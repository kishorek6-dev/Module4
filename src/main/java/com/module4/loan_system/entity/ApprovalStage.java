package com.module4.loan_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ApprovalStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stageId;

    private Long applicationId;
    private Long approverId;
    private String decision; // Approve / Reject / Return
    private LocalDate decisionDate;
    private String notes;

    // Getters & Setters
}