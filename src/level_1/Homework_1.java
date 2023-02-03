package level_1;

import java.io.IOException;
import java.util.Scanner;

public class Homework_1 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task1_1();
        System.out.println();
        task1_2();
        System.out.println();

        task2();
        System.out.println();

        task3();
        System.out.println();


    }
    static void task1_1() {
        System.out.println("Введите, пожалуйста, число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res_num = 0;
        for (int i = 1; i <= num; i++) {
            res_num += i;
        }
        System.out.printf("Треугольное число %d - это: %d.", num, res_num);
    }
    static void task1_2() {
        System.out.println("Введите, пожалуйста, число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("Факториал !%d - это: %d.", num, factorial);
    }
    static void task2() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i - i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    }
                }
            if (count == 1)
            {
                System.out.printf("%d, ", i);
            }
            count = 0;
        }
    }
    static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите знак: ");
        char ch = scanner.next().charAt(0);
        if (ch == '+') {
            System.out.printf("Сумма чисел %d + %d = %d", a, b, a+b);
        } else if (ch == '-'){
            System.out.printf("Разность чисел %d - %d = %d", a, b, a-b);
        } else if (ch == '*'){
            System.out.printf("Произведение чисел %d * %d = %d", a, b, a*b);
        } else if (ch == '/'){
            float a_fl = a;
            float b_fl = b;
            System.out.printf("Частное чисел %d / %d = %f", a, b, a_fl/b_fl);
        } else {
            System.out.println ("Некорректный ввод");
        }

    }

//    static String task4(String s_in) {
//
//
//    }
}


