package com.org.app.repository;

import com.org.app.entity.PhysicalEvaluation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEvaluationRepository extends JpaRepository<PhysicalEvaluation, Long> {

}
