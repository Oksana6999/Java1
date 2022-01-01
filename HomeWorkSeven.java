
/*
 * Java 1. Work 7.
 *
 *@author Matafonova Oksana
 *@version 28.12.2021
 */

class HomeWorkSeven {
    public static void main(String[]args) {
        Cat[]arrayCat = new Cat[5];
        arrayCat[0] = new Cat("Myrzik", 6);
        arrayCat[1] = new Cat("Zyablik", 2);
        arrayCat[2] = new Cat("Vaska", 5);
        arrayCat[3] = new Cat("Masyanya", 4);
        arrayCat[4] = new Cat("Barsik", 20);
        Plate plate = new Plate(15);
        System.out.println(plate);
        for (int i = 0; i < arrayCat.length; i++) {
            arrayCat[i].setSatiety(false);
            arrayCat[i].eat(plate);
            System.out.println("Cat " + arrayCat[i].name + ", " + arrayCat[i].satiety);
        }
        System.out.println(plate);
        plate.addEat(10);
        System.out.println("Add food in the plate");
        System.out.println(plate);
        for (int i = 0; i < arrayCat.length; i++) {
            arrayCat[i].eat(plate);
            System.out.println("Cat " + arrayCat[i].name + ", " + arrayCat[i].satiety);
        }
        System.out.println(plate);
    }
}

class Cat {
    String name;
    int appetite;
    boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    void setSatiety(boolean status) {
        satiety = status;
    }

    void eat(Plate plate) {
        if (!satiety) {
            satiety = plate.decreaseFood(appetite);
        }
    }

     @ Override
    public String toString() {
        return "Cat " + name + ", appetite: " + appetite;
    }

}

class Plate {
    int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void addEat(int food) {
        this.food += food;
    }

     @ Override
    public String toString() {
        return "Food in the plate: " + food;
    }
}
