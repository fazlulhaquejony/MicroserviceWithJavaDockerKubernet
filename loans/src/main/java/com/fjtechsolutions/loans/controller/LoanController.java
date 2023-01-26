package com.fjtechsolutions.loans.controller;

import com.fjtechsolutions.loans.model.Loans;
import com.fjtechsolutions.loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @Autowired
    public LoanService loanService;

    @GetMapping("/getData")
    public Loans getData()
    {
        return loanService.getData();
    }
}
