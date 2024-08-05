package com.H.IT.IT_support_Service.Model.DTO;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PersonneDto {
    private int id_personne ;
    private  String nom_complet;
    private  String Email;
    private String password;

    public 
}
