
public class Main {
	public static void main(String[] args)
	{
		Customer c1=new Customer("David",5);
		Host h1=new Host();
		h1.setHost();
		BusBoy bb1=new BusBoy();
		bb1.Boy();
		Manager m1=new Manager();
		CardLayoutDemo cld1=new CardLayoutDemo();
		cld1.placeOrderToManager();
		m1.placeorder();
		c1.requestBill();
		m1.totalamnt();
		bb1.clean();		
	}

}
