package model;

public class KangarooZone {
	
	//Attributes of the Kangaroo Zone class
	private String name;
	private double foodQuantity;
	private double waterQuantity; 
	private double temperature;
	private double humidity;
	private double area;
	
	//Objects associated to the Kangaroo Zone class
	private KangarooEnvironment environment1;
	private KangarooEnvironment environment2;
	private KangarooEnvironment environment3;
	
	//Constructor
	public KangarooZone(String name, double temperature, double humidity,
						KangarooEnvironment ke1, KangarooEnvironment ke2, KangarooEnvironment ke3) {
		this.name = name;
		this.temperature = temperature;
		this.humidity = humidity;
		this.area = 0;
		this.environment1 = ke1;
		this.environment2 = ke2;
		this.environment3 = ke3;
		this.foodQuantity = environment1.getFoodQuantity() + environment2.getFoodQuantity() + environment3.getFoodQuantity();
		this.waterQuantity = environment1.getWaterQuantity() + environment2.getWaterQuantity() + environment3.getWaterQuantity();
	}
	
	//Getters and setters (Also known as analyzers and modifiers)
	public void setName(String name) { this.name = name; }
	public void setFoodQuantity(double foodQuantity) { this.foodQuantity = foodQuantity; }
	public void setWaterQuantity(double waterQuantity) { this.waterQuantity = foodQuantity; }
	public void setTemperature(double temperature) { this.temperature = temperature; }
	public void setHumidity(double humidity) { this.humidity = humidity; }
	public void setEnvironment1(KangarooEnvironment e1) { this.environment1 = e1; }
	public void setEnvironment2(KangarooEnvironment e2) { this.environment2 = e2; }
	public void setEnvironment3(KangarooEnvironment e3) { this.environment3 = e3; }

	
	public String getName() { return name; }
	public double getFoodQuantity() { return foodQuantity; }
	public double getWaterQuantity() { return waterQuantity; }
	public double getTemperature() { return temperature; }
	public double getHumidity() { return humidity; }
	public double getArea() { return area; }
	public KangarooEnvironment getEnvironment1() { return environment1; }
	public KangarooEnvironment getEnvironment2() { return environment2; }
	public KangarooEnvironment getEnvironment3() { return environment3; }
	
