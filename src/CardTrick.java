//Azaan Shahzad 991750968

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author azaan
 */

import java.util.Random;

public class CardTrick {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        Random rand = new Random();
        String[] hand = new String[7];
        
        for (int i = 0; i < 7; i++) {
            String suit = suits[rand.nextInt(suits.length)];
            String number = numbers[rand.nextInt(numbers.length)];
            hand[i] = number + " of " + suit;
        }

        System.out.println("Your hand of cards:");
        for (String card : hand) {
            System.out.println(card);
        }

        // Adding hard-coded lucky card
        String luckyCard = "Ace of Spades";
        System.out.println("\nLucky card is: " + luckyCard);

        // Check if the lucky card is in the hand
        boolean isLuckyCardFound = false;
        for (String card : hand) {
            if (card.equals(luckyCard)) {
                isLuckyCardFound = true;
                break;
            }
        }

        if (isLuckyCardFound) {
            System.out.println("You win! The lucky card is in your hand.");
        } else {
            System.out.println("Sorry, the lucky card is not in your hand.");
        }
    }
}
