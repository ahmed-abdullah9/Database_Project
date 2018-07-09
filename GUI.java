import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{
	DBConnect connect = new DBConnect();
	private JFrame frame;
	private JButton btnShowTable,btnDeleteTable,btnInsertARow,btnEditTable,Exit;
	private void buttonsandLabel(){
		Exit = new JButton("Exit");
		Exit.setBounds(95, 252, 117, 38);
		frame.getContentPane().add(Exit);
		
		btnShowTable = new JButton("Show table");
		btnShowTable.setBounds(6, 40, 296, 52);
		frame.getContentPane().add(btnShowTable);
		
		btnDeleteTable = new JButton("Delete row");
		btnDeleteTable.setBounds(6, 93, 296, 52);
		frame.getContentPane().add(btnDeleteTable);
		
		btnInsertARow = new JButton("Insert row");
		btnInsertARow.setBounds(6, 146, 296, 52);
		frame.getContentPane().add(btnInsertARow);
		
		btnEditTable = new JButton("search or Edit table");
		btnEditTable.setBounds(6, 200, 296, 52);
		frame.getContentPane().add(btnEditTable);
		
		JLabel lblCarCompany = new JLabel("Car Company");
		lblCarCompany.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblCarCompany.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarCompany.setBounds(6, 7, 296, 33);
		frame.getContentPane().add(lblCarCompany);
	}
	private void Actions(){
		btnShowTable.addActionListener(this);
		btnDeleteTable.addActionListener(this);
		btnInsertARow.addActionListener(this);
		btnEditTable.addActionListener(this);
		Exit.addActionListener(this);
	}
	public GUI(){
		frame = new JFrame();
		frame.setTitle("Car Company"); 
		frame.setBounds(100, 100, 313, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		buttonsandLabel();		
		Actions();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnShowTable){
			showTableGUI s = new showTableGUI();
		s.setVisible(true);
		}
		else if(e.getSource() == btnDeleteTable){
			deleteTableGUI s = new deleteTableGUI();
			s.setVisible(true);
		}
		else if(e.getSource() == btnInsertARow){
			insertGUI s = new insertGUI();
			s.setVisible(true);
		}
		else if(e.getSource() == btnEditTable){
			editGUI s = new editGUI();
			s.setVisible(true);
		}
		if(e.getSource() == Exit){
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		GUI w = new GUI();
		w.frame.setVisible(true);
		
	}

	

}
