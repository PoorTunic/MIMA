package iut.org.nantes.factories;

import java.util.List;

public interface Factory {

	List<Hotel> getAllHotels(Hotel hotel);

	List<Monument> getAllMonuments(Monument monument);
}
