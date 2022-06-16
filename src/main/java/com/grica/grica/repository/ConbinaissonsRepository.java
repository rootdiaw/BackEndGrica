package com.grica.grica.repository;

import com.grica.grica.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ConbinaissonsRepository extends JpaRepository<Conbinaissons , Long> {

     //List<Conbinaissons> findConbinaissonsByCatastropheAndSousOptions(Catastrophe catastrophe, List<SousOption> sousOptions);
     @Query(value="select * from Conbinaissons " +
             "where catastrophe_idcatastrophe=?1 and vitesse_idvitesse=?2" +
             " and frequence_idfrequence=?3 and profondeur_idprofondeur=?4 " +
             " and niveau_controle_idniveaucontrole=?5" +
             " and niveau_perte_idniveauperte=?6",nativeQuery = true)
     Conbinaissons getConbinaissonNamefile(Long idcatastrophe, Long idvitesse, Long idfrequence,
                                           Long idprofondeur, Long idniveauControle, Long idniveauPerte);


    @Query(value="select * from Conbinaissons " +
            "where  namefile=?1",nativeQuery = true)
    Conbinaissons getConbinaissonNamefileTest(String file);



}
