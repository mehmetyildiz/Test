package com.yldz.facade.impl;

import javax.inject.Inject;

import com.yldz.facade.Facade;
import com.yldz.service.Service;

public class FacadeImpl implements Facade {

	@Inject
	public Service service;

	@Override
	public void getConnection() {
		service.getConnection();
	}

}
