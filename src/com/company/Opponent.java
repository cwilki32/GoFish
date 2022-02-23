package com.company;

public class Opponent {
    private Hand hand;

    public Opponent() {
        this.hand = new Hand();

    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public Hand getHand() {
        return this.hand;
    }
    private void goFish(Deck deck) {
        this.hand.takeCardFromDeck(deck);
    }
    public void printOpponentHand() {
        System.out.println("The opponent has [" + this.hand + "]");
    }

}
