package com.pms.commonService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommonCurdRepository<T> extends MongoRepository<T, String>{
}
