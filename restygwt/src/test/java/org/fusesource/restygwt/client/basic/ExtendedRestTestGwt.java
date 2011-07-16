/**
 * Copyright (C) 2009-2011 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
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
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, is strictly prohibited.
 */
package org.fusesource.restygwt.client.basic;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

/**
 */
public class ExtendedRestTestGwt extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "org.fusesource.restygwt.BasicTestGwt";
    }

    public void testCreateRestAction() {
        try {
            LoginService action = GWT.create(LoginService.class);
            assertNotNull(action);
        } catch (Exception e) {
            fail(" generator failed at creating an interface which " +
                    "has an intermediate interface between it and its RestService");
        }
    }

    public void testCreateRestSericeWithCollectionsAction() {
        try {
            CollectionService action = GWT.create(CollectionService.class);
            assertNotNull(action);
        } catch (Exception e) {
            fail(" generator failed at creating an interface with collection interface or collection impl " +
                    "as argument of method of a RestService");
        }
    }

}
