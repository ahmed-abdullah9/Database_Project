import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class done extends JFrame implements ActionListener{
	Container c = getContentPane();
	private JButton btnNewButton;
	public done(){
		setVisible(true);
		setBounds(100, 100, 207, 111);
		setTitle("done");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblDone = new JLabel("Done");
		lblDone.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		lblDone.setHorizontalAlignment(SwingConstants.CENTER);
		lblDone.setBounds(55, 6, 94, 33);
		c.add(lblDone);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setBounds(44, 51, 117, 29);
		c.add(btnNewButton);
		
		btnNewButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
	}
}
