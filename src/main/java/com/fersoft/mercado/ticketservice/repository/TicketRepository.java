package com.fersoft.mercado.ticketservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.fersoft.mercado.ticketservice.domain.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

	Ticket findTicketByNumeroPremiado(Integer numeroticket);

	Ticket findTicketByProdutoid(Integer productId);

}
