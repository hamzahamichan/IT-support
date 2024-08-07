package com.H.IT.IT_support_Service.Service;

import com.H.IT.IT_support_Service.Model.DTO.TicketSupportDto;
import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;

public interface TicketsService {
    TicketSupportDto addTicketSupport(TicketSupport ticketSupport);
    void deleteTickets(Integer id_ticket);
}
