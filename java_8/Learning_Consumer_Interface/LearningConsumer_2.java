import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Consumer;

class LearningConsumer_2 {
	public static void main(String[] args) {
		
		Consumer<List<Integer>> c1 = list -> {
			for(int i = 0; i < list.size(); i++)
				list.set(i, 2*list.get(i));
		};

		Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));

		List<Integer> list = new ArrayList<Integer>();
		list.add(8);	list.add(5);	list.add(2);

		c1.andThen(dispList).accept(list);
	}
}