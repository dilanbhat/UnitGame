public class Runner {
    private static int gameSpeed = 1000;
    public Runner(){


    }
    public static void main(String[] args) throws InterruptedException {
        GameState g = new GameState(20);
        g.setAll(new Empty());
        g.set(new Creature(),10,10);
        System.out.println(g);

        for (int t = 0; t < 20; t++){
            Thread.sleep(gameSpeed);
            GameState nextTick = g.tick();
            System.out.println(nextTick);
            g = nextTick;
        }
    }
}
