package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.ADto;

public interface ADao {

	public List<ADto> listDao() throws Exception;

	public void writeDao(String aName, String aPhone, String aAddress, String aEmail, String aRelation)
			throws Exception;

	public ADto searchDao(int aId) throws Exception;

}
