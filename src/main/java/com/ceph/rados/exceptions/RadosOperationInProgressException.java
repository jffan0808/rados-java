/*
 * RADOS Java - Java bindings for librados
 *
 * Copyright (C) 2014 1&1 - Behar Veliqi <behar.veliqi@1und1.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package com.ceph.rados.exceptions;

/**
 * Thrown when a operation is being called which is already in progress, e.g. Rados#connect()
 */
public class RadosOperationInProgressException extends RadosException {

    /**
     * @param message the message
     * @param returnValue the native error code
     */
    public RadosOperationInProgressException(String message, int returnValue) {
        super(message, returnValue);
    }

}
