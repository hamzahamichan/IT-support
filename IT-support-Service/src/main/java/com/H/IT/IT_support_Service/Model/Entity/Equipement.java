package com.H.IT.IT_support_Service.Model.Entity;

import com.H.IT.IT_support_Service.Model.DTO.EquipementDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_equipement;
    private String nom;
    private String type;
    private String marque;
    private String etats;

    @ManyToOne
    @JoinColumn(name = "id_admin")
    private Admin admin;

    @OneToMany(mappedBy = "equipement")
    private List<Panne> Pannes;


    public Equipement toEntity(EquipementDto dto){
        return Equipement.builder()
                .id_equipement(dto.getId_equipement())
                .nom(dto.getNom())
                .etats(dto.getEtats())
                .marque(dto.getMarque())
                .type(dto.getType())
                .build();
    }
}
