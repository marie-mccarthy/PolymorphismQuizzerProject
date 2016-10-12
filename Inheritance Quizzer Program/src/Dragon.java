
public class Dragon extends Monster
	{
		int number = 0;
		public void runDragon1()
			{
				int number = 3;
				String name = "runDragon1()";
				System.out.println("This is the Dragon 1 method");
			}
			public void runDragon2()
			{
				int number = 4;
				String name = "runDragon2()";
				System.out.println("This is the Dragon 2 method");
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
						runDragon1();
					}
				if(random== 2)
					{
						runDragon2();
					}
				if(random== 3)
					{
						runMonster1();
					}
				if(random== 4)
					{
						runMonster2();
					}
			}
			public void printOnePossibility()
			{
				int random2=(int)(Math.random()*4);
				if(random2== 1)
					{
						System.out.println("Monster x = new Monster();");
					}
				if(random2== 2)
					{
						System.out.println("Monster x = new Dragon();");
					}
				if(random2== 3)
					{
						System.out.println("Dragon x = new Monster();");
					}
				if(random2== 4)
					{
						System.out.println("Dragon x = new Dragon();");
					}
			}
			}
	