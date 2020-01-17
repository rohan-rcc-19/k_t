import java.util.List;
import java.util.ArrayList; 
import java.util.LinkedList;
import java.util.function.Consumer;

class LearningConsumer_1 {
	public static void main(String[] args) {
		
		Consumer<String> c = x -> System.out.println(x);
		c.accept("Learning Consumer.");

		Consumer<Integer> c1 = y -> System.out.println("This is my " + y + "st program.");
		c1.accept(1);

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2); list1.add(6); list1.add(9);
		// Consumer to multiply 2 to every integer of a list 
		Consumer<List<Integer>> c2 = list -> {
			for(int i = 0; i < list.size(); i++)
				list.set(i, 2 * list.get(i));
			//if there is a need to update the list element based on index then set
			//method of ArrayList class can be used.
			//The method set(int index, Element E) updates the element of specified
			//index with given element E.
		};

		c2.accept(list1);

		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));
		dispList.accept(list1);
	}
}