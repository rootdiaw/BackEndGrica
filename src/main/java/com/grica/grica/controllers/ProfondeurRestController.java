package com.grica.grica.controllers;

import com.grica.grica.entities.Profondeur;
import com.grica.grica.services.ProfondeurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiprofondeur")
public class ProfondeurRestController {

    private ProfondeurService profondeurService;

    public ProfondeurRestController(ProfondeurService profondeurService) {
        this.profondeurService = profondeurService;
    }
    @PostMapping
    public Profondeur addProfondeur(@RequestBody Profondeur profondeur){
        return profondeurService.addNewProfondeur(profondeur);
    }
    @GetMapping
    public List<Profondeur> getAllProfondeur() {
        return profondeurService.getAllProfondeur();
    }

    @GetMapping("/{id}")
    public  Profondeur getNiveauPerteById(@PathVariable("id") Long id){
        return profondeurService.getProfondeurById(id);
    }
    @GetMapping("/libelle/{libelle}")
    public  Profondeur getNiveauPerteByLibelle(@PathVariable("libelle") String libelle){
        return profondeurService.getProfondeurByLibelle(libelle);
    }
    @DeleteMapping("/{id}")
    public void DeleteProfondeur(@PathVariable("id") Long id){
        profondeurService.deleteProfondeurById(id);
    }
    @PutMapping("/{id}")
    public Profondeur updateProfondeur(@PathVariable("id") Long id, @RequestBody Profondeur profondeur){
        Profondeur prof= profondeurService.getProfondeurById(id);
        prof.setLibelle(profondeur.getLibelle());
        return profondeurService.updateProfondeur(profondeur);
    }
}
