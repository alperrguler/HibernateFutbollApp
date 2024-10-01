package com.alper.model;

import com.alper.controller.*;


public class ControllerModel {
	private static final ControllerModel INSTANCE = new ControllerModel();
	
	public final FixtureController fixtureController = new FixtureController();
	public final PlayerController playerController = new PlayerController();
	public final LeagueController leagueController = new LeagueController();
	public final ManagerController managerController = new ManagerController();
	public final MatchController matchController = new MatchController();
	public final StadiumController stadiumController = new StadiumController();
	public final StatisticsController statisticsController = new StatisticsController();
	public final TeamController teamController = new TeamController();
	public final TransferOfferController transferOfferController = new TransferOfferController();
	
	
	public ControllerModel() {
	}
	
	public static ControllerModel getInstance() {
		return INSTANCE;
	}
}