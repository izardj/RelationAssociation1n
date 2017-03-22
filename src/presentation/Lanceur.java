package presentation;

import metier.Personne;
import metier.Voiture;
import service.IService;
import service.Service;

public class Lanceur {

	public static void main(String[] args) {
		// service
		IService service = new Service();
		
		// personne
		Personne p = new Personne(1, "Gosling", "James");
		
		// voiture
		Voiture v1 = new Voiture(1, "Lincoln", "Blanche");
		Voiture v2 = new Voiture(2, "Bentley", "Verte");

		System.out.println(p);
		
		service.ajouterVoiture(p, v1);
		service.ajouterVoiture(p, v2);
		
		System.out.println(p);
	}

}
