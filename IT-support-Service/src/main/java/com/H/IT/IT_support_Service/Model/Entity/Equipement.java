package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_equipement;
        private String nom;
        private String type;
        private String marque;
         private String etats;

    @OneToMany(mappedBy ="equipement")
    List<Panne>pannes;

    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Admin admin;

    }

