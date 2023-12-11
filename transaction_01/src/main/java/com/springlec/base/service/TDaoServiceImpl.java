package com.springlec.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springlec.base.dao.TDao;

@Service
@Transactional(rollbackFor = Exception.class) // rollback을 안하면 data가 꼬인다.
public class TDaoServiceImpl implements TDaoService {
	
	@Autowired
	TDao dao;
	
	@Override
	public void writeDao(String id, String product) throws Exception {
		// TODO Auto-generated method stub
		dao.writeDao(id, product);
		dao.writeDao2(id);
	}

	

}
