package com.baseballproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baseballproject.entity.DcheerBoard;


@Repository
public interface dcheerRepository extends JpaRepository<DcheerBoard, Integer> {
  
}

