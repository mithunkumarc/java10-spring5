package com.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



//initializing container to load all beans defined in rootconfig and webconfig
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[] {};
   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] { WebConfig.class };
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }
}
