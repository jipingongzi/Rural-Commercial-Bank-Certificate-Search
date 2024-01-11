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
    private String no;

    private String userName;
    private String userNo;

    private Long examId;
    private LocalDateTime examDate;

    private String issuerName;
    private LocalDateTime issueDate;


}
