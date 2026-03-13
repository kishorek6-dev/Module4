package com.module4.loan_system.repository;

import com.module4.loan_system.entity.ApprovalStage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprovalStageRepository extends JpaRepository<ApprovalStage, Long> {
}