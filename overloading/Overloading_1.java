class Overloading_1Demo {
	public void type(int x) {
		System.out.println("in int " + x);
	}
	public void type(String s) {
		System.out.println("in string " + s);
	}
	public void type(byte b) {
		System.out.println("in byte " + b);
	}
}

class Overloading_1 {
	public static void main(String args[]) {

		byte z = 55;

		Overloading_1Demo obj1 = new Overloading_1Demo();

		obj1.type(z);			//it will go to byte argument
		obj1.type("hello");		//string
		obj1.type(250);
		obj1.type('A');			//since char is not available,
								//so the datatype higher than char
								//in terms of range is "int"

		obj1.type("A"); 			// String

		//obj1.type(7.5);			//since float datatype is not available
								//and so it's higher datatype, so its
								//higher datatype,
								//so at this step there will be an error.
	}
}