package com.example.xpnotesdojo.web;

import java.util.Map;

import javax.inject.Singleton;

import com.britesnow.snow.util.JsonUtil;
import com.britesnow.snow.util.ObjectUtil;
import com.britesnow.snow.web.RequestContext;
import com.britesnow.snow.web.param.annotation.WebParam;
import com.britesnow.snow.web.rest.annotation.WebPost;
import com.example.xpnotesdojo.dao.DaoRegistry;
import com.example.xpnotesdojo.dao.UserDao;
import com.example.xpnotesdojo.entity.User;
import com.google.inject.Inject;

@SuppressWarnings("rawtypes")
@Singleton
public class UserWebHandlers {

	@Inject
	private DaoRegistry daoRegistry;

	@WebPost("/User/daoLogin")
	public User daoLogin(@WebParam("objType") String objType,@WebParam("username")String username, @WebParam("password")String password, RequestContext rc) {
		UserDao userDao = (UserDao) daoRegistry.getDao(objType);
		User user = userDao.getUserByUserName(username);
		if (user != null && password != null && password.equals(user.getPassword())){
			rc.getReq().getSession().setAttribute("user", user);
			return user;
		} else {
			return null;
		}
	}
   
   
	@WebPost("/User/daoRegister")
	public User daoSave(@WebParam("objType") String objType, @WebParam("obj_id") Long id,
			@WebParam("objJson") String jsonObj, RequestContext rc) {
		 
		UserDao userDao = (UserDao) daoRegistry.getDao(objType);
		Map jsonMap = JsonUtil.toMapAndList(jsonObj);
		User user = new User();
		ObjectUtil.populate(user, jsonMap);
		if(userDao.getUserByUserName(user.getUsername()) != null) {
			return null;
		} else {
			return userDao.save(user);
		}

	}
    
}
