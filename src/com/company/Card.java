package com.company;

public class Card {
    //build a suit with Hearts, Diamonds, Spades, Clubs
    //build a rank from A-K
    private String suit;
    private String rank;

    public Card(String suit, String rank) { //constructor
        this.suit = suit;
        this.rank = rank;

    }

    public String toString() {
        return rank + " of " + suit;
    }

    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"}; //have suits
    String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }
}
