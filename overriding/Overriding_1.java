class Overriding_1_vehicle {
	void run() {System.out.println("vehicle is running.");}
}

class Overriding_1 extends Overriding_1_vehicle{
	void run() {System.out.println("bike is running safely.");}

	public static void main(String[] args) {
		Overriding_1 obj = new Overriding_1();
		obj.run();
	}
} 