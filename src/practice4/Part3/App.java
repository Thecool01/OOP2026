package practice4.Part3;

public class App {
    public void getStatistics(practice4.Part3.Interfaces.Game g) {
        System.out.println("Getting game statistics...");
        g.start();
        g.restart();
        g.stop();
    }

    public static void main(String[] args) {
        App app = new App();

        LogicGame logicGame = new LogicGame("Ali");
        MemoryGame memoryGame = new MemoryGame("Dana");

        System.out.println("=== LogicGame Test ===");
        app.getStatistics(logicGame);

        System.out.println();

        System.out.println("=== MemoryGame Test ===");
        app.getStatistics(memoryGame);

        System.out.println();
        memoryGame.save();
    }
}