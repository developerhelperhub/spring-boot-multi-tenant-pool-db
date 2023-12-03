package com.developerhelperhub.app;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TenantHandlerInterceptor implements HandlerInterceptor {

  private TenantIdentifierResolver resolver;

  public TenantHandlerInterceptor(TenantIdentifierResolver resolver) {
    this.resolver = resolver;
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    System.out.println("Tenant Id " + request.getHeader("TenantId"));

    if (request.getHeader("TenantId").trim().isEmpty()) {
      System.out.println("Tenant id not found in the header");
      return false;
    }

    this.resolver.setCurrentTeantId(request.getHeader("TenantId"));

    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {

  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, Exception ex) throws Exception {
  }
}
