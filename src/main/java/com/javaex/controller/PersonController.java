package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PersonService;
import com.javaex.vo.PersonVo;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	//리스트
	@GetMapping("/list")
	public List<PersonVo> list() {
		System.out.println("PersonController.list()");
		
		List<PersonVo> pList=personService.exeList();
		
		return pList;
	}

}
