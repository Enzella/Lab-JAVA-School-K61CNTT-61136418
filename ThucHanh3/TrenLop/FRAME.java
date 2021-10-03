package BaiThucHanhONha3;
import java.awt.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import BaiThucHanhONha3.FRAME.addListener;

public class FRAME {

    FlowLayout fl = new FlowLayout();
    setLayout(fl);
    setBounds(0, 0, 400, 200);
    setVisible(true);

    lblA = new Label("A: ");
    lblB = new Label("B: ");
    lblKQ = new Label("KQ: ");
    Plus = new Button("+");
    a = new TextField();
    b = new TextField();
    KQ = new TextField();
    a.setSize(100, 200);
    
    KQ.setEditable(false);
    
    // add components
    add(lblA);
    add(a);
    add(lblB);
    add(b);
    add(lblKQ);
    add(KQ);  
    add(Plus);
    
    
    Plus.addActionListener(new addListener());
    addWindowListener(new winListener());
}
  class addListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            String aText = a.getText();
            String bText = b.getText();
            
            if(aText.isEmpty() || bText.isEmpty()) return;
            
            double s = Double.parseDouble(aText) + Double.parseDouble(bText);
            
            KQ.setText(String.valueOf(s));
        }
        
    }	
    class winListener implements WindowListener 
    {

        @Override
        public void windowOpened(WindowEvent arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent arg0) {
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        

}
