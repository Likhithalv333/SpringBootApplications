package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.model.Mobile;

public interface MobileRepo extends JpaRepository<Mobile, Integer> {

}
