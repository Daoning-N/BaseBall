package com.baseballproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baseballproject.entity.LcheerBoard;

@Repository
public interface cheerRepository extends JpaRepository<LcheerBoard, Integer> {
  
}
