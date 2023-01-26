package com.fjtechsolutions.accounts.service;

import com.fjtechsolutions.accounts.model.Accounts;
import com.fjtechsolutions.accounts.repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountRepository accountRepository;
    @Transactional
    public Accounts getDataByAccountNumber()
    {
        Accounts account = accountRepository.getDataByAccountNumber();
        return account;
    }
}
