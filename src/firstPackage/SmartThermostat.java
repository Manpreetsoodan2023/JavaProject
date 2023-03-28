package firstPackage;

public class SmartThermostat {

	String BrandName;
	
	String Model;
	
	int Warranty;
	
	float DisplaySize;
	
	boolean doesitconnectwithinternet;
	
	void controltemp(){
		
		System.out.println("Heating and cooling temperature is automatically adjusted by"+BrandName+"SmartThermostat");
	
	}
	void getweather() {
		
		System.out.println("Get weather condition details by"+BrandName+"SmartThermostat");
		
	}
	
	void internetconnectivity() {
		
		System.out.println("Can be connected with phone if internet connectivity feature is present. Connectivity feature is present:"+ doesitconnectwithinternet);
		
	}
	}
	
	

