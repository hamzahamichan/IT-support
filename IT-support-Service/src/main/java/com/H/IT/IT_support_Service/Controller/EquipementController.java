package com.H.IT.IT_support_Service.Controller;

import com.H.IT.IT_support_Service.Model.DTO.EquipementDto;
import com.H.IT.IT_support_Service.Model.Entity.Equipement;
import com.H.IT.IT_support_Service.Service.EquipementSerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/equipement")
public class EquipementController {
    @Autowired
    private EquipementSerImpl equipementSer;


    @PostMapping("/add")
    public EquipementDto addEquipement(@RequestBody EquipementDto equipementDto) {

        return this.equipementSer.addEquipement(equipementDto);
    }

    @GetMapping("/get")
    public EquipementDto getEquipement(@RequestParam Integer id) {
        return this.equipementSer.getEquipement(id);
    }

    @DeleteMapping("/{id_equipement}")
    public void deleteEquipements(@PathVariable int id_equipement) {
        equipementSer.deleteEquipements(id_equipement);
    }

}
