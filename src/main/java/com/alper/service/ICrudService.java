package com.alper.service;

import java.util.List;
import java.util.Optional;

public interface ICrudService<T,ID> {
	T save(T entity);
	Iterable<T> saveAll(Iterable<T> entities);
	Boolean deleteById(ID id);
	Optional<T> findById(ID id);
	Boolean existById(ID id);
	List<T> findAll();

	
//	List<T> findByFieldNameAndValue(String fieldName, Object value);
//	List<T> findByFilledFields(T entity);
}