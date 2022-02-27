package application;

public class App {

	public static void main(String[] args) {
		/* have to either have throws Exception in the declaration
		 * or have a try catch
		 */
		Thermostat stat = new Thermostat();
		try {
		stat.setTemperature(-20);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
