package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaex.service.PhoneListService;
import com.javaex.vo.PhoneListVo;

@RestController
public class PhoneListController {
	
	@Autowired
	private PhoneListService service;

	@GetMapping("/api/list")
	public List<PhoneListVo> getlist() {
		System.out.println("PhoneListController.getlist()");

		List<PhoneListVo> pList = service.exeGetList();
		System.out.println(pList);

		return pList;
		
	}
}
