import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class searchGUI extends JFrame implements ActionListener{
	
	DBConnect connect = new DBConnect();
	private JTextField textField;
	private JButton b1,b2,b3,b4,close;
	Container c = getContentPane();
	
	public searchGUI(){
		setTitle("searching");
		setBounds(100, 100, 313, 378);
		c.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(6, 250, 296, 70);
		textField.setColumns(10);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		c.add(textField);
		
		JLabel lblCarCompany = new JLabel("Enter the Primary key");
		lblCarCompany.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblCarCompany.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarCompany.setBounds(6, 221, 280, 33);
		c.add(lblCarCompany);
		
		close = new JButton("Close");
		close.setBounds(94, 314, 117, 38);
		c.add(close);
		
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
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		close.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			String x = textField.getText();
			textField.setText(connect.searchCarCompany(x));
		}
		if(e.getSource() == b2){
			int x = Integer.parseInt(textField.getText());
			textField.setText(connect.searchCar(x));
		}
		if(e.getSource() == b3){
			String x = textField.getText();
			textField.setText(connect.searchCustomer(x));
		}
		if(e.getSource() == b4){
			textField.setText(connect.searchCarCompany_has_Cars(textField.getText()));
		}
		if(e.getSource() == close)
			setVisible(false);
	}
	public static void main(String[] args) {
		searchGUI d = new searchGUI();
		d.setVisible(true);
	}
}
