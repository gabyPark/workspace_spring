package com.itwill.cal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalTest {

	public static void main(String[] args) {

		// 보조 기능
		System.out.println("보조기능 : 데이터 확인 log");

		// 계산기 객체 생성 -> 사용 (주기능)
		Calculator cal = new Calculator();
		cal.add(100, 200);

		// 보조 기능
		System.out.println("보조기능 : 데이터 확인 log");

		System.out.println("--------------------------------------------");

		
		// AOP 기능을 추가한 객체를 생성 후 동작
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("AOPTest.xml");
		
		// xml 파일에 가서 proxyCal 객체를 꺼내서 사용할거야
		// 그리고 그걸 aopCal 이라고 부를거야
		Calculator aopCal = (Calculator) appCtx.getBean("proxyCal");

		aopCal.add(2, 3);
	}

}
