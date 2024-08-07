package com.H.IT.IT_support_Service.Service;

import com.H.IT.IT_support_Service.Model.DTO.EquipementDto;
import com.H.IT.IT_support_Service.Model.Entity.Equipement;

import java.util.List;


public interface EquipementService {
    EquipementDto addEquipement(EquipementDto equipementDto);
    EquipementDto getEquipement(Integer id);
    List<Equipement> getEquipements();
    void deleteEquipements(int id);
}
