public class Start {
	public static void main(String[] args) {

		Vendor vendor = new Vendor();
		
		//Rose rose = new Rose("Rose", "Green", 100);
		Chamomile chamomile = new Chamomile("Chamomile", "White", 20);
		Chamomile chamomileG = new Chamomile("Chamomile", "Grey", 20);
		Chamomile chamomileA = new Chamomile("Chamomile", "Grey", 50);
		Flower[] flower =  { chamomileA, chamomile, chamomileG };
		
		System.out.println(vendor.makeABouquet(flower));
		System.out.println(vendor.calculatePrice(flower));
		

		

	}
}