
/*
 * Java 1. Work 7.
 *
 *@author Matafonova Oksana
 *@version 28.12.2021
 */

class HomeWorkSeven {
    public static void main(String[]args) {
        Cat[]arrayCat = new Cat[5];
        arrayCat[0] = new Cat("Myrzik", 6, false);
        arrayCat[1] = new Cat("Zyablik", 2, false);
        arrayCat[2] = new Cat("Vaska", 5, false);
        arrayCat[3] = new Cat("Masyanya", 4, false);
        arrayCat[4] = new Cat("Barsik", 7, false);
        Plate plate = new Plate(15);
        System.out.println(plate);
        for (int i = 0; i < arrayCat.length; i++) {
            arrayCat[i].eat(plate);
            System.out.println("Cat " + arrayCat[i].name + ", " + arrayCat[i].satiety);
        }
        System.out.println(plate);
        plate.addEat(10);
        System.out.println(plate);
    }
}

class Cat {
    String name;
    int appetite;
    boolean satiety;

    Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    void eat(Plate plate) {
        if (plate.food > appetite) {
            plate.decreaseFood(appetite);
            this.satiety = true;
        }
    }

     @Override
    public String toString() {
        return "Cat " + name + ", appetite: " + appetite;
    }

}

class Plate {
    int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        if (this.food > food) {
            this.food -= food;
        }
    }

    void addEat(int food) {
        this.food += food;
    }

     @Override
    public String toString() {
        return "Food: " + food;
    }
}
