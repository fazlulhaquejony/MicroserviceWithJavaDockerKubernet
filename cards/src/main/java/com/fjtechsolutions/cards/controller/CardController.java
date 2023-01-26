package com.fjtechsolutions.cards.controller;

import com.fjtechsolutions.cards.model.Cards;
import com.fjtechsolutions.cards.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Autowired
    public CardService cardService;

    @GetMapping("/getData")
    public Cards getData()
    {
        return cardService.getData();
    }
}
