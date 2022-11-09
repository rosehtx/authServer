package com.serverlist.authserver.entity;

import java.util.Date;
import javax.annotation.Generated;

public class ServerCost {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String costName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Float costValue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date lastUpdate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String comment;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCostName() {
        return costName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerCost withCostName(String costName) {
        this.setCostName(costName);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCostName(String costName) {
        this.costName = costName == null ? null : costName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Float getCostValue() {
        return costValue;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerCost withCostValue(Float costValue) {
        this.setCostValue(costValue);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCostValue(Float costValue) {
        this.costValue = costValue;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getLastUpdate() {
        return lastUpdate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerCost withLastUpdate(Date lastUpdate) {
        this.setLastUpdate(lastUpdate);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getComment() {
        return comment;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public ServerCost withComment(String comment) {
        this.setComment(comment);
        return this;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
        ServerCost other = (ServerCost) that;
        return (this.getCostName() == null ? other.getCostName() == null : this.getCostName().equals(other.getCostName()))
            && (this.getCostValue() == null ? other.getCostValue() == null : this.getCostValue().equals(other.getCostValue()))
            && (this.getLastUpdate() == null ? other.getLastUpdate() == null : this.getLastUpdate().equals(other.getLastUpdate()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCostName() == null) ? 0 : getCostName().hashCode());
        result = prime * result + ((getCostValue() == null) ? 0 : getCostValue().hashCode());
        result = prime * result + ((getLastUpdate() == null) ? 0 : getLastUpdate().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        return result;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costName=").append(costName);
        sb.append(", costValue=").append(costValue);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append(", comment=").append(comment);
        sb.append("]");
        return sb.toString();
    }
}