// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Creature extends Item {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
    }
    @Override
    public Move nextDirection(){
        return new Move((int)((Math.random() * 2) - 1), (int)((Math.random() * 2) - 1));
    }

    @Override
    public String toString() {
        return "X";
    }
}