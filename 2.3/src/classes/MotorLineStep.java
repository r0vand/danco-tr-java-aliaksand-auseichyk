package classes;

import interfaces.ILineStep;
import interfaces.IProductPart;

public class MotorLineStep implements ILineStep {
	
	public MotorLineStep ()
	{
		 System.out.println("Motor Line Step has been created.");
	}
	
	
	public IProductPart buildProductPart() {
		
		return new Motor();
	}

}
