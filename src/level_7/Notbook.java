package level_7;

public class Notbook {

    String model;
    int price;
    int screen;
    int memory;
    String color;


    @Override
    public String toString() {
        String output = "Модель: " + model + "\nЦвет: " + color + ". Диагональ: "
                + screen + ". Память: " + memory + "ГБ. Цена: " + price + " руб."+'\n';
        return output;
    }
}
