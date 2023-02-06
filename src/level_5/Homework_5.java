package level_5;


import com.sun.source.tree.Tree;

import java.util.*;

public class Homework_5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Map <String, LinkedList <String>> book = new HashMap<>();
//        phonebook(book);
        listname();

    }

    static void phonebook (Map <String, LinkedList<String>> book) {
        while (true) {
            System.out.println("Name??? Для выхода введите 0");
            String name = scanner.nextLine();
            LinkedList<String> phones = new LinkedList<>();
            if (name.equals("0")) {
                break;
            }
            if (book.containsKey(name)) {
                System.out.println("Phone???");
                phones = book.get(name);
                String phone = scanner.nextLine();
                phones.add(phone);
                book.put(name, phones);
            } else {
                System.out.println("Phone???");
                String phone = scanner.nextLine();
                phones.add(phone);
                book.put(name, phones);
            }

            System.out.println(book);
        }
    }

    static void listname () {
        String sss = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
                "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, " +
                "Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";
        String [] names = sss.split(", ");
        TreeMap <String, Integer> treeMap = new TreeMap<>();
        int count = 1;
        for (String s: names
             ) {
            String [] str_1 = s.split(" ");
            if (treeMap.containsKey(str_1[0])) {
                count = treeMap.get(str_1[0]);
                count++;
                treeMap.put(str_1[0], count);
            } else {
                treeMap.put(str_1[0], count);
            }
            count = 1;
        }
        System.out.println(treeMap);

        TreeMap<Integer, List<String>> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        for (Map.Entry<String, Integer>entry: treeMap.entrySet() )
        {
            String value = entry.getKey();
            Integer key = entry.getValue();
            if (tm.containsKey(key)) {
                List<String> list = tm.get(key);
                list.add(value);
            } else {
                  List<String> list = new ArrayList<>();
                  list.add(value);
                  tm.put(key, list);
            }
        }
        System.out.println(tm);
    }
        
}
