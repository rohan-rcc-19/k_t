import java.io.*;

class Calculator_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Press 1 for Addition (+) ");
		System.out.println("Press 2 for Substraction (-)");
		System.out.println("Press 3 for Division (/)");
		System.out.println("Press 4 for Multiplication (*)");
		System.out.println();
		System.out.print("Your Choice : ");
		int choice = Integer.parseInt(br.readLine());
		//char name = reader.readLine().charAt(0); // '+' for addition, '-' for subtraction, and so on.

		switch(choice) {
			case 1:
				int sum = 0, i, x;
				int noArr[] = new int[25];
				System.out.println("Enter the numbers you want to add : ");
				for(i = 0; i < 25; i++) {
					x = Integer.parseInt(br.readLine());
					if(x != -1) {
						noArr[i] = x;
						continue;
					} else 
						break;
				}
				for(int j = 0; j<i; j++) {
					sum = sum + noArr[j];
					System.out.print(" " + noArr[j] + " ");
				}
				System.out.println("::Sum = " + sum);
				break;

			case 2:
				int diff, s1, s2;
				System.out.println("Enter the numbers you want to substract :");
				s1 = Integer.parseInt(br.readLine());
				s2 = Integer.parseInt(br.readLine());
				diff = s1 - s2;
				System.out.println(":: " + s1 + " - " + s2 + " = " + diff);
				break;

			case 3:
				System.out.println("Enter the numbers you want to divide :");
				int x1 = Integer.parseInt(br.readLine());
				int x2 = Integer.parseInt(br.readLine());
				Calculator_1.division(x1, x2);
				break;

			case 4:
				System.out.println("Enter the numbers you want to multiply :");
				int m1 = Integer.parseInt(br.readLine());
				int m2 = Integer.parseInt(br.readLine());
				int multiply = m1 * m2;
				System.out.println("multiplying " + m1 + "with " + m2 + "= " + multiply);
				break;
		}
	}

	//division method
		public static void division(int x1, int x2) {
			float div = 0;

			try {
				div = (float) x1/x2;
			} catch (ArithmeticException e) {
				System.out.println("divide by zero.");
			}

			System.out.println("division of " + x1 + " by " + x2 + " is " + div);
		}
}