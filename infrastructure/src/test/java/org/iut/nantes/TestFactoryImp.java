//package org.iut.nantes;
//
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import iut.org.nantes.Hotel.Record;
//import iut.org.nantes.factories.Hotel;
//import iut.org.nantes.factories.Monument;
//
//public class TestFactoryImp {
//
//	List<Record> testList;
//
//	@Before
//	public void init() {
//		RepoHotel a = new RepoHotel();
//		Hotel hotel = new Hotel("carquefou");
//		this.testList = a.getAll(hotel);
//	}
//
//	@Test
//	public void TestGetHotel() {
//		RepoHotel a = new RepoHotel();
//		Hotel hotel = new Hotel("carquefou");
//		this.testList = a.getAll(hotel);
//		// assertEquals("KYRIAD NANTES EST
//		// CARQUEFOU",testList.get(0).getFields().getNomoffre());
//	}
//
//	@Test
//	public void TestGetMonument() {
//
//		RepoMonument b = new RepoMonument();
//		List<String> listMon = new ArrayList<String>();
//		listMon.add(this.testList.get(0).getFields().getLocalisation().get(0).toString());
//		listMon.add(this.testList.get(0).getFields().getLocalisation().get(1).toString());
//		listMon.add("5000");
//		Monument monument = new Monument(listMon);
//		// assertEquals("PARC ET FERME DE LA CHANTRERIE",
//		// b.getAll(monument).get(0).getFields().getNomoffre());
//	}
//}
