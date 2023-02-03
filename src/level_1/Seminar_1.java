package level_1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* Первая задача_1 */
public class Seminar_1 {
    public static void main(String [] args) {
//        ex0();
//        ex1();
//        System.out.println(ex2(1));
//        ex3(2);
//        ex4();

    }
    static void ex0 () {
        System.out.println("Введите своё имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.printf ("Привет, %s!", name);
        scan.close();
//        Есть и другой вариант
//        System.out.println("Введите своё имя: ");
//        try (Scanner scan = new Scanner(System.in) {
//            String name = scan.nextLine();
//            System.out.printf ("Привет, %s!", name);
//        }
    }
    static void ex1 () {
        System.out.println("Введите своё имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else {
            System.out.printf("Доброй ночи, %s!", name);
        }


    }
    static int ex2 (int a) {
        int [] array = new int [20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(2);
        }
//        System.out.println(Arrays.toString(array));
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                count++;
            } else {
                if (count > max_count) {
                    max_count = count;
                }
                count = 0;
            }
        if (count > max_count) {
            max_count = count;
        }
        }
        return max_count;
    }
    static void ex3 (int value) {
        int [] array = new int [10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        System.out.println(Arrays.toString(array));
        int [] array_out = new int[10];
        Arrays.fill(array_out, value);
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != value) {
                array_out[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array_out));
    }
    static void ex4 () {
        String str_in = "ДОбро пожаловать на курс по изучению Java";
        String[] arr_s = str_in.split(" ");
        char [] chars = str_in.toCharArray();
        String str_res = "";
        // регулярные выражания
        for (int i = arr_s.length - 1; i >= 0; i--) {
            str_res += arr_s[i];
            str_res += " ";
        }
        System.out.println(str_res);
    }

}
