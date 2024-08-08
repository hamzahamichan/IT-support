package com.H.IT.IT_support_Service.Service;

import com.H.IT.IT_support_Service.Model.DTO.TicketSupportDto;
import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;
import com.H.IT.IT_support_Service.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketSerImpl implements  TicketsService{
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public TicketSupport addTicketSupport(TicketSupport ticketSupport) {
        ticketSupport.setDate_creation(ticketSupport.getDate_creation().atStartOfDay().toLocalDate());
        return this.ticketRepository.save(ticketSupport);
    }

    @Override
    public void deleteTickets(Integer id_ticket) {

    }
}
