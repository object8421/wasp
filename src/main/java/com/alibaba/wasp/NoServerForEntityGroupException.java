/**
 * Copyright 2010 The Apache Software Foundation
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.wasp;


/**
 * Thrown when no FServer can be found for a entityGroup
 */
public class NoServerForEntityGroupException extends EntityGroupException {
  private static final long serialVersionUID = 1L << 11 - 1L;

  /** default constructor */
  public NoServerForEntityGroupException() {
    super();
  }

  /**
   * Constructor
   * @param s message
   */
  public NoServerForEntityGroupException(String s) {
    super(s);
  }
}
