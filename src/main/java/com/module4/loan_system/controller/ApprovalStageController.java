package com.module4.loan_system.controller;
import com.module4.loan_system.entity.ApprovalStage;
import com.module4.loan_system.service.ApprovalStageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/stages")
public class ApprovalStageController {
    private final ApprovalStageService service;

    public ApprovalStageController(ApprovalStageService service) {
        this.service = service;
    }

    @PostMapping
    public ApprovalStage createStage(@RequestBody ApprovalStage stage) {
        return service.saveStage(stage);
    }

    @GetMapping
    public List<ApprovalStage> getAllStages() {
        return service.getAllStages();
    }
}