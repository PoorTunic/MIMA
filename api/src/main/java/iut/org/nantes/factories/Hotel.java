package iut.org.nantes.factories;

import java.util.List;

public class Hotel {
	String id;
	String nom;
	List<Double> Location;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Double> getLocation() {
		return Location;
	}

	public void setLocation(List<Double> location) {
		Location = location;
	}

	public Hotel(String id, String nom, List<Double> location) {
		super();
		this.id = id;
		this.nom = nom;
		Location = location;
	}

	public Hotel(String nom) {
		this.nom = nom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
