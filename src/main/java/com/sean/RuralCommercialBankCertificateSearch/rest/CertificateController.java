package com.sean.RuralCommercialBankCertificateSearch.rest;

import com.sean.RuralCommercialBankCertificateSearch.rest.vo.CertificateVo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rcb/certificate")
public class CertificateController {

    @PostMapping("/upload")
    public String upload(){
        return "";
    }

    @GetMapping("/query/{examId}/{idNo}")
    public CertificateVo query(@PathVariable("examId")String examId,
                               @PathVariable("userIdNo")String userIdNo){
        return null;
    }


}
