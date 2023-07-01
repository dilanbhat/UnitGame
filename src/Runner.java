public class Runner {
    public Runner(){

    }
    public static void main(String[] args) {
        GameState g = new GameState(5);
        g.setAll(new Empty());
        g.set(new Creature(),0,1);
        System.out.println(g);
    }
}
