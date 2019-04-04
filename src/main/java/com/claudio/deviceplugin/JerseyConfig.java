package com.claudio.deviceplugin;

import com.claudio.deviceplugin.controller.Controller;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        registerEndpoints();

    }

    private void registerEndpoints() {
        register(Controller.class);
    }

}
