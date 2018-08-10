package com.whf.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface GirlRepository extends JpaRepository<Girl,Integer>{
}
