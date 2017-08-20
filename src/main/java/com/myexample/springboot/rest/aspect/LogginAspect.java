package com.myexample.springboot.rest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.myexample.springboot.rest.modal.Bean;

@Aspect
@Component
public class LogginAspect {
	
	/*

	//private static final Logger LOGGER = LoggerFactory.getLogger(SampleServiceAspect.class);

	/*
	@Pointcut("execution(* com.droidablebee.springboot.rest.controller.getAllStudents())")
	public void beforeSampleCreation() {
		System.out.println("naveen");
		//LOGGER.info("A request was issued for a sample name: "+sampleName);
	}
	*/
	
	/*
	@Around("execution(* com.gkatzioura.spring.aop.service.SampleService.createSample (java.lang.String)) && args(sampleName)")
	public Object aroundSampleCreation(ProceedingJoinPoint proceedingJoinPoint,String sampleName) throws Throwable {

		LOGGER.info("A request was issued for a sample name: "+sampleName);

		sampleName = sampleName+"!";

		Sample sample = (Sample) proceedingJoinPoint.proceed(new Object[] {sampleName});
		sample.setName(sample.getName().toUpperCase());

		return sample;
	}
	 */


	/*@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("called");
		
	}*/
	
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(LogginAspect.class);
	//@Before("execution(* com.droidablebee.springboot.rest.controller.*.*(..))  && args(bean) || execution(* com.droidablebee.springboot.rest.modal.*.*(..)) && args(bean)")
    /*
	@Before("execution(* com.droidablebee.springboot.rest.controller.*.post*(..)) && args(bean) ||  execution(* com.droidablebee.springboot.rest.controller.*.test*(..)) && args(bean) ")
	//@Before("execution(* com.droidablebee.springboot.rest.controller.post*(..)) && execution(* com.droidablebee.springboot.rest.controller.get*(..)) && execution(* com.droidablebee.springboot.rest.controller.put*(..))  && args(bean) ")
    public void logMethodAccessBefore(JoinPoint joinPoint, Bean bean) {
        //log.info("***** Starting: " + joinPoint.getSignature().getName() + " *****");
        System.out.println("***** Starting: " + joinPoint.getSignature().getName() + " *****");
        System.out.println(bean.getName());
    }
	*/
	/*
    @Around("execution(* com.gkatzioura.spring.aop.service.SampleService.createSample (java.lang.String)) && args(sampleName)")
    public Object aroundSampleCreation(ProceedingJoinPoint proceedingJoinPoint,String sampleName) throws Throwable {
        //LOGGER.info("A request was issued for a sample name: "+sampleName);
        //sampleName = sampleName+"!";
        proceedingJoinPoint.proceed(new Object[] {sampleName});
        //sample.setName(sample.getName().toUpperCase());
        return null;
    }
	*/
	
	@Around("execution(* com.myexample.springboot.rest.controller.*.post*(..)) && args(bean) ||  execution(* com.myexample.springboot.rest.controller.*.test*(..)) && args(bean) ")
    public Bean logMethodAccessBefore(ProceedingJoinPoint  proceedingJoinPoint, Bean bean) throws Throwable {
        System.out.println("***** Starting: " + proceedingJoinPoint.getSignature().getName() + " *****");
        
        Bean bean1=(Bean) proceedingJoinPoint.proceed(new Object[] {bean});
       
       
        System.out.println("***** End: " + proceedingJoinPoint.getSignature().getName() + " *****");
        
       // System.out.println(bean.getName());
        
        return bean;
    }
    
	

}


