package com.sihai.service;

import java.util.List;

import com.sihai.pojo.User;

/**
 * 
 * @Title: UserService.java
 * @Package com.sihai.service
 * @Description: 用户处理的的相关操作 service
 * Copyright: Copyright (c) 2016
 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
 * 
 * @author leechenxiang
 * @date 2017年8月17日 下午8:11:54
 * @version V1.0
 */
public interface UserService {

	/**
	 * 
	 * @Description: 新增用户
	 * @param user
	 * 
	 * @author leechenxiang
	 * @date 2017年8月17日 下午8:13:11
	 */
	public void saveUser(User user);
	
	/**
	 * 
	 * @Description: 更新用户
	 * @param user
	 * 
	 * @author leechenxiang
	 * @date 2017年8月17日 下午8:13:21
	 */
	public void updateUserById(User user);
	
	/**
	 * 
	 * @Description: 删除用户
	 * @param userId
	 * 
	 * @author leechenxiang
	 * @date 2017年8月17日 下午8:13:28
	 */
	public void deleteUserById(String userId);
	
	/**
	 * 
	 * @Description: 根据用户主键ID获取用户信息
	 * @param userId
	 * @return
	 * 
	 * @author leechenxiang
	 * @date 2017年8月17日 下午8:22:08
	 */
	public User getUserById(String userId);
	
	/**
	 * 
	 * @Description: 获取用户列表
	 * @return
	 * 
	 * @author leechenxiang
	 * @date 2017年8月17日 下午8:13:38
	 */
	public List<User> getUserList();
}
