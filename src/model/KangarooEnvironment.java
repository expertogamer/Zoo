package model;

public class KangarooEnvironment {
	
	//Attributes of a kangaroo environment
	private String name;
	private double foodQuantity;
	private double waterQuantity;
	private double area;
	
	//Objects associated with the kangaroo environment
	private Kangaroo kangaroo1;
	private Kangaroo kangaroo2;
	private Kangaroo kangaroo3;
	
	public KangarooEnvironment(String name, double foodQuantity, double waterQuantity,
								Kangaroo k1, Kangaroo k2, Kangaroo k3) {
		this.name = name;
		this.foodQuantity = foodQuantity;
		this.waterQuantity = waterQuantity;
		this.area = 0;
		
		this.kangaroo1 = k1;
		this.kangaroo2 = k2;
		this.kangaroo3 = k3;
	}
	
	//Getters and setters (Also know as analyzers and modifiers)
	public void setName(String name) { this.name = name; }
	public void setFoodQuantity(double foodQuantity) { this.foodQuantity = foodQuantity; }
	public void setWaterQuantity(double waterQuantity) { this.waterQuantity = waterQuantity; }
	
	public String getName() { return name; }
	public double getFoodQuantity() { return foodQuantity; }
	public double getWaterQuantity() { return waterQuantity; }
	public double getArea() { return area; }
	
	//Calculates the area of the environment
	public String calculateArea() {
		
		double a = kangaroo1.getHeight() * 8 + kangaroo2.getHeight() * 8 + kangaroo3.getHeight() * 8; 
		area = a;
		String msg = "The area in " + name + " is " + a + " square meters.\n";
				
		return msg;
	}
	
	//Checks if any kangaroos need vaccines. There is no need to do any calculations right now.
	public String checkVaccines(Date currentDate) {
		
		String vaccine1, vaccine2, vaccine3, msg;
		
		if (kangaroo1.getBirthDate().getYear() < currentDate.getYear() - 1)
		{
			vaccine1 = kangaroo1.getName() + " needs a vaccine\n";
		}
		else
		{
			vaccine1 = kangaroo1.getName() + " does not need a vaccine\n";
		}
		
		if (kangaroo2.getBirthDate().getYear() < currentDate.getYear() - 1)
		{
			vaccine2 = kangaroo2.getName() + " needs a vaccine\n";
		}
		else
		{
			vaccine2 = kangaroo2.getName() + " does not need a vaccine\n";
		}
		if (kangaroo3.getBirthDate().getYear() < currentDate.getYear() - 1)
		{
			vaccine3 = kangaroo1.getName() + " needs a vaccine\n";
		}
		else
		{
			vaccine3 = kangaroo1.getName() + " does not need a vaccine\n";
		}
		msg = vaccine1 + vaccine2 + vaccine3;
		return msg;
	}
	
	//Checks if there is enough water in the kangaroo zone.
	public String checkWater() {
		
		String msg;
		
		double bmi = 26.0; //There is currently no need to calculate the BMI. (Calculations are not needed in this lab.)
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
	
	//Checks if there is enough food in the kangaroo zone
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
	
	//Checks if any kangaroos have a risk of getting a heart disease
	public String checkHeartDisease() {
		
		 //There is currently no need to calculate the BMI. (Calculations are not needed in this lab.)
		double kangaroo1BMI = 43.4;
		double kangaroo2BMI = 32.4;
		double kangaroo3BMI = 54.4;
		
		String msg;
		
		String k1;
		String k2;
		String k3;
		
		if(kangaroo1BMI < 18)
		{
			if(kangaroo1.getBloodType() == "A" || kangaroo1.getBloodType() == "AB")
				k1 = kangaroo1.getName() + "has a low risk of getting a heart disease\n";
			else
				k1 = kangaroo1.getName() + "has a low risk of getting a heart disease\n";
		}
		else if(kangaroo1BMI >= 18 && kangaroo1BMI <= 25)
		{
			k1 = kangaroo1.getName() + "has a low risk of getting a heart disease\n";
		}
		else
		{
			if(kangaroo1.getBloodType() == "A" || kangaroo1.getBloodType() == "AB" || kangaroo1.getBloodType() == "O")
				k1 = kangaroo1.getName() + "has a low risk of getting a heart disease\n";
			else
				k1 = kangaroo1.getName() + "has a low risk of getting a heart disease\n";
		}
		
		if(kangaroo2BMI < 18)
		{
			if(kangaroo2.getBloodType() == "A" || kangaroo2.getBloodType() == "AB")
				k2 = kangaroo2.getName() + "has a low risk of getting a heart disease\n";
			else
				k2 = kangaroo2.getName() + "has a low risk of getting a heart disease\n";
		}
		else if(kangaroo1BMI >= 18 && kangaroo1BMI <= 25)
		{
			k2 = kangaroo2.getName() + "has a low risk of getting a heart disease\n";
		}
		else
		{
			if(kangaroo2.getBloodType() == "A" || kangaroo2.getBloodType() == "AB" || kangaroo2.getBloodType() == "O")
				k2 = kangaroo2.getName() + "has a low risk of getting a heart disease\n";
			else
				k2 = kangaroo2.getName() + "has a low risk of getting a heart disease\n";
		}
		
		if(kangaroo3BMI < 18)
		{
			if(kangaroo3.getBloodType() == "A" || kangaroo3.getBloodType() == "AB")
				k3 = kangaroo3.getName() + "has a low risk of getting a heart disease\n";
			else
				k3 = kangaroo3.getName() + "has a low risk of getting a heart disease\n";
		}
		else if(kangaroo3BMI >= 18 && kangaroo3BMI <= 25)
		{
			k3 = kangaroo3.getName() + "has a low risk of getting a heart disease\n";
		}
		else
		{
			if(kangaroo3.getBloodType() == "A" || kangaroo3.getBloodType() == "AB" || kangaroo3.getBloodType() == "O")
				k3 = kangaroo3.getName() + "has a low risk of getting a heart disease\n";
			else
				k3 = kangaroo3.getName() + "has a low risk of getting a heart disease\n";
		}

		msg = k1 + k2 + k3;
		
		return msg;
	}
	
	

}
