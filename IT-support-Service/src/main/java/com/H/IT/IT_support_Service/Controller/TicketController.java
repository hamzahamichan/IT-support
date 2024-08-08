package com.H.IT.IT_support_Service.Controller;


import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;
import com.H.IT.IT_support_Service.Service.TicketSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketSerImpl ticketSer;
@PostMapping("/addT")
    public TicketSupport addTicketSupport(@RequestBody TicketSupport ticketSupport){
    return this.ticketSer.addTicketSupport(ticketSupport);
}

@GetMapping("/get")
    public List<TicketSupport> getAllTickets() {
        return this.ticketSer.getAllTickets();
    }
    @DeleteMapping("/delete/{id_ticket}")
    public void deleteTickets(@PathVariable int id_ticket){
    this.ticketSer.deleteTickets(id_ticket);
    }

@GetMapping("/awid")
    public TicketSupport getTicket(@RequestParam Integer id){
    return this.ticketSer.getTicket(id);
}

@PutMapping("/assigne/{id}")
    public TicketSupport linkTicket(@PathVariable Integer id,@RequestBody TicketSupport ticketSupport){
    return this.ticketSer.linkTicket(id,ticketSupport);

}

}
