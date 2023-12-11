package com.springlec.base.service;

import java.util.List;

import com.springlec.base.model.ADto;

public interface ADaoService {
	public List<ADto> listDao() throws Exception;
	public void writeDao(String aName, String aPhone, String aAddress, String aEmail, String aRelation) throws Exception;
	public ADto searchDao(int aId) throws Exception;
	public void deleteDao(int aId) throws Exception;
	public void modifyDao(int aId, String aName, String aPhone, String aAddress, String aEmail, String aRelation) throws Exception;
	public List<ADto> listQuery(String query, String content)throws Exception;
}
