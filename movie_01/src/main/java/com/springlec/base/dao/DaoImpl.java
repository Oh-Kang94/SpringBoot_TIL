package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.Dto;

public class DaoImpl implements Dao {


	SqlSession sqlSession;

	public static String nameSpace = "com.springlec.base.dao.Dao";

	
	@Override
	public List<Dto> listDao() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace + ".listDao");
	}

}
