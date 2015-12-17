
public class Bouquet {
private	Flower[] flower = new Flower[3];
private int priceBouquet;
private int quantity;

public Flower[] getFlower() {
	return flower;
}

public void setFlower(Flower[] flower) {
	this.flower = flower;
}

public void addFlower(Flower flower) {

	this.flower[quantity] = flower;
	quantity++;

	System.out.println(flower);
}

public int getPriceBouquet() {
	return priceBouquet;
}

public void setPriceBouquet(int priceBouquet) {
	this.priceBouquet = priceBouquet;
}


}
