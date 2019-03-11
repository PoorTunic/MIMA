package iut.org.nantes.factories;

import java.util.List;

public interface RepoMon<T> {
	List<T> getAll(Monument monument);
}
