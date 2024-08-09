package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Utilisateur  extends Personne{
    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private List<TicketSupport> tickets;
}
