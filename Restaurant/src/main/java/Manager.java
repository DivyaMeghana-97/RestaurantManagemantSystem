
public class Manager extends CardLayoutDemo{
	int manager=0,bill,totalamount;
	int sum=0;
	Object orderList=new Object();
	
	public Manager()
	{
		if(manager==0)
		{
		manager=1;
		System.out.println("Manager shows the menu\n");
		CardLayoutDemo c=new CardLayoutDemo();
		}
		else
		{
			System.out.println("Wait for the manager\n");
			manager=0;
			new Manager();
		}
	}
	
	void getOrder(Object ob)
	{
	 // CardLayoutDemo ob=new CardLayoutDemo();
	  orderList=ob;
	}
	void placeorder()
	{
		ExecutiveChef cheif=new ExecutiveChef();
		cheif.receiveOrder(orderList);
	}
	int makeBill()
	{
		if(orderList==cb1[0])
		{
			sum=sum+Integer.parseInt(lb1[0].getText());
		}
		if(orderList==cb1[1])
		{
			sum=sum+Integer.parseInt(lb1[1].getText());
		}
		if(orderList==cb1[2])
		{
			sum=sum+Integer.parseInt(lb1[2].getText());
		}
		if(orderList==cb1[3])
		{
			sum=sum+Integer.parseInt(lb1[3].getText());
		}
		if(orderList==cb1[4])
		{
			sum=sum+Integer.parseInt(lb1[4].getText());
		}
		if(orderList==cb1[5])
		{
			sum=sum+Integer.parseInt(lb1[5].getText());
		}
		
		if(orderList==cb2[0])
		{
			sum=sum+Integer.parseInt(lb2[0].getText());
		}
		if(orderList==cb2[1])
		{
			sum=sum+Integer.parseInt(lb2[1].getText());
		}
		if(orderList==cb2[2])
		{
			sum=sum+Integer.parseInt(lb2[2].getText());
		}
		if(orderList==cb2[3])
		{
			sum=sum+Integer.parseInt(lb2[3].getText());
		}
		if(orderList==cb2[4])
		{
			sum=sum+Integer.parseInt(lb2[4].getText());
		}
		if(orderList==cb2[5])
		{
			sum=sum+Integer.parseInt(lb2[5].getText());
		}
		
		if(orderList==cb3[0])
		{
			sum=sum+Integer.parseInt(lb3[0].getText());
		}
		if(orderList==cb3[1])
		{
			sum=sum+Integer.parseInt(lb3[1].getText());
		}
		if(orderList==cb3[2])
		{
			sum=sum+Integer.parseInt(lb3[2].getText());
		}
		if(orderList==cb3[3])
		{
			sum=sum+Integer.parseInt(lb3[3].getText());
		}
		if(orderList==cb3[4])
		{
			sum=sum+Integer.parseInt(lb3[4].getText());
		}
		if(orderList==cb3[5])
		{
			sum=sum+Integer.parseInt(lb3[5].getText());
		}
		bill=sum;
		return bill;
	}
	public void totalamnt()
	{
		totalamount=totalamount+bill;
		System.out.println("Total amount of restaurent is:" + totalamount + "\n");
	}

}
