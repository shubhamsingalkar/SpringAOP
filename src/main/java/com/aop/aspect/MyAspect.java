package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	
	@Before("execution(* com.aop.service.PaymentService.makePayment(..))")
	public void beforeMethod() {
		
		System.out.println("Payment Started.....");
	}
	
	@After("execution(* com.aop.service.PaymentService.makePayment(..))")
	public void afterMethod() {
		
		System.out.println("Payment Completed.....");
}
	
	//@Around("execution(* com.aop.service.PaymentService.makePayment(..))")
	public void aroundMethod() {
		
		System.out.println("Payment in process.....");
}
}
