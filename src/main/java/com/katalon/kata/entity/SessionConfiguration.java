package com.katalon.kata.entity;

public class SessionConfiguration {

  private String sessionId;

  private Boolean disableScreenshot;

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public Boolean getDisableScreenshot() {
    return disableScreenshot;
  }

  public void setDisableScreenshot(Boolean disableScreenshot) {
    this.disableScreenshot = disableScreenshot;
  }
}
