package exercises;

import java.util.Random;

public class PickTwoCards {

    public static void main(String[] args){

        String[] suits = {"clubs","hearts","spades","diamonds"};
        Random rand = new Random();
        int randSuit = rand.nextInt(suits.length);
        int randSuitTwo = rand.nextInt(suits.length);
        final int CARDS_IN_SUIT = 13;
        int value;
        int valueTwo;
        value = ((int)(Math.random() * 100)%CARDS_IN_SUIT + 1);
        valueTwo = ((int)(Math.random() * 100)%CARDS_IN_SUIT + 1);
        GetCards myCard = new GetCards();

        myCard.setValue(value);
        myCard.setSuit(suits[randSuit]);

        System.out.println("Your card is the " + myCard.getValue() + " of " +myCard.getSuit() + ".");

        myCard.setValue(valueTwo);
        myCard.setSuit(suits[randSuitTwo]);

        System.out.println("Their card is the " + myCard.getValue() + " of " + myCard.getSuit() + ".");
    }
}
