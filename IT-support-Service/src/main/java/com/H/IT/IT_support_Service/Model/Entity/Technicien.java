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
@Builder
public class Technicien extends Personne {

    @OneToMany(mappedBy = "technicien")
    private List<TicketSupport> tickets;
}
