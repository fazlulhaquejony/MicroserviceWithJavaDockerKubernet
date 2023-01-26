package com.fjtechsolutions.cards.service;

import com.fjtechsolutions.cards.model.Cards;
import com.fjtechsolutions.cards.repository.CardRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CardServiceImpl implements CardService{

    @Autowired
    public CardRepo cardRepo;
    @Override
    public Cards getData() {
        return cardRepo.getData();
    }
}
