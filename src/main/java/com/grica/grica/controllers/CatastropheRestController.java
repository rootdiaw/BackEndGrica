package com.grica.grica.controllers;

import com.grica.grica.entities.Catastrophe;
import com.grica.grica.services.CatastroheService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apicatastrophe")
public class CatastropheRestController {


    private CatastroheService catastroheService;

    public CatastropheRestController(CatastroheService catastroheService) {
        super();
        this.catastroheService = catastroheService;
    }

    @GetMapping
    public List<Catastrophe> getAllCatastrophe() {
        return catastroheService.getAllCatastrophe();
    }

    @GetMapping("/{id}")
    public  Catastrophe getCatastropheById(@PathVariable("id") Long id){
        return catastroheService.getCatastropheParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteCatastrophe(@PathVariable("id") Long id){

        catastroheService.deleteCatastropheParId(id);
    }
    @PostMapping
    public Catastrophe addCatastrophe(@RequestBody Catastrophe catastrophe){
        return catastroheService.addNewCatastrophe(catastrophe);
    }
    @PutMapping("/{id}")
    public Catastrophe updateCatastrophe(@PathVariable("id") Long id, @RequestBody Catastrophe catastrophe){
        Catastrophe catas= catastroheService.getCatastropheParId(id);
        catas.setLibelle(catastrophe.getLibelle());
        catas.setDescription(catastrophe.getDescription());
       // catas.setOptions(catastrophe.getOptions());

        return catastroheService.updateNewCatastrophe(catastrophe);
    }


}
