package com.capgemni.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/param/xml")
public class XmlCustomer {
	 /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{id}")
    public Customer1 getIt(@PathParam("id") int a) {
      Customer1 c=new Customer1();
       c.setId(a);
       c.setAbc("raju");
       
       return c;
       
    }

}


