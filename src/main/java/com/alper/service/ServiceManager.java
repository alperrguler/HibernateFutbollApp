package com.alper.service;

import com.alper.repository.ICrud;

import java.util.List;
import java.util.Optional;

public abstract class ServiceManager<T,ID> implements ICrudService<T,ID> {
	private final ICrud<T, ID> repository;
	
	public ServiceManager(ICrud<T, ID> repository) {
		this.repository = repository;
	}
	
	@Override
	public T save(T entity) {
		return repository.save(entity);
	}
	
	@Override
	      //List<Player>
	public Iterable<T> saveAll(Iterable<T> entities) {
		return repository.saveAll(entities);
	}
	
	@Override
	public Boolean deleteById(ID id) {
		return repository.deleteById(id);
	}
	
	@Override
	public Optional<T> findById(ID id) {
		return repository.findById(id);
	}
	
	@Override
	public Boolean existById(ID id) {
		return repository.existById(id);
	}
	
	@Override
	public List<T> findAll() {
		return repository.findAll();
	}
	
	
	
//	@Override
//	public List<T> findByFieldNameAndValue(String fieldName, Object value) {
//		return repository.findByFieldNameAndValue(fieldName, value);
//	}
//
//	@Override
//	public List<T> findByFilledFields(T entity) {
//		return repository.findByFilledFields(entity);
//	}
}