
public class PatternApp {

	public static void main(String[] args) {
		String name = "INEURON";
		int width = 9;
		int length = 9;
		//iPattern(width, length, name.charAt(0));
		//nPattern(width, length, name.charAt(0));
		//ePattern(width, length, name.charAt(0));
		//uPattern(width, length, name.charAt(0));
		uPattern(width, length, name.charAt(0));
	}

	public static void iPattern(int width, int length, char letter) {

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == length - 1) {
					System.out.print("*");
				} else if (j == width / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void nPattern(int width, int length, char letter) {

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0 || j == length - 1) {
					System.out.print("*");
				} else if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void ePattern(int width, int length, char letter) {

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == length / 2 || i == length - 1) {
					System.out.print("*");
				} else if (j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public static void uPattern(int width, int length, char letter) {

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (i != length - 1 && (j == 0 || j == width - 1)) {
					System.out.print("*");
				} else if (i == length - 1 && (j != 0 && j != width - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void rPattern(int width, int length, char letter) {

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0) {
					System.out.print("*");
				} else if (i == length - 1 && (j != 0 && j != width - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	
	
}
