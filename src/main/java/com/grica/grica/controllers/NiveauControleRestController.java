package com.grica.grica.controllers;

import com.grica.grica.entities.NiveauControle;
import com.grica.grica.services.NiveauControleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiniveaucontrole")
public class NiveauControleRestController {


    private NiveauControleService niveauControleService;
    public NiveauControleRestController(NiveauControleService niveauControleService) {
        this.niveauControleService = niveauControleService;
    }
    @PostMapping
    public NiveauControle addNiveauControle(@RequestBody NiveauControle niveauControle){
        return niveauControleService.addNewNiveauControle(niveauControle);
    }
    @GetMapping
    public List<NiveauControle> getAllNiveauControle() {
        return niveauControleService.getAllNiveauControle();
    }

    @GetMapping("/{id}")
    public  NiveauControle getNiveauControleById(@PathVariable("id") Long id){
        return niveauControleService.getNiveauControleById(id);
    }
    @GetMapping("/libelle/{libelle}")
    public  NiveauControle getNiveauControleByLibelle(@PathVariable("libelle") String libelle){
        return niveauControleService.getNiveauControleByLibelle(libelle);
    }
    @DeleteMapping("/{id}")
    public void DeleteNiveauControle(@PathVariable("id") Long id){

        niveauControleService.deleteNiveauControleById(id);
    }
    @PutMapping("/{id}")
    public NiveauControle updateNiveauControle(@PathVariable("id") Long id, @RequestBody NiveauControle niveauControle){
        NiveauControle ctr= niveauControleService.getNiveauControleById(id);
        ctr.setLibelle(niveauControle.getLibelle());
        return niveauControleService.updateNiveauControle(niveauControle);
    }

}
