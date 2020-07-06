package fr.orsys.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@DiscriminatorValue("CC")
@NoArgsConstructor @AllArgsConstructor @Data 
public class CopmteCourant extends Compte {
	private static final long serialVersionUID = 1L;
	private double decouvert;

}
