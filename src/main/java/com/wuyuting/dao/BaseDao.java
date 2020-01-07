package com.wuyuting.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyuting.pojo.User;

public interface BaseDao<T> {

	//查询
	List<User> select(User user);
	//根据ID查
	User selectById(Integer id);
	//添加
	int insert(User user);
	//修改
	int update(User user);
	//删除
	int delete(@Param("ids") String ids);
}
