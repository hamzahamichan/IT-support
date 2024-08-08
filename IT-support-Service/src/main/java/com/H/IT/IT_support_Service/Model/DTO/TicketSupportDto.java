package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TicketSupportDto {
    private int id_ticket;
    private String description;
    private LocalDate date_creation;
    private int id_Tech;
    private  String Etat ;
    private Date date_traitement;
public static TicketSupportDto toDto(TicketSupport tick){
    return  TicketSupportDto.builder()
            .id_ticket(tick.getId_ticket())
            .date_creation(tick.getDate_creation())
            .date_traitement(tick.getDate_traitement())
            .Etat(tick.getEtat().name())
            .description(tick.getDescription())
            .build();
}

}
