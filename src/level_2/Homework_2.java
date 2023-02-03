import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class Homework_2 {


    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger(); //не обязательно инициализировать логер и homework
        // внутри try-catch, иначе мы не сможем достать эти объекты вне try-catch

        try {
            FileHandler fileHandler = new FileHandler("log_hom.txt"); // именно хэндлер вызывает исключение, поэтому
            //все, что с ним связано мы и оборачиваем в try-catch
            logger.addHandler(fileHandler);
            SimpleFormatter sim = new SimpleFormatter();
            fileHandler.setFormatter(sim);

        } catch (IOException e) {
            e.printStackTrace();
        }

        fileRead(logger); //вызываем методы и передаем в них логер
        output("раз раз",logger);
        bublleSort(logger);
    }

    static String fileRead(Logger logger) {//в каждый метод добавили аргумент в виде логера
        logger.log(Level.INFO, "Читаем файл");
        File file = new File("json.txt");
        String json = null;
        try (FileReader fileReader = new FileReader(file))
        {
            char [] chars = new char[(int) file.length()];
            fileReader.read(chars);
            json = new String (chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    static void output (String s, Logger logger) {
        logger.log(Level.INFO, "Output");
        StringBuilder stringBuilder = new StringBuilder();


        String family = "";
        String assesment ="";
        String subject = "";
        String temporary = "";

        int key = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '"' && key % 2 != 0) {
                stringBuilder.append(s.charAt(i));
            } else {
                if (s.charAt(i) == '"' && key % 2 != 0) {
                    String x = stringBuilder.toString();
                    if (x.equals("фамилия") || x.equals("оценка") || x.equals("предмет")) {
                        temporary = x;
                    } else {
                        if (temporary.equals("фамилия")) {
                            family = x;
                        } else if (temporary.equals("оценка")) {
                            assesment = x;
                        } else if (temporary.equals("предмет")) {
                            subject = x;
                            System.out.println("Студент " + family + " получил оценку " + assesment + " по предмету: " + subject);
                        }
                    }
                    stringBuilder.delete(0, stringBuilder.length());
                    key++;
                } else if (s.charAt(i) == '"') {
                    key++;
                }
            }

        }
    }

    static void bublleSort (Logger logger) {
        int [] array = new int [30];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }
        System.out.print(Arrays.toString(array));
        int count = 0;
        int sort = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {

                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sort++;
                }
                count++;
                logger.log(Level.INFO, "Операций выполнено: "+ (count) + " и отсортировано: " + (sort));
            }
        }
        System.out.println();
        System.out.printf(Arrays.toString(array));
    }
}
