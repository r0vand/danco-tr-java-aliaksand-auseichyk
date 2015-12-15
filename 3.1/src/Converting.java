public class Converting {

	public static int[] convert(String[] Array) {
		int[] myIntArray;
		myIntArray = new int[5];
		for (int i = 0; i < 5; i++) {
			myIntArray[i] = Integer.parseInt(Array[i]);
		}
		return myIntArray;
	}

	public static int getSum(int[] IntArray) {
		int sum = 0;
		for (int i = 0; i < IntArray.length; i++) {
			sum += IntArray[i];
		}
		return sum;
	}

	public static String Summ(int sum) {
		String Summ = String.valueOf(sum);
		return Summ;
	}
}