package aop.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	//one aspect can contain multiple advices
	
	
	@Before("execution(* aop.model..*.*(..))")
	public void loggingAdvice() {
		System.out.println("writing log before method is executed");
	}

}