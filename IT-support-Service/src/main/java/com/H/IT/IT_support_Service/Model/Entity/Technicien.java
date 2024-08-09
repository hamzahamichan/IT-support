package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
public class Technicien extends Personne {
    @OneToMany(mappedBy = "technicien")
    private List<TicketSupport> tickets;
}
