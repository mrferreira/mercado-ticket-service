package com.fersoft.mercado.ticketservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fersoft.mercado.ticketservice.domain.Ticket;
import com.fersoft.mercado.ticketservice.repository.TicketRepository;

@RestController
public class TicketController {

	@Autowired
	TicketRepository ticketRepository;
	
	@GetMapping("/ticket")
	public Iterable<Ticket> all() {
		return ticketRepository.findAll();
	}
	
	@RequestMapping(value = "/ticket/{numeroticket}", method=RequestMethod.GET)
	public Ticket findByTicketId(@PathVariable Integer numeroticket) {
		return ticketRepository.findTicketByNumeroPremiado(numeroticket);
	}
	
	@RequestMapping(value = "/ticket/produto/{productId}", method=RequestMethod.GET)
	public Ticket findByProductId(@PathVariable Integer productId) {
		return ticketRepository.findTicketByProdutoid(productId);
	}
}
