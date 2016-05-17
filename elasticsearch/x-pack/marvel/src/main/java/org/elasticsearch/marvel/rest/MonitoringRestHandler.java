/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.marvel.rest;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.xpack.rest.XPackRestHandler;

public abstract class MonitoringRestHandler extends XPackRestHandler {

    protected static String URI_BASE = XPackRestHandler.URI_BASE + "/monitoring";

    public MonitoringRestHandler(Settings settings, Client client) {
        super(settings, client);
    }
}
