package lab3.problem1.Interfaces;

public interface Movable {
    default void move() {
        System.out.println("The creature is moving");
    }
}
