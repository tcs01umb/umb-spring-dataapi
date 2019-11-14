package com.umb.spring.dataapi.dao;

import org.springframework.data.repository.CrudRepository;

import com.umb.spring.dataapi.entities.Driver;

public interface DriverRepository extends CrudRepository<Driver, String>{

}
