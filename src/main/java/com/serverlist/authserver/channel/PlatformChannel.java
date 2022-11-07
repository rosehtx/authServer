package com.serverlist.authserver.channel;

import lombok.Getter;

@Getter
public enum PlatformChannel {
    UNDEFINED(0, "undefined"),

    WF_PLATFORM(1,"wf"),

    BYTE_PLATFORM(2,"byte");

    private final Integer platformType;
    private final String platformName;

    //构造方法
    PlatformChannel(int platformType,String platformName) {
        this.platformType=platformType;
        this.platformName=platformName;
    }

    public static PlatformChannel matchChannel(int platform) {
        if (platform == WF_PLATFORM.platformType) {
            return WF_PLATFORM;
        } else if (platform == BYTE_PLATFORM.platformType) {
            return BYTE_PLATFORM;
        } else {
            return UNDEFINED;
        }
    }
}
