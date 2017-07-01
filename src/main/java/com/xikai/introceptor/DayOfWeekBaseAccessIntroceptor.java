package com.xikai.introceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

/**
 * Created by xikaixiong on 2/22/17.
 */
public class DayOfWeekBaseAccessIntroceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LocalDate date = LocalDate.now();
        // be careful with letter case
        if(date.getDayOfWeek().toString().equals("SATURDAY")){
            response.getWriter().write("wrong day of working");
            return false;
        }
        return true;
    }
}
