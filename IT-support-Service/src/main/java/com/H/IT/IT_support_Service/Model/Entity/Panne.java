package com.H.IT.IT_support_Service.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToOne
    private Equipement equipement;

    @OneToMany(mappedBy = "panne")
    @JsonIgnore
    private List<TicketSupport> tickets;
}
