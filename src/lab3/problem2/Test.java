package lab3.problem2;

public class Test {
    static void main(String[] args) {
        Owl owl = new Owl("Snowy Owl", 3);
        Shark shark = new Shark("Great White", 7);
        Worm worm = new Worm("Earthworm", 1);

        System.out.println("=== Testing Owl ===");
        System.out.println("Type: " + owl.getType() + ", Age: " + owl.getAge());
        owl.move();
        owl.fly();

        System.out.println();

        System.out.println("=== Testing Shark ===");
        System.out.println("Type: " + shark.getType() + ", Age: " + shark.getAge());
        shark.move();
        shark.swim();

        System.out.println();

        System.out.println("=== Testing Worm ===");
        System.out.println("Type: " + worm.getType() + ", Age: " + worm.getAge());
        worm.move();
        worm.crawl();
    }
}
