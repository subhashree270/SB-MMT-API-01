package com.subha.service;

import java.util.List;

import com.subha.binding.Request;
import com.subha.binding.Response;

public interface MMTService {
	public Response bookTicket(Request req);
	public List<Response> getAllTickets();

}
