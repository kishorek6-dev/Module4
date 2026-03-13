package com.module4.loan_system.service;

import com.module4.loan_system.entity.CreditAppraisal;
import com.module4.loan_system.repository.CreditAppraisalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CreditAppraisalService {
    private final CreditAppraisalRepository repository;

    public CreditAppraisalService(CreditAppraisalRepository repository) {
        this.repository = repository;
    }

    public CreditAppraisal saveAppraisal(CreditAppraisal appraisal) {
        return repository.save(appraisal);
    }

    public List<CreditAppraisal> getAllAppraisals() {
        return repository.findAll();
    }
}