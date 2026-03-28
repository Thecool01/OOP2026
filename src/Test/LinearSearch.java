package Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinearSearch {
    public static void main(String args[]) {
        final int CON_SIZE = 100000000;
        List<Integer> partList = new ArrayList<Integer>(CON_SIZE);

        for (int i = 0; i < CON_SIZE; i++) {
            partList.add(i);
        }

        Iterator<Integer> elements = partList.iterator();
        long startTime = System.currentTimeMillis();

        while (elements.hasNext()) {
            elements.next();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " +  (endTime - startTime) + "ms");

    }
}
