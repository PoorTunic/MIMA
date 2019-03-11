package org.iut.nantes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import iut.org.nantes.Hotel.Record;
import iut.org.nantes.factories.Factory;
import iut.org.nantes.factories.Repo;
import iut.org.nantes.factories.RepoMon;

@Configuration
public class Config {

	@Bean
	public Service getSertvice() {
		return new Service();
	}

	@Bean
	public Factory getFactory() {
		return new FactoryImpl();
	}

	@Bean
	public Repo<Record> getRepoEvent() {
		return new RepoHotel();
	}

	@Bean
	public RepoMon<iut.org.nantes.Monument.Record> getRepoMonEvent() {
		return new RepoMonument();
	}
}