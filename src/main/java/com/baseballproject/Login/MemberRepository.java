package com.baseballproject.Login;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface MemberRepository extends JpaRepository<MemberEntity, Long>{
  Optional<MemberEntity> findByMemberEmail(String memberEmail);
}