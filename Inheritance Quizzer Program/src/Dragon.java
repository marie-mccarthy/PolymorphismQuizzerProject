
public class Dragon extends Monster
	{
		int number = 0;
		public void runDragon1()
			{
				System.out.println("This is the Dragon 1 method");
			}
			public void runDragon1name()
			{
				String name = "runDragon1()";
				System.out.println(name);
			}
			public void runDragon2()
			{
				System.out.println("This is the Dragon 2 method");
			}
			public void runDragon2name()
			{
				String name = "runDragon2()";
				System.out.println(name);
			}
			
			@Override
			public void runMonster2()
				{
				System.out.println("This is the over ridden Monster 2 method");
				}
			public void printOneMethod()
			{
				int random=(int)(Math.random()*4);
				if(random== 1)
					{
						runDragon1name();
					}
				if(random== 2)
					{
						runDragon2name();
					}
				if(random== 3)
					{
						runMonster1name();
					}
				if(random== 4)
					{
						runMonster2name();
					}
			}
			public void printOnePossibility()
			{
				int randomNumber=(int)(Math.random()*4);
				if(randomNumber== 1)
					{
						System.out.println("Monster x = new Monster();");
					}
				if(randomNumber== 2)
					{
						System.out.println("Monster x = new Dragon();");
					}
				if(randomNumber== 3)
					{
						System.out.println("Dragon x = new Monster();");
					}
				if(randomNumber== 4)
					{
						System.out.println("Dragon x = new Dragon();");
					}
			}
		}
	