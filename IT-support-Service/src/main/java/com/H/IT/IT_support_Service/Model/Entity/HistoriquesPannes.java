package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class HistoriquesPannes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_historique;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "id_panne", nullable = false)
    private Panne panne;

    @ManyToOne
    @JoinColumn(name = "id_equipement", nullable = false)
    private Equipement equipement;

}
