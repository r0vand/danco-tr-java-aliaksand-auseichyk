public class Start {
	public static void main(String[] args) {
		array.strArrayPrint(array.getStrArray());
		array.intArrayPrint(Converting.convert(array.getStrArray()));
		System.out.println(Converting.getSum(Converting.convert(array.getStrArray())));
		System.out.println(Converting.Summ(Converting.getSum(Converting.convert(array.getStrArray()))));
	}

}
