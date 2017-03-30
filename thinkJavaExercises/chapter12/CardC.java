/**
 * Think Java v.6 - Exercise 12.3
 *
 * In Poker a "flush" is a hand that contains five or more cards of the same
 * suit. A hand can contain any number of cards.
 *
 * (1) Write a method called suitHist that takes an array of cards as a
 * parameter and that returns a histogram of the suits in the hand. Your
 * solution should only traverse the array once.
 *
 * (2) Write a method called hasFlush that takes an array of cards as a
 * parameter and returns true if the hand contains a flush (and false otherwise)
 *
 * @author Unai de la O
 */

import java.util.Arrays;

public class CardC {
  public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

  public static final String[] SUITS = {
    "Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;

    private final int suit;

    /**
     * Constructs a card of the given rank and suit.
     */
    public CardC(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns a string representation of the card.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    /**
     * Returns a suits histogram of a hand.
     */
    public static int[] suitHist(CardC[] cards) {
      int[] histogram = new int[4];
      for (int i = 0; i < cards.length; i++) {
        histogram[cards[i].suit]++;
      }
      return histogram;
    }

    /**
     * Returns true if a flush exists; returns false if not.
     */
    public static boolean hasFlush(CardC[] cards) {
      for (int i = 0; i < 4; i++) {
        if (suitHist(cards)[i] >= 5)
          return true;
      }
      return false;
    }

    //MAIN
    public static void main(String[] args) {
      CardC[] manoPoker = new CardC[5];
      manoPoker[0] = new CardC(3, 2);
      manoPoker[1] = new CardC(11, 1);
      manoPoker[2] = new CardC(9, 3);
      manoPoker[3] = new CardC(5, 1);
      manoPoker[4] = new CardC(7, 1);

      int[] histogramaPalos = suitHist(manoPoker);
      System.out.println(Arrays.toString(histogramaPalos));
      boolean esColor = hasFlush(manoPoker);
      System.out.println(esColor);
    }
}
