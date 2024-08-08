package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.Panne;
import lombok.*;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class PanneDto {
    private int id_panne;
    private int id_equipement;
    private String description;
    private Date dateDeclaration;
    private Date dateReparation;
    private String etat;

    public static PanneDto toDto(Panne panned) {
        return PanneDto.builder()
                .id_panne(panned.getId_panne())
                .description(panned.getDescription())
                .dateDeclaration(panned.getDateDeclaration())
                .dateReparation(panned.getDateReparation())
                .etat(panned.getEtat())
                .build();
    }
}
