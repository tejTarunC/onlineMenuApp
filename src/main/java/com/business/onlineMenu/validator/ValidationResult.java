package com.business.onlineMenu.validator;

import io.micrometer.common.util.StringUtils;

import java.util.Optional;

public class ValidationResult {

  private final boolean isValid;
  private Optional<String> errorMessage;

  /**
   * No Error constructor
   */
  public ValidationResult() {
    this.isValid = true;
  }

  public ValidationResult(final String errorMessage) {
    if (StringUtils.isEmpty(errorMessage)) {
      this.isValid = true;
    } else {
      this.isValid = false;
      this.errorMessage = Optional.of(errorMessage);
    }
  }

  public Boolean isValid() {
    return isValid;
  }

  public String getErrorMessage() {
    return errorMessage.orElse(null);
  }
}

