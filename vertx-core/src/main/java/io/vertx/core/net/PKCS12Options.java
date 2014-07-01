/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.vertx.core.net;

/**
 * Key or trust store options configuring private key and/or certificates based on PKCS#12 files.<p>
 * When used as a key store, it should point to a store containing a private key and its certificate.<p>
 * When used as a trust store, it should point to a store containing a list of accepted certificates.<p>
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class PKCS12Options implements KeyStoreOptions, TrustStoreOptions {

  private String password;
  private String path;

  public PKCS12Options() {
    super();
  }

  public PKCS12Options(PKCS12Options other) {
    super();
    this.path = other.path;
  }

  public String getPassword() {
    return password;
  }

  public PKCS12Options setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getPath() {
    return path;
  }

  public PKCS12Options setPath(String path) {
    this.path = path;
    return this;
  }

  @Override
  public PKCS12Options clone() {
    return new PKCS12Options(this);
  }
}
