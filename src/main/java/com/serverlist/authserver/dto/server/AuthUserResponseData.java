package com.serverlist.authserver.dto.server;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AuthUserResponseData {
    @JSONField(name = "platformType")
    private int platformType;

    @JSONField(name = "uid")
    private String platformUid;

    @JSONField(name = "token")
    private String token;
}
