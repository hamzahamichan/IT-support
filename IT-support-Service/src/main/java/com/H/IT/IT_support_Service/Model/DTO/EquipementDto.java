package com.H.IT.IT_support_Service.Model.DTO;

import com.H.IT.IT_support_Service.Model.Entity.Equipement;
import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Builder @Data
public class EquipementDto {
    private int id_equipement;
    private String nom;
    private String type;
    private String marque;
    private String etats;

    public static EquipementDto toDto(Equipement entity){
       return EquipementDto.builder()
             .id_equipement(entity.getId_equipement())
              .nom(entity.getNom())
               .type(entity.getType())
               .etats(entity.getEtats())
                .marque(entity.getMarque())
               .build();
    }
}
