import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class showTableGUI extends JFrame implements ActionListener{
	
	DBConnect connect = new DBConnect();
	private JButton b1,b2,b3,b4,back;
	private JScrollPane scrollPane,scrollPane2,scrollPane3,scrollPane4;
	private JTable CarCompany,Car,Customer,CarCompany_has_cars,table;
	Container c = getContentPane();
	private void Buttons(){
		back = new JButton("back");
		back.setBounds(94, 314, 117, 38);
		c.add(back);
		
		b1 = new JButton("Car Company");
		b1.setBounds(67, 6, 173, 47);
		c.add(b1);
		
		b2 = new JButton("Car");
		b2.setBounds(67, 53, 173, 47);
		c.add(b2);
		
		b3 = new JButton("Customer");
		b3.setBounds(67, 100, 173, 47);
		c.add(b3);
		
		b4 = new JButton("CarCompany_has_Cars");
		b4.setBounds(67, 148, 173, 47);
		c.add(b4);
	}
	
	public showTableGUI(){
		setTitle("show table");
		setBounds(100, 100, 313, 378);
		c.setLayout(null);
		Buttons();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		back.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			CarCompany = connect.CarCompanyTable();
			scrollPane = new JScrollPane(CarCompany);
			scrollPane.setBounds(6, 202, 301, 106);
		    c.add(scrollPane);
		}
		if(e.getSource() == b2){
			Car = connect.CarTable();
			scrollPane = new JScrollPane(Car);
			scrollPane.setBounds(6, 202, 301, 106);
			c.add(scrollPane);
		}
		if(e.getSource() == b3){
			Customer = connect.CustomerTable();
			scrollPane = new JScrollPane(Customer);
			scrollPane.setBounds(6, 202, 301, 106);
			c.add(scrollPane);
		}
		if(e.getSource() == b4){
			CarCompany_has_cars = connect.CarCompany_has_CarsTable();
			scrollPane = new JScrollPane(CarCompany_has_cars);
			scrollPane.setBounds(6, 202, 301, 106);
			c.add(scrollPane);
		}
		
		if(e.getSource() == back)
			setVisible(false);
	}
	public static void main(String[] args) {
		showTableGUI d = new showTableGUI();
		d.setVisible(true);
	}

}
