package level_5;

import java.util.*;

public class Lesson_5 {
    public static void main(String[] args) {
//        ex01();
//        ex02();
//        ex03();
//        ex04();
        ex05();
        ex06();


    }

    static void ex01() {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); // проверить, и добавить
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db.putIfAbsent(2, "четыре"));
        System.out.println(db); // {null=!null, 1=один, 2=два}
        db.replace(2, "четрые");
        System.out.println(db);
        System.out.println(db.isEmpty());
        System.out.println(db.values());
        System.out.println(db.get(1));
        System.out.println(db);
        System.out.println(db);

        System.out.println(db.get(44));
        db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());
        System.out.println(db.values());
    }

    static void ex02() {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db);

        for (var item : db.entrySet()) {
            System.out.printf("Итерация: [%d: %s]\n", item.getKey(), item.getValue());
        }
    }

    static void ex03() {
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(30);
        Map<Integer, String> map3 = new HashMap<>(30, 0.8f);
    }

    static void ex04() {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "один");
        System.out.println(tMap);
        // {1=один}
        tMap.put(6, "шесть");
        System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4, "четыре");
        System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3, "три");
        System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2, "два");
        System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
    }

    static void ex05() {
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
    }

    static void ex06() {
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException

    }
}

