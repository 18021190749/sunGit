package com.spittr.util;

import com.spittr.entity.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-13 19:37
 */
@Aspect
@Component
public class Aop {
    private static int paramNum;

    static {
        try {
            Method[] methods = Class.forName("com.spittr.util.ValidateData").getDeclaredMethods();
            for(Method method :methods){
                if("processRegistration".equals(method.getName())){
                    paramNum = method.getParameterCount();
                }else {
                    paramNum = 0;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Pointcut("execution(* com.spittr.util.ValidateData.processRegistration(..))")
    public void validate() {
    }

    @Before(value = "validate()")
    public void before() {
    }

    @Around("validate()")
    public void around(ProceedingJoinPoint joinPoint) {
        try {

            System.out.println("前");
            Object[] args = joinPoint.getArgs();
            if (args.length == paramNum) {
                for (int i = 0; i < paramNum - 1; i++) {
                    User user = (User) args[i];
                    System.out.println("aop:"+user.toString());
                }
            }
            joinPoint.proceed();
            System.out.println("后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
