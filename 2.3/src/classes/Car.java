package classes;

import interfaces.IProduct;
import interfaces.IProductPart;

public class Car implements IProduct {
	private Body body;
	  private Chassis chassis;
	  private Motor motor;
	  
	  public Car()
	  {
		  body = null;
		  chassis = null;
		  motor = null;
		  System.out.println("billet Car has been created.");
	  }
	
	public void installFirstPart(IProductPart firstPart) {
		if(firstPart instanceof Body)
	    {body = (Body)firstPart;
		 System.out.println("Body has been installed.");}	

	};

	public void installSecondPart(IProductPart secondPart) {
		if(secondPart instanceof Chassis)
	    {chassis = (Chassis)secondPart;
		System.out.println("Chassis has been installed.");}
	};

	public void installThirdPart(IProductPart thirdPart) {
		if(thirdPart instanceof Motor)
	    {motor = (Motor)thirdPart;
		System.out.println("Motor has been installed.");}

	};

}
