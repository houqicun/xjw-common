package com.hou.xjw.mapper;

import com.hou.xjw.model.shiroPermission.Role;
import com.hou.xjw.model.shiroPermission.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

    List<Role> getRoleByUserId(Integer userId);

}
