package level_7;

import java.util.*;

public class Homework_7 {
    static Random random = new Random();
    static Set <Notbook> notbooks = new HashSet<>();
    static String [] colors = new String[] {"green", "blue", "red", "yellow", "black", "white", "pink"};;


    public static void main(String[] args) {
        notbooks = getbooks(100);
        Map <Integer, Integer> filter = new HashMap<>(userFilter());
        found(filter, notbooks);
    }

    // получает коллекцию ноутбукуов
    static Set <Notbook> getbooks (int count) {
        char [] chars = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        Notbook [] names = new Notbook[count];
        for (int i = 0; i < count; i++) {
            String name = Character.toString(chars[random.nextInt(0, chars.length)])
                    + Character.toString(chars[random.nextInt(0, chars.length)])
                    + "-" + Integer.toString(random.nextInt(0, 100));
            names[i] = new Notbook();
            names[i].model = name;
            names[i].color = colors[random.nextInt(0, colors.length)];
            int memory = random.nextInt(0, 1000);
            while (memory % 50 != 0)
                memory = random.nextInt(100, 1000);
            names[i].memory = memory;
            names[i].screen = random.nextInt(10, 19);
            int price = random.nextInt(100, 1000)*100;
            names[i].price = price;
            notbooks.add(names[i]);
        }
        return notbooks;

    }
// получает множество фильтров
    static Map <Integer, Integer> userFilter () {
        Map <Integer, Integer> filter = new HashMap<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваш любимый цвет из перечня. ");
        System.out.println("Если вы напишите любое сочетание букв, " +
                "\nто мы  выдадим все цвета");

        System.out.println(Arrays.toString(colors));
        String color = console.nextLine();
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(color)) {
                filter.put(1, i);
                break;
            } else {
                filter.put(1, 100);
            }
        }
        System.out.println("Введите максимальный объём памяти 100 - 1 000. 0 = максимум");
        int memory = console.nextInt();
            if(memory > 0) {
                filter.put(2, memory);
            } else {
                memory = 1000;
                filter.put(2, memory);
            }
        System.out.println("Введите максимальную цену 10 000 - 100 000. 0 = максимум");
        int price = console.nextInt();
        if(price > 0) {
            filter.put(3, price);
        } else {
            price = 100000;
            filter.put(3, price);
        }
        if (filter.containsKey(1)) {
            return filter;
        } else {
            System.out.println("Фильтров для выбора нет");
        }
        return filter;
    }
// ищет по заданным фильтрам ноутбуки из коллекции.
    static void found (Map <Integer, Integer> filter, Set <Notbook> notbooks) {
        Set <Notbook> set = new HashSet<>();
        String name_1 = null;
        if (filter.get(1) < colors.length) {
            name_1 = colors[filter.get(1)];
        } else {
            System.out.println("Такого цвета в коллекции нет. Мы предложим вам все цвета");
        }
        for (Notbook book: notbooks) {
            if (book.color.equals(name_1) | name_1 == null) {
                if (book.memory <= filter.get(2)) {
                    if (book.price <= filter.get(3)) {
                        set.add(book);
                    }
                }
            }
        }
        if (set.size() > 0) {
            System.out.println("Из 100 ноутбуков найдено: " + set.size());
            System.out.println(set);
        } else {
            System.out.println("По вашему фильтру ноутбуки не найдены. Попробуйте снова");
        }
    }
}
