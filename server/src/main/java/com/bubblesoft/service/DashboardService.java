package com.bubblesoft.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bubblesoft.model.Dashboard;

@Path("dashboards")
public class DashboardService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Dashboard> getDashboards() {
        
    	List<Dashboard> list = new ArrayList<Dashboard>();
    	list.add(new Dashboard("Discussion","Discussion Made life easier"));
    	list.add(new Dashboard("Chat","Chasdfasdfat"));
    	list.add(new Dashboard("Survey","Survasdfasdfey"));
    	list.add(new Dashboard("Test","Teasdfasdfst"));
    	list.add(new Dashboard("Test","Teasdfasdfst"));
    	list.add(new Dashboard("Test","Tesasdfasdft"));
    	return list;
    }
}
