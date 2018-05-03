import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmEncapsulation extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmpNum;
	private JTextField txtEmpName;
	private JTextField txtAdress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEncapsulation frame = new FrmEncapsulation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmEncapsulation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setBounds(10, 11, 86, 14);
		contentPane.add(lblEmployeeNumber);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(10, 39, 76, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(10, 64, 76, 14);
		contentPane.add(lblAdress);
		
		txtEmpNum = new JTextField();
		txtEmpNum.setBounds(116, 8, 169, 20);
		contentPane.add(txtEmpNum);
		txtEmpNum.setColumns(10);
		
		txtEmpName = new JTextField();
		txtEmpName.setBounds(116, 36, 169, 20);
		contentPane.add(txtEmpName);
		txtEmpName.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setBounds(116, 61, 169, 20);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
	      Emp e = new Emp();
		
		JButton btnSet = new JButton("Set");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			e.set_EmpNumb(Integer.parseInt(txtEmpNum.getText()));
			e.set_EmpName(txtEmpName.getText());
			e.set_EmpAdress(txtAdress.getText());
			}
		});
		btnSet.setBounds(116, 103, 62, 23);
		contentPane.add(btnSet);
		
		JButton btnGet = new JButton("Get");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String strMsg = String.valueOf(e.get_EmpNumb());
				 strMsg += "\n" + e.get_EmpName();
				 strMsg += "\n" + e.get_EmpAdress();
				JOptionPane.showMessageDialog(null, strMsg);
			}
			
		});
		btnGet.setBounds(198, 103, 69, 23);
		contentPane.add(btnGet);
	}
}
