package application;

public class App {

	public static void main(String[] args) throws Exception {
		/* have to either have throws Exception in the declaration
		 * or have a try catch
		 */
		Thermostat stat = new Thermostat();
		stat.setTemperature(70);

	}

}
