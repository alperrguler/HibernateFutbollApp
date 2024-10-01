package com.alper.service;

import com.alper.entity.Statistics;
import com.alper.repository.StatisticsRepository;

public class StatisticsService extends ServiceManager<Statistics,Long> {
	private final StatisticsRepository statisticsRepository;
	
	public StatisticsService() {
		this(new StatisticsRepository());
	}
	
	public StatisticsService( StatisticsRepository statisticsRepository) {
		super(statisticsRepository);
		this.statisticsRepository = statisticsRepository;
	}
}