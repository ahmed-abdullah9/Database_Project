import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class editGUI extends JFrame implements ActionListener{
	
	DBConnect connect = new DBConnect();
	private JTextField t1,t2,t3,t4,t5,t6,t7;
	private JButton b1,b2,b3,b4,bb1,bb2,bb3,bb4,back;
	private JLabel CarID,Cname,CustomerName,Price,CarID2,Phone,Country,neww;
	private JLabel CarName,City,Payment_method,Model,Color,CustomerName2;
	private JLabel l1,l2,l3,l4,l6,l7;
	private JComboBox c2,c1,c3,c4,c11,c22;
	StringTokenizer st;
	Container c = getContentPane();
	public void insertTextFields(){
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
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(119, 286, 75, 33);
		c.add(t7);
		t7.setVisible(false);
		
	}
	public void insertButtons(){
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
		
		bb1 = new JButton("Edit");
		bb1.setBounds(201, 6, 106, 47);
		c.add(bb1);
		bb1.setVisible(false);
		
		bb2 = new JButton("Edit");
		bb2.setBounds(201, 53, 106, 47);
		c.add(bb2);
		bb2.setVisible(false);
		
		bb3 = new JButton("Edit");
		bb3.setBounds(201, 100, 106, 47);
		c.add(bb3);
		bb3.setVisible(false);
		
		bb4 = new JButton("Edit");
		bb4.setBounds(201, 148, 106, 47);
		c.add(bb4);
		bb4.setVisible(false);
		
	}
	public void insertLabels(){
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
		
		l1 = new JLabel("choose the Company name");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		l1.setBounds(6, 282, 189, 40);
		c.add(l1);
		l1.setVisible(false);
		l2 = new JLabel("choose the CarID");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		l2.setBounds(6, 282, 189, 40);
		c.add(l2);
		l2.setVisible(false);
		l3 = new JLabel("choose the Customer name");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		l3.setBounds(6, 282, 189, 40);
		c.add(l3);
		l3.setVisible(false);
		l4 = new JLabel("choose the CarID");
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		l4.setBounds(6, 282, 189, 40);
		c.add(l4);
		l4.setVisible(false);
		
		l6 = new JLabel("choose the CarID");
		l6.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		l6.setHorizontalAlignment(SwingConstants.CENTER);
		l6.setBounds(6, 290, 84, 26);
		c.add(l6);
		l6.setVisible(false);
		
		neww = new JLabel("choose new Cname , CarID");
		neww.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		neww.setBounds(6, 257, 152, 16);
		c.add(neww);
		neww.setVisible(false);
		
		
	}
	public void insertComboBoxes(){
		c1 = new JComboBox();
		c1.setBounds(191, 290, 116, 27);
		c.add(c1);
		c1.setVisible(false);
		connect.CarCompanyPK(c1);
		
		c2 = new JComboBox();
		c2.setBounds(191, 290, 116, 27);
		c.add(c2);
		c2.setVisible(false);
		connect.CarPK(c2);
		
		c3 = new JComboBox();
		c3.setBounds(191, 290, 116, 27);
		c.add(c3);
		c3.setVisible(false);
		connect.CustomerPK(c3);
		
		c4 = new JComboBox();
		c4.setBounds(191, 290, 116, 27);
		c.add(c4);
		c4.setVisible(false);
		connect.CarCompany_has_CarsPK2(c4);
		
		c11 = new JComboBox();
		c11.setBounds(160, 252, 75, 26);
		c.add(c11);
		c11.setVisible(false);
		
		c22 = new JComboBox();
		c22.setBounds(232, 252, 75, 26);
		c.add(c22);
		c22.setVisible(false);
	}
	public void Actions(){
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		bb3.addActionListener(this);
		bb4.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		c4.addActionListener(this);
		back.addActionListener(this);
		
	}
	
	public editGUI(){
		setTitle("which table you want to search or edit ?");
		setBounds(100, 100, 313, 378);
		c.setLayout(null);
		
		insertTextFields();
		insertButtons();
		insertLabels();
		insertComboBoxes();
		
		Actions();
		
	}
	
	private void closeCar(){
		c2.setVisible(false);
		bb2.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		t4.setVisible(false);
		t5.setVisible(false);
		t6.setVisible(false);
		CarID.setVisible(false);
		Price.setVisible(false);
		CarName.setVisible(false);
		Model.setVisible(false);
		Color.setVisible(false);
		CustomerName2.setVisible(false);
		t7.setVisible(false);
		l2.setVisible(false);
		c2.setVisible(false);
		}
	private void closeCarCompany(){
		bb1.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		Cname.setVisible(false);
		Country.setVisible(false);
		City.setVisible(false);
		t7.setVisible(false);
		l1.setVisible(false);
		c1.setVisible(false);
	}
	private void closeCustomer(){
		bb3.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		CustomerName.setVisible(false);
		Phone.setVisible(false);
		Payment_method.setVisible(false);
		t7.setVisible(false);
		l3.setVisible(false);
		c3.setVisible(false);
	}
	private void closeLast(){
		bb4.setVisible(false);
		t1.setVisible(false);
		t2.setVisible(false);
		Cname.setVisible(false);
		CarID2.setVisible(false);
		l4.setVisible(false);
		c11.setVisible(false);
		c22.setVisible(false);
		c4.setVisible(false);
		neww.setVisible(false);
	}
	private void closeAll(){
		closeCar();
		closeCarCompany();
		closeCustomer();
		closeLast();
	}
	
	private void showCarCompany(){
		closeCar();
		closeCustomer();
		closeLast();
		bb1.setVisible(true);
		t1.setVisible(true);
		t2.setVisible(true);
		t3.setVisible(true);
		t1.setText("");
		t2.setText("");
		t3.setText("");
		Cname.setVisible(true);
		Country.setVisible(true);
		City.setVisible(true);
		l1.setVisible(true);
		c1.setVisible(true);
	}
	private void showCar(){
		closeCarCompany();
		closeCustomer();
		closeLast();
		c2.setVisible(true);
		bb2.setVisible(true);
		t1.setVisible(true);
		t2.setVisible(true);
		t3.setVisible(true);
		t4.setVisible(true);
		t5.setVisible(true);
		t6.setVisible(true);
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		CarID.setVisible(true);
		Price.setVisible(true);
		CarName.setVisible(true);
		Model.setVisible(true);
		Color.setVisible(true);
		CustomerName2.setVisible(true);
		l2.setVisible(true);
	}
	private void showCustomer(){
		closeCarCompany();
		closeCar();
		closeLast();
		bb3.setVisible(true);
		t1.setVisible(true);
		t2.setVisible(true);
		t3.setVisible(true);
		t1.setText("");
		t2.setText("");
		t3.setText("");
		CustomerName.setVisible(true);
		Phone.setVisible(true);
		Payment_method.setVisible(true);
		l3.setVisible(true);
		c3.setVisible(true);
	}
	private void showLast(){
		closeCarCompany();
		closeCar();
		closeCustomer();
		bb4.setVisible(true);
		t1.setVisible(true);
		t2.setVisible(true);
		t1.setText("");
		t2.setText("");
		Cname.setVisible(true);
		CarID2.setVisible(true);
		l4.setVisible(true);
		c4.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			showCarCompany();
		}
		if(e.getSource() == b2){
			showCar();
		}
		if(e.getSource() == b3){
			showCustomer();
		}
		if(e.getSource() == b4){
			showLast();
		}
		if(e.getSource() == bb1){
			String x = (String) c1.getSelectedItem();
			connect.editCarCompanyRow(x, t1.getText(), t2.getText(),t3.getText());
			done d = new done();
			connect.CarCompanyPK(c1);
			closeAll();
		}
		if(e.getSource() == bb2){
			int x = Integer.parseInt((String) c2.getSelectedItem());
			
			int y = Integer.parseInt(t1.getText());
			int z = Integer.parseInt(t2.getText());
			int w = Integer.parseInt(t4.getText());

					connect.editCarRow(x,y,z,t3.getText(),w,t5.getText(),t6.getText());
					done d = new done();
					closeAll();
		}
		if(e.getSource() == bb3){
			String x = (String) c3.getSelectedItem();
			int y = Integer.parseInt(t2.getText());
			connect.editCustomerRow(x,t1.getText(),y,t3.getText());
			done d = new done();
			closeAll();
		}
		if(e.getSource() == bb4){
			int x = Integer.parseInt(t2.getText());
			connect.deleteCarCompany_has_CarsRow(x);
			String Cname = (String) c11.getSelectedItem();
			int CarID = Integer.parseInt((String) c22.getSelectedItem());
			connect.insertCarCompany_has_Cars(Cname, CarID);
			done d = new done();
			closeAll();
		}
		if(e.getSource() == c1){
			String s0 = (String) c1.getSelectedItem();
			String s = connect.searchCarCompany(s0);
			st = new StringTokenizer(s);
			t1.setText(st.nextToken());
			t2.setText(st.nextToken());
			t3.setText(st.nextToken());
		}
		if(e.getSource() == c2){
			
			int x = Integer.parseInt((String) c2.getSelectedItem());
			String s = connect.searchCar(x);
			st = new StringTokenizer(s);
			t1.setText(st.nextToken());
			t2.setText(st.nextToken());
			t3.setText(st.nextToken());
			t4.setText(st.nextToken());
			t5.setText(st.nextToken());
			t6.setText(st.nextToken());
		}
		if(e.getSource() == c3){
			String s0 = (String) c3.getSelectedItem();
			String s = connect.searchCustomer(s0);
			st = new StringTokenizer(s);
			t1.setText(st.nextToken());
			t2.setText(st.nextToken());
			t3.setText(st.nextToken());
		}
		if(e.getSource() == c4){
			String s = connect.searchCarCompany_has_Cars((String) c4.getSelectedItem());
			StringTokenizer st = new StringTokenizer(s);
			t1.setText(st.nextToken());
			String oldCarID = st.nextToken();
			t2.setText(oldCarID);
			connect.CarCompanyPK(c11);
			connect.notInCarCompany_has_CarsPK2(c22);
			c22.addItem(oldCarID);
			c11.setVisible(true);
			c22.setVisible(true);
			neww.setVisible(true);
		}
		if(e.getSource() == back)
			setVisible(false);
	}
	public static void main(String[] args) {
		editGUI d = new editGUI();
		d.setVisible(true);
	}
}