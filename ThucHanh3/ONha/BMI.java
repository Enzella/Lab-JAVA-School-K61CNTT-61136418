package BaiThucHanhTrenLop3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import BaiThucHanhTrenLop3.FRAME.winListener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class BMI extends Frame {
	TextField	He,We;
	Label	lblHe,lblWe,lblvBMI,lblaBMI;
	Button Go;
class BMI()

	FlowLayout fl = new FlowLayout();
    setLayout(fl);
    setBounds(0, 0, 600, 400);
    setVisible(true);
    //
    lblHe = new Label("Height: ");
    lblHe.setBounds(70,50,20,25);
    txtHeight = new TextField();
    txtHeight.setBounds(140,50,200,25);
    
    lblWe = new Label("Weight: ");
    lblWe.setBounds(70,100,20,25);
    txtWeight = new TextField();
    txtWeight.setBounds(140,100,200,25);
    
    lblvBMI = new Label("");
    lblvBMI.setBounds(50,200,100,25);
    KQ = new TextField();
    KQ.setBounds(140,200,200,25);
    
    lblaBMI = new Label("");
    lblaBMI.setBounds(50,300,100,25);
    
    Go = new Button("BMI GO!");
    Go.setBounds(75,150,50,25);
    
    KQ.setEditable(false);
    
    
    add(lblHe);
    add(txtHeight);
    add(lblWe);
    add(txtWeight);
    add(lblvBMI);
    add(lblaBMI); 
    add(Go);

    Go.addWindowListener(new winListener());
}
public void actionPerformed(ActionEvent e) 
	{
    String txtHeight=getText();
    String txtWeight=getText();
            
    if(txtHeight.isEmpty() || txtWeight.isEmpty()) return;
    
    double s = Double.parseDouble(txtHeight) / Math.pơw(Double.parseDouble(txtWeight)/100,2);
  
    
    if (s < 16) {
    	lblvBMI.setText("BMI: " + s +"Ốm Cực Nặng");
    	lblaBMI.setText("Tăng cân");
    } else if (s >= 16 && s < 17){
    	lblvBMI.setText("BMI: " + KQ +"Ốm Nặng");
    	lblaBMI.setText("Tăng cân");
    } else if (s >= 17 && s < 18.5) {
    	lblvBMI.setText("BMI: " + KQ +"Ốm");
    	lblaBMI.setText("Tăng cân");
    } else if (s >= 18.5 && s < 25) {
    	lblvBMI.setText("BMI: " + KQ +"Cân Bằng");
    	lblaBMI.setText("Tốt");
    } else if (s >= 25 && s < 30) {
    	lblvBMI.setText("BMI: " + KQ +"Hơi Mập");
    	lblaBMI.setText("Giảm cân");
    } else if (s >= 30 && s < 34.9) {
    	lblvBMI.setText("BMI: " + KQ +"Mập");
    	lblaBMI.setText("Giảm cân");
    } else if (s >= 35 && s <= 39.9) {
    	lblvBMI.setText("BMI: " + s +"Mập Nặng");
    	lblaBMI.setText("Giảm cân");
    }else {
    	lblvBMI.setText("BMI: " + s +"Mập Cực Nặng");
    	lblaBMI.setText("Giảm cân");
    }
    	}
			}
  
