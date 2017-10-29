
public class ExecutiveChef extends CardLayoutDemo{
	public void receiveOrder(Object order)
    {
	    if(order==cb1[0]||order==cb1[1]||order==cb1[2]||order==cb1[3]||order==cb1[4]||order==cb1[5])
	    {
	    	System.out.println("Executive chef orders and instructs starter cooks\n");
	       StarterChefs sc=new StarterChefs();
	       sc.makeorder(order);
	    }
	    if(order==cb2[0]||order==cb2[1]||order==cb2[2]||order==cb2[3]||order==cb2[4]||order==cb2[5])
	    {
	    	System.out.println("Executive chef orders and instructs maincourse cooks\n");
	       MaincourseChefs sc=new MaincourseChefs();
	       sc.makeorder(order);
	    }
	    if(order==cb3[0]||order==cb3[1]||order==cb3[2]||order==cb3[3]||order==cb3[4]||order==cb3[5])
	    {
	    	System.out.println("Executive chef orders and instructs desert cooks\n");
	       DesertChefs sc=new DesertChefs();
	       sc.makeorder(order);
	    }
    }

}
