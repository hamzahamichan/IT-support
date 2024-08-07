package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.Admin;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AdminDto {
    private int id_admin ;
    private  String nom_complet;
    private  String Email;
    private String password;
    private static AdminDto  toDto(Admin per){
        return AdminDto .builder()
                .id_admin(per.getId_admin())
                .nom_complet(per.getNom_complet())
                .Email(per.getEmail())
                .password(per.getPassword())
                .build();
    }
}
