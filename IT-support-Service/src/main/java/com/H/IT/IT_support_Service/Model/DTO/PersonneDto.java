package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.Personne;
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
 private static PersonneDto toDto(Personne per){
     return PersonneDto.builder()
             .id_personne(per.getId_personne())
             .nom_complet(per.getNom_complet())
             .Email(per.getEmail())
             .password(per.getPassword())
             .build();
 }
    
}
