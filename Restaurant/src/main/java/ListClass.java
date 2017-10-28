import javax.swing.*;    
public class ListClass{  
	public ListClass() {
    JFrame f1=new JFrame();
    //JFrame f2=new JFrame();
    System.out.println("Staters:");
    String starters[][]={ {"Gobimanchuria","120"},    
                          {"Vegsalad","85"},    
                          {"Chicken Manchuria","180"},
                          {"Chilly Chicken","180"},
                          {"Pepper Chicken","180"}};    
    String column1[]={"NAME","COST"};         
    JTable jt1=new JTable(starters,column1);    
    jt1.setBounds(30,40,200,300);          
    JScrollPane sp1=new JScrollPane(jt1);    
    //f1.add(sp1);          
   // f1.setSize(300,400);    
    //f1.setVisible(true); 
    System.out.println("Main Course:");
    String maincourse[][]={ {"Veg Biryani Half","180"},    
                          {"Veg Biryani Full","320"},    
                          {"Chicken Biryani Half","220"},
                          {"Chicken Biryani Full","410"},
                          {"Chicken Biryani Jumbo","600"}};    
    String column2[]={"NAME","COST"};         
    JTable jt2=new JTable(maincourse,column2);    
    jt2.setBounds(30,40,200,300);          
    JScrollPane sp2=new JScrollPane(jt2);    
//    f1.add(sp1, BorderLayout.CENTRE);
    f1.validate();
   // f1.add(sp2, BorderLayout.CENTRE);          
    f1.setSize(300,400);    
    f1.setVisible(true); 
}   
	
public static void main(String[] args) {    
    new ListClass();    
}    
}