package com.serverlist.authserver.util;

import java.util.Iterator;
import java.util.Map;

public class HttpUtil {
    public static String getUrlEncodeParam(Map<String, Object> urlMap){
        StringBuilder sb = new StringBuilder();
        Iterator<String> iterator = urlMap.keySet().iterator();

        while (iterator.hasNext()) {
            String key   = iterator.next();
            String value = String.valueOf(urlMap.get(key));
            sb.append(key).append("=").append(value);
            if(iterator.hasNext()){
                sb.append("&");
            }
        }
        return sb.toString();
    }
}
