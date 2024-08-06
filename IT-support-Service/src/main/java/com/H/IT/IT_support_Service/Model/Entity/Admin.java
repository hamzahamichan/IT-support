package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Admin extends Personne{
    @OneToMany(mappedBy = "admin")
    private List<TicketSupport> tickets;



}
