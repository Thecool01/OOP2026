package lab3.problem2;

public class Worm extends Creature implements CanCrawl {
    public Worm (String type, int age) {
        super(type, age);
    }

    @Override
    public void move() {
        System.out.println("The worm " + getType() + " is moving on the ground.");
    }

    @Override
    public void crawl() {
        System.out.println("The worm " + getType() + " is crawling!");
    }
}
