package methods_of_wd;

public class Demo {
	public static void main(String[] args) {
		try {
			divide();
			System.out.println("Execution Didn't stopped...");
		} catch (ArithmeticException e) {
			System.out.println("Handled....");
		}
	}

	public static void divide() throws ArithmeticException {
		int a = 1;
		int b = 0;

		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}

		System.out.println("Handled...");
	}
}
