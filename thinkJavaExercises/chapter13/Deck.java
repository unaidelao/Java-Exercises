/**
 * Think Java v.6 - All exercises of chapter 13 are in this document.
 *
 * (1) In the repository for this book, you should find a file called Deck.java
 * that contains the code in this chapter. Check that you can compile it in
 * your enviroment.
 *
 * (2) Add a Deck method called randomInt that takes two integers, low and
 * high, including both. You can use the nextInt provided by java.util.Random,
 * which we saw in Section 8.7. But you should avoid creating a Random object
 * every time randomInt is invoked.
 *
 * (3) Write a method called swapCards that takes two indexes and swaps the
 * cards at the given locations.
 *
 * (4) Write a method called shuffle that uses the algorithm in Section 13.2.
 *
 * (5) Write a method called indexLowest that uses compareCard method to find
 * the lowest card in a given range of the deck (from lowIndex to highIndex,
 * including both).
 *
 * (6) Write a method called selectionSort that implements the selection sort
 * algorithm in Section 13.3.
 *
 * (7) Using the pseudocode in Section 13.4, write the method called merge. The
 * best way to test it is to build and shuffle a deck. Then use subdeck to form
 * two small subdecks, and use selection sort to sort them. Then you can pass
 * the two halves to merge to see if it works.
 *
 * (8) Write the simple version of mergeSort, the one that divides the deck in
 * half, uses selectionSort to sort the two halves, and uses merge to create a
 * new, sorted deck.
 *
 * (9) Write the recursive version of mergeSort. Remember that selectionSort is
 * a modifier and mergeSort is a pure method, which means that they get invoked
 * differently:
 *    deck.selectionSort()    // modifies an existing deck
 *    deck = deck.mergeSort() // replaces old deck with new
 *
 * (10) Write a method named insertionSort that implements this algorithm.
 *
 * @author Unai de la O
 */

import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return Arrays.toString(this.cards);
    }

    /**
     * (2) Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        Random randomNumber = new Random();
        int result = randomNumber.nextInt(high - low + 1);
        return result;
    }

    /**
     * (3) Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
      Card tmp = cards[i];
      cards[i] = cards[j];
      cards[j] = tmp;
    }

    /**
     * (4) Randomly permutes the array of cards.
     */
    public void shuffle() {
      for (int i = 0; i < this.cards.length; i++) {
        int j = randomInt(i, this.cards.length - 1);
        swapCards(i, j);
      }
    }

    /**
     * (5) Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
      int index = low;
      Card lowestCard = this.cards[low];
      for (int i = low + 1; i <= high; i++) {
        Card actualCard = this.cards[i];
        if (actualCard.compareTo(lowestCard) < 0) {
          index = i;
          lowestCard = actualCard;
        }
      }
      return index;
    }

    /**
     * (6) Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
      int highestCard = this.cards.length - 1;

      for (int i = 0; i < this.cards.length; i++) {
        int j = this.indexLowest(i, highestCard);
        this.swapCards(i, j);
      }
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * (7) Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
      Deck result = new Deck(d1.cards.length + d2.cards.length);

      int choice; // records the winner
      int i = 0;  // keep track at first subdeck
      int j = 0;  // keep track at second subdeck

      // traverse the result Deck
      for (int k = 0; k < result.cards.length; k++) {
        choice = 1;

        // d2 wins if d1 is empty, and viceversa;
        // Otherwise, compare the two cards.
        if ( i == d1.cards.length) {
          choice = 2;
        }
        else if (j == d2.cards.length) {
          choice = 1;
        }
        else if (d1.cards[i].compareTo(d2.cards[j]) == 1) {
          choice = 2;
        }

        // make the new deck
        if (choice == 1) {
          result.cards[k] = d1.cards[i];
          i++;
        }
        else {
          result.cards[k] = d2.cards[j];
          j++;
        }
      }
      return result;
    }

    /**
     * (8) (9) Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
      Deck sub1 = subdeck(0, 25);
      Deck sub2 = subdeck(26, 51);

      sub1.selectionSort();
      sub2.selectionSort();
      return merge(sub1, sub2);
    }

    /**
     * (10) Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
      for (int i = 1; i < this.cards.length; i++) {
        Card card = this.cards[i];
        this.insert(card, i);
      }
    }

    // Helper method for insertionSort() method
    public void insert(Card card, int i) {
      int j = i;
      while (j > 0 && card.compareTo(this.cards[j - 1]) < 0) {
        this.cards[j] = this.cards[j - 1];
        j--;
      }
      this.cards[j] = card;
    }

    // MAIN
    public static void main(String[] args) {
      Deck baraja = new Deck();
      //baraja.print();
      baraja.shuffle();
      System.out.println("---------Shuffle the deck---------------");
      baraja.print();
      System.out.println("---------Subdecks---------------");
      Deck sub1 = baraja.subdeck(0, 25);
      Deck sub2 = baraja.subdeck(26, 51);
      System.out.println("<<< Subdeck 1: >>>");
      sub1.print();
      System.out.println("<<< Subdeck 2: >>>");
      sub2.print();
      Deck mergedHalves = merge(sub1, sub2);
      System.out.println("---------Merged Halves Printed---------------");
      mergedHalves.print();
      Deck sortedDeck = mergedHalves.mergeSort();
      System.out.println("---------Merged Halves Sorted---------------");
      sortedDeck.print();

      //baraja.selectionSort();
      //System.out.println("---------Selection Sort---------------");
      //baraja.print();

    }
}
