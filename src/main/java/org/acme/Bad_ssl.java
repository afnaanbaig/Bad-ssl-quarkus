package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
@ApplicationScoped
@RegisterRestClient(configKey = "Bad-ssl")
public interface Bad_ssl {
    // @Path("/")
    // @GET
    // public Response bad_ssl();


    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@GET
	public Response certificate();



}
