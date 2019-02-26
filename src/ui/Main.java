package ui;
import model.Exhibition;

public class Main {
	
	//Entry point of the program. Most of the work is done in the MODEL package, not the UI package. The UI package is only responsible for the user interface.
	public static void main(String[] args) {
		
		Exhibition australia = new Exhibition("Australia");
		
		System.out.println("Welcome to the monitoring system!");
		
		String finalMessage = australia.reportKangarooStatus() + australia.reportLizardStatus();
		
		//This is the message the user will see
		System.out.println(finalMessage);
	}
	
	
}
