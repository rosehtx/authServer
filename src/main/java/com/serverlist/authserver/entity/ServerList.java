package com.serverlist.authserver.entity;

import lombok.Data;
import lombok.Value;

@Data
public class ServerList {
    public Integer id;
    public Integer serverId;
    public String  ip;
    public Integer port;
    public Integer type;
    //状态  1正常  2维护 3拥挤
    public Byte    status;
    //更新时间
    public Long updateAt;
}