package com.H.IT.IT_support_Service.Service;

import com.H.IT.IT_support_Service.Model.DTO.EquipementDto;
import com.H.IT.IT_support_Service.Model.Entity.Equipement;
import com.H.IT.IT_support_Service.Repository.AdminRepository;
import com.H.IT.IT_support_Service.Repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipementSerImpl implements EquipementService{
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public EquipementDto addEquipement(EquipementDto equipementDto) {
        Equipement equipement = Equipement.builder()
                .nom(equipementDto.getNom())
                .type(equipementDto.getType())
                .marque(equipementDto.getMarque())
                .etats(equipementDto.getEtats())
                .build();

        // Sauvegarder l'entité
        Equipement savedEquipement = equipementRepository.save(equipement);

        // Convertir l'entité sauvegardée en DTO
        EquipementDto savedEquipementDto = EquipementDto.toDto(savedEquipement);

        return savedEquipementDto;


    }

    public Optional<Equipement> getEquipement(Integer id) {
       return this.equipementRepository.findById(id);
    }


    @Override
    public List<Equipement> getEquipements() {
        return this.equipementRepository.findAll();
    }

    @Override
    public void deleteEquipements(int id_equipement) {
     equipementRepository.deleteById(id_equipement);
    }
}
