package practice2;

public class problem3 {
    public static void main(String[] args) {
        Time t1 = new Time(23, 53, 4);

        System.out.println(t1.toStandard());
        System.out.println(t1.toUniversal());

        Time t2 = new Time(10, 28, 43);
        t1.adding_time(t2);

        System.out.println(t1.toStandard());
        System.out.println(t1.toUniversal());
    }
}
