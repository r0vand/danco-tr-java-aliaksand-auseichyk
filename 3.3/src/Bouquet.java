
public class Bouquet {
	private Flower[] flower = new Flower[3];
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
	}

	
	public String toString(){
		return this.flower[0]+" "+this.flower[1]+" "+this.flower[2]+" "+this.quantity;
		}
}
