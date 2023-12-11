package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ADao;
import com.springlec.base.dao.ADao2;
import com.springlec.base.model.ADto;

@Service
public class ADaoServiceImpl2 implements ADaoService2 {

	@Autowired
	ADao2 dao;

	@Override
	public void deleteDao(int aId) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteDao(aId);

	}

	@Override
	public void modifyDao(int aId, String aName, String aPhone, String aAddress, String aEmail, String aRelation)
			throws Exception {
		// TODO Auto-generated method stub
		dao.modifyDao(aId, aName, aPhone, aAddress, aEmail, aRelation);

	}

	@Override
	public List<ADto> listQuery(String query, String content) throws Exception {
		// TODO Auto-generated method stub
		content = "%" + content + "%";
		return dao.listQuery(query, content);
	}

}
