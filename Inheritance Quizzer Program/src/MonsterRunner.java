import java.util.Scanner;

public class MonsterRunner
	{
		
		public static void main(String[] args)
		{
			int counter= 1;
			System.out.println("What is your name?");	
			Scanner userInputName= new Scanner(System.in);
			String name = userInputName.nextLine();		
			System.out.println("Welcome "+name+". How many times would you like to play");
			Scanner userInput= new Scanner(System.in);
			int numberOfTimes0 = userInput.nextInt();	
			int numberOfTimes = numberOfTimes0+1;
			boolean stillPlaying=true;
			while(stillPlaying)					
				{	
					if(counter!=numberOfTimes)
						{
							stillPlaying= true;
							Dragon x = new Dragon();
							x.printOneMethod();
							x.printOnePossibility();
							System.out.println("If this code runs what will happen");
							x.runMonster1();
							x.runMonster2();
							x.runDragon1();
							x.runDragon2();
							System.out.println("It wont work.");
						}
					else
						{		
						stillPlaying=false;
						System.out.println("game over");
						System.exit(1);
						
						}
					counter++;
				}
			}
	}
	