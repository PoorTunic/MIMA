package org.iut.nantes;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import iut.org.nantes.Monument.Monuments;
import iut.org.nantes.Monument.Record;
import iut.org.nantes.factories.Monument;
import iut.org.nantes.factories.RepoMon;

public class RepoMonument implements RepoMon<Record> {

	@Override
	public List<Record> getAll(Monument monument) {
		RestTemplate template = new RestTemplate();
		Monuments restRec = template.getForObject(
				"https://data.paysdelaloire.fr/api/records/1.0/search/?dataset=793866443_lieux-de-patrimoine-culturel-en-loire-atlantique&geofilter.distance="
						+ monument.getLocation().get(0) + "," + monument.getLocation().get(1) + "," + monument.getLocation().get(2),
				Monuments.class);
		return restRec.getRecords();
	}
}