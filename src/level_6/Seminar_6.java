package level_6;

import java.util.*;

public class Seminar_6 {
    public static void main(String[] args) {
////        ex01();
//        Integer [] array = filArray(10, 0, 25);
//        System.out.println(Arrays.toString(array));
//        System.out.println(ex02(array));
    ex03();

    }
    static void ex01 () {
        Integer [] arr = new Integer[] {113, 3, 40,34,5,53,4};
        HashSet <Integer> set1 = new HashSet<>(Arrays.asList(arr));
        LinkedHashSet <Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        TreeSet <Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

    }

    static Integer [] filArray (int count, int min, int max) {
        Integer [] array = new Integer [count];
        for (int i = 0; i < count; i++) {
            array [i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }
    static double ex02 (Integer [] array) {
        Set <Integer> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);
        return (set.size()/array.length)*100.0;
    }

    static void ex03 () {
        Cat cat1 = new Cat();
//        System.out.println(cat.name);
        cat1.name = "Vaska";
//        System.out.println(cat.name);
        cat1.age = 5;
        cat1.ownerName = "Petr";
        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        cat2.age = 3;
        cat2.ownerName = "Petr";

        Cat cat3 = new Cat();
        cat3.name = "Barsik";
        cat3.age = 3;
        cat3.ownerName = "Petr";


        Set <Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        System.out.println(cat3.equals(cat2));

    }
}
