package com.myexample.springboot.rest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.myexample.springboot.rest.modal.Bean;

@Aspect
@Component
public class LogginAspect {
		
	@Around("execution(* com.myexample.springboot.rest.controller.*.post*(..)) && args(bean) ||  execution(* com.myexample.springboot.rest.controller.*.test*(..)) && args(bean) ")
    public Bean logMethodAccessBefore(ProceedingJoinPoint  proceedingJoinPoint, Bean bean) throws Throwable {
        System.out.println("***** Starting: " + proceedingJoinPoint.getSignature().getName() + " *****");
        Bean bean1=(Bean) proceedingJoinPoint.proceed(new Object[] {bean});
        System.out.println("***** End: " + proceedingJoinPoint.getSignature().getName() + " *****");
        return bean;
    }
    
	

}


