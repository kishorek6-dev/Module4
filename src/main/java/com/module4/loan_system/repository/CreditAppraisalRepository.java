package com.module4.loan_system.repository;

import com.module4.loan_system.entity.CreditAppraisal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditAppraisalRepository extends JpaRepository<CreditAppraisal, Long> {
}
