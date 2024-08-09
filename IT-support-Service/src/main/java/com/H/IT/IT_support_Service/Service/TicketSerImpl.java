package com.H.IT.IT_support_Service.Service;


import com.H.IT.IT_support_Service.Model.DTO.TicketSupportDto;
import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;
import com.H.IT.IT_support_Service.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


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
    public void deleteTickets(int id_ticket) {
 ticketRepository.deleteById(id_ticket);
    }

    @Override
    public List<TicketSupport> getAllTickets() {
        return this.ticketRepository.findAll();
    }

    @Override
    public TicketSupport getTicket(Integer id) {
      return this.ticketRepository.findById(id).orElse(null);
    }

        @Override
        public TicketSupport linkTicket(Integer id, TicketSupport ticketSupport) {
            // Récupérer le TicketSupport existant à partir de l'ID
            TicketSupport existingTicketSupport = ticketRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("TicketSupport not found with id: " + id));

            // Mettre à jour les champs nécessaires du TicketSupport existant
            existingTicketSupport.setTechnicien(ticketSupport.getTechnicien());
            existingTicketSupport.setEtat(ticketSupport.getEtat());

            // Enregistrer le TicketSupport mis à jour
            return ticketRepository.save(existingTicketSupport);
        }
    }

