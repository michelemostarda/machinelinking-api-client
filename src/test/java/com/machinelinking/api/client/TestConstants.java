/*
 *  Copyright 2013 MachineLinking S.r.l.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.machinelinking.api.client;

/**
 * Defines parameters to access the <i>MachineLinking API</i>.
 *
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class TestConstants {

    /*************************************************************************************
     NOTE: these test cases require a valid application ID and KEY. To get a free one
     please refer to https://machinelinking.3scale.net/login
     *************************************************************************************/

    /**  Application ID. */
    public static final String APP_ID  = System.getProperty("ml.app.id", "missing.app.id");
    /**  Application KEY. */
    public static final String APP_KEY = System.getProperty("ml.app.key", "missing.app.key");

    private TestConstants() {}

}
