package classes;

import interfaces.IAssembllyLine;
import interfaces.IProduct;
import interfaces.IProductPart;

public class CarAssemblyLine implements IAssembllyLine {
	private BodyLineStep bodyLineStep;
	private ChassisLineStep chassisLineStep;
	private MotorLineStep motorLineStep;
	
	public CarAssemblyLine(BodyLineStep bodyLineStep, ChassisLineStep chassisLineStep, MotorLineStep motorLineStep)
	  {
	    this.bodyLineStep = bodyLineStep;
		this.chassisLineStep = chassisLineStep;
		this.motorLineStep = motorLineStep;
	    System.out.println("Car Assembly Line has been created.");
	  }
	
	public IProduct assembleProduct(IProduct product) {
		if(product instanceof Car)
	    {
		  product.installFirstPart(bodyLineStep.buildProductPart());
		  product.installSecondPart(chassisLineStep.buildProductPart());
		  product.installThirdPart(motorLineStep.buildProductPart());
	      
		}
		System.out.println("Car has been successfully assembled.");
		return product;
	}

	

}
