
public class Dragon extends Monster
	{
		public void runDragon1()
			{
				System.out.println("The dragon breathes fire");
			}
			public void runDragon2()
			{
				System.out.println("The dragon flies above the castle");
			}
			public void printAll()
			{
				runMonster1();
				runMonster2();
				runDragon1();
				runDragon2();
			}
	}