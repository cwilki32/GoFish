package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    //build an arraylist called Deck from Card arrays
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"}; //have suits
    String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    private List<Card> deck = new ArrayList<Card>();

//    public Deck() {//constructor
//        deck = new ArrayList<Card>();
//    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public String toString() {
        String output = "";
        for (Card card : deck) {
            output += card;
            output += "\n";
        }
        return output;

    }

    public List<Card> buildDeck() {
//        List<Card> newDeck = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(new Card(suits[i], ranks[j]));
            }
        }
        return deck;
    }
    public void shuffle() {
        Collections.shuffle(deck, new Random());
    }

    public Card takeCard() {
        Card cardToTake = new Card(deck.get(0)); //need to constructor index for get
        deck.remove(0);
        return cardToTake;
    }
}

