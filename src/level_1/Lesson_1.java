package level_1;

import java.util.Scanner;
// import java.io.*;
// import java.io.IOException;

// public class less_1 {
//     public static void main(String[] args) throws Exception {

//         // System.out.println("Doctor Pepper");
//         // System.out.println("X");
//         // String ggg = "5";
//         // String strok = null;
//         // System.out.println(strok);
//         // short age = 5;
//         // int salary = 10151552;
//         // System.out.println(salary);
//         // System.out.println(age);
//         // float num2 = 2.7f;
//         // System.out.println(num2);
//         // double f = 1254.5451;
//         // System.out.println(f);
//         // char ch = 131; // Неявная типизация - будет символ
//         // System.out.println(ch);
//         // int a = 13_140_015;
//         // double b = a;
//         // System.out.println(b);
//         // boolean f = true && false;
//         // System.out.println(f);
//         // boolean x = true | false;
//         // System.out.println(x);

//         // String str_1 = "Hello World";
//         // var str_2 = "High and litle";
//         // // System.out.println(getType(str_2));
//         // // Обёртки. Классы-обёртки. int - класс, integer - это обёртка.
//         // System.out.println(Integer.SIZE);
//         // System.out.println(str_2.length());
//         // System.out.println(str_1.charAt(1));
//         // // Побитовые операции
//         // int b = 0;
//         // int a = 1;
//         // boolean c = a == b;
//         // System.out.println(c);
//         // b = 1;
//         // System.out.println(c);
//         // double a = 11;
//         // float b = 2.5f;
//         // ++a;
//         // --b;
//         // System.out.println(a/b);
//         // // Это ниже приоритетом
//         // System.out.println(a++);
//         // // Это выше приоритетом
//         // System.out.println(++a);
//         // System.out.println(a);
//         // int num = 11;
//         // num = num-- - --num;
//         // System.out.println(num);

//         // Операции Java
//         // ● Присваивание: =
//         // ● Арифметические: *, /, +, -, %, ++, --
//         // ● Операции сравнения: <, >, ==, !=, >=, <=
//         // ● Логические операции: ||, &&, ^, !
//         // ● Побитовые операции <<, >>, &, |, ^

//         // Побитовые сдвиги
//         // int a = 8;
//         // System.out.println(a >> 3);
//         // int a1 = 5;
//         // int a2 = 2;
//         // System.out.println(a1 & a2);
//         //
//         // String s = "qwer";
//         // boolean sss = s.length() >= 5 && s.charAt(4) == '1';
//         // // программа посмотрит результат справа, поэтому выше называют быстрая
//         // оперсанта
//         // boolean xxx = s.length() >= 5 & s.charAt(4) == '1';

//         // boolean sss = s.length() >= 5 || s.charAt(4) == '1';
//         // // программа посмотрит результат справа, поэтому выше называют быстрая
//         // оперсанта
//         // boolean sss = s.length() >= 5 | s.charAt(4) == '1';

//         // System.out.println(sss);

//         // boolean bol1 = true;
//         // boolean bol2 = true;
//         // System.out.println(bol1 & bol2);
//         // // Быстрая операция
//         // System.out.println(bol1 && bol2);

//         // MASSIVY

//         // int [] array = new int [10];
//         // System.out.println(array.length);

//         // array = new int[] {1, 3, 4, 5, 1, 2, 4, 8, 10};
//         // array [3] = 13;

//         // System.out.println(array[3]);
//         // System.out.println(array);

//         // // можно и подругому написать.
//         // int [] bay;
//         // int bry [];

//         // int[] arr[] = new int[3][5];
//         // for (int[] line : arr) {
//         // for (int item : line) {
//         // System.out.printf("%d ", item);
//         // }
//         // System.out.println();
//         // }

//         // Преобразования:
//         // int i = 123; double d = i;
//         // System.out.println(i); // 123
//         // System.out.println(d); // 123.0
//         // d = 3.1415; i = (int)d;
//         // System.out.println(d); // 3.1415
//         // System.out.println(i); // 3
//         // d = 3.9415; i = (int)d;
//         // System.out.println(d); // 3.9415
//         // System.out.println(i); // 3
//         // byte b = Byte.parseByte("123");
//         // System.out.println(b); // 123
//         // b = Byte.parseByte("1234");
//         // System.out.println(b); // NumberFormatException: Value out of range
//         // Инварианты, ковариативность, контрвариативность.
//         // Нельзя напрямую в массив вещ положить целые.

//         // ДАННЫЕ ОТ ПОЛЬЗОВАТЕЛЯ

