package com.sean.RuralCommercialBankCertificateSearch.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rcb/certificate")
public class CertificateController {

    @PostMapping("/upload")
    public String upload(){
        return "";
    }

    @GetMapping("/query/{examId}/{idNo}")
    public String query(@PathVariable("examId")String examId,
                        @PathVariable("userIdNo")String userIdNo){
        return "";
    }


}
