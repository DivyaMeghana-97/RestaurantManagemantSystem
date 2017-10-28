
public class Manager {
	int manager=0;
	public Manager()
	{
		if(manager==0)
		{
		manager=1;
		System.out.println("Manager shows the menu\n");
		}
		else
		{
			System.out.println("Wait for the manager\n");
			manager=0;
			new Manager();
		}
	}

}
