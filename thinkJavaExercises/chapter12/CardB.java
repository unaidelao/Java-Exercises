/**
 * Think Java v.6 - Exercise 12.2
 *
 * In some card games, Aces are ranked higher than Kings.
 * Modify the compareTo method to implement this ordering.
 *
 * @author Unai de la O
 */
public class CardB {
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
    public CardB(int rank, int suit) {
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
     * Modificated compareTo() method so Aces are ranked higher than Kings.
     */
    public int compareTo(CardB that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        // if the FIRST object to compare is an Ace, it wins
        if (this.rank == 1)
              return 1;

        if (this.rank < that.rank) {
            return -1;
        }
        // if the SECOND object to compare is an Ace, it wins
        if (that.rank == 1)
              return -1;

        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    // MAIN
    public static void main(String[] args) {
      CardB kingOfClubs = new CardB(13, 0);
      CardB aceOfClubs = new CardB(1, 0);
      CardB aceOfDiamonds = new CardB(1, 1);
      System.out.println(kingOfClubs.compareTo(aceOfClubs));
      System.out.println(aceOfDiamonds.compareTo(aceOfClubs));
    }
}
