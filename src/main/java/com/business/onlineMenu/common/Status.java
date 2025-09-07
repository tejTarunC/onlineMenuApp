package com.business.onlineMenu.common;


public enum Status {

  OK(200, "Request succeeded"),
  CREATED(201, "Resource created"),
  ACCEPTED(202, "Request accepted"),
  NO_CONTENT(204, "No content found"),
  PARTIAL(206, "Request partially succeeded"),
  MOVED_PERMANENT(301, "Moved permanently"),
  FOUND(302, "Found"),
  SEE_OTHER(303, "See Other"),
  NOT_MODIFIED(304, "Not Modified"),
  TEMPORARY_REDIRECT(307, "temporary Redirect"),
  BAD_REQUEST(400, "Bad Request"),
  UNAUTHORIZED(401, "Unauthorized"),
  FORBIDDEN(403, "Forbidden"),
  NOT_FOUND(404, "Not found"),
  METHOD_NOT_ALLOWED(405, "Method not allowed"),
  NOT_ACCEPTABLE(406, "Not acceptable media type"),
  REQUEST_TIMEOUT(408, "Request timeout"),
  CONFLICT(409, "Request Conflict"),
  REQUEST_ENTITY_TOO_LARGE(413, "Request entity too large"),
  UNSUPPORTED_MEDIA_TYPE(415, "Unsupported media type"),
  UNPROCESSABLE_ENTITY(422, "Unprocessable Entity"),
  FAIL(500, "Server error"),
  BAD_GATEWAY(502, "Bad gateway"),
  SERVICE_UNAVAILABLE(503, "Service unavailable"),
  GATEWAY_TIMEOUT(504, "Gateway Timeout");

  private final int code;
  private final String description;

  public String getDescription() {
    return description;
  }

  public int getCode() {
    return code;
  }

  Status(int code, String description) {
    this.description = description;
    this.code = code;
  }

}

