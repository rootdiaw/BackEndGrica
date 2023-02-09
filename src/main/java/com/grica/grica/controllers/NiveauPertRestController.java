package com.grica.grica.controllers;

import com.grica.grica.entities.NiveauPerte;
import com.grica.grica.services.NiveauPerteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiniveauperte")
public class NiveauPertRestController {



    private NiveauPerteService niveauPerteService;
    public NiveauPertRestController(NiveauPerteService niveauPerteService) {
        this.niveauPerteService = niveauPerteService;
    }

    @PostMapping
    public NiveauPerte addNiveauPerte(@RequestBody NiveauPerte niveauPerte){
        return niveauPerteService.addNewNiveauPerte(niveauPerte);
    }
    @GetMapping
    public List<NiveauPerte> getAllNiveauPerte() {
        return niveauPerteService.getAllNiveauPerte();
    }

    @GetMapping("/{id}")
    public  NiveauPerte getNiveauPerteById(@PathVariable("id") Long id){
        return niveauPerteService.getNiveauPerteById(id);
    }
    @GetMapping("/libelle/{libelle}")
    public  NiveauPerte getNiveauPerteByLibelle(@PathVariable("libelle") String libelle){
        return niveauPerteService.getNiveauPerteByLibelle(libelle);
    }
    @DeleteMapping("/{id}")
    public void DeleteNiveauPerte(@PathVariable("id") Long id){
        niveauPerteService.deleteNiveauPerteById(id);
    }
    @PutMapping("/{id}")
    public NiveauPerte updateNiveauPerte(@PathVariable("id") Long id, @RequestBody NiveauPerte niveauPerte){
        NiveauPerte ptr= niveauPerteService.getNiveauPerteById(id);
        ptr.setLibelle(niveauPerte.getLibelle());
        return niveauPerteService.updateNiveauPerte(niveauPerte);
    }
}
