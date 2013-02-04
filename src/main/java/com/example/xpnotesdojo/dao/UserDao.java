package com.example.xpnotesdojo.dao;

import com.example.xpnotesdojo.entity.User;
import com.google.inject.Singleton;

@Singleton
public class UserDao extends BaseHibernateDao<User> {
	
	public User getUserByUserName(String userName) {
		return (User) daoHelper.findFirst("from User where userName = ?", userName);
	}
	
}
