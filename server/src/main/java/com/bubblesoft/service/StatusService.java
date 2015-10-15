
package com.bubblesoft.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bubblesoft.model.Status;

@Path("status")
public class StatusService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public List<Status> getStatus(@PathParam("id") String id) {
        
    	List<Status> list = new ArrayList<Status>();
    	list.add(new Status("Payload Submission",true));
    	list.add(new Status("Invoice",true));
    	list.add(new Status("EPRINT",true));
    	list.add(new Status("PRINT",true));
    	list.add(new Status("FTP_COMPLETE",true));
    	list.add(new Status("PENDING Payment",true));
    	list.add(new Status("SEND MAIL",true));
    	list.add(new Status("ARCHIVE",false));
    	list.add(new Status("WIPE",false));
    	list.add(new Status("PURGE",false));
    	list.add(new Status("DELETE",false));
    	list.add(new Status("COMPLETE",false));
    	return list;
    }
}

