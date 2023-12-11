package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.Dao;
import com.springlec.base.model.Dto;

@Service
public class DaoServiceImpl implements DaoService {

	@Autowired
	Dao dao;

	@Override
	public List<Dto> listDao() throws Exception {
		// TODO Auto-generated method stub
		return dao.listDao();
	}

}
