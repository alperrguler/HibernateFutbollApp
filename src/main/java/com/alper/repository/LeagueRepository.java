package com.alper.repository;

import com.alper.entity.League;

public class LeagueRepository extends RepositoryManager<League,Long> {
	public LeagueRepository() {
		super(League.class);
	}
}