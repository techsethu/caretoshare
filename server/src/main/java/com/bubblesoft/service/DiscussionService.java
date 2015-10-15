
package com.bubblesoft.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bubblesoft.model.Discussion;

@Path("discussions")
public class DiscussionService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Discussion> getdiscussions() {
        
    	List<Discussion> list = new ArrayList<Discussion>();
    	list.add(new Discussion("Discussion","Discussion Made life easier"));
    	list.add(new Discussion("Chat","Chat"));
    	list.add(new Discussion("Survey","Survey"));
    	list.add(new Discussion("Test","Test"));
    	list.add(new Discussion("Test","Test"));
    	list.add(new Discussion("Test","Test"));
    	return list;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Discussion getdiscussion(@PathParam("id") String id) {
    	
    	return new Discussion("abcd","xyz");
    }
}

