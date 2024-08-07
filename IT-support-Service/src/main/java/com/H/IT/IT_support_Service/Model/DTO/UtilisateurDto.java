package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.Utilisateur;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UtilisateurDto {
    private int id_user ;
    private  String nom_complet;
    private  String Email;
    private String password;
    private static UtilisateurDto toDto(Utilisateur per){
        return UtilisateurDto.builder()
                .id_user(per.getId_user())
                .nom_complet(per.getNom_complet())
                .Email(per.getEmail())
                .password(per.getPassword())
                .build();
    }
}
