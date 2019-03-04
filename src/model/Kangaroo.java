package model;

public class Kangaroo {
	
	//Kangaroo class attributes
	private String name;
	private String sex;
	private String bloodType;
	private double height;
	private double weight;
	
	//Objects associated with the kangaroo class
	private Date birthDate;
	
	//Constructor
	public Kangaroo(String name, String sex, String bloodType, double height, double weight, Date birthDate) {
		this.name = name;
		this.sex = sex;
		this.bloodType = bloodType;
		this.height = height;
		this.weight = weight;
		this.birthDate = birthDate; 
	}
	
	//Calculates the BMI of the kangaroo
	public double calculateBMI() {
		return weight / (height * height);
	}
	
	//returns true if the name begins and ends with a vowel, returns false if it does not
	public boolean nameBeginsEndsWithVowel() { 

		return ((name.charAt(0) == 'A' || name.charAt(0) == 'a' ||
				name.charAt(0) == 'E' || name.charAt(0) == 'e' ||
				name.charAt(0) == 'I' || name.charAt(0) == 'i' ||
				name.charAt(0) == 'O' || name.charAt(0) == 'o' ||
				name.charAt(0) == 'U' || name.charAt(0) == 'u') &&
				(name.charAt(name.length()-1) == 'A' || name.charAt(name.length()-1) == 'a' ||
				name.charAt(name.length()-1) == 'E' || name.charAt(name.length()-1) == 'e' ||
				name.charAt(name.length()-1) == 'I' || name.charAt(name.length()-1) == 'i' ||
				name.charAt(name.length()-1) == 'O' || name.charAt(name.length()-1) == 'o' ||
				name.charAt(name.length()-1) == 'U' || name.charAt(name.length()-1) == 'u') );
		
	
	}
	
	//Getters and setters (Also known as analyzers and modifiers)
	public void setName(String name) { this.name = name; }
	public void setSex(String sex) { this.sex = sex; }
	public void setBloodType(String bloodType) { this.bloodType = bloodType; }
	public void setHeight(double height) { this.height = height; }
	public void setWeight(double weight) { this.weight = weight; }
	public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
	
	public String getName() { return name; }
	public String getSex() { return sex; }
	public String getBloodType() { return bloodType; }
	public double getHeight() { return height; }
	public double getWeight() { return weight; }
	public Date getBirthDate() {return birthDate; }
	
	
	
}
