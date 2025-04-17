package methods_of_wd;

public class ExplanationOfException {

	public static void main(String[] args) {
		try {
			divide();
		} catch (NullPointerException e) {
			System.out.println("Handled...");
		}catch (ArithmeticException e) {
			System.out.println("Handled...");
		}
		
		System.out.println("Next task to be executed...");
	}

	public static void divide() {
		System.out.println(1/0);
	}
}
