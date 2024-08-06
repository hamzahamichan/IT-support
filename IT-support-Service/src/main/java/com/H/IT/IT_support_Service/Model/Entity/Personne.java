package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_personne;
    private String nom_complet;
    private String Email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
