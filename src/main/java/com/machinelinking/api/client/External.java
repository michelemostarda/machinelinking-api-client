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

import java.net.URL;

/**
 * Defines an external resource.
 *
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class External {

    private final String label;
    private final URL url;
    private final String resource;

    public External(String label, URL url, String resource) {
        this.label = label;
        this.url = url;
        this.resource = resource;
    }

    public String getLabel() {
        return label;
    }

    public URL getUrl() {
        return url;
    }

    public String getResource() {
        return resource;
    }

    @Override
    public String toString() {
        return String.format("label: [%s], url: %s, resource: %s", label, url, resource);
    }
}
