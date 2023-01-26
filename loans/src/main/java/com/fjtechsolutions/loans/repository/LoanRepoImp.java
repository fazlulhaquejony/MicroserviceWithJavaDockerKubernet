package com.fjtechsolutions.loans.repository;

import com.fjtechsolutions.loans.model.Loans;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class LoanRepoImp implements LoanRepo{
    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public Loans getData() {
        Session session = entityManager.unwrap(Session.class);
        Query<Loans> query = session.createNativeQuery("select * from loans where loan_number=1",Loans.class);
        Loans loans =query.getSingleResult();
        return loans;

    }
}
