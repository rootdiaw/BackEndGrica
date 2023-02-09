package com.grica.grica.controllers;

import com.grica.grica.entities.SousOption;
import com.grica.grica.services.SousOptionService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apisousoption")
public class SousOptionRestController {
    private SousOptionService sousOptionService;
    public SousOptionRestController(SousOptionService sousOptionService) {

        super();
        this.sousOptionService = sousOptionService;
    }

    @GetMapping
    public List<SousOption> getAllSousOption() {
        return sousOptionService.getAllSousOption();
    }

    @GetMapping("/id")
    public  SousOption getSousOptionById(@PathVariable("id") Long id){
        return sousOptionService.getSousOptionParId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteSousOption(@PathVariable("id") Long id){

        sousOptionService.deleteSousOptionParId(id);

    }
    @PostMapping
    public SousOption addOption(@RequestBody SousOption sousOption){
        return sousOptionService.addNewSousOption(sousOption);
    }
    @PutMapping("/{id}")
    public SousOption updateConbinaissons(@PathVariable("id") Long id, @RequestBody SousOption sousOption){
        SousOption sousopt= sousOptionService.getSousOptionParId(id);
        sousopt.setLibelle(sousOption.getLibelle());
        return sousOptionService.updateSousOption(sousOption);
    }

    @GetMapping("/sousoptionarray")
    public  List<SousOption> getSousOptionByArray(@RequestParam("tabarray")  String tabarray[]){
        List<SousOption> sopt=new ArrayList<SousOption>();
        for( String a : tabarray){
            List<SousOption> sousoptioParLibelle=sousOptionService.getSousOptionParLibelle(a);
            sopt.addAll(sousoptioParLibelle);
        }
        return sopt;
    }

}
