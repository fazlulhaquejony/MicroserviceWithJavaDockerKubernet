package com.fjtechsolutions.accounts.repository;

import com.fjtechsolutions.accounts.model.Accounts;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImp implements AccountRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Accounts getDataByAccountNumber() {
        // TODO Auto-generated method stub
        Session currentSession = entityManager.unwrap(Session.class);
        System.out.println("data error1==>"+currentSession.createNativeQuery("select * from accounts where account_number=1",Accounts.class).getSingleResult());
        Query<Accounts> query = currentSession.createNativeQuery("select * from accounts where account_number=1",Accounts.class);
        System.out.println("data error2==>"+query.getFetchSize());
        Accounts account= query.getSingleResult();
        return account;
    }
}
