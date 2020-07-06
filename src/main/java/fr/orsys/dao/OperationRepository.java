package fr.orsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

}
