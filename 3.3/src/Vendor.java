
public class Vendor {

	
	public static Bouquet makeABouquet(Flower [] flower) {
		
		Bouquet bouquet = new Bouquet();
		
			bouquet.addFlower(flower[0]);
			bouquet.addFlower(flower[1]);
			bouquet.addFlower(flower[2]);
	
		return bouquet;
	}
	public static int calculatePrice(Flower[] flower) {
		int price = 0;
		for (int i = 0; i < flower.length; i++) {
			price += flower[i].price;
		}
		return price;
		
		
	}
public static void Showcase() {
		
		
		Rose rose = new Rose("Rose","Green",100);
		Chamomile chamomile = new Chamomile("Chamomile","White", 20);
		Chamomile chamomileG = new Chamomile("Chamomile","Grey", 20);
		
		Flower [] flower = {rose, chamomile,chamomileG};
		Bouquet bouquet;
		
		Vendor vendor = new Vendor();
		bouquet = Vendor.makeABouquet(flower);
		
		

	}
}
