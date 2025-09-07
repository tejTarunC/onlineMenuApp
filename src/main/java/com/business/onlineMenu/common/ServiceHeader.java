package com.business.onlineMenu.common;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ServiceHeader implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Map<String, Object> headerAttributes;

  public ServiceHeader(){super();}

  public ServiceHeader(Map<String, Object> headerAttributes){
    super();
    this.headerAttributes = headerAttributes;
  }

  public Map<String, Object> getHeaderAttributes(){
    if(headerAttributes == null){
      headerAttributes = new HashMap<String, Object>();
    }
    return headerAttributes;
  }

  public ServiceHeader setHeaderAttributes(Map<String, Object> headerAttributes){
    this.headerAttributes = headerAttributes;
    return this;
  }

  public ServiceHeader addHeaderAttribute(String key, Object value) {
    getHeaderAttributes().put(key, value);
    return this;
  }

  /**
   * @param key
   * @return
   */
  public Object getHeaderAttribute(String key) {
    return getHeaderAttributes().get(key);
  }

  /**
   * @param key
   * @return
   */
  public boolean containsHeaderAttribute(String key) {
    return getHeaderAttributes().containsKey(key);
  }

  /**
   * @param key
   * @return
   */
  public Object removeHeaderAttribute(String key) {
    return getHeaderAttributes().remove(key);
  }

  @Override
  public String toString() {
    return "ServiceHeader [headerAttributes=" + headerAttributes + "]";
  }
}
