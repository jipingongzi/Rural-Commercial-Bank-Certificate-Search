package com.sean.RuralCommercialBankCertificateSearch.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table
public class CertificateEntity {

    @Id
    private Long id;
    private String userName;
    private String userIdNo;

    private Long examId;

    private String issuerName;
    private LocalDateTime issueDate;


}
