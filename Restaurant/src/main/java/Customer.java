
public class Customer
	{
	  private String customerName;
	  private int count,bill;
	  public Customer(String s,int c)
	  {
		 setCustomerName(s);
		 setCount(c);		 
	  }
	  public void setCustomerName(String s)
	  {
	    customerName=s;
	  }
	  public void setCount(int c)
	  {
	    count=c;
	  }
	  public void requestBill()
	  {
		  Manager m=new Manager();
		  bill=m.makeBill();
		  System.out.println("Customers gives feedback and pays"+ bill +" rupees and leaves \n");
	  }
    }
    
