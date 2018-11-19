public class Tile {
    private char letter;
    private int value;

    public Tile() {
        this('a');
    }

    public Tile(char letter) {
        this(letter, 1);
    }

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getValuesToString() {
        return "Tile " + getLetter() + " has the value " + getValue() + ".";
    }
}
