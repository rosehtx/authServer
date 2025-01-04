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

//    public Integer getId() {
//        return id;
//    }
//    public ServerList withId(Integer id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getServerId() {
//        return serverId;
//    }
//    public ServerList withServerId(Integer serverId) {
//        this.setServerId(serverId);
//        return this;
//    }
//
//    public void setServerId(Integer serverId) {
//        this.serverId = serverId;
//    }
//
//    public String getIp() {
//        return ip;
//    }
//
//    public ServerList withIp(String ip) {
//        this.setIp(ip);
//        return this;
//    }
//
//    public void setIp(String ip) {
//        this.ip = ip == null ? null : ip.trim();
//    }
//
//    public Integer getPort() {
//        return port;
//    }
//
//    public ServerList withPort(Integer port) {
//        this.setPort(port);
//        return this;
//    }
//
//    public void setPort(Integer port) {
//        this.port = port;
//    }
//
//    public Integer getType() {
//        return type;
//    }
//
//    public ServerList withType(Integer type) {
//        this.setType(type);
//        return this;
//    }
//
//    public void setType(Integer type) {
//        this.type = type;
//    }
//
//    public Byte getStatus() {
//        return status;
//    }
//
//    public ServerList withStatus(Byte status) {
//        this.setStatus(status);
//        return this;
//    }
//
//    public void setStatus(Byte status) {
//        this.status = status;
//    }
//
//    public Integer getUpdateAt() {
//        return updateAt;
//    }
//
//    public ServerList withUpdateAt(Integer updateAt) {
//        this.setUpdateAt(updateAt);
//        return this;
//    }
//
//    public void setUpdateAt(Integer updateAt) {
//        this.updateAt = updateAt;
//    }
}