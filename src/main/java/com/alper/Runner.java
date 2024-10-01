package com.alper;

import com.alper.gui.MainGUI;
import com.alper.model.ControllerModel;
import com.alper.repository.*;
import com.alper.utility.DataGenerator;
import com.alper.utility.FixtureFunction.FixtureGenerator;

import java.time.LocalDate;
import java.util.*;


public class Runner {
	public static void main(String[] args) {
		ControllerModel controllerModel = ControllerModel.getInstance();
		TeamRepository teamRepository = new TeamRepository();
		DataGenerator dataGenerator = new DataGenerator();
//		dataGenerator.createGenerateData();

		MainGUI.startApplication();
//		MatchGUI.createFixture();

//		MatchGUI.fiksturuYazdir();
		
		List<Long> takimIDleri = teamRepository.findAllTeamIds();
		FixtureGenerator fixtureGenerator =new FixtureGenerator(takimIDleri, LocalDate.of(2024, 10, 8));
		
//		fixtureGenerator.makeMatch();
//		fixtureGenerator.printLeagueTable();
//		for (EPosition position:EPosition.values()){
//			System.out.println(position.ordinal()+1+" - "+position.name());
//		}
		
//		TransferGUI.oyuncuSec();
//		TransferGUI.oyuncuAra();
//		TransferGUI.teklifYap();
		
	
	
	}
	
}