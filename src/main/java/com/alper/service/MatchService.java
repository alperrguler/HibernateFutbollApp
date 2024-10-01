package com.alper.service;

import com.alper.entity.Match;
import com.alper.repository.MatchRepository;

public class MatchService extends ServiceManager<Match,Long> {
	private  final MatchRepository matchRepository;
	
	public MatchService() {
		this(new MatchRepository());
	}
	
	public MatchService(MatchRepository matchRepository) {
		super(matchRepository);
		this.matchRepository = matchRepository;
	}
}