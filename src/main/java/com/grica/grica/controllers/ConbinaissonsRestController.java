package com.grica.grica.controllers;
import com.grica.grica.entities.Conbinaissons;
import com.grica.grica.services.ConbinaissonsService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/apiconbinaissons")
public class ConbinaissonsRestController {

    private ConbinaissonsService conbinaissonsService;

    public ConbinaissonsRestController(ConbinaissonsService conbinaissonsService) {
        super();
        this.conbinaissonsService = conbinaissonsService;
    }

    @GetMapping
    public List<Conbinaissons> getAllConbinaissons() {
        return conbinaissonsService.getAllConbinaissons();
    }

    @GetMapping("/{id}")
    public  Conbinaissons getConbinaissonsById(@PathVariable("id") Long id){
        return conbinaissonsService.getConbinaissonsParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteConbinaissons(@PathVariable("id") Long id){

        conbinaissonsService.deleteConbinaissonsParId(id);

    }
    @PostMapping
    public Conbinaissons addConbinaissons(@RequestBody Conbinaissons conbinaissons){
        return conbinaissonsService.addNewConbinaissons(conbinaissons);
    }
    @PutMapping("/{id}")
    public Conbinaissons updateConbinaissons(@PathVariable("id") Long id, @RequestBody Conbinaissons conbinaissons){
        Conbinaissons conbinaissons1= conbinaissonsService.getConbinaissonsParId(id);
        conbinaissons1.setNamefile(conbinaissons.getNamefile());
        conbinaissons1.setCatastrophe(conbinaissons.getCatastrophe());
        conbinaissons1.setVitesse((conbinaissons.getVitesse()));
        conbinaissons1.setFrequence(conbinaissons.getFrequence());
        conbinaissons1.setProfondeur((conbinaissons.getProfondeur()));
        conbinaissons1.setNiveauControle(conbinaissons.getNiveauControle());
        conbinaissons1.setNiveauPerte((conbinaissons.getNiveauPerte()));

        return conbinaissonsService.updateNewConbinaissons(conbinaissons);
    }

   @GetMapping(path="/test/{file}")
    public  Conbinaissons getTest(@PathVariable("file") Conbinaissons file){
        return  conbinaissonsService.getConbinaissonsNamefileTest(file.getNamefile());
    }

    @PostMapping("/name/file")
    public Conbinaissons getConbinaissonsNameFile(@RequestBody Conbinaissons conbinaisson){

       return conbinaissonsService.getConbinaissonsNamefile(conbinaisson.getCatastrophe().getIdcatastrophe(),
               conbinaisson.getVitesse().getIdvitesse(),conbinaisson.getFrequence().getIdfrequence(),
               conbinaisson.getProfondeur().getIdprofondeur(),
               conbinaisson.getNiveauControle().getIdniveaucontrole(),
               conbinaisson.getNiveauPerte().getIdniveauperte());
    }


}
