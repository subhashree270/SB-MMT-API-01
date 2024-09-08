package com.subha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subha.binding.Request;
import com.subha.binding.Response;
import com.subha.service.MMTService;

@RestController
@RequestMapping("/mmt")
public class MMTController {
	@Autowired
	private MMTService mmtService;
	
	@PostMapping("/bookTicket")
	public ResponseEntity<Response> ticketBooking(@RequestBody Request req){
		 Response ticket = mmtService.bookTicket(req);
		 return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping("/getTickets")
	public ResponseEntity<List<Response>> getAllTickets(){
		 List<Response> tickets = mmtService.getAllTickets();
		 return new ResponseEntity<>(tickets,HttpStatus.OK);
	}

}
