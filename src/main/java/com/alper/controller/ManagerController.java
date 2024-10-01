package com.alper.controller;

import com.alper.dto.request.ManagerLoginRequestDTO;
import com.alper.dto.request.ManagerSaveRequestDto;
import com.alper.dto.response.ManagerResponseDto;
import com.alper.entity.Manager;
import com.alper.service.ManagerService;

import java.util.List;
import java.util.Optional;

public class ManagerController {
	private final ManagerService managerService;
	
	public ManagerController() {
		this.managerService = new ManagerService();
	}
	
	public Optional<ManagerResponseDto> save(ManagerSaveRequestDto dto) {
		try {
			System.out.println("Controller Manager başarıyla kaydedildi.");
			return managerService.save(dto);
			
		} catch (Exception e) {
			System.out.println("Controller Manager kaydedilirken hata oluştu: " + e.getMessage());
		}
		return Optional.empty();
	}
	
	public Iterable<Manager> saveAll(List<Manager> managerList) {
		try {
			System.out.println("Controller Manager başarıyla kaydedildi.");
			return managerService.saveAll(managerList);
			
		} catch (Exception e) {
			System.out.println("Controller Manager kaydedilirken hata oluştu: " + e.getMessage());
		}
		return managerList;
	}
	
	public Boolean deleteByID(Long longid) {
		try {
			Boolean isDeleted = managerService.deleteById(longid);
			if (isDeleted) {
				System.out.println("Controller: Manager başarıyla silindi.");
				return true;
			}else {
				System.out.println("Controller: Manager silinemedi.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: Manager silinirken hata oldu: " + e.getMessage());
			return false;
		}
	}
	
	public Optional<Manager> findById(Long longid) {
		Optional<Manager> managerOptional = managerService.findById(longid);
		return managerOptional;
	}
	
	public Boolean existById(Long longid){
		try {
			Boolean isExistById = managerService.existById(longid);
			if (isExistById) {
				System.out.println("Controller: Manager başarıyla bulundu");
				return true;
			}else {
				System.out.println("Controller: Manager bulunamadı.");
				return false;
			}
		}
		catch (Exception e) {
			System.out.println("Controller: Manager bulunurken hata oldu: "+e.getMessage());
			return false;
		}
	}
	
	public List<Manager> findAll() {
		List<Manager> managerList = managerService.findAll();
		if (managerList.isEmpty()) {
			System.out.println("Controller Veritabanında kayıtlı Manager bulunmamaktadır.");
		}
		return managerList;
	}
	public Optional<Manager> findManagerUserNameAndPassword(ManagerLoginRequestDTO dto){
		return managerService.findManagerUserNameAndPassword(dto);
	}
	
	public Optional<Long> findTeamIdByManagerId(Long managerId){
		return managerService.findTeamIdByManagerId(managerId);
	}
	
	public Optional<Manager> findByTeamId(Long secilenTakimID) {
		return managerService.findByTeamId(secilenTakimID);
	}
}