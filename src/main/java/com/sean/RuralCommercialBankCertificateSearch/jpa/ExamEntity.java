package com.sean.RuralCommercialBankCertificateSearch.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table
public class ExamEntity {

    @Id
    private Long id;
    private String name;

}
