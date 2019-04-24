package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.Permission;
import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    Permission selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(Permission record);

	Permission getPermissionRoot();

	List<Permission> getPermissionByPid(Integer id);

	List<Permission> queryAllPermission();

	List<Integer> queryPermisionIdByRoleid(Integer roleid);
}