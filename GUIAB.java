import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class GUIAB {
	public static void main(String[]a) {
		Frame fr = new Frame("AB");
		fr.setBounds(0,0,600,400);
		fr.setLayout(null);
		//
		Label lblA = new Label("A");
		lblA.setBounds(37, 24, 98, 15);
		
		Label lblB = new Label("B");
		lblB.setBounds(37, 84, 100, 15);
		
		Label lblKQ = new Label("KQ");
		lblKQ.setBounds(37, 187, 192, 49);
		
		TextField txtA = new TextField();
		txtA.setBounds(37, 45, 135, 21);
		
		TextField txtB = new TextField();
		txtB.setBounds(37, 105, 135, 21);
		
		TextField txtKQ = new TextField();
		txtKQ.setBounds(37, 250,192, 49);
		
		Button btnCong = new Button("Tinh Tong");
		btnCong.setBounds(34, 138, 75, 25);
		
		
		fr.add(lblA);fr.add(txtA);
		fr.add(lblB);fr.add(txtB);
		fr.add(btnCong);
		fr.add(lblKQ);fr.add(txtKQ);
		
		
			ActionListener bolangnghe = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String strA = txtA.getText();
				String strB = txtB.getText();
				int a = Integer.parseInt(strA);
				int b = Integer.parseInt(strB);
				
				int c = a+b;
				txtKQ.setText(String.valueOf(c));
							
				}
					};
		btnCong.addActionListener(bolangnghe);{
			
		}
		
		
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
					System.exit(0);
			}
		});
		fr.setVisible(true);
		
	}
}
