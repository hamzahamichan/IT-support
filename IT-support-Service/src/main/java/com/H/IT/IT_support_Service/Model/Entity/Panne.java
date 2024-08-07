package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Panne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_panne;
        private String Type;
        private String description;
        private Date dateDeclaration;
        private Date dateReparation;
        private String etat;


        @ManyToMany
        List<Equipement> equipements;

    @OneToMany(mappedBy = "panne")
    private List<HistoriquesPannes> historiquesPannes;

    @OneToMany(mappedBy = "panne")
    private List<TicketSupport> tickets;
}
