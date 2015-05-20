package org.keycloak.stian.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("public")
    public Message getPublic() {
        return new Message("Public Endpoint");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("secured")
    public Message getSecured() {
        return new Message("Secured Endpoint");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("admin")
    public Message getAdmin() {
        return new Message("Admin Endpoint");
    }

}
