package com.alper.model;

import com.alper.entity.Player;
import com.alper.entity.Stadium;
import com.alper.entity.Team;
import com.alper.enums.EColours;


import java.util.List;

public class TeamModel {
	private final ControllerModel controllerModel=ControllerModel.getInstance();
	
	private Long id;
	private Stadium stadium; // bu şekilde tutabilir
	private String teamName;
	private String presidentName;
	private String foundationDate;
	private EColours colour;
	private List<Player> playerList;
	
	public TeamModel() {
	}
	

	//TODO bunun team entitysinde olması gerekli yeri yanlış
	public void takimlerinOzetBilgileriniGoruntule() {
		List<Team> teamList = controllerModel.teamController.findAll();
		
		if (teamList.isEmpty()) {
			System.out.println("Veritabanında takım bulunamadı.");
		} else {
			System.out.println("----- Takımların Özet Bilgileri -----");
			teamList.forEach(team -> {
				System.out.println("Takım ID: " + team.getId());
				System.out.println("Takım Adı: " + team.getTeamName());
				System.out.println("Kuruluş Yılı: " + team.getFoundationDate());
				System.out.println("----------------------------");
			});
		}
	}
}