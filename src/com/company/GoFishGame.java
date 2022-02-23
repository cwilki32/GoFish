package com.company;

public class GoFishGame {

    private Deck testDeck;
    private Opponent newOpponent;
    private Player newPlayer;
    public GoFishGame() {

        testDeck = new Deck();
        newOpponent = new Opponent();
        newPlayer = new Player();
        Hand testHand = new Hand();
        testDeck.buildDeck();
        testDeck.shuffle();
        deal();

    }



    private void deal() {

        newPlayer.getHand().takeCardFromDeck(testDeck);
        newPlayer.getHand().takeCardFromDeck(testDeck);
        newPlayer.getHand().takeCardFromDeck(testDeck);
        newPlayer.getHand().takeCardFromDeck(testDeck);
        newPlayer.getHand().takeCardFromDeck(testDeck);
        newPlayer.getHand().takeCardFromDeck(testDeck);
        newPlayer.getHand().takeCardFromDeck(testDeck);
        newOpponent.getHand().takeCardFromDeck(testDeck);
        newOpponent.getHand().takeCardFromDeck(testDeck);
        newOpponent.getHand().takeCardFromDeck(testDeck);
        newOpponent.getHand().takeCardFromDeck(testDeck);
        newOpponent.getHand().takeCardFromDeck(testDeck);
        newOpponent.getHand().takeCardFromDeck(testDeck);
        newOpponent.getHand().takeCardFromDeck(testDeck);

        newPlayer.printHand();
        newOpponent.printOpponentHand();
    }
}
