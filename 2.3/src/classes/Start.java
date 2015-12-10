package classes;

import classes.BodyLineStep;
import classes.ChassisLineStep;
import classes.Car;
import classes.CarAssemblyLine;
import classes.MotorLineStep;

public class Start {

	public static void main(String[] args) {
		BodyLineStep bodyLineStep = new BodyLineStep();
		  ChassisLineStep chassisLineStep = new ChassisLineStep();
		  MotorLineStep motorLineStep = new MotorLineStep();
		  CarAssemblyLine carAssemblyLine = new CarAssemblyLine(bodyLineStep,chassisLineStep,motorLineStep);
		  Car carBillet = new Car();
		  Car car = (Car)carAssemblyLine.assembleProduct(carBillet);
	}

}
