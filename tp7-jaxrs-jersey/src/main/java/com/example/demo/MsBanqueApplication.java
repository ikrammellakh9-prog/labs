package com.example.demo;

import com.example.demo.entities.Compte;
import com.example.demo.enums.TypeCompte;
import com.example.demo.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MsBanqueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBanqueApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository) {
        return args -> {
            compteRepository.save(new Compte(9000.0, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(12000.0, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(4500.0, new Date(), TypeCompte.COURANT));

            System.out.println("Données de test initialisées avec succès dans la base H2 :");
            compteRepository.findAll().forEach(c ->
                    System.out.println("Compte ID=" + c.getId() + ", Solde=" + c.getSolde() + ", Type=" + c.getType()));
        };
    }
}
