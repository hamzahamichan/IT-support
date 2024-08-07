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
    public TicketSupportDto addTicketSupport(TicketSupport ticketSupport) {
        // Créer une nouvelle instance de TicketSupport
        TicketSupport ticketSupport1 = new TicketSupport();

        // Copier les propriétés nécessaires
        ticketSupport1.setDescription(ticketSupport.getDescription());

        // Si vous avez déjà un objet Panne, vous pouvez le définir directement
        if (ticketSupport.getPanne() != null) {
            ticketSupport1.setPanne(ticketSupport.getPanne());
        }
        ticketSupport1.setDescription(ticketSupport.getDescription());
        ticketSupport1.setEtat(ticketSupport.getEtat());

        TicketSupport savedTicketSupport = ticketRepository.save(ticketSupport1);


        TicketSupportDto savedTicketSupportDto = TicketSupportDto.toDto(savedTicketSupport);

        return savedTicketSupportDto;


    }

    @Override
    public void deleteTickets(Integer id_ticket) {

    }
}
