package com.serverlist.authserver.channel;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum RedisKeyChannel {
    USER_INFO("user:");


    private final String key;

    //构造方法
    RedisKeyChannel(String key) {
        this.key=key;
    }
}
