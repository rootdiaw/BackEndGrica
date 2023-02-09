package com.grica.grica.controllers;

import com.grica.grica.entities.Utilisateur;
import com.grica.grica.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/apiutilisateur")
public class UtilisateurRestController {


    private UtilisateurService utilisateurService;

    public UtilisateurRestController(UtilisateurService utilisateurService) {
        super();
        this.utilisateurService = utilisateurService;
    }

    @PostMapping(path="/auth")
    public List<Utilisateur> getEmailAndPassword(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.getEmailAndPassword(utilisateur.getEmail(),utilisateur.getPassword());
    }

}