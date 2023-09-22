package src.main.java.seqcollection;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,4,5,3));
        System.out.println("Before Reverse");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list = list.reversed();
        System.out.println("After Reverse");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
