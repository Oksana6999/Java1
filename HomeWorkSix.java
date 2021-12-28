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
        IAnimal cat = new Cat("Barsik", 200);
        IAnimal cat1 = new Cat("Musyanya", 200);
        IAnimal dog = new Dog("Bobik", 15, 500);
        IAnimal[]animals = {
            cat,
            cat1,
            dog
        };
        System.out.println(cat.run(210));
        System.out.println(cat1.run(100));
        System.out.println(dog.swim(200));
        System.out.println(cat1.swim(10));
        System.out.println(dog.run(1000));
        for (IAnimal a: animals) {
            System.out.println(a);
        }
    }
}

class Cat extends Animal {

    Cat(String name, int limitRun) {
        super(name, limitRun);
    }

     @Override
    public String swim(int distanceSwim) {
        return name + " is a cat and can't swim.";
    }
}

class Dog extends Animal {

    Dog(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
    }
}

interface IAnimal {
    String run(int distanceRun);
    String swim(int distanceSwim);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int limitRun;
    protected int limitSwim;

    Animal(String name, int limitRun, int limitSwim) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
    }

    Animal(String name, int limitRun) {
        this.name = name;
        this.limitRun = limitRun;
    }

     @Override
    public String run(int distanceRun) {
        if (distanceRun < limitRun) {
            return name + " run " + distanceRun + "m";
        } else
            return name + " can't run " + distanceRun + "m";
    }

     @Override
    public String swim(int distanceSwim) {
        if (distanceSwim < limitSwim) {
            return name + " run " + distanceSwim + "m";
        } else
            return name + " can't swim " + distanceSwim + "m";
    }

     @Override
    public String toString() {
        return name + ", limit run " + limitRun + "m, limit swim " + limitSwim + "m.";
    }
}
