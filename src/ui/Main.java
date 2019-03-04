package ui;
import model.*;
import java.util.Scanner;

public class Main {
	
	static Exhibition australia;
	
	//Entry point of the program. 
	public static void main(String[] args) {
		
		init();
		startMenu();
		
	}
	
	//I create all the objects needed for the program to work properly
	public static void init() {

		Date birthDateK1 = new Date(1, 2, 2008);
		Date birthDateK2 = new Date(3, 6, 2017);
		Date birthDateK3 = new Date(5, 7, 2016);
		Date birthDateK4 = new Date(1, 2, 2012);
		Date birthDateK5 = new Date(5, 6, 2013);
		Date birthDateK6 = new Date(4, 12, 2018);
		
		KangarooEnvironment e1 = new KangarooEnvironment("Environment 1", 79.9, 1364.5);
		KangarooEnvironment e2 = new KangarooEnvironment("Environment 2", 100.3, 75.5);
		KangarooEnvironment e3 = new KangarooEnvironment("Environment 3", 64.1, 67.3);
		
		e1.createKangaroo("Jack", "Male", "O", 1.6, 51.6, birthDateK1);
		e1.createKangaroo("Rosa", "Female", "AB", 1.23, 30.1, birthDateK2);
		e2.createKangaroo("Aurelio", "Male", "O", 1.7, 45.6, birthDateK3);
		e2.createKangaroo("Ana", "Female", "B", 1.23, 54.1, birthDateK4);
		e3.createKangaroo("Ed", "Male", "O", 1.5, 41.6, birthDateK5);
		e3.createKangaroo("Bellota", "Female", "A", 1.2, 33.3, birthDateK6);
		
		KangarooZone kangarooZone = new KangarooZone("Kangaroo Zone", 34.4, 66.5, e1, e2, e3);
		
		Date birthDateL1 = new Date(3, 2, 2017);
		Date birthDateL2 = new Date(12, 6, 2016);
		Lizard lizard1 = new Lizard("Lizardo", "Male", "A", 0.4, 11.1, birthDateL1);
		Lizard lizard2 = new Lizard("Lizarda", "Female", "O", 0.3, 10.1, birthDateL2);
		
		LizardZone lizardZone = new LizardZone("Lizard Zone", 36.6, 55.5, 4.5, 3.4, lizard1, lizard2);
		
		australia = new Exhibition("Australia", kangarooZone, lizardZone);
	}
	
