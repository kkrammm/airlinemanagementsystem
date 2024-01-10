import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class MySqlGUITest
{
	public static void main(String... aa)
	{
	  MyFrame f1=new MyFrame();
	  f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f1.setVisible(true);
	}
}
class MyFrame extends JFrame
{
	Connection con;
	Statement st;
	ResultSet rs;
	JTabbedPane myTab=new JTabbedPane();
	
	JButton next=new JButton("Next");
	JButton insert=new JButton("Insert");
	JButton pre=new JButton("Previous");
	JTextField t1p1=new JTextField(15);
	JTextField t2p1=new JTextField(15);
	JTextField t1p2=new JTextField(15);
	JTextField t2p2=new JTextField(15);
	JTextField t1p3=new JTextField(15);
	JButton delete=new JButton("Delete");
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	
	public MyFrame()
	{
	try{
		setSize(400,400);
		setTitle("MySqlGUI Demo");
		p1.add(t1p1);
		p1.add(t2p1);
		p1.add(next);
		p1.add(pre);
		
		p2.add(t1p2);
		p2.add(t2p2);
		p2.add(insert);
		////////////////
		p3.add(t1p3);
		p3.add(delete);
		/////
		myTab.add("Display",p1);
		myTab.add("Insert",p2);
		myTab.add("Delete",p3);
		add(myTab);
		
		
		makeConnection();
		rs=st.executeQuery("select * from student");
		rs.first();
		t1p1.setText(rs.getString(1));
		t2p1.setText(rs.getString(2));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					if(rs.next())
					{
						t1p1.setText(rs.getString(1));
						t2p1.setText(rs.getString(2));
					}
					else
					{
					 JOptionPane.showMessageDialog(null,"Tis is Last");
					 rs.last();
					} 
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					st.executeUpdate("delete from thi where name='"+t1p3.getText().trim()+"'");
					rs=st.executeQuery("select * from thi");
					JOptionPane.showMessageDialog(null,"deleted");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		insert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					st.executeUpdate("insert into student values("+t1p2.getText()+",'"+t2p2.getText()+"')");
					rs=st.executeQuery("select * from student");
					JOptionPane.showMessageDialog(null,"Inserted");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
		pre.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try
				{
					if(rs.previous())
					{
						t1p1.setText(rs.getString(1));
						t2p1.setText(rs.getString(2));
					}
					else
					{
					 JOptionPane.showMessageDialog(null,"Tis is first");
					 rs.first();
					} 
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mepco","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}