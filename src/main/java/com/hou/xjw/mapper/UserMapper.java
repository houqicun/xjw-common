package com.hou.xjw.mapper;

import com.hou.xjw.model.shiroPermission.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User getUserForLogin(@Param("userName") String userName, @Param("password") String password);

    List<User> getUserList();

}
