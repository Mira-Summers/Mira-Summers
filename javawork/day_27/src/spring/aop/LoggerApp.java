package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 通知类：目前增强的部分
 * @Aspect 声明当前类为一个切面类
 */
@Component
@Aspect
public class LoggerApp {
    /**
     * 声明切入点表达式
     */

    public void pt01(){
    }
    @Pointcut("execution(* spring.service.TestService.method*(..))")

    @Before("pt01()")
    public void beforeAdvice(){
        System.out.println("前置通知开始收集日志~~~~");
    }
    public void afterAdvice(){
        System.out.println("后置通知开始收集日志~~~");
    }
    public void endAdvice(){
        System.out.println("");
    }
    /**
     * 环绕通知
     */
    public void arroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("前置通知手机日志：");
            //调用目标方法
            Object proceed=proceedingJoinPoint.proceed();
            //调用方法的参数
            Object[] args=proceedingJoinPoint.getArgs();
            if(args!=null&&args.length>0){
                for (Object arg:args){
                    System.out.println(arg);
                }
            }
            System.out.println("后端收集日志");
        }catch (Throwable e){
            System.out.println("异常收集日志");
            throw new RuntimeException(e);
        }finally {
            System.out.println("最终收集日志");
        }
    }
}
