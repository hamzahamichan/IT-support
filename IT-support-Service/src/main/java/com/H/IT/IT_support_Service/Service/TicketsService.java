package com.H.IT.IT_support_Service.Service;

import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;

public interface TicketsService {
    TicketSupport addTicketSupport(TicketSupport ticketSupport);
    void deleteTickets(Integer id_ticket);
}
