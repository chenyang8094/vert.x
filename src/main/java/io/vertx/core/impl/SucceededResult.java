/*
 * Copyright (c) 2011-2013 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.core.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class SucceededResult<T> implements Future<T> {

  private final T result;

  public SucceededResult(T result) {
    this.result = result;
  }

  @Override
  public T result() {
    return result;
  }

  @Override
  public Throwable cause() {
    return null;
  }

  @Override
  public boolean succeeded() {
    return true;
  }

  @Override
  public boolean failed() {
    return false;
  }

  @Override
  public boolean isComplete() {
    return true;
  }

  @Override
  public Future<T> setHandler(Handler<AsyncResult<T>> handler) {
    if (handler != null) {
      handler.handle(this);
    }
    return this;
  }

  @Override
  public void complete(T result) {
    throw new IllegalStateException();
  }

  @Override
  public void complete() {
    throw new IllegalStateException();
  }

  @Override
  public void fail(Throwable throwable) {
    throw new IllegalStateException();
  }

  @Override
  public void fail(String failureMessage) {
    throw new IllegalStateException();
  }
}
