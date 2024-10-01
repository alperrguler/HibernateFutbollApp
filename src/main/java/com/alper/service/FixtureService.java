package com.alper.service;

import com.alper.entity.Fixture;
import com.alper.repository.FixtureRepository;

public class FixtureService extends ServiceManager<Fixture,Long> {
	private  final FixtureRepository fixtureRepository;
	
	public FixtureService() {
		this(new FixtureRepository());
		
	}
	
	public FixtureService(FixtureRepository fixtureRepository) {
		super(fixtureRepository);
		this.fixtureRepository = fixtureRepository;
		
	}
	
}