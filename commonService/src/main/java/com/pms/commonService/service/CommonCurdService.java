package com.pms.commonService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.pms.commonService.repository.ICommonCurdRepository;

@Service
public class CommonCurdService<T> implements ICommonCurdService<T>, ICommonAdvanceService<T>{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private ICommonCurdRepository<T> commonCurdRepository;
	
	@Override
	public T insert(T t) {
		return commonCurdRepository.insert(t);
	}

	@Override
	public T getById(String id) {
		return commonCurdRepository.findById(id).get();
	}

	@Override
	public List<T> getAll() {
		return commonCurdRepository.findAll();
	}

	@Override
	public void deleteById(String id) {
		commonCurdRepository.deleteById(id);
	}

	@Override
	public T update(T t) {
		return commonCurdRepository.save(t);
	}

	@Override
	public List<T> getData(T t) {
		// TODO Auto-generated method stub
		return null;
	}
}
