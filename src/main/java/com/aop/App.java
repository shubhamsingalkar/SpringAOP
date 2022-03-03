package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;
import com.aop.service.PaymentServiceImpl;


public class App 
{
 
	public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
    	PaymentService pay = context.getBean("payment",PaymentService.class);
    	pay.makePayment(500);
    	
        System.out.println( "Hello World........!" );
    }
}
