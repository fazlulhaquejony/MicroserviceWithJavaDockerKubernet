package com.fjtechsolutions.accounts.repository;

import com.fjtechsolutions.accounts.model.Accounts;

public interface AccountRepository {
    public Accounts getDataByAccountNumber();
}
