class Overloading_3_mainfunc {
	public static void main(String[] args) {
		System.out.println("Hi! I am main here. I am calling the next one.");
		Overloading_3_mainfunc.main("Second");
	}

	public static void main(String ar1) {
		System.out.println("Hi! I am the " + ar1 + " one.");
		Overloading_3_mainfunc.main("Third", "last one.");
	}

	public static void main(String ar2, String ar3) {
		System.out.println("Hi! I am the " + ar2 + " and the " + ar3);
	}
}