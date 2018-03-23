/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.config;

/**
 *
 * @author ADITYA
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class[] getRootConfigClasses() {
    return new Class[]{AppConfig.class};  
    }

    @Override
    protected Class[] getServletConfigClasses() {
     return null;  
    }

    @Override
    protected String[] getServletMappings() {
       return new String[]{"/"};
    }
     
}
