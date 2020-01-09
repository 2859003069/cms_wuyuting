package com.wuyuting.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyuting.cms.pojo.User;

public interface BaseDao<T> {

	//查询
	List<T> select(T t);
	//根据ID查
	User selectById(Integer id);
	//添加
	int insert(T t);
	//修改
	int update(T t);
	//删除
	int delete(@Param("ids") String ids);
}
