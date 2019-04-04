package com.claudio.deviceplugin.controller;


import com.claudio.deviceplugin.domain.Account;
import com.claudio.deviceplugin.domain.ResponseEntity;
import com.claudio.deviceplugin.service.AccountService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/devicePlugin")
public class Controller {

    @Inject
    private AccountService accountService;
    @GET
    @Path("/getData")
    @Produces(MediaType.APPLICATION_XML)
    public Response getData(@QueryParam("accountCode") String accountCode,
                            @QueryParam("targetDevice") String targetDevice,
                            @QueryParam("pluginVersion") String pluginVersion) {
        Optional<Account> account = accountService.getAccount(accountCode);
        if(!account.isPresent()){
            return Response.status(Response.Status.ACCEPTED)
                    .entity(new ResponseEntity()).build();
        }
        ResponseEntity response = new ResponseEntity();
        Account accountConfig = account.get();
        response.setHost(accountConfig.getHosts().get(0).getAddress());
        response.setPing(accountConfig.getPingTime());
        response.setViewCode(accountConfig.get);
        return Response.status(Response.Status.ACCEPTED)
                .entity(response).build();
    }

}
