package com.serverlist.authserver.entity;

import javax.annotation.Generated;

public class Servers {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String serverName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String host;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String db;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer port;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String socket;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String wrapper;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String owner;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getServerName() {
        return serverName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withServerName(String serverName) {
        this.setServerName(serverName);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHost() {
        return host;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withHost(String host) {
        this.setHost(host);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDb() {
        return db;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withDb(String db) {
        this.setDb(db);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUsername() {
        return username;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPassword() {
        return password;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPort() {
        return port;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withPort(Integer port) {
        this.setPort(port);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPort(Integer port) {
        this.port = port;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSocket() {
        return socket;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withSocket(String socket) {
        this.setSocket(socket);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSocket(String socket) {
        this.socket = socket == null ? null : socket.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getWrapper() {
        return wrapper;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withWrapper(String wrapper) {
        this.setWrapper(wrapper);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWrapper(String wrapper) {
        this.wrapper = wrapper == null ? null : wrapper.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOwner() {
        return owner;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Servers withOwner(String owner) {
        this.setOwner(owner);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Servers other = (Servers) that;
        return (this.getServerName() == null ? other.getServerName() == null : this.getServerName().equals(other.getServerName()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDb() == null ? other.getDb() == null : this.getDb().equals(other.getDb()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getSocket() == null ? other.getSocket() == null : this.getSocket().equals(other.getSocket()))
            && (this.getWrapper() == null ? other.getWrapper() == null : this.getWrapper().equals(other.getWrapper()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServerName() == null) ? 0 : getServerName().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDb() == null) ? 0 : getDb().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getSocket() == null) ? 0 : getSocket().hashCode());
        result = prime * result + ((getWrapper() == null) ? 0 : getWrapper().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return result;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serverName=").append(serverName);
        sb.append(", host=").append(host);
        sb.append(", db=").append(db);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", port=").append(port);
        sb.append(", socket=").append(socket);
        sb.append(", wrapper=").append(wrapper);
        sb.append(", owner=").append(owner);
        sb.append("]");
        return sb.toString();
    }
}