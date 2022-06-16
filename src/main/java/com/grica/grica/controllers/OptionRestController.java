package com.grica.grica.controllers;

import com.grica.grica.entities.Option;
import com.grica.grica.services.OptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apioption")
public class OptionRestController {


    private OptionService optionService;

    public OptionRestController(OptionService optionService) {
        this.optionService = optionService;
    }
    @GetMapping
    public List<Option> getAllOption() {
        return optionService.getAllOption();
    }

    @GetMapping("/id")
    public  Option getOptionById(@PathVariable("id") Long id){
        return optionService.getOptionParId(id);
    }
    @DeleteMapping("/{id}")
    public void deleteOption(@PathVariable("id") Long id){

        optionService.deleteOptionParId(id);

    }
    @PostMapping
    public Option addOption(@RequestBody Option option){
        return optionService.addNewOption(option);
    }
    @PutMapping("/{id}")
    public Option updateOption(@PathVariable("id") Long id, @RequestBody Option option){
        Option opt= optionService.getOptionParId(id);
        opt.setLibelle(option.getLibelle());
        opt.setSousOptions(option.getSousOptions());


        return optionService.updateNewOption(option);
    }
}
