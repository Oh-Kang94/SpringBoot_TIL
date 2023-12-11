package com.springlec.base.service;

import java.util.List;

import com.springlec.base.model.ADto;

public interface ADaoService2 {
	public void deleteDao(int aId) throws Exception;
	public void modifyDao(int aId, String aName, String aPhone, String aAddress, String aEmail, String aRelation) throws Exception;
	public List<ADto> listQuery(String query, String content)throws Exception;
}
