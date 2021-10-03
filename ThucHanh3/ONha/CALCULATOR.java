package BaiThucHanhTrenLop3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
public class CALCULATOR extends Frame{
	TextField	a,b,KQ;
	Label	lblA,lblB,lblKQ;
	Button Plus,Sub,Mul,Div;
	
	public CALCULATOR()
	{

        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        setBounds(0, 0, 600, 400);
        setVisible(true);
        
        //
        lblA = new Label("A: ");
        lblA.setBounds(70,50,20,25);
        
        lblB = new Label("B: ");
        lblB.setBounds(70,100,20,25);
        
        lblKQ = new Label("KQ: ");
        lblKQ.setBounds(50,200,100,25);
        
        Plus = new Button("+");
        Plus.setBounds(75,150,50,25);
        
        Sub = new Button("-");
        Sub.setBounds(145,150,50,25);
        
        Mul = new Button("*");
        Mul.setBounds(215,150,50,25);
        
        Div = new Button("/");
        Div.setBounds(285,150,50,25);
        
        a = new TextField();
        a.setBounds(140,50,200,25);
        b = new TextField();
        b.setBounds(140,100,200,25);
        KQ = new TextField();
        KQ.setBounds(140,200,200,25);
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
        add(Sub);
        add(Mul);
        add(Div);
        
        
        Plus.addActionListener(new addListener());
        Sub.addActionListener(new addListener());
        Mul.addActionListener(new addListener());
        Div.addActionListener(new addListener());
        
        
        addWindowListener(new winListener());
    }
	  class addListener implements ActionListener {
			public void Plus() {
	            String aText = a.getText();
	            String bText = b.getText();
	            
	            if(aText.isEmpty() || bText.isEmpty()) return;
	            
	            double s = Double.parseDouble(aText) + Double.parseDouble(bText);
	            
	            KQ.setText(String.valueOf(s));
		    }
			public void Sub() {
	            String aText = a.getText();
	            String bText = b.getText();
	            
	            if(aText.isEmpty() || bText.isEmpty()) return;
	            
	            double s = Double.parseDouble(aText) - Double.parseDouble(bText);
	            
	            KQ.setText(String.valueOf(s));
		    }
			public void Mul() {
	            String aText = a.getText();
	            String bText = b.getText();
	            
	            if(aText.isEmpty() || bText.isEmpty()) return;
	            
	            double s = Double.parseDouble(aText) * Double.parseDouble(bText);
	            
	            KQ.setText(String.valueOf(s));
		    }
			public void Div() {
	            String aText = a.getText();
	            String bText = b.getText();
	            
	            if(aText.isEmpty() || bText.isEmpty()) return;
	            
	            double s = Double.parseDouble(aText) / Double.parseDouble(bText);
	            
	            KQ.setText(String.valueOf(s));
		    }
			 @Override
			    public void actionPerformed(ActionEvent e) {
			        if (e.getActionCommand() == "+") {
			            Plus();
			        } else if (e.getActionCommand() == "-") {
			            Sub();
			        } else if (e.getActionCommand() == "*") {
			            Mul();
			        } else if (e.getActionCommand() == "/") {
			            Div();
			        }
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
	    }
}
