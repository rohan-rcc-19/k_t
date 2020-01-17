
	//##############################################################
	//  The following code shows how to pass Consumer as parameter
	//##############################################################

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Student {
	public String name;
	public double gpa;

	Student(String n, double gpa) {
		this.name = n;
		this.gpa = gpa;
	}
}

class LearningConsumer_4 {
	public static void main(String[] args) {
		
		List<Student> s1 = Arrays.asList(
			new Student("john", 3),
			new Student("mark", 6),
			new Student("philip", 5),
			new Student("johan", 8.5),
			new Student("mark", 6.75)
			);

		acceptAllStudents(s1, e -> System.out.println(e.name));
		acceptAllStudents(s1, e -> {
			e.gpa *= 0.5;
		});
		acceptAllStudents(s1, e -> System.out.println(e.name + ": " + e.gpa));

	}

	public static void acceptAllStudents(List<Student> s2, Consumer<Student> printer) {
			for (Student s: s2)
				printer.accept(s);
		}
}