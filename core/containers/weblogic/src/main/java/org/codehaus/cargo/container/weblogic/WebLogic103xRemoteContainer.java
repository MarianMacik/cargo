/*
 * ========================================================================
 *
 * Codehaus CARGO, copyright 2004-2011 Vincent Massol, 2012-2019 Ali Tokmen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.container.weblogic;

import org.codehaus.cargo.container.configuration.RuntimeConfiguration;
import org.codehaus.cargo.container.weblogic.internal.AbstractWebLogicRemoteContainer;

/**
 * Special container support for the Bea WebLogic 10.3.x application server. Contains WLST support.
 */
public class WebLogic103xRemoteContainer extends AbstractWebLogicRemoteContainer
{

    /**
     * Unique container id.
     */
    public static final String ID = "weblogic103x";

    /**
     * {@inheritDoc}
     * @see AbstractWebLogicRemoteContainer#AbstractWebLogicRemoteContainer(org.codehaus.cargo.container.configuration.RuntimeConfiguration)
     */
    public WebLogic103xRemoteContainer(RuntimeConfiguration configuration)
    {
        super(configuration);
    }

    /**
     * {@inheritDoc}
     * @see org.codehaus.cargo.container.Container#getName()
     */
    @Override
    public String getName()
    {
        return "WebLogic 10.3.x";
    }

    /**
     * {@inheritDoc}
     * @see org.codehaus.cargo.container.Container#getId()
     */
    @Override
    public String getId()
    {
        return ID;
    }
}
