package org.iut.nantes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import iut.org.nantes.Hotel.Record;
import iut.org.nantes.factories.Factory;
import iut.org.nantes.factories.Hotel;
import iut.org.nantes.factories.Monument;
import iut.org.nantes.factories.Repo;
import iut.org.nantes.factories.RepoMon;

//import org.springframework.beans.factory.annotation.Autowired;

public class FactoryImpl implements Factory {

	@Autowired
	Repo<Record> repo;
	
	@Autowired
	RepoMon<iut.org.nantes.Monument.Record> repoMonu;

	@Override
	public List<Hotel> getAllHotels(Hotel hotel) {
		List<Record> resFromRepo = repo.getAll(hotel);
		List<Hotel> res = buildHotel(resFromRepo);
		return res;
	}
	
	@Override
	public List<Monument> getAllMonuments(Monument monument) {
		List<iut.org.nantes.Monument.Record> respFromRepo = repoMonu.getAll(monument);
		List<Monument> monuments = buildMonument(respFromRepo);
		return monuments;
	}

	private List<Hotel> buildHotel(List<Record> ListEvenement) {
		List<Hotel> lesHotels = new ArrayList<Hotel>();
		String id;
		String nom;
		List<Double> Location;
		for (Record e : ListEvenement) {
			id = e.getDatasetid();
			nom = e.getFields().getNomoffre();
			Location = e.getFields().getLocalisation();
			lesHotels.add(new Hotel(id, nom, Location));
		}
		return lesHotels;
	}
	
	private List<Monument> buildMonument(List<iut.org.nantes.Monument.Record> respFromRepo){
		List<Monument> monuments = new ArrayList<Monument>();
		String codeinseecommune;
		String commune;
		String type;
		List<String> location;
		for (iut.org.nantes.Monument.Record record : respFromRepo) {
			codeinseecommune = record.getRecordid();
			commune = record.getFields().getNomoffre();
			type = record.getFields().getType();
			location = record.getFields().getLocalisation();
			monuments.add(new Monument(codeinseecommune, commune, type, location, false));
		}
		return monuments;
	}
}
