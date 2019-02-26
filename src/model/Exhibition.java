package model;

public class Exhibition {

	//Exhibition attributes
	
	private String name;
	private KangarooZone kangarooZone;
	private LizardZone lizardZone;
	
	//Exhibition constructor
	public 	Exhibition(String name) { 
		
		this.name = name;
		
		//I create all the objects needed for the program to work properly
		Date birthDateK1 = new Date(1, 2, 2008);
		Date birthDateK2 = new Date(3, 6, 2017);
		Date birthDateK3 = new Date(5, 7, 2018);
		Date birthDateK4 = new Date(1, 2, 2012);
		Date birthDateK5 = new Date(5, 6, 2013);
		Date birthDateK6 = new Date(4, 12, 2019);
		Date birthDateK7 = new Date(1, 12, 2012);
		Date birthDateK8 = new Date(3, 11, 2016);
		Date birthDateK9 = new Date(13, 7, 2019);
		Kangaroo k1 = new Kangaroo("Jack", "Male", "O", 1.6, 51.6, birthDateK1);
		Kangaroo k2 = new Kangaroo("Rosa", "Female", "AB", 1.23, 30.1, birthDateK2);
		Kangaroo k3 = new Kangaroo("Maria", "Female", "A", 0.4, 23.3, birthDateK3);
		Kangaroo k4 = new Kangaroo("Juan", "Male", "O", 1.7, 45.6, birthDateK4);
		Kangaroo k5 = new Kangaroo("Juana", "Female", "B", 1.23, 54.1, birthDateK5);
		Kangaroo k6 = new Kangaroo("Bonbon", "Female", "B", 0.7, 24.3, birthDateK6);
		Kangaroo k7 = new Kangaroo("Ed", "Male", "O", 1.5, 41.6, birthDateK7);
		Kangaroo k8 = new Kangaroo("Burbuja", "Female", "AB", 1.6, 30.1, birthDateK8);
		Kangaroo k9 = new Kangaroo("Bellota", "Female", "A", 1.6, 33.3, birthDateK9);
		KangarooEnvironment e1 = new KangarooEnvironment("Environment 1", 10.1, 4.5, k1, k2, k3);
		KangarooEnvironment e2 = new KangarooEnvironment("Environment 2", 12.3, 5.5, k4, k5, k6);
		KangarooEnvironment e3 = new KangarooEnvironment("Environment 3", 14.2, 7.3, k7, k8, k9);
		
		kangarooZone = new KangarooZone("Kangaroo Zone", 34.4, 66.5, e1, e2, e3);
		
		Date birthDateL1 = new Date(3, 2, 2017);
		Date birthDateL2 = new Date(12, 6, 2016);
		Lizard lizard1 = new Lizard("Lizardo", "Male", "A", 0.4, 11.1, birthDateL1);
		Lizard lizard2 = new Lizard("Lizarda", "Female", "O", 0.3, 10.1, birthDateL2);
		
		lizardZone = new LizardZone("Lizard Zone", 36.6, 55.5, 4.5, 3.4, lizard1, lizard2);
		}
	
	//Gives me a string with the status of the kangaroos
	public String reportKangarooStatus() {
		
		String status = kangarooZone.calculateArea() + kangarooZone.checkFood() + kangarooZone.checkVaccines(new Date(10, 2, 2019)) +
						kangarooZone.checkHeartDisease() + kangarooZone.checkWater(); 
		
		return status;
	}
	
	//Gives me a string with the status of the lizards
	public String reportLizardStatus() {
		String status = lizardZone.calculateArea() + lizardZone.checkFood() + lizardZone.checkWater();
		
		return status;
	}
	
	//Getters and setters (Also know as analyzers and modifiers)
	public void 	setName(String name) { this.name = name; }
	public String 	getName() { return name; }
	
}
