package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity @AllArgsConstructor
@NoArgsConstructor @Builder
@Getter @Setter
public abstract class  Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_personne ;
    private  String nom_complet;
    private  String Email;
    private String password;
}
