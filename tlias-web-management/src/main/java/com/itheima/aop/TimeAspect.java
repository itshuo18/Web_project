package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName: TimeAspect
 * Package: com.itheima.aop
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/5/5 19:41
 * @Version: 1.0
 */
@Slf4j
@Component
@Aspect // AOP类
public class TimeAspect {
    @Pointcut("execution(* com.itheima.service.*.*(..))")
    private void pt(){}
    @Around("pt()")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String className = joinPoint.getTarget().getClass().getName(); // 获取目标类名
        Signature signature= joinPoint.getSignature(); // 获取目标方法签名
        String methodName= joinPoint.getSignature().getName(); // 获取目标方法名
        Object[] args = joinPoint.getArgs(); // 获取目标方法运行参数

        long begin = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // 执行原始方法，获取返回值

        long end = System.currentTimeMillis();
        log.info(joinPoint.getSignature()+"执行耗时: {}毫秒",end-begin);
        return result;
    }

    @Before("pt()")
    public void before(JoinPoint joinPoint) throws Throwable {
        String className = joinPoint.getTarget().getClass().getName(); // 获取目标类名
        Signature signature= joinPoint.getSignature(); // 获取目标方法签名
        String methodName= joinPoint.getSignature().getName(); // 获取目标方法名
        Object[] args = joinPoint.getArgs(); // 获取目标方法运行参数

    }
}
