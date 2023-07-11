package com.baseballproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baseballproject.entity.DwordsBoard;

@Repository
public interface dwordsRepository extends JpaRepository<DwordsBoard, Integer>{
  
}
