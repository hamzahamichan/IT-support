package com.H.IT.IT_support_Service.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User extends Personne{
    @OneToMany(mappedBy = "user")
    private List<TicketSupport> tickets;
}
