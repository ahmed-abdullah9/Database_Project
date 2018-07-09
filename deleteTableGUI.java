import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class deleteTableGUI extends JFrame implements ActionListener{
	
	DBConnect connect = new DBConnect();
	private JButton b1,b2,b3,b4,bb1,bb2,bb3,bb4,back;
	private JLabel l1,l2,l3,l4,l5;
	private JComboBox c1,c2,c3,c4,c5;
	Container c = getContentPane();
	
	private void textAndButtonsAndLabels(){
		back = new JButton("back");
		back.setBounds(94, 314, 117, 38);
		c.add(back);
		
		b1 = new JButton("Car Company");
		b1.setBounds(6, 6, 173, 47);
		c.add(b1);
		
		b2 = new JButton("Car");
		b2.setBounds(6, 53, 173, 47);
		c.add(b2);
		
		b3 = new JButton("Customer");
		b3.setBounds(6, 100, 173, 47);
		c.add(b3);
		
		b4 = new JButton("CarCompany_has_Cars");
		b4.setBounds(6, 148, 173, 47);
		c.add(b4);
		
		bb1 = new JButton("Delete");
		bb1.setBounds(191, 6, 116, 47);
		c.add(bb1);
		bb1.setVisible(false);
		
		bb2 = new JButton("Delete");
		bb2.setBounds(191, 53, 116, 47);
		c.add(bb2);
		bb2.setVisible(false);
		
		bb3 = new JButton("Delete");
		bb3.setBounds(191, 100, 116, 47);
		c.add(bb3);
		bb3.setVisible(false);
		
		bb4 = new JButton("Delete");
		bb4.setBounds(191, 148, 116, 47);
		c.add(bb4);
		bb4.setVisible(false);
		
		l1 = new JLabel("Choose Company");
		l1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(6, 229, 101, 16);
		c.add(l1);
		l1.setVisible(false);
		
		l2 = new JLabel("Choose CarID");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		l2.setBounds(6, 229, 101, 16);
		c.add(l2);
		l2.setVisible(false);
		
		l3 = new JLabel("Choose Customer");
		l3.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setBounds(6, 229, 101, 16);
		c.add(l3);
		l3.setVisible(false);
		
		l4 = new JLabel("Choose Company");
		l4.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setBounds(6, 229, 101, 16);
		c.add(l4);
		l4.setVisible(false);
		
		l5 = new JLabel("Choose CarID");
		l5.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setBounds(6, 288, 101, 16);
		c.add(l5);
		l5.setVisible(false);
	}
	private void JComboBoxes(){
		c1 = new JComboBox();
		c1.setBounds(119, 214, 183, 47);
		c.add(c1);
		c1.setVisible(false);
		
		c2 = new JComboBox();
		c2.setBounds(119, 214, 183, 47);
		c.add(c2);
		c2.setVisible(false);
		
		c3 = new JComboBox();
		c3.setBounds(119, 214, 183, 47);
		c.add(c3);
		c3.setVisible(false);
		
		c4 = new JComboBox();
		c4.setBounds(119, 214, 183, 47);
		c.add(c4);
		c4.setVisible(false);
		
		c5 = new JComboBox();
		c5.setBounds(119, 273, 183, 47);
		c.add(c5);
		c5.setVisible(false);
	}
	private void Actions(){
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		bb3.addActionListener(this);
		bb4.addActionListener(this);
		c5.addActionListener(this);
		back.addActionListener(this);
	}
	
	public deleteTableGUI(){
		setTitle("in which table you want to delete ?");
		setBounds(100, 100, 313, 378);
		c.setLayout(null);

		textAndButtonsAndLabels();
		JComboBoxes();
		Actions();
	}
	
	private void closeCarCompany(){
		bb1.setVisible(false);
		l1.setVisible(false);
		c1.setVisible(false);
	}
	private void closeCar(){
		bb2.setVisible(false);
		l2.setVisible(false);
		c2.setVisible(false);
	}
	private void closeCustomer(){
		bb3.setVisible(false);
		l3.setVisible(false);
		c3.setVisible(false);
	}
	private void closeCarCompany_has_Cars(){
		bb4.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		c4.setVisible(false);
		c5.setVisible(false);
	}
	
	private void closeAll(){
		closeCar();
		closeCarCompany();
		closeCarCompany_has_Cars();
		closeCustomer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			closeCar();
			closeCustomer();
			closeCarCompany_has_Cars();
			bb1.setVisible(true);
			l1.setVisible(true);
			connect.CarCompanyPK(c1);
			c1.setVisible(true);
		}
		if(e.getSource() == b2){
			closeCarCompany();
			closeCustomer();
			closeCarCompany_has_Cars();
			bb2.setVisible(true);
			l2.setVisible(true);
			connect.CarPK(c2);
			c2.setVisible(true);
		}
		if(e.getSource() == b3){
			closeCarCompany();
			closeCar();
			closeCarCompany_has_Cars();
			l3.setVisible(true);
			bb3.setVisible(true);
			connect.CustomerPK(c3);
			c3.setVisible(true);
		}
		if(e.getSource() == b4){
			closeCarCompany();
			closeCar();
			closeCustomer();
			bb4.setVisible(true);
			l5.setVisible(true);
			c5.setVisible(true);
			connect.CarCompany_has_CarsPK2(c5);
		}
		if(e.getSource() == bb1){
			connect.deleteCarCompanyRow((String) c1.getSelectedItem());
			done d = new done();
			connect.CarCompanyPK(c1);
		}
		if(e.getSource() == bb2){
			int x =Integer.parseInt((String) c2.getSelectedItem());
			connect.deleteCarRow(x);
			done d = new done();
			connect.CarPK(c2);
		}
		if(e.getSource() == bb3){
			connect.deleteCustomerRow((String) c3.getSelectedItem());
			done d = new done();
			connect.CustomerPK(c3);
		}
		if(e.getSource() == bb4){
			int x = Integer.parseInt((String) c5.getSelectedItem());
			connect.deleteCarCompany_has_CarsRow(x);
			done d = new done();
			connect.CarCompany_has_CarsPK2(c5);
		}
		if(e.getSource() == back)
			setVisible(false);
	}
	public static void main(String[] args) {
		showTableGUI d = new showTableGUI();
		d.setVisible(true);
	}

}
