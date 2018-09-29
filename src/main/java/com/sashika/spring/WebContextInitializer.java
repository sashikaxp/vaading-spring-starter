package com.sashika.spring;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;


public class WebContextInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) {
        //XmlWebApplicationContext context = new XmlWebApplicationContext();
        new AnnotationConfigWebApplicationContext();
    }

}
