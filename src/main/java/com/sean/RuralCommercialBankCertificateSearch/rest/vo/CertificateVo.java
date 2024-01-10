package com.sean.RuralCommercialBankCertificateSearch.rest.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CertificateVo {

    private Long certificateId;
    private String certificateNo;

    private String userIdNo;
    private String userName;

    private String issuerName;
    /**
     * X年Y月Z日
     */
    private String issueDate;
    private String examName;
    /**
     * X年Y月Z日
     */
    private String examDate;
}
