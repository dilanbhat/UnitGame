public class GameState {
    private Item[][] field;
    private int size;



    public GameState(int size) {
        this.size = size;
        field = new Item[size][size];
    }

    public GameState(Item[][] startField) {
        this.field = startField;
    }

    public GameState tick() {
        Item[][] newField = new Item[size][size];
        // Iterate through the 2D array
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                //TODO update item
                Item currentItem = field[i][j];
                System.out.println("Current Location: (" + i + ", " + j + ")");
                System.out.println("Current Item: " + currentItem);
                newField[i][j] = field[i][j];
                // Perform desired operations with the current item and location
            }
        }
        return new GameState(newField);
    }

    public void setAll(Item it){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = it;
            }
        }
    }

    public void set(Item it, int x, int y){
        field[y][x] = it;
    }


    public Item get(Item it, int x, int y) {
        return field[y][x];
    }


    @Override
    public String toString()
    {
        String out = "";
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                //TODO update item
                Item currentItem = field[i][j];
                out += currentItem.toString();
            }
            out += "\n";
        }
        return out;
    }
}
