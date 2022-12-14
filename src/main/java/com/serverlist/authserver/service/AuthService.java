package com.serverlist.authserver.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.serverlist.authserver.channel.PlatformChannel;
import com.serverlist.authserver.channel.RedisKeyChannel;
import com.serverlist.authserver.dao.ServerNoticeDao;
import com.serverlist.authserver.dao.ServerUserDao;
import com.serverlist.authserver.dto.BaseResponse;
import com.serverlist.authserver.dto.BaseResponseData;
import com.serverlist.authserver.dto.server.AuthUserResponseData;
import com.serverlist.authserver.dto.server.CheckTokenData;
import com.serverlist.authserver.entity.ServerList;
import com.serverlist.authserver.entity.ServerNotice;
import com.serverlist.authserver.entity.ServerNoticeList;
import com.serverlist.authserver.entity.ServerUser;
import com.serverlist.authserver.mapper.ServerUserDynamicSqlSupport;
import com.serverlist.authserver.mapper.ServerUserMapper;
import com.serverlist.authserver.mapper.ServerUserMasterMapper;
import com.serverlist.authserver.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.SqlTable;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Slf4j
@Service
public class AuthService {

    @Value("${php.http.url}")
    private String phpHttpUrl;

    @Autowired
    private RedisUtil RedisUtil;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpClientService httpClientService;

    @Autowired
    private ServerUserMapper ServerUserMapper;

    @Autowired
    private ServerUserDao ServerUserDao;

    @Autowired
    private ServerNoticeDao ServerNoticeDao;

    private AuthService(){

    }

    public BaseResponseData<AuthUserResponseData> getUserById(int userId, int channel){
        PlatformChannel platform = PlatformChannel.matchChannel(channel);
        if(platform.getPlatformType().equals(PlatformChannel.UNDEFINED.getPlatformType())){
            return BaseResponse.failure("????????????channel");
        }
        String userInfo = RedisUtil.getStringByKey(RedisKeyChannel.USER_INFO.getKey() + channel + "" +":" +userId + "" );
        log.info("userInfo key ===> " + RedisKeyChannel.USER_INFO.getKey() + channel + "" +":" +userId + "" );
        log.info("userInfo ====> " + userInfo);
//        RedisUtil.showKeys();
        if(userInfo == null){
            return BaseResponse.failure("??????????????????");
        }

        //????????? ???????????????????????????
//        AuthUserResponseData authData = new AuthUserResponseData();
//        JSONObject userInfoJson = JSON.parseObject(userInfo);
//        authData.setToken(userInfoJson.getString("token"));
//        authData.setPlatformUid(userInfoJson.getString("uid"));
//        authData.setPlatformType(userInfoJson.getInteger("platformType"));

        //????????? ??? ??????????????????
        AuthUserResponseData authData = JSON.parseObject(userInfo,AuthUserResponseData.class);

        return BaseResponse.success(authData);
    }

    public CheckTokenData getAuthToken(CheckTokenData postCheckData){
        String url  = phpHttpUrl;
        StringBuilder sb = new StringBuilder();
        sb.append(url)
                .append("?uid=")
                .append(postCheckData.getUid())
                .append("&token=")
                .append(postCheckData.getToken());
        String getUrl =  sb + "";
        log.info("curl url => " + getUrl);

        Map<String,Object> httpData = new HashMap<>();
        httpData.put("uid",postCheckData.getUid());
        httpData.put("token",postCheckData.getToken());

        // restTemplate ?????? get?????? getForObject??????
//        String restTemplateGet   = restTemplate.getForObject(getUrl, String.class);//????????????????????????
        CheckTokenData restTemplateGet   = restTemplate.getForObject(getUrl, CheckTokenData.class);//???????????????
        System.out.print("restTemplate getForObject?????? \n");
        System.out.print(restTemplateGet);
        System.out.print("\n");

        // restTemplate ?????? get?????? getForEntity??????
        ResponseEntity<CheckTokenData> getResponseEntity = restTemplate.getForEntity(getUrl,CheckTokenData.class);
        System.out.print("restTemplate getForEntity?????? \n");
        System.out.println(getResponseEntity.getHeaders());
        System.out.print("\n");
        System.out.println(getResponseEntity.getBody());
        System.out.print("\n");

        // restTemplate post?????? postForObject??????
//        String restTemplatePost = restTemplate.postForObject(url, postCheckData, String.class);
        CheckTokenData restTemplatePost   = restTemplate.postForObject(url, postCheckData,CheckTokenData.class);//???????????????
        System.out.print("restTemplate postForObject?????? \n");
        System.out.println(restTemplatePost);
        System.out.print("\n");

        // restTemplate ?????? post?????? postForEntity??????
        ResponseEntity<CheckTokenData> restTemplatePostEntity = restTemplate.postForEntity(url,postCheckData,CheckTokenData.class);
        System.out.print("restTemplate postForEntity?????? \n");
        System.out.println(restTemplatePostEntity.getHeaders());
        System.out.print("\n");
        System.out.println(restTemplatePostEntity.getBody());
        System.out.print("\n");

        //jdk11+  HttpClient
        CheckTokenData clientPostData = httpClientService.sendHttpClientPostRequest(url,httpData,"",CheckTokenData.class);
        System.out.print("HttpClient post x-www-form-urlencoded \n");
        System.out.print(clientPostData);
        System.out.print("\n");

        CheckTokenData clientPostRawData = httpClientService.sendHttpClientRawPostRequest(url,JSONObject.toJSON(httpData).toString(),CheckTokenData.class);
        System.out.print("HttpClient post raw \n");
        System.out.print(clientPostRawData);
        System.out.print("\n");

        return  clientPostRawData;
    }

    public void checkAuth(CheckTokenData postCheckData){
        Map<String,Object> param = new HashMap<>();
        param.put("user_id",postCheckData.getUid());
        param.put("token",postCheckData.getToken());

        //?????????????????????
        List<ServerUser> userList = ServerUserDao.getListDataByParam(param,ServerUserMapper.selectList);
        if(userList != null){
            System.out.print("=======List<ServerUser>\n");
            System.out.print(userList);
            System.out.print("\n");
            for(Iterator it = userList.iterator(); it.hasNext();)
            {
                ServerUser uu = (ServerUser) it.next();
                System.out.print(uu.getToken());
                System.out.print("\n");
            }
//            for(int i=0;i<userList.size(); i++)
//            {
//                ServerUser uu = userList.get(i);
//                System.out.print(uu.getToken());
//                System.out.print("\n");
//            }
        }

        //??????????????????
        ServerUser slaveUser = ServerUserDao.getOneDataByParam(param,ServerUserMapper.selectList);
        if(slaveUser != null){
            System.out.print("slaveUser ===== \n");
            System.out.print(slaveUser);
        }

        //????????????notice?????????
        List<ServerNoticeList>  resNotice = ServerNoticeDao.getListDataByParam();
        System.out.print("\n");
        System.out.print("resNotice ===== \n");
        System.out.print(resNotice);

    }
}
