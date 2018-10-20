package com.hou.xjw.mapper;

import com.hou.xjw.model.test.TestQueryLog;

import java.util.List;

public interface TestMapper {

    void addQueryLog(TestQueryLog testQueryLog);

    List<TestQueryLog> queryLogByParam(TestQueryLog testQueryLog);
}
