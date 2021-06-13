package com.itwillbs.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class MysqlConnectTest {
	
	// 테스트용 클래스 -> Junit을 사용한 실행
	// => 사용하고자하는 테스트는 항상 메서드(동작)으로 구성
	
	private static final String DRIVER 
		="com.mysql.jdbc.Driver";
	// 8.xx   com.mysql.cj.jdbc.Driver
	private static final String DBURL 
		="jdbc:mysql://localhost:3306/springdb?useSSL=false";
	// 8.xx   ?serverTimezone=Asia/Seoul&useSSL=false
	
	private static final String DBID = "root";
	private static final String DBPW = "1234";

	// 	@Test : "해당메서드를 테스트 하겠다."라는 의미를
	//        Jnuit한태 정보 전달
	
	
	// 디비연결 테스트메서드()
	@Test
	public void testCon() throws Exception {

		Class.forName(DRIVER);
		
		Connection conn 
		    = DriverManager.getConnection(DBURL, DBID, DBPW);
		
		System.out.println("디비연결 성공 : "+conn);
	}
	
	
	@Test
	public void testCon2() {

		// try~with 구문  1.7 이상 사용가능
		// try ~ catch ~ finally 구문의 강제성 불편함을 극복
		// => AutoCloseable 인터페이스를 포함하는 객체 사용
		
		try (Connection conn 
			    = DriverManager.getConnection(DBURL, DBID, DBPW)) {
			Class.forName(DRIVER);			
		
			System.out.println("디비연결 성공2 : "+conn);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

}
