package com.example.itogpract.repository;

import com.example.itogpract.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {}

