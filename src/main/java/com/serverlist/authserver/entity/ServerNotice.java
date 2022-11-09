package com.serverlist.authserver.entity;

import javax.annotation.Generated;

public class ServerNotice {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer serverId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String notice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Byte isEnd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerNotice withId(Integer id) {
        this.setId(id);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getServerId() {
        return serverId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerNotice withServerId(Integer serverId) {
        this.setServerId(serverId);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNotice() {
        return notice;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerNotice withNotice(String notice) {
        this.setNotice(notice);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getStartTime() {
        return startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerNotice withStartTime(Long startTime) {
        this.setStartTime(startTime);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getEndTime() {
        return endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerNotice withEndTime(Long endTime) {
        this.setEndTime(endTime);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Byte getIsEnd() {
        return isEnd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerNotice withIsEnd(Byte isEnd) {
        this.setIsEnd(isEnd);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIsEnd(Byte isEnd) {
        this.isEnd = isEnd;
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
        ServerNotice other = (ServerNotice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServerId() == null ? other.getServerId() == null : this.getServerId().equals(other.getServerId()))
            && (this.getNotice() == null ? other.getNotice() == null : this.getNotice().equals(other.getNotice()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getIsEnd() == null ? other.getIsEnd() == null : this.getIsEnd().equals(other.getIsEnd()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServerId() == null) ? 0 : getServerId().hashCode());
        result = prime * result + ((getNotice() == null) ? 0 : getNotice().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getIsEnd() == null) ? 0 : getIsEnd().hashCode());
        return result;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serverId=").append(serverId);
        sb.append(", notice=").append(notice);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", isEnd=").append(isEnd);
        sb.append("]");
        return sb.toString();
    }
}