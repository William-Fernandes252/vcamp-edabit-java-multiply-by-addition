public class NumberMult {
	public static int multiply(int x, int y) {
		if(x == 0 || y == 0) {
			return 0;
		}
		if(y < 0) {
			return multiply(x, y + 1) - x;
		}
		return x + multiply(x, y - 1);
	}
}