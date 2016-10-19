package com.iotekclass.admin.config;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *@description 用户登录表单提交认证过滤器
 *
 *@author honestAnt
 *@date   2016/10/11 17:00
 *@since V1.0
 *
 */
@Component("customFormAuthenticationFilter")
public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {

    @Autowired
    ShiroFilterFactoryBean shiroFilter;

    public CustomFormAuthenticationFilter() {
        if(shiroFilter != null) {
            shiroFilter.getFilters().put("authc",this);
        }
    }

    /**
     * 自定义登录成功处理
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
                                     ServletResponse response) throws Exception {

        issueSuccessRedirect(request, response);
        return false;
    }
}
