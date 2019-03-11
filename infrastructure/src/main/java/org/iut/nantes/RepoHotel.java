package org.iut.nantes;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import iut.org.nantes.Hotel.Hotels;
import iut.org.nantes.Hotel.Record;
import iut.org.nantes.factories.Hotel;
import iut.org.nantes.factories.Repo;

public class RepoHotel implements Repo<Record> {

	public List<Record> getAll(Hotel hotel) {
		RestTemplate restTemplate = new RestTemplate();
		Hotels resRec = restTemplate.getForObject("https://data.paysdelaloire.fr/api/records/1.0/search/?dataset=793866443_hotels-en-loire-atlantique&rows=15&q=" + hotel.getNom().toLowerCase(), Hotels.class);
		return resRec.getRecords();
	}
}
