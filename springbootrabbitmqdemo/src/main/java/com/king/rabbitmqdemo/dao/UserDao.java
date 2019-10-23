package com.king.rabbitmqdemo.dao;


import com.king.rabbitmqdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author King Chen
 */

@Mapper
public interface UserDao {
	/**
	 * This method was selecting user data by userId
	 *
	 * @return the value of User
	 * @param userId
	 *
	 *
	 */
	User selectByUserId(String userId);
	/**
	 * This method was adding user to database
	 *
	 * @return void
	 * @param user
	 *
	 *
	 */
	void addUser(User user);
	/**
	 * This method was updating user
	 *
	 * @return void
	 * @param user
	 *
	 *
	 */
	void updateUser(User user);
	/**
	 * This method was deleting user
	 *
	 * @return void
	 * @param userId
	 *
	 *
	 */
	void deleteByUserId(String userId);

}
