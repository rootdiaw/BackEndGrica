package com.grica.grica.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import com.grica.grica.message.ResponseFile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Conbinaissons  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idconbinaissons;
    private String namefile;
    @OneToOne
    private Catastrophe catastrophe;
    @OneToOne
    private Vitesse vitesse;
    @OneToOne
    private Frequence frequence;
    @OneToOne
    private Profondeur profondeur;
    @OneToOne
    private  NiveauControle niveauControle;
    @OneToOne
    private NiveauPerte niveauPerte;


}
