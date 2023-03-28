package firstPackage;

public class ThermostatMain {

	public static void main(String[] args) {
		
		SmartThermostat Gthermostat = new SmartThermostat();
		
		Gthermostat.BrandName = "Google";
		Gthermostat.Model = "Nest";
		Gthermostat.Warranty = 1;
		Gthermostat.DisplaySize = 2.1f;
		Gthermostat.doesitconnectwithinternet = true;
		
		Gthermostat.controltemp();
		Gthermostat.getweather();
		Gthermostat.internetconnectivity();
		
		System.out.println("****************");
		
	SmartThermostat Athermostat = new SmartThermostat();
	
	Athermostat.BrandName = "Amazon";
	Athermostat.Model = "Ecobee";
	Athermostat.Warranty = 3;
	Athermostat.DisplaySize = 3.5f;
	Athermostat.doesitconnectwithinternet = true;
	
	Athermostat.controltemp();
	Athermostat.getweather();
	Athermostat.internetconnectivity();
	
}
}