package com.H.IT.IT_support_Service.Service;


import com.H.IT.IT_support_Service.Model.DTO.PanneDto;
import com.H.IT.IT_support_Service.Model.Entity.Panne;
import com.H.IT.IT_support_Service.Repository.PanneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanneService {

    @Autowired
    private PanneRepo panneRepo;

    public Panne addPanne(Panne panne){
      return this.panneRepo.save(panne);
    }
}
