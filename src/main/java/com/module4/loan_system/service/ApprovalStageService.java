package com.module4.loan_system.service;

import com.module4.loan_system.entity.ApprovalStage;
import com.module4.loan_system.repository.ApprovalStageRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApprovalStageService {
    private final ApprovalStageRepository repository;

    public ApprovalStageService(ApprovalStageRepository repository) {
        this.repository = repository;
    }

    public ApprovalStage saveStage(ApprovalStage stage) {
        return repository.save(stage);
    }

    public List<ApprovalStage> getAllStages() {
        return repository.findAll();
    }
}