package org.iut.nantes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import iut.org.nantes.factories.Hotel;
import iut.org.nantes.factories.Monument;

// We accept the cross origin to accept to retrieve in the localhost for the application and API server 
@CrossOrigin("*")
// The server has enabled the auto-configuration
@EnableAutoConfiguration
// Here all the components will be scanned and set up
@ComponentScan
@Controller
public class ServiceApp {

	// We add the service
	@Autowired
	Service service;

	// We create the URL : http://localhost/hotels?hotelName=<VALUE> to find the
	// hotel where the client will arrive
	@RequestMapping(method = RequestMethod.GET, value = "/hotels")
	// It responses an data body
	@ResponseBody
	// This method gets hotelName parameter to find the structure in the API
	List<Hotel> Hotels(@RequestParam(defaultValue = "BOURGOGNE", value = "hotelName") String hotelName) {
		// We call the service to get all data of the hotels
		return service.getAllHotels(new Hotel(hotelName));
	}

	// This URL : http://localhost/hotels?coor0=<VALUE>&coor1=<VALUE>&dist=<VALUE>
	// to get the monument list near of the hotel
	@RequestMapping(method = RequestMethod.GET, value = "/monuments")
	@ResponseBody
	List<Monument> getAllMonuments(@RequestParam(defaultValue = "", name = "coor0") String coor0,
			@RequestParam(defaultValue = "", value = "coor1") String coor1,
			@RequestParam(defaultValue = "", value = "dist") String dist) {
		// We add the coordinates and the distance max. to find the monuments
		List<String> coordinates = new ArrayList<String>();
		coordinates.add(coor0);
		coordinates.add(coor1);
		coordinates.add(dist);
		return service.getAllMonuments(new Monument(coordinates));
	}
}