	//Changes a kangaroo's environment. Returns false if unsuccessful
	public boolean changeKangaroo(String name, int environmentNumber) {
		
		String sex, bloodType;
		double height, weight;
		Date birthDate;
		boolean success = false;
		
		if(environment1.getKangaroo1() != null) {
			if(environment1.getKangaroo1().getName().equals(name)) {
				
				sex = environment1.getKangaroo1().getSex();
				bloodType = environment1.getKangaroo1().getBloodType();
				height = environment1.getKangaroo1().getHeight();
				weight = environment1.getKangaroo1().getWeight();
				birthDate = environment1.getKangaroo1().getBirthDate();
				environment1.eliminateKangaroo(name);
				
				System.out.println(sex);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
			}
		}
		
		if(environment1.getKangaroo2() != null) {
			if(environment1.getKangaroo2().getName().equals(name)) {
				
				sex = environment1.getKangaroo2().getSex();
				bloodType = environment1.getKangaroo2().getBloodType();
				height = environment1.getKangaroo2().getHeight();
				weight = environment1.getKangaroo2().getWeight();
				birthDate = environment1.getKangaroo2().getBirthDate();
				environment1.eliminateKangaroo(name);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
			}
		}

		if(environment1.getKangaroo3() != null) {
			if(environment1.getKangaroo3().getName().equals(name)) {
				
				sex = environment1.getKangaroo3().getSex();
				bloodType = environment1.getKangaroo3().getBloodType();
				height = environment1.getKangaroo3().getHeight();
				weight = environment1.getKangaroo3().getWeight();
				birthDate = environment1.getKangaroo3().getBirthDate();
				environment1.eliminateKangaroo(name);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
				
			} 
		}
		
		if(environment2.getKangaroo1() != null) {
			if(environment2.getKangaroo1().getName().equals(name)) {
				
				sex = environment2.getKangaroo1().getSex();
				bloodType = environment2.getKangaroo1().getBloodType();
				height = environment2.getKangaroo1().getHeight();
				weight = environment2.getKangaroo1().getWeight();
				birthDate = environment2.getKangaroo1().getBirthDate();
				environment2.eliminateKangaroo(name);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
				
			}
		}
		
		if(environment2.getKangaroo2() != null) {
			if(environment2.getKangaroo2().getName().equals(name)) {
				
				sex = environment2.getKangaroo2().getSex();
				bloodType = environment2.getKangaroo2().getBloodType();
				height = environment2.getKangaroo2().getHeight();
				weight = environment2.getKangaroo2().getWeight();
				birthDate = environment2.getKangaroo2().getBirthDate();
				environment2.eliminateKangaroo(name);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
				
			}
		}
		
		if(environment2.getKangaroo3() != null) {
			
			if(environment2.getKangaroo3().getName().equals(name)) {
				
				sex = environment2.getKangaroo3().getSex();
				bloodType = environment2.getKangaroo3().getBloodType();
				height = environment2.getKangaroo3().getHeight();
				weight = environment2.getKangaroo3().getWeight();
				birthDate = environment2.getKangaroo3().getBirthDate();
				environment2.eliminateKangaroo(name);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
				
			}
		}
		
		if(environment3.getKangaroo1() != null) {
			 if(environment3.getKangaroo1().getName().equals(name)) {
					
					sex = environment3.getKangaroo1().getSex();
					bloodType = environment3.getKangaroo1().getBloodType();
					height = environment3.getKangaroo1().getHeight();
					weight = environment3.getKangaroo1().getWeight();
					birthDate = environment3.getKangaroo1().getBirthDate();
					environment3.eliminateKangaroo(name);
					
					if(environmentNumber == 1) {
						return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
					} else if (environmentNumber == 2) {
						return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
					} else if (environmentNumber == 3) {
						return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
					}
					
				} 
		}
		
			 
		if(environment3.getKangaroo2() != null) {
			if(environment3.getKangaroo2().getName().equals(name)) {
				
				sex = environment3.getKangaroo2().getSex();
				bloodType = environment3.getKangaroo2().getBloodType();
				height = environment3.getKangaroo2().getHeight();
				weight = environment3.getKangaroo2().getWeight();
				birthDate = environment3.getKangaroo2().getBirthDate();
				environment3.eliminateKangaroo(name);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
				
			} 		
		}
			  


		if(environment3.getKangaroo3() != null) {
			if(environment3.getKangaroo3().getName().equals(name)) {
				
				sex = environment3.getKangaroo3().getSex();
				bloodType = environment3.getKangaroo3().getBloodType();
				height = environment3.getKangaroo3().getHeight();
				weight = environment3.getKangaroo3().getWeight();
				birthDate = environment3.getKangaroo3().getBirthDate();
				environment3.eliminateKangaroo(name);
				
				if(environmentNumber == 1) {
					return environment1.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 2) {
					return environment2.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				} else if (environmentNumber == 3) {
					return environment3.createKangaroo(name, sex, bloodType, height, weight, birthDate);
				}
			
			}	
		}	  

		
		return success;	
		
	}
	
	//Eliminates a kangaroo. Returns false if unsuccessful
	public boolean eliminateKangaroo(String name) {
		return (environment1.eliminateKangaroo(name) || environment2.eliminateKangaroo(name) || environment3.eliminateKangaroo(name));
	}
	
	//Calculates the area
	public String calculateArea() {
		
		String msg = environment1.calculateArea() + environment2.calculateArea() + environment3.calculateArea();
		double a = environment1.getArea() + environment2.getArea() + environment3.getArea();
		area = a;
		String areaTotal = "Total area in " + name + " is " + a + " square meters\n";
		return msg + areaTotal;
	}
	
	//Checks for needed vaccines in each environment
	public String checkVaccines(Date currentDate) {
		
		String msg = environment1.checkVaccines(currentDate) + environment2.checkVaccines(currentDate) + environment3.checkVaccines(currentDate);
		
		return msg;
	}
	
	//Checks the water status in each environment
	public String checkWater() {
		
		String msg = environment1.checkWater() + environment2.checkWater() + environment3.checkWater();
		
		return msg;
	}
	
	//Checks the food status in each environment
	public String checkFood() {
		
		String msg = environment1.checkFood() + environment2.checkFood() + environment3.checkFood();
		
		return msg;
	}
	
	//Checks for heart disease risk in each environment
	public String checkHeartDisease() {
		
		String msg = environment1.checkHeartDisease() + environment2.checkHeartDisease() + environment3.checkHeartDisease();
		
		return msg;
	}
	
	//Returns a string with the kangaroos whose names begin and end with a vowel
	public String findKangarooWhoseNameBeginsEndsWithVowel() {
		String msg = environment1.findKangarooWhoseNameBeginsEndsWithVowel() + environment2.findKangarooWhoseNameBeginsEndsWithVowel() + environment3.findKangarooWhoseNameBeginsEndsWithVowel();
		
		return msg;
	}
	
	//Gives a report of the vaccination dates of the kangaroos of each environment
	public String reportVaccines() {
		
		String msg = environment1.reportVaccines() + environment2.reportVaccines() + environment3.reportVaccines();
		
		return msg;
	}
}