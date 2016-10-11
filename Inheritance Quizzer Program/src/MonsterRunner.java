import java.util.Scanner;

public class MonsterRunner
	{
		public static void main(String[] args)
		{
			
			System.out.println("What is your name?");	
			Scanner userInputName= new Scanner(System.in);
			String name = userInputName.nextLine();		
			System.out.println("Welcome "+name+". How many times would you like to play");
			Monster x = new Dragon();
			x.runMonster1();
			x.printAll();
			}
	}
	