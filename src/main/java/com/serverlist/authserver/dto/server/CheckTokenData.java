package com.serverlist.authserver.dto.server;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CheckTokenData {
    @JSONField(name = "platformType")
    private int platformType;

    @JSONField(name = "platformUid")
    private String platformUid;

    @JSONField(name = "uid")
    private int uid;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "token")
    private String token;
}
