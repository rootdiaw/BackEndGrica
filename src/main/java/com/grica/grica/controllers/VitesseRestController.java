package com.grica.grica.controllers;

import com.grica.grica.entities.Profondeur;
import com.grica.grica.entities.Vitesse;
import com.grica.grica.repository.VitesseRepository;
import com.grica.grica.services.VitesseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apivitesse")
public class VitesseRestController {

    private VitesseService vitesseService;
    public VitesseRestController(VitesseService vitesseService) {
        this.vitesseService = vitesseService;
    }
    @PostMapping
    public Vitesse addVitesse(@RequestBody Vitesse vitesse)
    {
        return vitesseService.addNewVitesse(vitesse);
    }
    @GetMapping
    public List<Vitesse> getAllVitesse() {
        return vitesseService.getAllVitesse();
    }

    @GetMapping("/{id}")
    public  Vitesse getNiveauPerteById(@PathVariable("id") Long id){
        return vitesseService.getVitesseParId(id);
    }
    @GetMapping("/libelle/{libelle}")
    public  Vitesse getNiveauPerteByLibelle(@PathVariable("libelle") String libelle){
        return vitesseService.getVitesseByLibelle(libelle);
    }
    @DeleteMapping("/{id}")
    public void DeleteProfondeur(@PathVariable("id") Long id){
        vitesseService.deleteVitesseParId(id);
    }
    @PutMapping("/{id}")
    public Vitesse updateVitesse(@PathVariable("id") Long id, @RequestBody Vitesse vitesse){
        Vitesse vt= vitesseService.getVitesseParId(id);
        vt.setLibelle(vitesse.getLibelle());
        return vitesseService.updateVitesse(vitesse);
    }
}
