package com.pms.commonService.service;

import java.util.List;

public interface ICommonCurdService<T> {
	public T insert(T t);
	public T getById(String id);
	public List<T> getAll();
	public void deleteById(String id);
	public T update(T t);
}
