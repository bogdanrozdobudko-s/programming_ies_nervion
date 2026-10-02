package ejemplo2If;

public class Ejemplo2If {
	public static void main(String[] args) {
		int a = 5, b = 23, c = 2;

		int major;

		if (a < b) {
			major = b;
		} else {
			major = a;
		}

		if (b < c) {
			major = c;
		} else {
			major = b;
		}
		
		System.out.println("The major number is: " + major);
	}

}
