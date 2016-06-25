package com.huangpf.service.impl;

import com.huangpf.dao.UserTMapper;
import com.huangpf.po.UserT;
import com.huangpf.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.OverridesAttribute;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserTMapper userDao;
	@Override
	public UserT getUserById(long userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

	@Override
	public void insertUserT(UserT userT){
		this.userDao.insert(userT);
	}

}
