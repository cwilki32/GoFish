package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Go fish -
        //Brush up on rules of play
        //Shuffle
        //Deal hand to each player, each gets 7 cards
        //Lay rest in middle of table
        //Clockwise (back and forth)
        //Keep track of matches, called books (Scorekeeping each player) - BONUS
        //Ask for card, if no print “go fish” and add to hand
        //Build Card class
        //Need 4 suits and 13 cards , do not need to worry about value
        //Build Deck class for arraylist from Card class
        //Need 52 cards
        //Build Hand class for arraylist from Deck
        //Build with “card” from “deck” remove from “deck arraylist”
        //Deal 2 hands
        //One for player and one for computer - MAY WANT A PLAYER AND COMPUTER CLASS TBD
        //User input is guess, we can use scanner for that
        //Match to computer, if no match, draw, if match remove from hand
        //Deal one card to start and then get to 7
        //How do we get computer’s guess (random int?)
        //Guess what user asked for first, then random
        Deck testDeck = new Deck();
        Hand testHand = new Hand();
        testDeck.buildDeck(); //call method, is there a way to remove this step? such as call new Deck and it builds
//        System.out.println(abc.toString());
        testDeck.shuffle();
        testHand.takeCardFromDeck(testDeck);
        testHand.takeCardFromDeck(testDeck);
        System.out.println(testHand.toString());
        System.out.println(testDeck.toString());

    }
}
