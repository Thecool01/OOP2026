package lab3.problem3;

public interface MyCollection<elm> {
    void add(elm element);
    void remove(elm element);
    void clear();

    boolean contains(elm element);
    int size();
    boolean isEmpty();



}
