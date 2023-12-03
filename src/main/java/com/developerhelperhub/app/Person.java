package com.developerhelperhub.app;

import org.hibernate.annotations.TenantId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

  @Id
  private int personId;

  @TenantId
  @Column(name = "tenant")
  private String tenant;

  @Column(name = "name")
  private String name;

  @Override
  public String toString() {
    return "Person [personId=" + personId + ", tenant=" + tenant + ", name=" + name + "]";
  }

}
