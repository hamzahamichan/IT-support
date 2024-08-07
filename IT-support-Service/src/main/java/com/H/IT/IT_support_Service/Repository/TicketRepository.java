package com.H.IT.IT_support_Service.Repository;

import com.H.IT.IT_support_Service.Model.Entity.TicketSupport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketSupport , Integer> {
}
