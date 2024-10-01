package com.alper.repository;

import com.alper.entity.Fixture;

public class FixtureRepository extends RepositoryManager<Fixture,Long> {
	public FixtureRepository() {
		super(Fixture.class);
	}
	
	
}