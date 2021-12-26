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
        IAnimal cat = new Cat("Barsik", "white and black", 3);
        IAnimal cat1 = new Cat("Musyanya", "red", 2);
        IAnimal dog = new Dog("Bobik", "black", 5);
        IAnimal[]animals = {
            cat,
            cat1,
            dog
        };
        for (IAnimal a: animals) {
            System.out.println(a);
            System.out.println(a.voice());
            System.out.println(a.run(150));
            System.out.println(a.swim(5));
            System.out.println(a.run(500));
            System.out.println(a.swim(11));
        }
    }
}

class Cat extends Animal {
    Cat(String name, String color, int age) {
        super(name, color, age);
    }

     @Override
    public String voice() {
        return "myau";
    }

     @Override
    public String run(int m) {
        return (m > 200 ? (name + " can't run " + m + "m") : (name + " run " + m + "m"));
    }

     @Override
    public String swim(int s) {
        return "Cat can't swim";
    }
}

class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);
    }

     @Override
    public String voice() {
        return "gav-gav";
    }

     @Override
    public String run(int m) {
            return (m > 500 ? (name + " can't run " + m + "m") : (name + " run " + m + "m"));
    }

     @Override
    public String swim(int s) {
        return (s > 10 ? (name + " can't swim " + s + "m") : (name + " swim " + s + "m"));
    }
}

interface IAnimal {
    String voice();
    String run(int m);
    String swim(int s);
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