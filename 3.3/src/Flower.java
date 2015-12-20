
public  abstract class Flower {
	public String name;
	public String color;
	public int price;

	protected Flower(String name, String color,int price) {
		this.name = name;
		this.color = color;
		this.price = price;

	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	
}
	public String toString(){
	return this.name+" "+this.color+" "+this.price;
	}
}