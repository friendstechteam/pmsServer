package com.pms.commonService.service;

import java.util.List;

public interface ICommonAdvanceService<T> {
	public List<T> getData(T t);
}
