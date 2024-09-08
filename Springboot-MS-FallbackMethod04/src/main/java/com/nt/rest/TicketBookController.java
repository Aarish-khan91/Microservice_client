package com.nt.rest;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/ticket")
public class TicketBookController {

	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "dummyBookTickets")//method name must be match with fallback given class method
	public ResponseEntity<String> BookTickets() {
		System.out.println("TicketBookController.BookTicket()");

		if (new Random().nextInt(10) < 5)
			throw new RuntimeException("Ticket b.logic method executed");

		return new ResponseEntity<>("Ticket Booked Successfully", HttpStatus.OK);
	}

	//fallback method
	public ResponseEntity<String> dummyBookTickets() {
		System.out.println("TicketBookController.dummyBookTickets()");

		return new ResponseEntity<>("Problem in Ticket booking... incovinence is regrated.", HttpStatus.BAD_GATEWAY);
	}
}
