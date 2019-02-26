package model;

public class LizardZone {
	
	//LizardZone attributes
	
	private String name;
	private double foodQuantity;
	private double waterQuantity; 
	private double temperature;
	private double humidity;
	private double area;
	
	//Objects related to LizardZone
	
	private Lizard lizard1;
	private Lizard lizard2;
	
	//Constructor
	public LizardZone(String name, double temperature, double humidity, double fq, double wq,
						Lizard l1, Lizard l2) {
		this.name = name;
		this.temperature = temperature;
		this.humidity = humidity;
		this.foodQuantity = fq;
		this.waterQuantity = wq;
		this.area = 0;
		
		this.lizard1 = l1;
		this.lizard2 = l2;
	}
	
	//Getters and setters (Also know as analyzers and modifiers)
	public void setName(String name) { this.name = name; }
	public void setFoodQuantity(double foodQuantity) { this.foodQuantity = foodQuantity; }
	public void setWaterQuantity(double waterQuantity) { this.waterQuantity = foodQuantity; }
	public void setTemperature(double temperature) { this.temperature = temperature; }
	public void setHumidity(double humidity) { this.humidity = humidity; }
	
	public String getName() { return name; }
	public double getFoodQuantity() { return foodQuantity; }
	public double getWaterQuantity() { return waterQuantity; }
	public double getTemperature() { return temperature; }
	public double getHumidity() { return humidity; }
	public double getArea() { return area; }
	
	//Calculates the area
	public String calculateArea() {
		
		double a = lizard1.getHeight() * 8 + lizard2.getHeight() * 8;
		area = a;
		String msg = "The area in " + name + " is " + a + " square meters.\n";
				
		return msg;
	}
	
	// Checks if there is enough water in the lizard zone
	public String checkWater() {
		
		String msg;
		
		double bmi = 22.0; //There is currently no need to calculate the BMI
		double waterNeeded = bmi * 0.75;
		
		if (waterNeeded < waterQuantity)
		{
			msg = "There is not enough water in " + name + "\n";
		}
		else
		{
			msg = "There is sufficient water in " + name + "\n";
		}
		
		return msg;
	}
	
	//Checks if there is enough food in the lizard zone
	public String checkFood() {
		
		String msg;
		
		if (foodQuantity < 5.0)
		{
			msg = "WARNING! There are less than 5.0 kg of food in the Lizard Zone.\n";
		}
		else 
		{
			msg = "There is sufficient food in the Lizard Zone.\n";
		}
		
		return msg;
	}
	
}
