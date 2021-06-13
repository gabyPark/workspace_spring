package com.itwill.web;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

	public static void main(String[] args) {
		
		// MsgBean 객체를 사용해서
		// "홍길동 : Hello" 메세지 출력
		
		// HelloApp 파일이 MsgBean 파일에 있는 sayMSG() 메서드 호출
		// HelloApp 은 MsgBean 필요하다.
		// => HelloApp은 MsgBean 객체에 의존하고 있다.
		
		MsgBean mb = new MsgBean();
		
		mb.sayMsg("홍길동","Hello!");
		
		// HelloApp -> BoardDAO - getBoardList() 
		// "HelloApp 객체는 BoardDAO 객체에 의존하고 있다."
		BoardDAO bdao = new BoardDAO();
		
		bdao.getBoardList();
		
		// => 객체에 의존하고 있다. 객체가 필요하다. 객체가 없어서는 안된다.
		// => 두 객체의 결합도가 높다.
		
		// "홍길동 : 안녕!" 출력
//		MsgBeanKr kr = new MsgBeanKr();
//		kr.sayMSGkr();
		MsgBeanTotal msgKr = new MsgBeanKr();
		msgKr.sayMsg();
		
		// "Hong : Hello~" 출력
//		MSGBeanEn en = new MsgBeanEx();
//		en.sayMsGen;
		MsgBeanTotal msgEn = new MsgBeanEn();
		msgEn.sayMsg();
		

		// 빈 객체를 생성해서 사용
		// (스프링에서 객체 생성 -> 만들어진 객체 사용)
		BeanFactory factory 
			= new XmlBeanFactory(new FileSystemResource("beans.xml"));
		// (객체를 찾으러 저장소(마트)에 가는 동작)
		
		
		// 객체를 꺼내오는 동작 (마트에 가서, 상품을 사오는 동작)
		// getBean 하는게 의존 주입 (DI)
		MsgBeanKr mkr 
			= factory.getBean("msgBeanKr",MsgBeanKr.class);
					 
			
		mkr.sayMsg();
		
		
		
	}

}
