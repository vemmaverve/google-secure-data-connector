/* Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id$
 */
package com.google.dataconnector.client;

/**
 * Exception thrown by strategies which will cause a reply with error to be
 * sent back to the cloud.
 */
public class StrategyException extends Exception {

	private static final long serialVersionUID = 1L;

	public StrategyException(String message, Throwable th) {
		super(message, th);
	}

	public StrategyException(String message) {
		super(message);
	}
}
