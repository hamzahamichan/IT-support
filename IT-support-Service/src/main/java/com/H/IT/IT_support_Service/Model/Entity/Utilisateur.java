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
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;
    private String nom_complet;
    private String email; // Utilisez camelCase pour les noms de variables
    private String password;
    private Role role;
    @OneToMany(mappedBy = "user")
    private List<TicketSupport> tickets;
}
