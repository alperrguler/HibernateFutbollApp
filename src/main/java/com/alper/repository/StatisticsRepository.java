package com.alper.repository;

import com.alper.entity.Statistics;

public class StatisticsRepository extends RepositoryManager<Statistics,Long> {
	public StatisticsRepository() {
		super(Statistics.class);
	}
	
	
}