package com.sean.RuralCommercialBankCertificateSearch.service;

import com.sean.RuralCommercialBankCertificateSearch.jpa.CertificateRepo;
import com.sean.RuralCommercialBankCertificateSearch.jpa.ExamRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CertificateService {
    private final CertificateRepo certificateRepo;
    private final ExamRepo examRepo;

    public CertificateService(CertificateRepo certificateRepo, ExamRepo examRepo) {
        this.certificateRepo = certificateRepo;
        this.examRepo = examRepo;
    }

}
