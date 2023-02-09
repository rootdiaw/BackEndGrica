package com.grica.grica.controllers;

import com.grica.grica.entities.Frequence;
import com.grica.grica.services.FrequenceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apifrequence")
public class FrequenceRestController {



    private FrequenceService frequenceService;
    public FrequenceRestController(FrequenceService frequenceService) {
        this.frequenceService = frequenceService;
    }
    @PostMapping
    public Frequence addFrequence(@RequestBody Frequence frequence){
        return frequenceService.addNewFrequence(frequence);
    }
    @GetMapping
    public List<Frequence> getAllFrequence() {
        return frequenceService.getAllFrequence();
    }

    @GetMapping("/{id}")
    public  Frequence getFrequenceById(@PathVariable("id") Long id){
        return frequenceService.getFrequenceById(id);
    }

    @GetMapping("/libelle/{libelle}")
    public  Frequence getFrequenceByLibelle(@PathVariable("libelle") String libelle){
        return frequenceService.getFrquenceByLibelle(libelle);
    }

    @DeleteMapping("/{id}")
    public void DeleteFrequence(@PathVariable("id") Long id){

        frequenceService.deleteFrequenceById(id);
    }
    @PutMapping("/{id}")
    public Frequence updateFrequence(@PathVariable("id") Long id, @RequestBody Frequence frequence){
        Frequence freq= frequenceService.getFrequenceById(id);
        freq.setLibelle(frequence.getLibelle());
        return frequenceService.updateFrequence(frequence);
    }
}
