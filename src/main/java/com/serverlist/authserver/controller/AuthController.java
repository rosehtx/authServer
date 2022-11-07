package com.serverlist.authserver.controller;

import com.alibaba.fastjson.JSON;
import com.serverlist.authserver.dto.BaseResponse;
import com.serverlist.authserver.dto.BaseResponseData;
import com.serverlist.authserver.dto.server.AuthUserResponseData;
import com.serverlist.authserver.dto.server.CheckTokenData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.serverlist.authserver.service.AuthService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    @Autowired
    private AuthService AuthService;

    @GetMapping("/getUser")
    public BaseResponseData<AuthUserResponseData> getUser(HttpServletRequest request,
//        @RequestParam("userId") int userId,
        final int userId,
        @RequestParam("channel") int channel
    ){
        log.info("getUser  request :" + JSON.toJSON(request.getParameterMap()));
        return  AuthService.getUserById(userId,channel);
    }

    @RequestMapping("/checkToken")
    public BaseResponseData<?> postCheckToken(HttpServletRequest request,
          @RequestBody String checkJson //适合post的raw请求
    ){
        log.info("checkToken ========> " + checkJson);
        if(checkJson == null){
            return BaseResponse.failure("error param");
        }
        CheckTokenData postCheckData = JSON.parseObject(checkJson,CheckTokenData.class);
        postCheckData.setToken("token");
        AuthService.checkAuthToken(postCheckData);
        return BaseResponse.failure("jj");
    }

}
