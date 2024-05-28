/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = scanner.nextInt();
        String suit = Card.SUITS[suitIndex];
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == value && card.getSuit().equals(suit)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations, your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        
        found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The lucky card is in the magic hand!");
        } else {
            System.out.println("The lucky card is not in the magic hand.");
        }
    }
}
