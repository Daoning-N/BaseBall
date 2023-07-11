package com.baseballproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baseballproject.entity.LwordsBoard;

@Repository
public interface lwordsRepository extends JpaRepository<LwordsBoard, Integer>{
  
}
