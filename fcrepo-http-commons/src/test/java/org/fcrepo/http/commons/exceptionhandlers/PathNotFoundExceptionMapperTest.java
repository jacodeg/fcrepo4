/**
 * Copyright 2013 DuraSpace, Inc.
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
 */

package org.fcrepo.http.commons.exceptionhandlers;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;
import static org.junit.Assert.assertEquals;

import javax.jcr.PathNotFoundException;
import javax.ws.rs.core.Response;

import org.fcrepo.http.commons.exceptionhandlers.PathNotFoundExceptionMapper;
import org.junit.Before;
import org.junit.Test;

public class PathNotFoundExceptionMapperTest {

    private PathNotFoundExceptionMapper testObj;

    @Before
    public void setUp() {
        testObj = new PathNotFoundExceptionMapper();
    }

    @Test
    public void testToResponse() {
        PathNotFoundException input = new PathNotFoundException();
        Response actual = testObj.toResponse(input);
        assertEquals(NOT_FOUND.getStatusCode(), actual.getStatus());
    }
}