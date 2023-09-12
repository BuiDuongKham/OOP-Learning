package SetAndVariant;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> mySet1 = new HashSet<>();

        System.out.println(mySet1.add(1));
        System.out.println(mySet1.add(1000));
        System.out.println(mySet1.add(100));
        System.out.println(mySet1.add(1));

        for (int i :
                mySet1) {
            System.out.println(i);
        }

        // initialize with some elements

        Set<String> mySet2 = Set.of("Hello", "How", "are", "you");

        for (String s :
                mySet2) {
            System.out.println(s);
        }
    }
}
