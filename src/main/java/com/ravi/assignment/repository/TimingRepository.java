package com.ravi.assignment.repository;

import com.ravi.assignment.domain.Timing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimingRepository extends JpaRepository<Timing,Integer>{
    
}
