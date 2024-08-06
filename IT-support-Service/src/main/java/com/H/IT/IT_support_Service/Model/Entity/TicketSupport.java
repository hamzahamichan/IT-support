package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class TicketSupport {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ticket;
    private String description;
    private Date date_creation;
    private String Etat;
    private Date date_traitement;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_technicien")
    private Technicien technicien;

    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Admin admin;
}
