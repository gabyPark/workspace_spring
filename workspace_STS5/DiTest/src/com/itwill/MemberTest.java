package com.itwill;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberTest {

	public static void main(String[] args) {
		
		// MemberDAO 객체 생성 -> 회원가입
		
		// 강한 결합
		MemberDAOImpl mdao = new MemberDAOImpl();
		mdao.insertMember();
		
		System.out.println("---------------------------");
		
		// 상대적으로 약한 결합
		
		MemberDAO mdao1 = new MemberDAOImpl();
		mdao1.insertMember();
		
		// 스프링을 사용한 객체 주입 (DI)
		BeanFactory fac = 
				new XmlBeanFactory(new FileSystemResource("beans.xml"));
		
		// MemberDAO mdao2 = (MemberDAO) fac.getBean("mdao");
		MemberDAO mdao2 = (MemberDAO) fac.getBean("mdao",MemberDAO.class);
		mdao2.insertMember();
	
	
		
		// DI - set() 사용
		MemberDAO mdao3 = fac.getBean("mdaoSet",MemberDAOImpl.class);
		
		mdao3.idCheck();
		
		
		// DI - 생성자 사용
		MemberDAO mdaoc1 = fac.getBean("mdaoC1",MemberDAOImpl.class);
		mdaoc1.idCheck();

		MemberDAO mdaoc2 = fac.getBean("mdaoC2",MemberDAOImpl.class);
		mdaoc2.idCheck();
		
	
	}

}
