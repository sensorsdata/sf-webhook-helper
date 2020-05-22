package com.sensorsdata.webhook.exception;

/**
 * 请求中止异常，预期内的异常，抛出该异常时不影响 webhook 返回结果，按发送成功处理
 */
public final class AbortException extends RuntimeException {
  public AbortException(String message) {
    super(message);
  }
}
