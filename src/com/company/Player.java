package com.company;

import java.util.Scanner;

public class Player {//need a scanner and a hand variable from Hand class
    private Hand hand;
    Scanner scanner = new Scanner(System.in);

    public Player() {//constructing player
        this.hand = new Hand();
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public Hand getHand() {
        return this.hand;
    }
    public void goFish(Deck deck) {
        this.hand.takeCardFromDeck(deck);
    }
    public void printHand() {
        System.out.println("Player has [" + this.hand + "]");
    }
}
