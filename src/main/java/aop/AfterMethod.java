package aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterMethod implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        System.out.println("AfterMethod : После метода!");
        System.out.println("returnValue="+returnValue);
        System.out.println("method="+method);
        System.out.println("target="+target);
        for (Object obj:args) System.out.println("argument="+obj);
    }
}