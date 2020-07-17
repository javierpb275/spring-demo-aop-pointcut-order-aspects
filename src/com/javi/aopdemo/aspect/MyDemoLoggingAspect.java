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
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>>> Performing API analytics");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n=====>>>> Logging to Cloud in async fashion");
	}

}
