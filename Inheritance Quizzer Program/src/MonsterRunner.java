import java.util.Scanner;

public class MonsterRunner
	{
		public static void main(String[] args)
		{
			String anwser = "";
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
									int i = 0;
									int randomNumber=(int)(Math.random()*4)+1;
									if(randomNumber== 1)
										{
											System.out.println("Monster x = new Monster();");
											Monster a = new Monster();
											i = 1;
										}
									if(randomNumber== 2)
										{
											System.out.println("Monster x = new Dragon();");
											Monster a = new Dragon();
											i =1;
										}
									if(randomNumber== 3)
										{
											System.out.println("Dragon x = new Monster();");
											Dragon a = (Dragon) new Monster();
											i = 3;
										}
									if(randomNumber== 4)
										{
											System.out.println("Dragon x = new Dragon();");
											Dragon a = new Dragon();
											i = 4;
										}
									//printOneMethod()
									int z = 0;
									int random=(int)(Math.random()*4)+1;
									if(random== 1)
										{
											x.runDragon1name();
											anwser = "This is the Dragon 1 method";
										//	x.runDragon1();
											z = 1;
										}
									if(random== 2)
										{
											x.runDragon2name();
											anwser = "This is the Dragon 2 method";
										//	x.runDragon2();
											z = 1;
										}
									if(random== 3)
										{
											x.runMonster1name();
											anwser = "This is the monster 1 method";
										//	x.runMonster1();
											z = 3;
										}
									if(random== 4)
										{
											x.runMonster2name();
											anwser = "This is the monster 2 method";
										//	x.runMonster2();
											z = 3;
										}
									System.out.println("If this code runs what will happen?");
									System.out.println();								
									System.out.print("1. ");x.runMonster1();
									System.out.print("2. ");x.runMonster2();
									System.out.print("3. ");x.runDragon1();
									System.out.print("4. ");x.runDragon2();
									System.out.print("5. ");System.out.println("It wont work.");
									Scanner userInputAnwser= new Scanner(System.in);
									int userAnwser = userInputAnwser.nextInt();	
									
//									if(userAnwser==5&&i == 3)
//										{
//										System.out.println("That is correct!");
//											right++;
//										}
//									if((userAnwser == 1||userAnwser == 2)&&(z==3)&&(i ==1)||(i==2))
//									{
//										System.out.println("That is correct!");
//										right ++;
//									}
//									if(userAnwser == 1)
//									if((i == 4)&&(z == 1))
//									{
//										
//									}
									String userAnwser2 = "";
									if(userAnwser == 1)
									{
										String userAnswer2 = "This is the monster 1 method";
									}
									if(userAnwser == 2)
									{
										String userAnswer2 = "This is the monster 2 method";
									}
									if(userAnwser == 3)
									{
										String userAnswer2 = "This is the Dragon 1 method";
									}
									if(userAnwser == 4)
									{
										String userAnswer2 = "This is the Dragon 2 method";
									}
									if(userAnwser2.equals(anwser))
									{
										System.out.println("Correct");
										right++;
									}
									else
										{
										System.out.println("Wrong");
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
					System.out.println("You have"+right+" right and "+wrong+"wrong. ");
					counter++;
				}
			}
	}