	// Starts the menu and handles the input and the output.
	public static void startMenu() {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("\nWelcome to the wonderful world of animals!");
		
		System.out.println("Choose an option by entering the number and pressing enter");
		
		System.out.println("1. Create a kangaroo");
		System.out.println("2. Delete a kangaroo");
		System.out.println("3. Change a kangaroo's environment");
		System.out.println("4. Find the animals whose name begins and ends with a vowel");
		System.out.println("5. Give a report of when the kangaroos need vaccines");
		System.out.println("6. Check notifications");
		System.out.println("7. Quit");
		
		num = s.nextInt();
		
		switch(num)	{
			
			case 1:	int selection1, environment1;
					int day, month, year;
					String name = " ";
					String sex = "";
					String bloodType = "";
					double weight, height;
					boolean success1 = false;
					
					System.out.println("Please choose the environment in which you want to create the kangaroo");
					System.out.println("1. Environment 1");
					System.out.println("2. Environment 2");
					System.out.println("3. Environment 3");
					environment1 = s.nextInt();
					
					System.out.println("Please enter the name of the kangaroo");
					name = s.nextLine();
					name = s.nextLine(); // I have to use nextLine() twice because nextInt() is counted as one line
					
					System.out.println(name);
					System.out.println("Please choose the sex of the kangaroo");
					System.out.println("1. Male");
					System.out.println("2. Female");
					selection1 = s.nextInt();
					if(selection1 == 1)
						sex = "Male";
					else if(selection1 == 2)
						sex = "Female";
					else {
						System.out.println("Invalid input. The menu will now restart.");
						startMenu();
					}
					
					System.out.println("Please choose the blood type of the kangaroo");
					System.out.println("1. A");
					System.out.println("2. B");
					System.out.println("3. O");
					System.out.println("4. AB");
					selection1 = s.nextInt();
					if(selection1 == 1)
						bloodType = "A";
					else if(selection1 == 2)
						bloodType = "B";
					else if(selection1 == 3)
						bloodType = "O";
					else if(selection1 == 4)
						bloodType = "AB";
					else {
						System.out.println("Invalid input. Returning to the initial menu");
						startMenu();
					}
					
					System.out.println("Please enter the weight of the kangaroo in kilograms");
					weight = s.nextDouble();
					
					System.out.println("Please enter the height of the kangaroo in meters");
					height = s.nextDouble();
					
					System.out.println("Please enter the day of the month the kangaroo was born on");
					day = s.nextInt();
					System.out.println("Please enter the month the kangaroo was born in");
					month = s.nextInt();
					System.out.println("Please enter the year the kangaroo was born in");
					year = s.nextInt();
					
					if(environment1 == 1) {
						success1 = australia.getKangarooZone().getEnvironment1().createKangaroo(name, sex, bloodType, weight, height, new Date(day, month, year));
						
						if(success1) {
							System.out.println("Kangaroo created successfully.");
					
							System.out.println("Kangaroos in environment #1:");
							if(australia.getKangarooZone().getEnvironment1().getKangaroo1() != null)
								System.out.println("1. "+australia.getKangarooZone().getEnvironment1().getKangaroo1().getName());
							else
								System.out.println("1. EMPTY");
							
							if(australia.getKangarooZone().getEnvironment1().getKangaroo2() != null)
								System.out.println("2. "+australia.getKangarooZone().getEnvironment1().getKangaroo2().getName());
							else
								System.out.println("2. EMPTY");
						
							if(australia.getKangarooZone().getEnvironment1().getKangaroo3() != null)
								System.out.println("3. "+australia.getKangarooZone().getEnvironment1().getKangaroo3().getName());
							else
								System.out.println("3. EMPTY");
							
						} else {
							System.out.println("ERROR. Could not create the kangaroo");
							System.out.println("Kangaroos in environment #1:");
							if(australia.getKangarooZone().getEnvironment1().getKangaroo1() != null)
								System.out.println("1. "+australia.getKangarooZone().getEnvironment1().getKangaroo1().getName());
							else
								System.out.println("1. EMPTY");
							
							if(australia.getKangarooZone().getEnvironment1().getKangaroo2() != null)
								System.out.println("2. "+australia.getKangarooZone().getEnvironment1().getKangaroo2().getName());
							else
								System.out.println("2. EMPTY");
						
							if(australia.getKangarooZone().getEnvironment1().getKangaroo3() != null)
								System.out.println("3. "+australia.getKangarooZone().getEnvironment1().getKangaroo3().getName());
							else
								System.out.println("3. EMPTY");
						}
						
					} else if(environment1 == 2) {
						
						success1 = australia.getKangarooZone().getEnvironment2().createKangaroo(name, sex, bloodType, weight, height, new Date(day, month, year));
						
						if(success1) {
							System.out.println("Kangaroo created successfully!");
					
							System.out.println("Kangaroos in environment #2:");
							if(australia.getKangarooZone().getEnvironment2().getKangaroo1() != null)
								System.out.println("1. "+australia.getKangarooZone().getEnvironment2().getKangaroo1().getName());
							else
								System.out.println("1. EMPTY");
							
							if(australia.getKangarooZone().getEnvironment2().getKangaroo2() != null)
								System.out.println("2. "+australia.getKangarooZone().getEnvironment2().getKangaroo2().getName());
							else
								System.out.println("2. EMPTY");
						
							if(australia.getKangarooZone().getEnvironment2().getKangaroo3() != null)
								System.out.println("3. "+australia.getKangarooZone().getEnvironment2().getKangaroo3().getName());
							else
								System.out.println("3. EMPTY");
							
						} else {
							System.out.println("ERROR. Could not create the kangaroo");
							System.out.println("Kangaroos in environment #2:");
							if(australia.getKangarooZone().getEnvironment2().getKangaroo1() != null)
								System.out.println("1. "+australia.getKangarooZone().getEnvironment2().getKangaroo1().getName());
							else
								System.out.println("1. EMPTY");
							
							if(australia.getKangarooZone().getEnvironment2().getKangaroo2() != null)
								System.out.println("2. "+australia.getKangarooZone().getEnvironment2().getKangaroo2().getName());
							else
								System.out.println("2. EMPTY");
						
							if(australia.getKangarooZone().getEnvironment2().getKangaroo3() != null)
								System.out.println("3. "+australia.getKangarooZone().getEnvironment2().getKangaroo3().getName());
							else
								System.out.println("3. EMPTY");
						}
						
					} else if (environment1 == 3) {
						
						success1 = australia.getKangarooZone().getEnvironment3().createKangaroo(name, sex, bloodType, weight, height, new Date(day, month, year));
						
						if(success1) {
							System.out.println("Kangaroo created successfully!");
					
							System.out.println("Kangaroos in environment #3:");
							if(australia.getKangarooZone().getEnvironment3().getKangaroo1() != null)
								System.out.println("1. "+australia.getKangarooZone().getEnvironment3().getKangaroo1().getName());
							else
								System.out.println("1. EMPTY");
							
							if(australia.getKangarooZone().getEnvironment3().getKangaroo2() != null)
								System.out.println("2. "+australia.getKangarooZone().getEnvironment3().getKangaroo2().getName());
							else
								System.out.println("2. EMPTY");
						
							if(australia.getKangarooZone().getEnvironment3().getKangaroo3() != null)
								System.out.println("3. "+australia.getKangarooZone().getEnvironment3().getKangaroo3().getName());
							else
								System.out.println("3. EMPTY");
							
						} else {
							System.out.println("ERROR. Could not create the kangaroo");
							System.out.println("Kangaroos in environment #3:");
							if(australia.getKangarooZone().getEnvironment3().getKangaroo1() != null)
								System.out.println("1. "+australia.getKangarooZone().getEnvironment3().getKangaroo1().getName());
							else
								System.out.println("1. EMPTY");
							
							if(australia.getKangarooZone().getEnvironment3().getKangaroo2() != null)
								System.out.println("2. "+australia.getKangarooZone().getEnvironment3().getKangaroo2().getName());
							else
								System.out.println("2. EMPTY");
						
							if(australia.getKangarooZone().getEnvironment3().getKangaroo3() != null)
								System.out.println("3. "+australia.getKangarooZone().getEnvironment3().getKangaroo3().getName());
							else
								System.out.println("3. EMPTY");
						}
						
					} else {
						System.out.println("ERROR. Could not create the kangaroo");
					}

					
					startMenu();
					break;
					
			case 2:	String name2;
					boolean success2 = false;
					System.out.println("Please enter the name of kangaroo you wish to eliminate");
					name2 = s.nextLine();
					name2 = s.nextLine(); // I have to use nextLine() twice because nextInt() is counted as one line
					success2 = australia.getKangarooZone().eliminateKangaroo(name2);
					if(success2) {
						System.out.println("Kangaroo eliminated successfully.");
					} else
						System.out.println("ERROR. Could not eliminate the kangaroo.");
					startMenu();
					break;
					
			case 3: int environment3;
					String name3;
					boolean success3;
					System.out.println("Please enter the name of the kangaroo you wish to move");
					name3 = s.nextLine();
					name3 = s.nextLine();
					System.out.println("Please enter the number of the environment you wish to move it to");
					System.out.println("1. Environment 1");
					System.out.println("2. Environment 2");
					System.out.println("3. Environment 3");
					environment3 = s.nextInt();
					success3 = australia.getKangarooZone().changeKangaroo(name3, environment3);
					if(success3) 
						System.out.println("The kangaroo was moved successfully!");
					else
						System.out.println("ERROR. Could not move the kangaroo you requested");
						startMenu();
							break;
			
			case 4: String vowelMessage = australia.findAnimalsWhoseNameBeginsEndsWithVowel();
					System.out.println(vowelMessage);
					startMenu();
					break;
					
			case 5: String vaccinesReport = australia.reportVaccines();
					System.out.println(vaccinesReport);
					startMenu();
					break;
				
			case 6: String msg = australia.reportKangarooStatus() + australia.reportLizardStatus();
					System.out.println(msg);
					startMenu();
					break;
					
			case 7: System.out.println("Goodbye!");
					break;
					
			default: startMenu();
					break;
		}
		
	}
	
}