package com.module4.loan_system.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Data
public class CreditAppraisal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appraisalId;

    private Long applicationId;
    private Long analystId;
    private int score;
    private String remarks;
    private LocalDate appraisedDate;


    // Getters & Setters
}

//[
//        {
//        "appraisalId": 1,
//        "score": 780,
//        "remarks": "Strong repayment history",
//        "appraisedDate": "2026-03-12",
//        "analystId": 501,
//        "loanApplication": {
//        "applicationId": 101,
//        "customerId": 501,
//        "requestedAmount": 500000,
//        "tenureMonths": 36,
//        "status": "UnderReview"
//        }
//        }
//        ]
