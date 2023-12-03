package com.developerhelperhub.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class TenantInterceptorConfig implements WebMvcConfigurer {

  @Autowired
  private TenantIdentifierResolver resolver;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new TenantHandlerInterceptor(this.resolver));
  }

}
