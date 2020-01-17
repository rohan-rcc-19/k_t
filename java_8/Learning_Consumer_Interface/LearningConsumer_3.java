import java.util.function.Consumer;

class LearningConsumer_3 {
	static void printMessage(String name) {
		System.out.println("Hello " + name);
	}
	static void printValue(int val) {
		System.out.println(val);
	}

	public static void main(String[] args) {
		
		//reffering method to String type Consumer interface
		Consumer<String> c1 = LearningConsumer_3::printMessage;
		c1.accept("I am learning Consumer in different ways.");

		//reffering method to Integer type Consumer interface
		Consumer<Integer> c2 = LearningConsumer_3::printValue;
		c2.accept(1815);
	}
}