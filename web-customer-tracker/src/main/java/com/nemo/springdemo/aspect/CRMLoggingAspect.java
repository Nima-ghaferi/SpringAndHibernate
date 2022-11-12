package com.nemo.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.nemo.springdemo.controller.*.*(..))")
    public void forControllerPackage(){}

    @Pointcut("execution(* com.nemo.springdemo.service.*.*(..))")
    public void forServicePackage(){}

    @Pointcut("execution(* com.nemo.springdemo.dao.*.*(..))")
    public void forDaoPackage(){}

    @Pointcut("forControllerPackage() || forDaoPackage() || forDaoPackage()")
    public void forAppFlow(){}


    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("=========> in @Before: calling method: " + methodName);
        Object[] args = joinPoint.getArgs();

        for (Object arg: args) {
            logger.info("===========> arg: " + arg);
        }
    }

    @AfterReturning(pointcut = "forAppFlow()", returning = "result")
    public void afterReturning (JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().toShortString();
        logger.info("=========> in @AfterReturning: from method: " + methodName);
        logger.info("=========> result:" + result);
    }
}
