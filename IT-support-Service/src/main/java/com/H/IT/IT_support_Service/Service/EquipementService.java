package com.H.IT.IT_support_Service.Service;

import com.H.IT.IT_support_Service.Model.DTO.EquipementDto;
import com.H.IT.IT_support_Service.Model.Entity.Equipement;

import java.util.List;
import java.util.Optional;


public interface EquipementService {
    EquipementDto addEquipement(EquipementDto equipementDto);
    Optional<Equipement> getEquipement(Integer id);
    List<Equipement> getEquipements();
    void deleteEquipements(int id);
}
