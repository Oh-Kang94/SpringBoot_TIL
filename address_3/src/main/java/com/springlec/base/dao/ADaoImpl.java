package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.ADto;

public class ADaoImpl implements ADao {


	SqlSession sqlSession;

	public static String nameSpace = "com.springlec.base.dao.ADao";

	
	@Override
	public List<ADto> listDao() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace + ".listDao");
	}

	@Override
	public void writeDao(String aName, String aPhone, String aAddress, String aEmail, String aRelation)
			throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert((nameSpace)+".writeDao");
	}

	@Override
	public ADto searchDao(int aId) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne((nameSpace)+".searchDao");
	}

	@Override
	public void deleteDao(int aId) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete((nameSpace)+".deleteDao");
	}

	@Override
	public void modifyDao(int aId, String aName, String aPhone, String aAddress, String aEmail, String aRelation)
			throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update((nameSpace)+".modifyDao");
	}

	@Override
	public List<ADto> listQuery(String query, String content) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList((nameSpace)+".listQuery");
	}

}
