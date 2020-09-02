package testArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest extends ArrayList<MyArrayList> {
    public static void main(String[] args) {
        List<String> dogs1 = new ArrayList<>();
        dogs1.add(new String("Sarah"));
        dogs1.add(new String("Dora"));
        dogs1.add(new String("Judi"));
        System.out.println("Unchanged: \n" + dogs1);

        dogs1.add(1, "Don Karleon");
        dogs1.add(2, "Don Makaron");
        System.out.println("Add by index: \n" + dogs1);

        System.out.println("============");

        List<String> dogs2 = new ArrayList<>();
        dogs2.add(new String("Lana"));
        dogs2.add(new String("Lucky"));
        System.out.println("Unchanged: \n" + dogs2);

        System.out.println("The first group of dogs: \n" + dogs1);
        System.out.println("The second group of dogs: \n" + dogs2);

        System.out.println("AddAll method:");
        dogs1.addAll(2, dogs2);
        System.out.println(dogs2);
        System.out.println("Printing all the elements");
        System.out.println("The whole group is assembled: \n" + dogs1);

        System.out.println("Contains: \n");
        System.out.println(dogs1.contains(dogs1.get(1)));
        System.out.println("Are all the contents equal? -> " + dogs1.containsAll(dogs2));
        System.out.println("Size List 1: " + dogs1.size());
        System.out.println("Size List 2: " + dogs2.size());

        System.out.println(dogs1);
        dogs1.set(1,"Barbos");
        System.out.println(dogs1);

        System.out.println(dogs1);
        dogs1.remove(1);
        System.out.println(dogs1);

        System.out.println("==============");
        System.out.println(dogs2);
        dogs2.remove(1);
        System.out.println(dogs2);

        System.out.println("Remove: ");
        dogs1.removeAll(dogs1);
        System.out.println(dogs1);
    }

}
