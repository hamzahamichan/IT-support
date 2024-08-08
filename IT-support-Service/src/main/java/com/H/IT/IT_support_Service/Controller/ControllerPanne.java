package com.H.IT.IT_support_Service.Controller;

import com.H.IT.IT_support_Service.Model.DTO.PanneDto;
import com.H.IT.IT_support_Service.Model.Entity.Panne;
import com.H.IT.IT_support_Service.Service.PanneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Panne_List")
public class ControllerPanne {

    @Autowired
    private PanneService panneService;

    @PostMapping("/add")
    private PanneDto addPanne(@RequestBody Panne panne){
       return PanneDto.toDto(this.panneService.addPanne(panne));
    }

    @GetMapping("/getBy")
    public PanneDto getPanne(@PathVariable int id){
        return this.panneService.getPanne(id);
    }
}
