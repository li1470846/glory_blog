package com.zking.ssm.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageAspect {

    /**
     * 环绕通知
     * @param args
     * @return
     * @throws Throwable
     */

    @Around("execution(* *..*Service.*Page(..))")
    public Object invoke(ProceedingJoinPoint args) throws Throwable{

        //获取目标方法传递过来的参数集合
        Object[] params = args.getArgs();

        //分页
        PageBean pageBean = null;
        for (Object param : params) {
            if (param instanceof PageBean){
                pageBean = (PageBean)param;
                break;
            }
        }

        if (pageBean != null && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        Object proceed = args.proceed(params);

        if (pageBean != null && pageBean.isPagination()){
            PageInfo pageInfo = new PageInfo((List)proceed);
            pageBean.setTotal(pageInfo.getTotal()+"");
        }

        return proceed;
    }
}
