package com.business.onlineMenu.api;

import com.business.onlineMenu.common.ServiceResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractAPI {

  @Autowired
  protected ServiceResponseBuilder serviceResponseBuilder;
}
