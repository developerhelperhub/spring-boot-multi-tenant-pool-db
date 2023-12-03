package com.developerhelperhub.app;

import java.util.Map;

import org.hibernate.cfg.AvailableSettings;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.stereotype.Component;

@Component
public class TenantIdentifierResolver
    implements CurrentTenantIdentifierResolver, HibernatePropertiesCustomizer {

  private ThreadLocal<String> currentTeantId = new ThreadLocal<>();

  public TenantIdentifierResolver() {
    setCurrentTeantId("NOT_SET_CURRENT_TENANT_ID");
  }

  public void setCurrentTeantId(String currentTeantId) {
    this.currentTeantId.set(currentTeantId);
  }

  public void removeCurrentTeantId() {
    this.currentTeantId.remove();
  }

  @Override
  public String resolveCurrentTenantIdentifier() {
    return this.currentTeantId.get();
  }

  @Override
  public void customize(Map<String, Object> hibernateProperties) {
    hibernateProperties.put(AvailableSettings.MULTI_TENANT_IDENTIFIER_RESOLVER, this);
  }

  @Override
  public boolean validateExistingCurrentSessions() {
    return true;
  }

}