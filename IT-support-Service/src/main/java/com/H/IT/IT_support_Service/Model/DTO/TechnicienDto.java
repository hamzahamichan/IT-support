package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.Technicien;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TechnicienDto {
    private int id_Tech;
    private String nom_complet;
    private String Email;
    private String password;

    private static TechnicienDto toDto(Technicien per) {
        return TechnicienDto.builder()
                .id_Tech(per.getId_Tech())
                .nom_complet(per.getNom_complet())
                .Email(per.getEmail())
                .password(per.getPassword())
                .build();
    }
}
