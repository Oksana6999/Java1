class HomeWorkOne {
	public static void main(String[] args) {
		printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	public static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	public static void checkSumSign() {
		int a = 10;
		int b = 20;
	    if (a + b >= 0) {
			System.out.println ("Sum is positive");
		}
		else {
			System.out.println("Sum is negativ");
		}	
	}
	public static void printColor() {
        int value = 100;
		if (value <= 0) {
			System.out.println("Red");
		}
		if (value > 0 || value <= 100) {
			System.out.println("Yellow");
		}
		else {
			System.out.println("Green");
		}
	}
	public static void compareNumbers() {
		int a = 12;
		int b = 22;
		if (a >= b) {
			System.out.println(" a >= b ");
		}
		else {
			System.out.println(" a < b ");
		}
	}
	
}