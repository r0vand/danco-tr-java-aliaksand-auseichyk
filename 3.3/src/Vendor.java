
public class Vendor {

	public Bouquet makeABouquet(Flower[] flower) {

		Bouquet bouquet = new Bouquet();
		bouquet.addFlower(flower[0]);
		bouquet.addFlower(flower[1]);
		bouquet.addFlower(flower[2]);
		return bouquet;
	}

	public int calculatePrice(Flower[] flower) {
		int price = 0;
		for (int i = 0; i < flower.length; i++) {
			price += flower[i].price;
		}
		return price;

	}
	
}
