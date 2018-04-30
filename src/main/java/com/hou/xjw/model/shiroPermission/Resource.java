package com.hou.xjw.model.shiroPermission;

import java.util.Date;

/**
 * 权限资源类
 * */

public class Resource {

    private Integer id;
    private String resourceName;
    private String resourceExp;
    private String url;
    private Integer typeId;
    private Integer parentId;
    private Date createTime;
    private Date updateTime;
    private String opUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceExp() {
        return resourceExp;
    }

    public void setResourceExp(String resourceExp) {
        this.resourceExp = resourceExp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", resourceName='" + resourceName + '\'' +
                ", resourceExp='" + resourceExp + '\'' +
                ", url='" + url + '\'' +
                ", typeId=" + typeId +
                ", parentId=" + parentId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", opUser='" + opUser + '\'' +
                '}';
    }
}
