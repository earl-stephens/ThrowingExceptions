package application;

public class Thermostat {
	// temperature in celsius
	//have to have throws Exception in the method declaration
	
	public void setTemperature(double temperature) {
		
	/*	if(temperature < 0 || temperature > 35) {
			//exceptions are classes
			//lots of premade exceptions
			//can make custom exceptions
			throw new Exception("Temperature out of range"); 
		}
		*/
		boolean tempCheck = true;
		try {
			temperature < 0 || temperature > 35;
			}
		catch(Exception e) {
			System.out.println("Temperature out of range.");
		}
		
	}
}
