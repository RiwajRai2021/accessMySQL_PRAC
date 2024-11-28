package com.example.accessmysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.accessmysql.model.User;


//SprngBoot creates at runtime a UserRepository BEAN 
//Bean is a Spring -Managed POJO (object) 
//Bean created here == private Repository repository 
public interface UserRepository extends CrudRepository<User, Integer> {

	
	
}
