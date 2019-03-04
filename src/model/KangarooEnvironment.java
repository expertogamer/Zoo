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
	
	//Constructor
	public KangarooEnvironment(String name, double foodQuantity, double waterQuantity) {
		this.name = name;
		this.foodQuantity = foodQuantity;
		this.waterQuantity = waterQuantity;
		this.area = 0;
		
		kangaroo1 = null;
		kangaroo2 = null;
		kangaroo3 = null;
	}
	

	//Getters and setters (Also known as analyzers and modifiers)
	public void setName(String name) { this.name = name; }
	public void setFoodQuantity(double foodQuantity) { this.foodQuantity = foodQuantity; }
	public void setWaterQuantity(double waterQuantity) { this.waterQuantity = waterQuantity; }
	
	public String getName() { return name; }
	public double getFoodQuantity() { return foodQuantity; }
	public double getWaterQuantity() { return waterQuantity; }
	public double getArea() { return area; }
	public Kangaroo getKangaroo1() { return kangaroo1; }
	public Kangaroo getKangaroo2() { return kangaroo2; }
	public Kangaroo getKangaroo3() { return kangaroo3; }
	
	//Creates a kangaroo in the environment. There cannot be more than one male in an environment and there must be three or less kangaroos per environment
	public boolean createKangaroo(String name, String sex, String bloodType, double height, double weight, Date birthDate) {
		boolean success = false;
		
		if(sex == "Male") {

			if (kangaroo1 == null) {
				if(kangaroo2 == null) {
					if (kangaroo3 == null) {
						kangaroo3 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
						success = true;
					} else if (kangaroo3.getSex() != "Male") {
							kangaroo2 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
							success = true;
					}
				} else if(kangaroo3 == null) { 
					if (kangaroo2.getSex() != "Male") {
					kangaroo1 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
					success = true;
					}
				} else {
					if(kangaroo2.getSex() != "Male" && kangaroo3.getSex() != "Male") {
						kangaroo1 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
						success = true;
					}
				}
			} else if (kangaroo2 == null) {
				if (kangaroo3 == null) {
					if(kangaroo1.getSex() != "Male") {
						kangaroo3 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
						success = true;
					}
				} else if (kangaroo1.getSex() != "Male" && kangaroo3.getSex() != "Male") {
					kangaroo2 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
					success = true;
				}
			} else if(kangaroo3 == null) {
				if(kangaroo1.getSex() != "Male" && kangaroo2.getSex() != "Male") {
					kangaroo3 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
					success = true;
				}
			} 
				
		} else {
			if(kangaroo1 == null) {
				kangaroo1 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
				success = true;
			}
			else if(kangaroo2 == null) {
				kangaroo2 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
				success = true;
			}
			else if(kangaroo3 == null) {
				kangaroo3 = new Kangaroo(name, sex, bloodType, height, weight, birthDate);
				success = true;
			}
		}
		return success;

	}
	
	//Eliminates a kangaroo with the given name
	public boolean eliminateKangaroo(String name) {
		
		boolean success = false;
		
		if(kangaroo1 != null) {
			if(kangaroo1.getName().equals(name)) {
				kangaroo1 = null;
				success = true;
			}
		} else if(kangaroo2 != null) {
			if(kangaroo2.getName().equals(name)) {
				kangaroo2 = null;
				success = true;
			}
		} else if(kangaroo3 != null) {
			if(kangaroo3.getName().equals(name)) {
				kangaroo3 = null;
				success = true;
			}
		}
		
		return success;
	}

	
	//Calculates the area of the environment
	public String calculateArea() {
		
		double a = 0;
		
		if(kangaroo1 != null)
			a += kangaroo1.getHeight() * 8;
		if(kangaroo2 != null)
			a += kangaroo2.getHeight() * 8;
		if(kangaroo3 != null)
			a += kangaroo3.getHeight() * 8;
		area = a;
		String msg = "The area in " + name + " is " + a + " square meters.\n";
				
		return msg;
	}
	
	//Checks if any kangaroos need vaccines. There is no need to do any calculations right now.
	public String checkVaccines(Date currentDate) {
		
		String vaccine1 = "";
		String vaccine2 = "";
		String vaccine3 = "";
		String msg;
		
		if(kangaroo1 != null) {
			if (kangaroo1.getBirthDate().getYear()*365 + kangaroo1.getBirthDate().getMonth()*12 + kangaroo1.getBirthDate().getDay() > (currentDate.getYear()*365 + currentDate.getMonth()*12 + currentDate.getDay()) - 365)
			{
				vaccine1 = kangaroo1.getName() + " needs a vaccine\n";
			}
			else
			{
				vaccine1 = kangaroo1.getName() + " does not need a vaccine\n";
			}
		}

		if (kangaroo2 != null) {
			if (kangaroo2.getBirthDate().getYear()*365 + kangaroo2.getBirthDate().getMonth()*12 + kangaroo2.getBirthDate().getDay() > (currentDate.getYear()*365 + currentDate.getMonth()*12 + currentDate.getDay()) - 365)
			{
				vaccine2 = kangaroo2.getName() + " needs a vaccine\n";
			}
			else
			{
				vaccine2 = kangaroo2.getName() + " does not need a vaccine\n";
			}
		}

		if(kangaroo3 != null) {
			if (kangaroo3.getBirthDate().getYear()*365 + kangaroo3.getBirthDate().getMonth()*12 + kangaroo3.getBirthDate().getDay() > (currentDate.getYear()*365 + currentDate.getMonth()*12 + currentDate.getDay()) - 365)
			{
				vaccine3 = kangaroo3.getName() + " needs a vaccine\n";
			}
			else
			{
				vaccine3 = kangaroo3.getName() + " does not need a vaccine\n";
			}
		}

		msg = vaccine1 + vaccine2 + vaccine3;
		return msg;
	}
	
	//Checks if there is enough water in the kangaroo zone.
	public String checkWater() {
		
		String msg;
		
		double bmi = 0;
		
		if(kangaroo1 != null)
			bmi += kangaroo1.calculateBMI();
		if(kangaroo2 != null)
			bmi += kangaroo2.calculateBMI();
		if(kangaroo3 != null)
			bmi += kangaroo3.calculateBMI();
		
		double waterNeeded = bmi * 1.5;
		
		if (waterNeeded > waterQuantity)
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
		double requiredFood = 0;
		
		if(kangaroo1 != null) {
			if(kangaroo1.getWeight() < 30)
				requiredFood += kangaroo1.getWeight() * 0.8;
			else if (kangaroo1.getWeight() > 48)
				requiredFood += 40 + ((kangaroo1.getWeight() - 48) * 0.4);
			else
				requiredFood += kangaroo1.getWeight() * 1.1;
		}
		
		if(kangaroo2 != null) {
			if(kangaroo2.getWeight() < 30)
				requiredFood += kangaroo2.getWeight() * 0.8;
			else if (kangaroo2.getWeight() > 48)
				requiredFood += 40 + ((kangaroo2.getWeight() - 48) * 0.4);
			else
				requiredFood += kangaroo2.getWeight() * 1.1;
		}
		
		if(kangaroo3 != null) {
			if(kangaroo3.getWeight() < 30)
				requiredFood += kangaroo3.getWeight() * 0.8;
			else if (kangaroo3.getWeight() > 48)
				requiredFood += 40 + ((kangaroo3.getWeight() - 48) * 0.4);
			else
				requiredFood += kangaroo3.getWeight() * 1.1;
		}
		
		msg = name + " requires " + requiredFood + " kilograms of food.\n";
		
		if(foodQuantity < requiredFood)
			msg += "WARNING. There is not enough food in " + name + "\n";
		
		return msg;
	}
	
	//Checks if any kangaroos have a risk of getting a heart disease
	public String checkHeartDisease() {
		
		String msg = "";
		
		String k1 = "";
		String k2 = "";
		String k3 = "";
		
		if(kangaroo1 != null) {
			double kangaroo1BMI = kangaroo1.calculateBMI();
			if(kangaroo1BMI < 18)
			{
				if(kangaroo1.getBloodType() == "A" || kangaroo1.getBloodType() == "AB")
					k1 = kangaroo1.getName() + " has a low risk of getting a heart disease\n";
				else
					k1 = kangaroo1.getName() + " has a moderate risk of getting a heart disease\n";
			}
			else if(kangaroo1BMI >= 18 && kangaroo1BMI <= 25)
			{
				k1 = kangaroo1.getName() + " has a low risk of getting a heart disease\n";
			}
			else
			{
				if(kangaroo1.getBloodType() == "A" || kangaroo1.getBloodType() == "AB" || kangaroo1.getBloodType() == "O")
					k1 = kangaroo1.getName() + " has a high risk of getting a heart disease\n";
				else
					k1 = kangaroo1.getName() + " has a moderate risk of getting a heart disease\n";
			}
			
		}
	
		if(kangaroo2 != null)
		{
			double kangaroo2BMI = kangaroo2.calculateBMI();
			if(kangaroo2BMI < 18)
			{
				if(kangaroo2.getBloodType() == "A" || kangaroo2.getBloodType() == "AB")
					k2 = kangaroo2.getName() + " has a low risk of getting a heart disease\n";
				else
					k2 = kangaroo2.getName() + " has a moderate risk of getting a heart disease\n";
			}
			else if(kangaroo2BMI >= 18 && kangaroo2BMI <= 25)
			{
				k2 = kangaroo2.getName() + " has a low risk of getting a heart disease\n";
			}
			else
			{
				if(kangaroo2.getBloodType() == "A" || kangaroo2.getBloodType() == "AB" || kangaroo2.getBloodType() == "O")
					k2 = kangaroo2.getName() + " has a high risk of getting a heart disease\n";
				else
					k2 = kangaroo2.getName() + " has a moderate risk of getting a heart disease\n";
			}
		}
	
		if(kangaroo3 != null) 
		{
			double kangaroo3BMI = kangaroo3.calculateBMI();
			if(kangaroo3BMI < 18)
			{
				if(kangaroo3.getBloodType() == "A" || kangaroo3.getBloodType() == "AB")
					k3 = kangaroo3.getName() + " has a low risk of getting a heart disease\n";
				else
					k3 = kangaroo3.getName() + " has a moderate risk of getting a heart disease\n";
			}
			else if(kangaroo3BMI >= 18 && kangaroo3BMI <= 25)
			{
				k3 = kangaroo3.getName() + " has a low risk of getting a heart disease\n";
			}
			else
			{
				if(kangaroo3.getBloodType() == "A" || kangaroo3.getBloodType() == "AB" || kangaroo3.getBloodType() == "O")
					k3 = kangaroo3.getName() + " has a high risk of getting a heart disease\n";
				else
					k3 = kangaroo3.getName() + " has a moderate risk of getting a heart disease\n";
			
		}
}

		msg = k1 + k2 + k3;
		
		return msg;
	}
	
	//Looks if kangaroo1, kangaroo2 or kangaroo3 have a name that begins and ends with a vowel
	public String findKangarooWhoseNameBeginsEndsWithVowel() {
		String msg = "";
		
		if(kangaroo1 != null) {
			if(kangaroo1.nameBeginsEndsWithVowel()) {
				msg += kangaroo1.getName() + "'s name begins and ends with a vowel.\n";
			}
		}
		
		if(kangaroo2 != null) {
			if(kangaroo2.nameBeginsEndsWithVowel()) {
				msg += kangaroo2.getName() + "'s name begins and ends with a vowel.\n";
			}
		}

		if(kangaroo3 != null) {
			if(kangaroo3.nameBeginsEndsWithVowel()) {
				msg += kangaroo3.getName() + "'s name begins and ends with a vowel.\n";
			}
		}
		
		return msg;
	}
	
	//Gives a report of each kangaroo's vaccination date
	public String reportVaccines() {
		
		String msg = "";
		
		if(kangaroo1 != null) {
			msg += kangaroo1.getName() + " vaccination date: " + kangaroo1.getBirthDate().getDay() + "/" + kangaroo1.getBirthDate().getMonth() + "/" + (kangaroo1.getBirthDate().getYear() + 1) + "\n";
		}
		if(kangaroo2 != null) {
			msg += kangaroo2.getName() + " vaccination date: " + kangaroo2.getBirthDate().getDay() + "/" + kangaroo2.getBirthDate().getMonth() + "/" + (kangaroo2.getBirthDate().getYear() + 1) + "\n";
		}
		if(kangaroo3 != null) {
			msg += kangaroo3.getName() + " vaccination date: " + kangaroo3.getBirthDate().getDay() + "/" + kangaroo3.getBirthDate().getMonth() + "/" + (kangaroo3.getBirthDate().getYear() + 1) + "\n";
		}
		
		return msg;
	}

}
