import java.util.Arrays;

public class Start {
	public static void main(String[] args) {

		Vendor vendor = new Vendor();
		Vendor.Showcase();

		System.out.println(Vendor.calculatePrice(Vendor.makeABouquet(Vendor.Showcase())));
	}
}