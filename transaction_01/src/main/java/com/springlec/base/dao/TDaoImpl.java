package com.springlec.base.dao;

import org.apache.ibatis.session.SqlSession;

public class TDaoImpl implements TDao {

	SqlSession sqlsession;

	public static String namespace = "com.spring.base.dao.TDao";

	@Override
	public void writeDao(String id, String product) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace + ".writeDao");
	}

	@Override
	public void writeDao2(String id) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert(namespace + ".writeDao2");

	}

}
