import java.io.*;
import java.util.*;
import java.lang.Comparable;

class Employee_db_1 implements Comparable<Employee_db_1> {
	private int id;
	private String name;
	private String location;
	private double salary;
	
	public Employee_db_1(int id, String name, String location, double salary) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
    public int compareTo(Employee_db_1 compareId) {
        int compare=(compareId).getId();
        
        return this.id-compare;
    }

    @Override
    public String toString() {
        return "[ Id=" + id + ", Name=" + name + ", Location=" + location + "]";
    }
}

public class Employee_main_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the strength of your records: ");
		int n = Integer.parseInt(br.readLine());
		List<Employee_db_1> emp1 = new ArrayList<Employee_db_1>(n);

		for(int i = 0; i < n; i++) {
			System.out.println("Enter records for Employee : " + i);
			int id = Integer.parseInt(br.readLine());
			String name = br.readLine();
			String loc = br.readLine();
			int salary = Integer.parseInt(br.readLine());

			emp1.add(new Employee_db_1(id, name, loc, salary));
		}

		Collections.sort(emp1);

		System.out.println("Sorted : ");
		for(Employee_db_1 emp : emp1)
			System.out.println(emp);
	}
}

