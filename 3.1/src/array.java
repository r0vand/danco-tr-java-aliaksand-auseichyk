public class array {
	public static String[] getStrArray() {
		return new String[] { "1", "2", "3", "4", "5" };
	}

	public static void strArrayPrint(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void intArrayPrint(int[] b) {
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

}