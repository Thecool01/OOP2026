package lab2.problem1.SuperSubClass3;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Iphone ip1 = new Iphone("USA", 2025, "350123451234560", "16 pro", "White");
        Iphone ip2 = new Iphone("China", 2025, "350123451234560", "16 pro", "Yellow");
        Iphone ip3 = new Iphone("India", 2020, "865434044201239 ", "12 pro max", "Black");

        Set<Smartphone> testset = new HashSet<Smartphone>();
        testset.add(ip1);
        testset.add(ip2);
        testset.add(ip3);

        System.out.println("The size of the set hash after adding 3 iphones: " + testset.size());
    }
}
