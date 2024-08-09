package com.H.IT.IT_support_Service.Service;


import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;

import java.util.List;

public interface TicketsService {
    TicketSupport addTicketSupport(TicketSupport ticketSupport);
    void deleteTickets(int id);
    List<TicketSupport> getAllTickets();
    TicketSupport getTicket (Integer id);
    TicketSupport linkTicket(Integer id ,TicketSupport ticketSupport);
}
