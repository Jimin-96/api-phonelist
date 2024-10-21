package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javaex.dao.PhoneListDao;
import com.javaex.vo.PhoneListVo;

@Service
public class PhoneListService {
	
	@Autowired
	private PhoneListDao dao;
	
	public List<PhoneListVo> exeGetList(){
		System.out.println("PhoneListService.exeGetList");
		
		List<PhoneListVo> pList = dao.getList();
		
		return pList;
	}

}
