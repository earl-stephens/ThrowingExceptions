package application;

public class Thermostat {
	// temperature in celsius
	//have to have throws Exception in the method declaration
	
	public void setTemperature(double temperature) throws Exception {
		setMachineTemperature(temperature);
		/*
		if(temperature < 0 || temperature > 35) {
			//exceptions are classes
			//lots of premade exceptions
			//can make custom exceptions
			throw new Exception("Temperature out of range"); 
		}
		*/
		System.out.println("Setting temperature to " + temperature);
		/*
		So you have to keep the throws Exception in the method
		declaration, and in the App main method is where you call
		the try catch.
		*/
	}
	
		private void setMachineTemperature(double temperature) throws Exception {
			if(temperature < 0 || temperature > 35) {
				throw new Exception("Temperature out of range");
			}
		}
	
}
