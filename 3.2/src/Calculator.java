public class Calculator {
	public static int theHighestFigure(int number) {
		int a = number % 10;
		int b = (number / 10) % 10;
		int c = (number / 100) % 10;
		int d = 0;
		if (a >= b & a > c || a > b & a >= c) {
			d = a;
		} else {
			if (b > a & b >= c) {
				d = b;
			} else {
				d = c;
			}

		}
		return d;
	}
}