package com.fjtechsolutions.accounts.controller;

import com.fjtechsolutions.accounts.model.Accounts;
import com.fjtechsolutions.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/getaccount")
    public Accounts getAccount()
    {
        Accounts account = accountService.getDataByAccountNumber();
        System.out.print(account);
        //Accounts account =
        return account;
    }
}
