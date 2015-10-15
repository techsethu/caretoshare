package com.bubblesoft.service;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class CORSFilter implements ContainerResponseFilter {

	public void filter(ContainerRequestContext creq,
					   ContainerResponseContext cresp) throws IOException {
		cresp.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
		cresp.getHeaders().putSingle("Access-Control-Allow-Credentials", "true");
		cresp.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
		cresp.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");
	}
}