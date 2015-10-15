
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
    	list.add(new Status("Discussion",false));
    	list.add(new Status("Chat",false));
    	list.add(new Status("Survey",false));
    	list.add(new Status("Test",false));
    	list.add(new Status("Test",true));
    	list.add(new Status("Test",true));
    	return list;
    }
}

