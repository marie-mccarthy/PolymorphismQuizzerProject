import java.util.Scanner;

public class MonsterRunner
	{
		public static void main(String[] args)
		{
			int counter= 1;
			int right = 0;
			int wrong = 0;
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
								{
									//prints one possibility 
									int randomNumber=(int)(Math.random()*4)+1;
									if(randomNumber== 1)
										{
											System.out.println("Monster x = new Monster();");
											Monster a = new Monster();
										}
									if(randomNumber== 2)
										{
											System.out.println("Monster x = new Dragon();");
											Monster a = new Dragon();
										}
									if(randomNumber== 3)
										{
											System.out.println("Dragon x = new Monster();");
											Dragon a = (Dragon) new Monster();
										}
									if(randomNumber== 4)
										{
											System.out.println("Dragon x = new Dragon();");
											Dragon a = new Dragon();
										}
									//printOneMethod()
										
									int random=(int)(Math.random()*4)+1;
									if(random== 1)
										{
											x.runDragon1name();
											x.runDragon1();
										}
									if(random== 2)
										{
											x.runDragon2name();
											x.runDragon2();
										}
									if(random== 3)
										{
											x.runMonster1name();
											x.runMonster1();
										}
									if(random== 4)
										{
											x.runMonster2name();
											x.runMonster2();
										}
									System.out.println("If this code runs what will happen?");
									System.out.println();
								
									System.out.print("1. ");x.runMonster1();
									System.out.print("2. ");x.runMonster2();
									System.out.print("3. ");x.runDragon1();
									System.out.print("4. ");x.runDragon2();
									System.out.print("5. ");System.out.println("It wont work.");
									Scanner userInputAnwser= new Scanner(System.in);
									int userAnwser = userInput7.nextInt();		
									if(anwser==userAnwser)
										{
											right++;
										}
									else
										{
											wrong++;
										}
									}
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