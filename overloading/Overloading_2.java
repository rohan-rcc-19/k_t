class Overloading_2Demo {
	public int sum (int x, int y) {
		return (x+y);
	}
	public int sum (int x, int y, int z) {
		return (x+y+z);
	}
	public double sum (double x, int y) {
		return (x+y);
	}
}

class Overloading_2 {
	public static void main(String[] args) {
		
		Overloading_2Demo obj1 = new Overloading_2Demo();

		System.out.println(obj1.sum(10, 9));
		System.out.println(obj1.sum(6, 9, 5));
		System.out.println(obj1.sum(9.8, 5));
	}
}