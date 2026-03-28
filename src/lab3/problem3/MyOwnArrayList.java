package lab3.problem3;

import java.util.ArrayList;

public class MyOwnArrayList<elm> implements MyCollection<elm> {
    private ArrayList<elm> myList = new ArrayList<>();

    @Override
    public void add(elm element) {
        myList.add(element);
    }

    @Override
    public void remove(elm element) {
        myList.remove(element);
    }

    @Override
    public int size() {
        return myList.size();
    }
    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public boolean contains(elm element) {
        return myList.contains(element);
    }

    @Override
    public void clear() {
        myList.clear();
    }



}
