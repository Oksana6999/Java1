class Lesson5 {
    public static void main(String[]args) {
        Cat cat = new Cat("Barsik", "white and black", 3);
		cat.setName("Murzik");
        System.out.println(cat.voice());
        System.out.println(cat);
		Cat cat1 = new Cat("Musyanya", "red", 2);
		System.out.println(cat1.voice());
		System.out.println(cat1);
		System.out.println(cat1.getName());
    }
}

class Cat {
    private String name;
    private String color;
    private int age;

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
	public void setName(String name) {
		if (name != null){
		this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}

    String voice() {
        return "meou";
    }
     @ Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}



