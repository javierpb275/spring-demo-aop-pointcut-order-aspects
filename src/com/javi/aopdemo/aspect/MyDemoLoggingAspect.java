package com.javi.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	
	@Before("com.javi.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")//added fully qualified class name
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>>> Executing @Before advice on method");
	}
	

}
