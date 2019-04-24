package com.atguigu.atcrowdfunding.manager.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.bean.Permission;
import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.util.Page;
import com.atguigu.atcrowdfunding.vo.Data;

public interface UserService {

	User queryUserByLogin(Map<String, Object> paramMap);

	Page<User> queryPage(Map<String, Object> paramMap);

	int saveUser(User user);

	User getUserById(Integer id);

	int updateUser(User user);

	int deleteUser(Integer id);

	int deleteBatchUser(Integer[] id);

	int deleteBatchUserByData(Data ds);

	List<Permission> queryPermissionSelf(Integer id);

	
	
}
