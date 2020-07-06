package fr.orsys;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import fr.orsys.dao.ClientRepository;
import fr.orsys.entities.Client;

@SpringBootApplication
public class AteliersBanqueApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AteliersBanqueApplication.class, args);
		 ClientRepository clients= ctx.getBean(ClientRepository.class);
		System.out.println("--------Ajout des Clients---------");
		Client client1=new Client();
		client1.setNom("Eric");
		clients.save(client1);
		Client client2=new Client();
		client2.setNom("Fabian");
		clients.save(client2);
		Client client3=new Client();
		client3.setNom("Francois");
		clients.save(client3);
		clients.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		System.out.println("------Recherche par mots Clés----------");
		List<Client> clts=clients.clientsParMC("%F%");
		clts.forEach(c->{
			System.out.println(c.getNom());
		});
	}

}
