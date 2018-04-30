package com.hou.xjw.model.shiroPermission;

import java.util.Date;

/**
 * 权限角色类
 * */

public class Role {

    private Integer id;
    private String roleName;
    private Integer isSuperAdmin;
    private Date createTime;
    private Date updateTime;
    private String opUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(Integer isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
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
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", isSuperAdmin=" + isSuperAdmin +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", opUser='" + opUser + '\'' +
                '}';
    }

}
