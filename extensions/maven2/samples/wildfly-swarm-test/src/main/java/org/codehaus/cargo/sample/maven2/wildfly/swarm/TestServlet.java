/*
 * ========================================================================
 *
 *  Codehaus CARGO, copyright 2004-2011 Vincent Massol, 2012-2019 Ali Tokmen.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  ========================================================================
 */
package org.codehaus.cargo.sample.maven2.wildfly.swarm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Testing servlet.
 * */
@WebServlet("/*")
public class TestServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException
    {
        resp.getWriter().write("Test successful, property value:"
                + System.getProperty("org.test.property"));
        resp.getWriter().close();
    }
}
