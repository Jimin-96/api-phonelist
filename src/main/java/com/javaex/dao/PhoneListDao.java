package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.javaex.vo.PhoneListVo;

@Repository
public class PhoneListDao {

	@Autowired
	private SqlSession session;
	
	// 리스트 가져오기
		public List<PhoneListVo> getList() {
			System.out.println("GuestbookDao.getPersonList()");
			List<PhoneListVo> pList = session.selectList("person.selectList");

			System.out.println(pList);

			return pList;
		}

}
