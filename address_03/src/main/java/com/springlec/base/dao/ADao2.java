package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.ADto;

public interface ADao2 {
	public void deleteDao(int aId) throws Exception;

	public void modifyDao(int aId, String aName, String aPhone, String aAddress, String aEmail, String aRelation)
			throws Exception;
	
	public List<ADto> listQuery(String query, String content) throws Exception;

}
