package com.javi.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@Before("forDaoPackageNoGetterSetter()")//apply pointcut declaration to advice
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>>> Executing @Before advice on method");
	}
	

}
