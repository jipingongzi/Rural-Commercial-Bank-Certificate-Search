package com.sean.RuralCommercialBankCertificateSearch.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rcb/certificate")
public class CertificateController {

    @PostMapping("/upload")
    public String upload(){
        return "";
    }

    @GetMapping("/query/{idNo}")
    public String query(@PathVariable("idNo")String idNo){
        return "";
    }


}
