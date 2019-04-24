package com.atguigu.atcrowdfunding.manager.service;

import java.util.List;

import com.atguigu.atcrowdfunding.bean.Permission;

public interface PermissionService {

	Permission getPermissionRoot();

	List<Permission> getPermissionByPid(Integer id);

	List<Permission> queryAllPermission();

	int savePermission(Permission permission);

	Permission getPermissionById(Integer id);

	int updatePermission(Permission permission);

	int deletePermission(Integer id);

	List<Integer> queryPermisionIdByRoleid(Integer roleid);

}
