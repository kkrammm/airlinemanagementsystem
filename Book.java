import javax.swing.*;
import java.awt.*;

public class Book extends JFrame
		{
			JTextField t2,t3;
			JPanel p3;
			JComboBox cb;
			JTextField name,phone;
			Book()
			{
				super("Update PASSENGER DETAILS");
				setResizable(false);
				setLayout(null);
				p3 = new JPanel();
				//Toolkit kit=Toolkit.getDefaultToolkit();
				//Dimension d=kit.getScreenSize();
				//setSize(d.width,d.height);
				setVisible(true);
				
				setTitle("Airline Menu");
				constructUI();
				designUI();
				//handleEvents();
			}
			void constructUI()
			{	String country[] = {"India","AUS","chennai","delhi","england"};
				cb = new JComboBox(country);
				t2 = new JTextField(10);
				t2.setBounds(160,80,200,20);
				t3 = new JTextField(20);
				t3.setBounds(160,160,200,20);
				p3 = new JPanel();
				name = new JTextField("Enter name");
				//name.setBounds(50,100, 200,30);
				phone = new JTextField("Enter phonenumber ");
				//phone.setBounds(50,100, 200,300);				
		
			}
			void designUI()
			{	
				//p3.setLayout(new GridLayout(7,2));
				p3.add(cb);
				
				p3.add(t2);
				p3.add(t3);
				p3.add(name);
				p3.add(phone);
				add(p3);
			}
		
	public static  void main(String[] args)
	{
	
		Book b1 = new Book();	
 		b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
	}
}	