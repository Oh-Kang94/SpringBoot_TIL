package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ADao;
import com.springlec.base.model.ADto;

@Service
public class ADaoServiceImpl implements ADaoService {

	@Autowired
	ADao dao;
	
	@Override
	public List<ADto> listDao() throws Exception {
		// TODO Auto-generated method stub
		return dao.listDao();
	}

	@Override
	public void writeDao(String aName, String aPhone, String aAddress, String aEmail, String aRelation)
			throws Exception {
		dao.writeDao(aName, aPhone, aAddress, aEmail, aRelation);

	}

	@Override
	public ADto searchDao(int aId) throws Exception {
		// TODO Auto-generated method stub
		return dao.searchDao(aId);
	}

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

}
