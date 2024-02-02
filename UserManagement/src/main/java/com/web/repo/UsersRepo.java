package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.entity.Users;

public interface UsersRepo extends CrudRepository<Users, Integer> {

}
