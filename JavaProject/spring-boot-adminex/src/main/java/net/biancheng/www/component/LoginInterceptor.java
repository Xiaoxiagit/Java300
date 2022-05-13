package net.biancheng.www.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 目标方法执行前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception{
        Object loginUser =request.getSession().getAttribute("loginuser");
        if(loginUser == null){
            //未登录，返回登陆页
            request.setAttribute("msg","您没有权限进行此操作，请先登陆！");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else{
            return true;
        }
    }

    /**
     * 目标方法执行后
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)throws Exception{
        log.info("postHandle执行{}",modelAndView);
    }

    /**
     * 页面渲染后
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception{
        log.info("afterCompletion执行异常{}",ex);
    }
}
