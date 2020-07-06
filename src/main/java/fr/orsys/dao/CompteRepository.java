package fr.orsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
