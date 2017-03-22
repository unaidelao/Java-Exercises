/**
 * Think Java v.6 - Exercise 11.3
 *
 * In the board game Scrabble, each tile contains a letter, which is used to
 * spell words in rows and columns, and a score, which is used to determine the
 * value of words.
 *
 * (1) Write a definition for a class named Tile that represents Scrabble
 * tiles. The instance variables should include a character named letter and
 * an integer named value.
 *
 * (2) Write a constructor that takes parameters named letter and value and
 * initializes the instance variables.
 *
 * (3) Write a method named printTile that takes a Tile object as a parameter
 * and displays the instance variables in a reader-friendly format.
 *
 * (4) Write a method named testTile that creates a Tile object with the letter
 * Z and the value 10, and then uses printTile to display the state of the
 * object.
 *
 * (5) Implement the toString and equals methods for a Tile.
 *
 * (6) Create getters and setters for each of the attributes.
 *
 * @author Unai de la O
 */

public class Tile {
  private char letter;
  private int value;

  // Constructor
  public Tile(char letter, int value) {
    this.letter = letter;
    this.value = value;
  }

  // prints Tile attributes using printf method
  public static void printTile(Tile t) {
    System.out.printf("Tile: %c\nValue: %02d\n\n", t.letter, t.value);
  }

  // creates a new Tile and invokes printTile()
  public static void testTile() {
    Tile tile1 = new Tile('Z', 10);
    printTile(tile1);
  }

  // toString method
  public String toString() {
    return String.format("Tile: %c\nValue: %02d\n", this.letter, this.value);
  }

  // equals() method for testing equivalence
  public boolean equals(Tile that) {
    return this.letter == that.letter && this.value == that.value;
  }

  // getters
  public char getLetter() {
    return this.letter;
  }
  public int getValue() {
    return this.value;
  }

  // setters
  public void setLetter(char letter) {
    this.letter = letter;
  }
  public void setValue(int value) {
    this.value = value;
  }

  // Main method
  public static void main(String[] args) {
    System.out.println("testTile() method:");
    System.out.println("------------------");
    testTile();

    System.out.println("Now, using toString() method:");
    System.out.println("-----------------------------");
    Tile tile2 = new Tile('A', 1);
    String s = tile2.toString();
    System.out.println(s);

    System.out.println("Testing equals methods: ");
    System.out.println("------------------------");
    Tile tile3 = new Tile('B', 3);
    Tile tile4 = tile3; // tile3 == to tile4
    Tile tile5 = new Tile('B', 3); // tile5 equivalent to tile3
    System.out.printf("Is tile3 == tile4?(must be true): %b\n", tile3 == tile4);
    System.out.printf("Is tile3 equivalent to tile5?(must be true): %b\n", tile3.equals(tile4));
    System.out.printf("Is tile3 == tile5?(must be false): %b\n\n", tile3 == tile5);

    System.out.println("Testing getters and setters:");
    System.out.println("----------------------------");
    System.out.println("The letter of tile5 is " + tile5.getLetter());
    System.out.println("The value of tile5 is " + tile5.getValue());
    // setting 'X' as the new letter of tile5
    tile5.setLetter('X');
    System.out.println("Now, tile5 letter is " + tile5.getLetter());
    // setting 8 as the new value of tile5
    tile5.setValue(8);
    System.out.println("Now, tile5 value is " + tile5.getValue());
  }
}
