package com.che.sc.interceptor;

import com.che.sc.antotation.AuthAnnotation;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Auther: chejs
 * @Date: 2019/7/29 23:51
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        AuthAnnotation authAnnotation = method.getAnnotation(AuthAnnotation.class);
        if(authAnnotation!=null && authAnnotation.permission()) {
            String uuid = request.getParameter("uuid");
            if(uuid!=null &&  !"".equals(uuid)) {
                //验证。。。

                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
