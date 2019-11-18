package com.umb.spring.dataapi.dao;

import org.springframework.data.repository.CrudRepository;

import com.umb.spring.dataapi.entities.MyAccount;

public interface MyAccountRepository extends CrudRepository<MyAccount, Integer> {

}
