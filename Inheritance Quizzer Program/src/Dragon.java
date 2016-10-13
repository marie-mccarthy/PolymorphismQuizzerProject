
public class Dragon extends Monster
	{
		int number = 0;
		public void runDragon1()
			{
				String anwser = "1";
				System.out.println("This is the Dragon 1 method");
			}
			public void runDragon1name()
			{
				String methodName = "runDragon1()";
				System.out.println(methodName);
			}
			public void runDragon2()
			{
				String anwser = "2";
				System.out.println("This is the Dragon 2 method");
			}
			public void runDragon2name()
			{
				String methodName = "runDragon2()";
				System.out.println(methodName);
			}
			
			@Override
			public void runMonster2()
				{
				String anwser = "This is the over ridden Monster 2 method";
				System.out.println("This is the over ridden Monster 2 method");
				}
			
			
			
		}
	