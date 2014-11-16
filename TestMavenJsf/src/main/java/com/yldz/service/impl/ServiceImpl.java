package com.yldz.service.impl;

import javax.inject.Inject;

import com.yldz.dao.Dao;
import com.yldz.service.Service;

public class ServiceImpl implements Service {

	@Inject
	public Dao dao;
	
	@Override
	public void getConnection() {
		dao.getConnection();
	}

}
