package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PersonDao;
import com.javaex.vo.PersonVo;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	//리스트
	public List<PersonVo> exeList() {
		System.out.println("PersonService.exeList()");
		
		List<PersonVo> pList=personDao.personSelect();
		
		return pList;
	}

}
