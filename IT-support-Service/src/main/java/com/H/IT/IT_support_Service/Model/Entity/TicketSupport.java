package com.H.IT.IT_support_Service.Model.Entity;

import com.H.IT.IT_support_Service.Enum.Ticket;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class TicketSupport {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ticket;
    private String description;
    private LocalDate date_creation;
    @Enumerated(EnumType.STRING)
    private Ticket Etat;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private Utilisateur utilisateur;


    @ManyToOne
            (cascade = CascadeType.ALL)
    @JoinColumn(name = "id_panne")
    private Panne panne;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "technicien_id")
    private Technicien technicien;


    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Admin admin;

}
