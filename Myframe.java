import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.BorderLayout;
public class MyFrame extends JFrame
{
	
	JPanel p1,p2;
	JTextField t1,t2;
	JPasswordField pf;
	JLabel l1,l2,l3;
	JCheckBox c1;
	JButton b1,b2;
	MyFrame()
	{
		try{
		p1=new JPanel();
		constructUI();
		designUI();
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		setSize(d.width,d.height);
		setVisible(true);
		setTitle("LOGIN FORM");
		handleEvents();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void constructUI()
   {
        	p1=new JPanel();
			l1=new JLabel(" USER CREDENTIALS ");
			l2=new JLabel("USERNAME:");
			t1=new JTextField(15);
			l3=new JLabel("PASSWORD:");
			pf=new JPasswordField(15);
			pf.setEchoChar('*');
			c1=new JCheckBox("Show Password");
			b1=new JButton("Login");
			b2=new JButton("Sign Up");
   }
   public void designUI()
   {
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(670,200,150,30);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(600,250,100,30);
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(700,250,150,30);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(600,300,100,30);
		getContentPane().add(pf,BorderLayout.CENTER);
		pf.setBounds(700,300,150,30);
		getContentPane().add(c1,BorderLayout.CENTER);
		c1.setBounds(700,350,150,30);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(600,400,100,30);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(750,400,100,30);
   }
	public void handleEvents()
	{
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Book b1 = new Book();
				}
			}
		);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				SignUp s = new SignUp();
			}
		}
		);
	}
	public static  void main(String[] args)
	{
		System.out.println("Welcome");
		MyFrame f1 = new MyFrame();	
 		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
	}
}