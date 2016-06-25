package com.huangpf.service;

import com.huangpf.po.UserT;

public interface IUserService {
	public UserT getUserById(long userId);
	public void insertUserT(UserT userT);
}
