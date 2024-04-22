package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PersonDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//리스트
	public List<PersonVo> personSelect() {
		System.out.println("PersonDao.personSelect()");
		
		List<PersonVo> pList=sqlSession.selectList("person.selectAll");
		
		return pList;
	}

}
