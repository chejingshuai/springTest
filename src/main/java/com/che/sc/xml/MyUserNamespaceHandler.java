package com.che.sc.xml;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Description:
 * @Auther: chejs
 * @Date: 2019/7/25 22:58
 */
public class MyUserNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
