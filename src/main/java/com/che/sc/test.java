package com.che.sc;

import com.che.sc.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Auther: chejs
 * @Date: 2019/7/25 23:22
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext beans=new ClassPathXmlApplicationContext("classpath:application-customtag.xml");
        User user=(User)beans.getBean("testBean");
        System.out.println("username:"+user.getUserName()+":"+"email:"+user.getEmail());
    }
}
