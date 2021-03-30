package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RestClient;




@Path("/test")
public class GreetingResource {
    @RestClient
    @Inject 
    Bad_ssl bad_ssl;
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response Test() {
       return bad_ssl.certificate();

    }
}