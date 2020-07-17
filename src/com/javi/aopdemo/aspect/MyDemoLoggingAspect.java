package com.javi.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@Pointcut("execution(* com.javi.aopdemo.dao.*.*(..))")//create pointcut declaration
	private void forDaoPackage() {
		
	}
	
	// create pointcut for getter methods
	@Pointcut("execution(* com.javi.aopdemo.dao.*.get*(..))")//match getter methods
	private void getter() {}
	
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.javi.aopdemo.dao.*.set*(..))")//match setter methods
	private void setter() {}
	
	
	// create pointcut: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	
	
	
	@Before("forDaoPackageNoGetterSetter()")//apply pointcut declaration to advice
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>>> Executing @Before advice on method");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>>> Performing API analytics");
	}

}
