package com.fjtechsolutions.loans.service;

import com.fjtechsolutions.loans.model.Loans;
import com.fjtechsolutions.loans.repository.LoanRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoanServiceImp implements LoanService{

    @Autowired
    LoanRepo loanRepo;
    @Override
    public Loans getData() {
        return loanRepo.getData();
    }
}
