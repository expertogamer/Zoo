package model;

public class Exhibition {

	//Exhibition attributes
	
	private String name;
	private KangarooZone kangarooZone;
	private LizardZone lizardZone;
	
	//Exhibition constructor
	public 	Exhibition(String name, KangarooZone kz, LizardZone lz) { 
		
		this.name = name;
		this.kangarooZone = kz;
		this.lizardZone = lz;
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
	
	//Finds the lizards and the kangaroos whose name begins and ends with a vowel (e.g. Alberto, Ana)
	public String findAnimalsWhoseNameBeginsEndsWithVowel() {
		String msg = kangarooZone.findKangarooWhoseNameBeginsEndsWithVowel() + lizardZone.findLizardWhoseNameBeginsEndsWithVowel();
		return msg;
	}
	
	//Gives a report of when the kangaroos need to be vaccinated
	public String reportVaccines() {
		String msg = kangarooZone.reportVaccines();
		
		return msg;
	}
	
	//Getters and setters (Also known as analyzers and modifiers)
	public void 	setName(String name) { this.name = name; }
	public void 	setKangarooZone(KangarooZone kz) {  kangarooZone = kz; }
	
	public String 	getName() { return name; }
	public KangarooZone getKangarooZone() {return kangarooZone; }
	
}
