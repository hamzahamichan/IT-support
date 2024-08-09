package com.H.IT.IT_support_Service.Model.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Panne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_panne;
    private String Type;

    @ManyToOne
    private Equipement equipement;

    @OneToMany(mappedBy = "panne",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TicketSupport> tickets;
}
