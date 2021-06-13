package com.itwillbs.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// @RunWith(SpringJUnit4ClassRunner.class)
// => 테스트할때 스프링으로 테스트하겠다.
//@ContextConfiguration(
//locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
//)
// => 테스트에 필요한 설정을 연결(정보 가져오기) 

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class DataSourceTest {
	
	// DB연결 테스트
	
	// @Inject : 연결된 설정파일(스프링)에서 필요한 객체를 의존 주입(자동)
	@Inject
	private DataSource ds;
	
	//@Test
	public void dsTest() {
		// 의존 주입 받은 객체 확인
		System.out.println(" 객체  : "+ds);
		System.out.println(" 의존 주입 성공! ");		
	}
	
	@Test
	public void testCon() throws Exception {
		// DB연결 테스트 
		
		try(Connection con = ds.getConnection() ){
			
			System.out.println(" 디비연결 성공!   ");
			System.out.println(" 객체  : "+con);
			
		}catch (Exception e) {
			System.out.println("디비 연결 실패!");
		}
				
	}
	
	
	
	
	

}
