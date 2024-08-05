package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Panne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_panne;
        private String description;
        private Date dateDeclaration;
        private Date dateReparation;
        private String etat;

}
