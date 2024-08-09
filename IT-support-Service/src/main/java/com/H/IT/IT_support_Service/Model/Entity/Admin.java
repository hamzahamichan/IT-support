package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Admin extends Personne{


    @OneToMany(mappedBy = "admin")
    private List<Equipement> equipements;
    @OneToMany(mappedBy = "admin")
    private List<TicketSupport> tickets;

}
