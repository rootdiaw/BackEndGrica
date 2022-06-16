package com.grica.grica.controllers;
import com.grica.grica.services.AllOptionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiparametre")
public class AllOptionController {

    private AllOptionService allOptionService;

    public AllOptionController(AllOptionService allOptionService) {
        this.allOptionService = allOptionService;
    }

    @GetMapping
    public Map<String, Object> getAllOption(){
        return  allOptionService.getAllOption();
    }
}
