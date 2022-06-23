package com.grica.grica;

import com.grica.grica.controllers.ConbinaissonsRestController;
import com.grica.grica.entities.Catastrophe;
import com.grica.grica.entities.Conbinaissons;
import com.grica.grica.services.AllOptionService;
import com.grica.grica.services.CatastroheService;
import com.grica.grica.services.ConbinaissonsService;
import com.grica.grica.services.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GricaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(GricaApplication.class, args);
	}

}

