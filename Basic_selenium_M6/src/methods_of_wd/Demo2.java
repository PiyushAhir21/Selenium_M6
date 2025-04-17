package methods_of_wd;

public class Demo2 {
	public static void main(String[] args) {
		try {
			divide();
			System.out.println("Execution Didn't stopped...");
		} catch (ArithmeticException e) {
			System.out.println("Handled....");
		}
	}
	
	public static void divide() {
		int a = 1;
		int b = 0;
		System.out.println(a/b);
	}
}
