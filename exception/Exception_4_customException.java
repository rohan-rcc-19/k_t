class MyException extends Exception {
	private int details;
	
	MyException(int a) {
		details = a;
	}
	public String toString() {
		return "MyException [" + details + "]";
	}
}

class Exception_4_customException {
	static void compute (int a) throws MyException {
		System.out.println("Called Compute (" + a + ")");
		if(a > 10)
			throw new MyException(a);
		System.out.println("Normal Exit");
	}

	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		} catch (MyException e) {
			System.out.println("Caught " + e);
		}
	}
}