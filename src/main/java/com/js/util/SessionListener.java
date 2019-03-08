package com.js.util;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Map;

public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent event) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        //在session销毁的时候 把loginMap中保存的键值对清除
        String account = event.getSession().getAttribute("account").toString();
        if(account!=null){
            Map<String, String> loginMap = (Map<String, String>)event.getSession().getServletContext().getAttribute("loginMap");
            loginMap.remove(account);
            event.getSession().getServletContext().setAttribute("loginMap",loginMap);
            System.out.println(account+"用户注销！");
        }
    }
}
