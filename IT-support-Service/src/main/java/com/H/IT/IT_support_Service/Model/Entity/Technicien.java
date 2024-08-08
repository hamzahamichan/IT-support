package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Technicien  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Tech;
    private String nom_complet;
    private String email;
    private String password;
    private  Role role;
    @OneToMany(mappedBy = "technicien")
    private List<TicketSupport> tickets;
}
