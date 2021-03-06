package com.consoleconnect.mw.sonarqube.sample.entity;

import java.util.Collection;

public class User {

  private int b;
  
  private final String id;

  private String username;

  private String email;

  private String password;

  private Collection<Role> roles;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Collection<Role> getRoles() {
    return roles;
  }

  public void setRoles(Collection<Role> roles) {
    this.roles = roles;
  }

  public String getId() {
    return id;
  }

  public User(String id) {
    super();
    this.id = id;
  }
  
  public boolean testMe() {
    System.out.println("Test me pls");
    return true;
  }

}
