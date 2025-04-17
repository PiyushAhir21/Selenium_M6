package methods_of_wd;

class MatrimonyException extends Exception {

	String msg;

	MatrimonyException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
}

public class Matrimony {

	static void submit(int age) throws MatrimonyException {
		if (age >= 18) {
			System.out.println("Happy Life");
		} else {
			throw new MatrimonyException("Hey there");
		}
	}

	public static void main(String[] args) throws MatrimonyException {
		submit(15);
	}
}
