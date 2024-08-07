package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_admin;
    private String nom_complet;
    private String email; // Utilisez camelCase pour les noms de variables
    private String password;
   private Role role;
    @OneToMany(mappedBy = "admin")
    private List<Equipement> equipements;
    @OneToMany(mappedBy = "admin")
    private List<TicketSupport> tickets;
}
