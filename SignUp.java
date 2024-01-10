import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame{
   JPanel P1;
   JButton S1 ;
   JTextField t1,t2,t3,t4,t5;
   JLabel l1,l2,l3,l4,l5,l6,l7;
   JPasswordField p1;
   JPasswordField p2;
   MyFrame()
   {
     //Construction
     P1=new JPanel();
     constructUI();
     designUI();
     Toolkit kit=Toolkit.getDefaultToolkit();
     Dimension d=kit.getScreenSize();
     setSize(d.width,d.height);
     setVisible(true);
     setTitle("Registration form");
	 
   }
   public void designUI()
   {
		P1.setLayout(new GridLayout(7,2));
        P1.add(l1);
		P1.add(t1);
		P1.add(l2);
        P1.add(t2);
        P1.add(l3);
        P1.add(t3); 
        P1.add(l4);
        P1.add(t4);
        P1.add(l5);
        P1.add(t5);
        P1.add(l6);
        P1.add(p1);	
	P1.add(l7);
	p1.add(p2);
	P1.add(S1);
	add(P1);
   }
   public void constructUI()
   {
        t1= new JTextField(5);
        t2= new JTextField(5);
        t3= new JTextField(5);
		t4= new JTextField(5);
		t5= new JTextField(5);
		l1= new JLabel("Name:");
		l2= new JLabel("Address line:");
		l3= new JLabel("Phone no:");
		l4= new JLabel("phn no:");
		l5= new JLabel("User Id:");
		l6= new JLabel("Password:");
		l7= new JLabel("Re-enter password:");
		p1= new JPasswordField(10);
		p2= new JPasswordField(10);
        S1=new JButton("Submit");
	    P1=new JPanel();
        handleEvents();
   }
   public void handleEvents()
   {
    S1.addActionListener( new ActionListener(){
       public void actionPerformed(ActionEvent ae)
       {
               
       }
	   
    });
    p2.addActionListener( new ActionListener(){
       public void actionPerformed(ActionEvent ae)
       {
 
       }
    });
   
   }	
}
public class SignUp
{
 public static void main(String[]arg)
 
 {
  System.out.println("Hello"); 
  MyFrame f1=new MyFrame();
  //f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}