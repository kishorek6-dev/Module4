package com.module4.loan_system.controller;

import com.module4.loan_system.entity.CreditAppraisal;
import com.module4.loan_system.service.CreditAppraisalService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appraisals")
public class CreditAppraisalController {
    private final CreditAppraisalService service;

    public CreditAppraisalController(CreditAppraisalService service) {
        this.service = service;
    }

    @PostMapping
    public CreditAppraisal createAppraisal(@RequestBody CreditAppraisal appraisal) {
        return service.saveAppraisal(appraisal);
    }

    @GetMapping
    public List<CreditAppraisal> getAllAppraisals() {
        return service.getAllAppraisals();
    }
}