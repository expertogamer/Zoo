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
	
	//Getters and setters (Also know as analyzers and modifiers)
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
