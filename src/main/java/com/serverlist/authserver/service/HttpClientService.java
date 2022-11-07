package com.serverlist.authserver.service;

import com.alibaba.fastjson.JSON;
import com.serverlist.authserver.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;

@Service
@Slf4j
public class HttpClientService {
    @Autowired
    private HttpClient httpClientBuilder;

    public <T> T sendHttpClientPostRequest(String url, Map<String, Object> apiParams, String headerParam, Class<T> responseClass){
        String paramUrl = HttpUtil.getUrlEncodeParam(apiParams);

        //创建 builder
        HttpRequest.Builder reBuilder = HttpRequest.newBuilder();
        //链式调用
        HttpRequest request = reBuilder
                //存入消息头
                //消息头是保存在一张 TreeMap 里的
                .header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8")
                .header("Auth-check", headerParam)
                //http 协议版本
//                .version(HttpClient.Version.HTTP_2)
                //url 地址
                .uri(URI.create(url))
                //超时时间
                .timeout(Duration.ofMillis(5000))
                //发起一个 post 消息，需要存入一个消息体
                .POST(HttpRequest.BodyPublishers.ofString(paramUrl))
                //发起一个 get 消息，get 不需要消息体
                //.GET()
                //method(...) 方法是 POST(...) 和 GET(...) 方法的底层，效果一样
                .build();

        try {
            HttpResponse<String> response =  httpClientBuilder.send(request, HttpResponse.BodyHandlers.ofString());
            if (response != null) {
                Integer responseCode = response.statusCode();
                String responseBody  = response.body();
                log.info("sendHttpClientPostRequest data");
                log.info(responseCode + "");
                log.info(responseBody);
                T clientResponse = JSON.parseObject(responseBody, responseClass);
                if (clientResponse != null) {
                    return clientResponse;
                }
            }
        }catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }
}
