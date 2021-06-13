package com.itwillbs.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {
				"file:src/main/webapp/WEB-INF/spring/root-context.xml"				
		}
		)
public class MyBatisTest {
	
	//SqlSessionFactory 객체 사용해서 
	// 디비 연결 테스트
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		System.out.println(" 주입객체  : "+sqlFactory);
		System.out.println("의존 주입 성공! ");
	}
	
	@Test
	public void testConnect() throws Exception {
		
		try(SqlSession sqlsession = sqlFactory.openSession()){
			
			System.out.println("디비 연결 성공 : "+sqlsession);
			System.out.println(" 디비연결정보 + mybatis 설정정보 사용");
			
		}catch (Exception e) {
			System.out.println("디비 연결 실패!");
	    }
		
	}
	
	
	
	
	

}
