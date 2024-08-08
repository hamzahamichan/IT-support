package com.H.IT.IT_support_Service.Controller;


import com.H.IT.IT_support_Service.Model.DTO.TicketSupportDto;
import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;
import com.H.IT.IT_support_Service.Service.TicketSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ticket")
public class TicketController {

    @Autowired
    TicketSerImpl ticketSer;
@PostMapping("/add-ticket")
    public TicketSupportDto addTicketSupport(@RequestBody TicketSupport ticketSupport){
    return TicketSupportDto.toDto(this.ticketSer.addTicketSupport(ticketSupport));
}
}
