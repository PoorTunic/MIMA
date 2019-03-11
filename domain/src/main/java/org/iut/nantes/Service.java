package org.iut.nantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import iut.org.nantes.factories.Factory;
import iut.org.nantes.factories.Hotel;
import iut.org.nantes.factories.Monument;

public class Service {

	@Autowired
	Factory factory;

	public List<Hotel> getAllHotels(Hotel hotel) {
		return factory.getAllHotels(hotel);
	}

	public List<Monument> getAllMonuments(Monument monument) {
		return factory.getAllMonuments(monument);
	}
}
