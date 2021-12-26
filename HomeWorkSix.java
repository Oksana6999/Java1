/*
 *Java 1. Work 6.
 *
 *@author Matafonova Oksana
 *@version 26.12.2021
 *
 *
 */

class HomeWorkSix {
    public static void main(String[]args) {
        IAnimal cat = new Cat("Barsik", "white and black", 3, 100);
        IAnimal cat1 = new Cat("Musyanya", "red", 2, 150);
        IAnimal dog = new Dog("Bobik", "black", 5, 20, 30);
        IAnimal[]animals = {
            cat,
            cat1,
            dog
        };
        System.out.println(cat1.run(100));
        System.out.println(dog.swim(200));
        for (IAnimal a: animals) {
            System.out.println(a);
        }
    }
}

class Cat extends Animal {
    int distanceRun;

    Cat(String name, String color, int age, int distanceRun) {
        super(name, color, age);
        if (distanceRun < 200) {
            this.distanceRun = distanceRun;
        }
    }

     @Override
    public String run(int distanceRun) {
        return name + " run " + distanceRun + "m";
    }

     @Override
    public String swim(int distanceSwim) {
        return name + " swim " + distanceSwim + "m";
    }
}

class Dog extends Animal {

    int distanceRun;
    int distanceSwim;

    Dog(String name, String color, int age, int distanceRun, int distanceSwim) {
        super(name, color, age);
        if (distanceRun < 500) {
            this.distanceRun = distanceRun;
        }
        if (distanceSwim < 10) {
            this.distanceSwim = distanceSwim;
        }
    }

     @Override
    public String run(int distanceRun) {
        return name + " run " + distanceRun + "m";
    }

     @Override
    public String swim(int distanceSwim) {
        return name + " swim " + distanceSwim + "m";
    }
}

interface IAnimal {
    String run(int distanceRun);
    String swim(int distanceSwim);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

     @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}
