/*
 * Java 1. Work 5.
 *
 *@author Matafonova Oksana
 *@version 23.12.2021
 */

class HomeWorkFive {
    public static void main(String[]args) {
        Person[]personArr = new Person[5];
        personArr[0] = new Person("Petr Petrov", "Engineer", "petr@gmail.com", "89033456785", 50000, 55);
        personArr[1] = new Person("Sergei Ivanov", "Accountant", "serg@gmail.com", "86754903344", 55000, 35);
        personArr[2] = new Person("Svetlana Kamanova", "Designer", "svet@gmail.com", "89022348100", 35000, 45);
        personArr[3] = new Person("Aleksei Svetlakov", "Marketing specialist", "aleks@gmail.com", "89033546789", 85500, 38);
        personArr[4] = new Person("Bladimir Shumov", "Translator", "vlad@gmail.com", "89345678978", 55000, 40);
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i].getAge() > 40) {
                System.out.println(personArr[i]);
            }
        }
    }
}

class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

     @ Override
    public String toString() {
        return fullName + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

}
