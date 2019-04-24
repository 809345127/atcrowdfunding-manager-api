package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.Permission;
import com.atguigu.atcrowdfunding.bean.User;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

	User queryUserByLogin(Map<String, Object> paramMap);

	List<User> queryPageList(Map<String, Object> paramMap);

	int count(Map<String, Object> paramMap);

	int deleteBatchUserByData(/*@Param("userList") */List<User> uList);

	List<Permission> queryPermissionSelf(Integer id);
}