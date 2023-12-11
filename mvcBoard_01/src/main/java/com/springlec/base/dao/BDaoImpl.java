package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.BDto;

public class BDaoImpl implements BDao {

	SqlSession sqlSession;

	public static String nameSpace = "com.springlec.base.dao.BDao";

	@Override
	// JAVA 부분
	public List<BDto> listDao() throws Exception {
		// XML부분
		return sqlSession.selectList(nameSpace + ".listDao");
	}

	@Override
	public void writeDao(String bName, String bTitle, String bContent) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert((nameSpace) + ".writeDao");
	}

	@Override
	public BDto searchDao(int bId) throws Exception {
		// TODO Auto-generated method stub
		//	Casting 여기서 해주는 거다.
		// ㅣList에서 one 으로 바꿀때 (bDto)
		return sqlSession.selectOne(nameSpace + ".searchDao");
	}

	@Override
	public void deleteDao(int bId) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete((nameSpace) + ".deleteDao");
		
	}

	@Override
	public void modifyDao(int bId, String bName, String bTitle, String bContent) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update((nameSpace) + ".modifyDao");
	}

	

}
