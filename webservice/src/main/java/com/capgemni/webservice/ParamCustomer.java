package com.capgemni.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Consumes;
@Path("/param/json")
public class ParamCustomer {
	
	 /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Customer getIt(@QueryParam("id") int a) {
       Customer c=new Customer();
       c.setId(a);
       c.setAbc("vikas");
       
       return c;
       
    }

}