//         // Scanner iScan = new Scanner(System.in);
//         // System.out.printf("Name: ");
//         // String name = iScan.nextLine();
//         // System.out.printf("Privet, %s!", name);
//         // // Некоторые примитивы
//         // System.out.printf("int a: ");
//         // int x = iScan.nextInt();
//         // System.out.printf("double a: ");
//         // double y = iScan.nextDouble();
//         // System.out.printf("%d + %adw = %f", x, y, x + y);
//         // iScan.close();

//         // // Проверка на соответствие получаемого типа
//         // Scanner iScanner = new Scanner(System.in);
//         // System.out.printf("int a: ");
//         // boolean flag = iScanner.hasNextInt();
//         // System.out.println(flag);
//         // int i = iScanner.nextInt();
//         // System.out.println(i);
//         // iScanner.close();

//         // Форматированный вывод
//         // int a = 1, b = 2;
//         // int c = a + b;
//         // String res = a + " + " + b + " = " + c;
//         // System.out.println(res);

//         // String s = "sfsfas";
//         // int x = 133;
//         // String q = x + s;
//         // System.out.println(q);
//         // Четыре строки. Может дать просадку по производительности.
//         // %d: целочисленных значений
//         // %x: для вывода шестнадцатеричных чисел
//         // %f: для вывода чисел с плавающей точкой
//         // %e: для вывода чисел в экспоненциальной форме,
//         // например, 3.1415e+01
//         // %c: для вывода одиночного символа
//         // %s: для вывода строковых значений
//         // float pi = 3.1415f;
//         // System.out.printf("%f\n", pi); // 3,141500
//         // System.out.printf("%.2f\n", pi); // 3,14
//         // System.out.printf("%.3f\n", pi); // 3,141
//         // System.out.printf("%e\n", pi); // 3,141500e+00
//         // System.out.printf("%.2e\n", pi); // 3,14e+00
//         // System.out.printf("%.3e\n", pi); // 3,141e+00

//         // // ОБЛАСТИ ВИДИМОСТИ ПЕРЕМЕННЫХ
//         // {
//         // int i = 123;
//         // System.out.println(i);
//         // }
//         // int i = 14324;
//         // System.out.println(i); // error: cannot find symbol
//         // // СЕРВИС ВЫПЛЕТ - ПРОГРАММА

//         // sayHi(); // hi!
//         // System.out.println(sum(1, 3)); // 4
//         // System.out.println(factor(5)); // 120.0
//         // int a = 100;
//         // int b = 2;
//         // int c;
//         // if (a > b) {
//         // c = a;
//         // } else {
//         // c = b;
//         // }
//         // System.out.println(c);

//         // int a = 1;
//         // int b = 2;
//         // int c = 0;
//         // if (a > b) c = a;
//         // if (b > a) c = b;
//         // System.out.println(c);

//         // Тернарный оператор
//         // int a = 1;
//         // int b = 2;
//         // int min = a < b ? a : b;
//         // System.out.println(min);

//         // int mounth = value;
//         // String text = "";
//         // switch (mounth) {
//         // case 1:
//         // text = "Autumn";
//         // break;
//         // default:
//         // text = "mistake";
//         // break;
//         // }
//         // System.out.println(text);
//         // iScan.close();

//         // ЦИКЛЫ
//         // int value = 15321;
//         // int count = 0;
//         // while (value != 0) {
//         // value /= 10;
//         // count++;
//         // }
//         // System.out.println(count);

//         // int value = 321;
//         // int count = 0;
//         // do {
//         //     value /= 10;
//         //     count++;
//         // } while (value != 0);
//         // System.out.println(count);

//         // int s = 0;
//         // for (int i = 1; i <= 10; i++) {
//         //     s += i;
//         // }
//         // System.out.println(s);

//         // for (int i = 0; i < 5; i++) {
//         //     for (int j = 0; j < 5; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }
//         // // * * * * *
//         // // * * * * *
//         // // * * * * *
//         // // * * * * *
//         // // * * * * *


//         // FOR EACH - новый цикл
//         // int arr[] = new int[10];
//         // for (int item : arr) {
//         //     System.out.printf("%d ", item);
//         // }
//         // System.out.println();

//         // Работа с файлами!!!

//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }

//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//         System.out.println();
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();

//     }

//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
//     }

//     static void sayHi() {
//         System.out.println("hi!");
//     }

//     static int sum(int a, int b) {
//         return a + b;
//     }

//     static double factor(int n) {
//         if (n == 1)
//             return 1;
//         return n * factor(n - 1);
//     }

// }
// // Я строчу комментарий
// /*
//  * Можно писать, всё, что угодно.
//  * Есть ссылочные типы - классы, массивы; и примитивы - обычные типы данныеchar,
//  * int, string и т.д.
//  * Чем побитовые операции отличаются от логических?
//  * Чем класс отличается от обёртки?
//  * Почему в обёртке не стринга?
//  */
