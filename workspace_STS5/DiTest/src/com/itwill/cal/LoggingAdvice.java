package com.itwill.cal;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{

	// 로그를 찍는 보조기능을 구현한 클래스 

	@Override
	public Object invoke(MethodInvocation inv) throws Throwable {

		System.out.println("[메서드 호출 전] : LoggingAdvice");
		System.out.println(inv.getMethod() + "메서드 호출 전!");
		
		Object obj = inv.proceed();  // 실제 작동하는 동작(주기능) 호출
		
		System.out.println("[메서드 호출 후] : LoggingAdvice");
		System.out.println(inv.getMethod() + "메서드 호출 후!");

		return obj;
	}
	
}
