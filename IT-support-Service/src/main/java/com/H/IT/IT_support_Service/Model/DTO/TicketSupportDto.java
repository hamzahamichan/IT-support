package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;
import lombok.*;

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
    private Date date_creation;
    private int id_Tech;
    private int id_panne;
    private  String Etat ;
    private int equipementId;
    private Date date_traitement;
public static TicketSupportDto toDto(TicketSupport tick){
    return  TicketSupportDto.builder()
            .id_ticket(tick.getId_ticket())
            .id_panne(tick.getPanne().getId_panne())
            .date_creation(tick.getDate_creation())
            .date_traitement(tick.getDate_traitement())
            .Etat(tick.getEtat())
            .description(tick.getDescription())
            .build();
}

}
