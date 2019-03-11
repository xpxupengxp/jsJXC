package com.js.util.logSave;

import com.js.entity.SysOprateLog;
import com.js.service.SysOprateLogService;
import com.js.util.ApiResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;


@Aspect
@Component
public class SysLogAspect {

    @Autowired
    private SysOprateLogService sysOprateLogService;

    private static final Logger logger = LoggerFactory.getLogger(SysLogAspect.class);

    @Pointcut("@annotation(com.js.util.logSave.OperationLogger)")
    public void controllerAspect() {

    }

    /**
     * 后置通知，用于拦截Controller 层记录用户的操作
     * @param joinPoint
     */
//    @After("controllerAspect()")
//    public void doAfter(JoinPoint joinPoint) {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
//                .getRequestAttributes()).getRequest();
//        String ip = request.getRemoteAddr();
//        try {
//            String targetName = joinPoint.getTarget().getClass().getName();
//            String methodName = joinPoint.getSignature().getName();
//            Object[] arguments = joinPoint.getArgs();
//            Class targetClass = Class.forName(targetName);
//            Method[] methods = targetClass.getMethods();
//            String actType = "";
//            for (Method method : methods) {
//                if (method.getName().equals(methodName)) {
//                    Class[] clazzs = method.getParameterTypes();
//                    if (clazzs.length == arguments.length) {
//                        actType = method.getAnnotation(OperationLogger.class).actType();
//                    }
//                }
//            }
//            SysOprateLog sysOprateLog = new SysOprateLog();
//            sysOprateLog.setActType(actType);
//            sysOprateLog.setObjectId("0000");
//            sysOprateLog.setUpdatetime(new Date());
//            sysOprateLog.setIp(ip);
//            sysOprateLogService.insert(sysOprateLog);
//        }catch (Exception e) {
//            logger.error("异常信息：",e.getMessage());
//        }
//    }

    /**
     * Around通知(成功存入数据库将保存操作日志)
     * @param joinPoint
     * @return
     * @throws java.lang.Throwable
     */
    @Around("controllerAspect()")
    public Object processTx(ProceedingJoinPoint joinPoint) throws java.lang.Throwable {
        Object[] args = joinPoint.getArgs();
        Object rvt = joinPoint.proceed(args);
        ApiResponse a = (ApiResponse)rvt;
        if(a.getCode() != 200) {
            return rvt;
        }
        if(a.getData() != null) {
            ApiResponse b = (ApiResponse)a.getData();
            if(b.getCode() != 200) {
                return rvt;
            }
        }
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        String ip = request.getRemoteAddr();
        try {
            String targetName = joinPoint.getTarget().getClass().getName();
            String methodName = joinPoint.getSignature().getName();
            Object[] arguments = joinPoint.getArgs();
            Class targetClass = Class.forName(targetName);
            Method[] methods = targetClass.getMethods();
            String actType = "";
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    Class[] clazzs = method.getParameterTypes();
                    if (clazzs.length == arguments.length) {
                        actType = method.getAnnotation(OperationLogger.class).actType();
                    }
                }
            }
            SysOprateLog sysOprateLog = new SysOprateLog();
            sysOprateLog.setActType(actType);
            sysOprateLog.setObjectId("0000");
            sysOprateLog.setUpdatetime(new Date());
            sysOprateLog.setIp(ip);
            sysOprateLogService.insert(sysOprateLog);
        }catch (Exception e) {
            logger.error("异常信息：",e.getMessage());
        }
        return rvt;
    }

    @AfterThrowing(value = "controllerAspect()",throwing = "e")
    public void doAfter(JoinPoint joinPoint,Exception e) {
        //---------异常通知--------
    }

}
