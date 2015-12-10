package classes;

import interfaces.ILineStep;
import interfaces.IProductPart;

public class ChassisLineStep implements ILineStep {

	public ChassisLineStep()
	  {
	    System.out.println("Chassis Line Step has been created.");
	  }
	public IProductPart buildProductPart() {
		// TODO Auto-generated method stub
		return new Chassis();
	};

}
