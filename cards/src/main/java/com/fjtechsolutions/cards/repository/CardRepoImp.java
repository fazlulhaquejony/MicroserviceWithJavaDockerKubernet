package com.fjtechsolutions.cards.repository;

import com.fjtechsolutions.cards.model.Cards;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepoImp implements CardRepo{

    @PersistenceContext
    public EntityManager entityManager;

    @Override
    public Cards getData() {
        Session session = entityManager.unwrap(Session.class);
        Query<Cards> query = session.createNativeQuery("select * from cards where customer_id=1",Cards.class);
        Cards card =query.getSingleResult();
        return card;

    }
}
