package level_6;

public class Cat {


    String name;
    int age;
    String ownerName;
    String doctorName;

    void sayMayu () {
        System.out.println("Myau-myau");
    }

    @Override
    public String toString() {
        return "Кличка: " + name + " Возраст: " + age + " лет. Хозяин: " + ownerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return (name.equals(cat.name) && age == cat.age && ownerName.equals(cat.ownerName));

    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + ownerName.hashCode();
    }
}
