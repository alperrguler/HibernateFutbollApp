package com.alper.service;

import com.alper.dto.request.ManagerLoginRequestDTO;
import com.alper.dto.request.ManagerSaveRequestDto;
import com.alper.dto.response.ManagerResponseDto;
import com.alper.entity.Manager;
import com.alper.entity.Team;
import com.alper.repository.ManagerRepository;

import java.util.Optional;

public class ManagerService extends ServiceManager<Manager,Long> {
	private final ManagerRepository managerRepository;
	private final TeamService teamService;
	public ManagerService() {
		this(new ManagerRepository());
	}
	
	public ManagerService( ManagerRepository managerRepository) {
		super(managerRepository);
		this.managerRepository = managerRepository;
		this.teamService = new TeamService();
	}
	
	public Optional<ManagerResponseDto> save(ManagerSaveRequestDto dto){
		Manager manager;
		Optional<Manager> managerOptional;
		ManagerResponseDto managerResponseDto = new ManagerResponseDto();
		
		try {
			Optional<Team> teamOptional = teamService.findTeamIdByName(dto.getTeamName());
			if(teamOptional.isPresent()) {
				manager = new Manager();
				manager.setManagerName(dto.getManagerName());
				manager.setManagerSurname(dto.getManagerSurname());
				manager.setManagerPassword(dto.getManagerPassword());
				manager.setDateOfBirth(dto.getDateOfBirth());
				manager.setTeamID(teamOptional.get().getId());
				managerOptional = Optional.of(managerRepository.save(manager));
				
				managerResponseDto.setManagerName(managerOptional.get().getManagerName());
				managerResponseDto.setManagerSurname(managerOptional.get().getManagerSurname());
				managerResponseDto.setDateOfBirth(managerOptional.get().getDateOfBirth());
				managerResponseDto.setTeamName(teamOptional.get().getTeamName());
				System.out.println(managerOptional.get().getManagerName() + " " +managerOptional.get().getManagerSurname() + " başarıyla kaydedildi");
				return Optional.of(managerResponseDto);
			}
		}
		catch (Exception e) {
			System.out.println("Service : Manager kaydedilirken hata oluştu "+ e.getMessage());
		}
		return Optional.of(managerResponseDto);
	}
	public Optional<Manager> findManagerUserNameAndPassword(ManagerLoginRequestDTO dto){
		return managerRepository.findManagerUserNameAndPassword(dto);
	}
	
	public Optional<Long> findTeamIdByManagerId(Long managerId){
		return managerRepository.findTeamIdByManagerId(managerId);
	}
	
	public Optional<Manager> findByTeamId(Long secilenTakimID) {
		return managerRepository.findByTeamId(secilenTakimID);
	}
}