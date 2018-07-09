import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class insertGUI extends JFrame implements ActionListener{
	
	DBConnect connect = new DBConnect();
	private JTextField t1,t2,t3,t4,t5,t6;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,back;
	private JComboBox c3,c4,c5;
	Container c = getContentPane();
	private JLabel CarID,Cname,CustomerName,Price,CarID2,Phone,Country,CarName,City,Payment_method,Model,Color,CustomerName2;
	private void textAndButtonsAndLabels(){
		t1 = new JTextField();
		t1.setBounds(6, 214, 75, 26);
		c.add(t1);
		t1.setVisible(false);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(119, 214, 75, 26);
		c.add(t2);
		t2.setVisible(false);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(233, 214, 75, 26);
		c.add(t3);
		t3.setVisible(false);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(6, 252, 75, 26);
		c.add(t4);
		t4.setVisible(false);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(119, 252, 75, 26);
		c.add(t5);
		t5.setVisible(false);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(233, 252, 75, 26);
		c.add(t6);
		t6.setVisible(false);
		
		
		back = new JButton("back");
		back.setBounds(94, 314, 117, 38);
		c.add(back);
		
		b1 = new JButton("Car Company");
		b1.setBounds(23, 6, 173, 47);
		c.add(b1);
		
		b2 = new JButton("Car");
		b2.setBounds(23, 53, 173, 47);
		c.add(b2);
		
		b3 = new JButton("Customer");
		b3.setBounds(23, 100, 173, 47);
		c.add(b3);
		
		b4 = new JButton("CarCompany_has_Cars");
		b4.setBounds(23, 148, 173, 47);
		c.add(b4);
		
		b5 = new JButton("Insert");
		b5.setBounds(201, 6, 106, 47);
		c.add(b5);
		b5.setVisible(false);
		
		b6 = new JButton("Insert");
		b6.setBounds(201, 53, 106, 47);
		c.add(b6);
		b6.setVisible(false);
		
		b7 = new JButton("Insert");
		b7.setBounds(201, 100, 106, 47);
		c.add(b7);
		b7.setVisible(false);
		
		b8 = new JButton("Insert");
		b8.setBounds(201, 148, 106, 47);
		c.add(b8);
		b8.setVisible(false);
		
		CarID = new JLabel("CarID");
		CarID.setHorizontalAlignment(SwingConstants.CENTER);
		CarID.setBounds(6, 200, 75, 16);
		c.add(CarID);
		CarID.setVisible(false);
		Cname = new JLabel("Cname");
		Cname.setHorizontalAlignment(SwingConstants.CENTER);
		Cname.setBounds(6, 200, 75, 16);
		c.add(Cname);
		Cname.setVisible(false);
		CustomerName = new JLabel("CustomerName");
		CustomerName.setHorizontalAlignment(SwingConstants.CENTER);
		CustomerName.setBounds(6, 200, 75, 16);
		c.add(CustomerName);
		CustomerName.setVisible(false);
		CarID2 = new JLabel("CarID");
		CarID2.setHorizontalAlignment(SwingConstants.CENTER);
		CarID2.setBounds(119, 200, 75, 16);
		c.add(CarID2);
		CarID2.setVisible(false);
		
		Price = new JLabel("Price");
		Price.setHorizontalAlignment(SwingConstants.CENTER);
		Price.setBounds(119, 200, 75, 16);
		c.add(Price);
		Price.setVisible(false);
		Country = new JLabel("Country");
		Country.setHorizontalAlignment(SwingConstants.CENTER);
		Country.setBounds(119, 200, 75, 16);
		c.add(Country);
		Country.setVisible(false);
		Phone = new JLabel("Phone");
		Phone.setHorizontalAlignment(SwingConstants.CENTER);
		Phone.setBounds(119, 200, 75, 16);
		c.add(Phone);
		Phone.setVisible(false);
		
		CarName = new JLabel("CarName");
		CarName.setHorizontalAlignment(SwingConstants.CENTER);
		CarName.setBounds(233, 200, 75, 16);
		c.add(CarName);
		CarName.setVisible(false);
		Payment_method = new JLabel("Payment_method");
		Payment_method.setHorizontalAlignment(SwingConstants.CENTER);
		Payment_method.setBounds(233, 200, 75, 16);
		c.add(Payment_method);
		Payment_method.setVisible(false);
		City = new JLabel("City");
		City.setHorizontalAlignment(SwingConstants.CENTER);
		City.setBounds(233, 200, 75, 16);
		c.add(City);
		City.setVisible(false);
		
		
		
		Model = new JLabel("Model");
		Model.setHorizontalAlignment(SwingConstants.CENTER);
		Model.setBounds(6, 240, 75, 16);
		c.add(Model);
		Model.setVisible(false);
		
		Color = new JLabel("Color");
		Color.setHorizontalAlignment(SwingConstants.CENTER);
		Color.setBounds(119, 240, 75, 16);
		c.add(Color);
		Color.setVisible(false);
		
		CustomerName2 = new JLabel("CustomerName");
		CustomerName2.setHorizontalAlignment(SwingConstants.CENTER);
		CustomerName2.setBounds(233, 240, 75, 16);
		c.add(CustomerName2);
		CustomerName2.setVisible(false);
	}
	private void Actions(){
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		back.addActionListener(this);
	}
	public insertGUI(){
		setTitle("in which table you want to insert ?");
		setBounds(100, 100, 313, 378);
		c.setLayout(null);
		
		c3 = new JComboBox();
		c3.setBounds(217, 252, 91, 26);
		c.add(c3);
		c3.setVisible(false);
		
		c4 = new JComboBox();
		c4.setBounds(119, 214, 75, 26);
		c.add(c4);
		c4.setVisible(false);
		
		c5 = new JComboBox();
		c5.setBounds(6, 214, 75, 26);
		c.add(c5);
		c5.setVisible(false);
		
		
		textAndButtonsAndLabels();
		Actions();
	}
	private void closeCar(){
		b6.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		t4.setVisible(false);
		t5.setVisible(false);
		//t6.setVisible(false);
		CarID.setVisible(false);
		Price.setVisible(false);
		CarName.setVisible(false);
		Model.setVisible(false);
		Color.setVisible(false);
		CustomerName2.setVisible(false);
		c3.setVisible(false);
		}
	private void closeCarCompany(){
		b5.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		Cname.setVisible(false);
		Country.setVisible(false);
		City.setVisible(false);
	}
	private void closeCustomer(){
		b7.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		CustomerName.setVisible(false);
		Phone.setVisible(false);
		Payment_method.setVisible(false);
	}
	private void closeLast(){
		b8.setVisible(false);
		Cname.setVisible(false);
		CarID2.setVisible(false);
		c4.setVisible(false);
		c5.setVisible(false);
		
	}
	
	private void closeAll(){
		closeCar();
		closeCarCompany();
		closeCustomer();
		closeLast();
	}
	private void setT(){
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			closeCar();
			closeCustomer();
			closeLast();
			b5.setVisible(true);
			t1.setVisible(true);
			t2.setVisible(true);
			t3.setVisible(true);
			Cname.setVisible(true);
			Country.setVisible(true);
			City.setVisible(true);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			
		}
		if(e.getSource() == b2){
			closeCarCompany();
			closeCustomer();
			closeLast();
			b6.setVisible(true);
			t1.setVisible(true);
			t2.setVisible(true);
			t3.setVisible(true);
			t4.setVisible(true);
			t5.setVisible(true);
			//t6.setVisible(true);
			CarID.setVisible(true);
			Price.setVisible(true);
			CarName.setVisible(true);
			Model.setVisible(true);
			Color.setVisible(true);
			CustomerName2.setVisible(true);
			c3.setVisible(true);
			connect.CustomerPK(c3);
		}
		if(e.getSource() == b3){
			closeCar();
			closeCarCompany();
			closeLast();
			b7.setVisible(true);
			t1.setVisible(true);
			t2.setVisible(true);
			t3.setVisible(true);
			CustomerName.setVisible(true);
			Phone.setVisible(true);
			Payment_method.setVisible(true);
			
		}
		if(e.getSource() == b4){
			closeCar();
			closeCarCompany();
			closeCustomer();
			b8.setVisible(true);
			Cname.setVisible(true);
			CarID2.setVisible(true);
			connect.notInCarCompany_has_CarsPK2(c4);
			connect.CarCompanyPK(c5);
			c4.setVisible(true);
			c5.setVisible(true);
		}
		if(e.getSource() == b5){
			connect.insertCarCompany(t1.getText(), t2.getText(), t3.getText());
			closeAll();
			done d = new done();
			setT();
		}
		if(e.getSource() == b6){
			int x = Integer.parseInt(t1.getText());
			int y = Integer.parseInt(t2.getText());
			int z = Integer.parseInt(t4.getText());
			
					connect.insertCar(x,y,t3.getText(),z,t5.getText(),(String) c3.getSelectedItem());
			done d = new done();
			connect.CustomerPK(c3);
			setT();
		}
		if(e.getSource() == b7){
			int y = Integer.parseInt(t2.getText());
			connect.insertCustomer(t1.getText(),y,t3.getText());
			done d = new done();
			closeAll();
			setT();
		}
		if(e.getSource() == b8){
			int y = Integer.parseInt((String) c4.getSelectedItem());
			connect.insertCarCompany_has_Cars((String) c5.getSelectedItem(), y);
			done d = new done();
			connect.notInCarCompany_has_CarsPK2(c4);
			connect.CarCompanyPK(c5);
			setT();
		}
		if(e.getSource() == back)
			setVisible(false);
	}
	public static void main(String[] args) {
		insertGUI d = new insertGUI();
		d.setVisible(true);
	}
}