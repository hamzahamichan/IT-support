package com.H.IT.IT_support_Service.Repository;

import com.H.IT.IT_support_Service.Model.Entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Integer> {
    Personne findPersonneByEmail(String email);
}
