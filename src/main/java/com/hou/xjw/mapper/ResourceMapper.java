package com.hou.xjw.mapper;

import com.hou.xjw.model.shiroPermission.Resource;
import com.hou.xjw.model.shiroPermission.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceMapper {

    List<Resource> getResourceByRoleId(Integer roleId);

    List<Resource> getMenuByRoleId(Integer roleId);

    List<Resource> getResourceList();

}
