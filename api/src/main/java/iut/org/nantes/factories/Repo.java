package iut.org.nantes.factories;

import java.util.List;

public interface Repo<T> {
	List<T> getAll(Hotel hotel);
}
