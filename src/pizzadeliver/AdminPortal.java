package pizzadeliver;

import javax.swing.*;  
import java.awt.event.*;  
import java.awt.Color;
import java.awt.Font;
public class AdminPortal extends JFrame implements ActionListener{  
    JLabel l1,l2,l3,l,tl,ol1,ol2,ol3,ol4,lds,p,os;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;  
    JButton b,b1,b2,b3; 
    JRadioButton rb1,rb2,rb3,rb4,rb5,rb6; 
    JTextArea area,area1,area2;
    AdminPortal(){  
    	 l=new JLabel("Welcome to Home Style Pizza Shop");  
         l.setBounds(70,30,400,30);
         p=new JLabel("Order ID :");  
         p.setBounds(80,475,400,30); 
         os=new JLabel("Phone Number :");  
         os.setBounds(230,475,400,30);
         area1=new JTextArea();  
         area1.setBounds(140,480,70,20);
         area2=new JTextArea();  
         area2.setBounds(330,480,70,20);
         add(area1);add(area2);
         lds=new JLabel("Update Delivery Status");  
         lds.setBounds(70,450,400,30);
         Font f = new Font("TimesRoman",Font.BOLD,25);
         l.setFont(f);
         l.setForeground(Color.red);
         lds.setForeground(Color.red);
        l1=new JLabel("Each Topping: $1.50");  
        l1.setBounds(90,75,300,20); 
        l1.setForeground(Color.red);
        cb1=new JCheckBox("Tomato");  
        cb1.setBounds(100,100,150,20);  
        cb2=new JCheckBox("Green Pepper");  
        cb2.setBounds(100,125,150,20);  
        cb3=new JCheckBox("Black Olives");  
        cb3.setBounds(100,150,150,20);  
        cb4=new JCheckBox("Mushrooms");  
        cb4.setBounds(100,175,150,20);  
        cb5=new JCheckBox("Extra Cheese");  
        cb5.setBounds(100,200,150,20);  
        cb6=new JCheckBox("Pepproni");  
        cb6.setBounds(100,225,150,20);
        cb7=new JCheckBox("Sausage");  
        cb7.setBounds(100,250,150,20);
        b=new JButton("Process Selection");  
        b.setBounds(300,200,200,30); 
        b1=new JButton("Cooking");  
        b1.setBounds(100,520,100,30);
        b2=new JButton("On Its Way");  
        b2.setBounds(203,520,100,30);
        b3=new JButton("Delivered");  
        b3.setBounds(306,520,100,30);
        b.addActionListener(this);  
        add(l1);add(cb1);add(cb2);add(cb3);add(b);add(cb4);add(cb5);add(cb6);add(cb7);add(l); add(lds);add(b1);add(b2);add(b3);
        add(p);add(os);
        l2=new JLabel("Pizza Size");  
        l2.setBounds(300,75,300,20); 
        l2.setForeground(Color.red);
        rb1=new JRadioButton("Small: $6.50");    
        rb1.setBounds(310,100,150,30);      
        rb2=new JRadioButton("Medium: $8.50");    
        rb2.setBounds(310,130,150,30);
        rb3=new JRadioButton("Large: $10.00");    
        rb3.setBounds(310,160,150,30);
        add(rb1);add(rb2);add(l2);add(rb3);
        l3=new JLabel("Pizza Type");  
        l3.setBounds(490,75,300,20); 
        l3.setForeground(Color.red);
        rb4=new JRadioButton("Thin Crust");    
        rb4.setBounds(500,100,150,30);      
        rb5=new JRadioButton("Medium Crust");    
        rb5.setBounds(500,130,150,30);
        rb6=new JRadioButton("Pan");    
        rb6.setBounds(500,160,150,30);
        add(rb4);add(rb5);add(l3);add(rb6);
        tl=new JLabel("Your order");  
        tl.setBounds(100,310,300,20); 
        add(tl);
        ol1=new JLabel();  
        ol1.setBounds(105,305,540,100);
        add(ol1);
        ol2=new JLabel();  
        ol2.setBounds(105,318,540,100);
        add(ol2);
        ol3=new JLabel();  
        ol3.setBounds(105,331,540,100);
        add(ol3);
        ol4=new JLabel();  
        ol4.setBounds(105,356,540,100);
        add(ol4);
        area=new JTextArea();  
        area.setBounds(100,340,540,100);
        add(area);
        setSize(700,630);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg1="Pizza type: ";  
        String msg2="Pizza size: ";  
        String msg3="Toppings: ";  
        if(cb1.isSelected()){  
            amount+=1.50;  
            msg3+="tomato, ";  
        }  
        if(cb2.isSelected()){  
            amount+=1.50;  
            msg3+="green pepper, ";  
        }  
        if(cb3.isSelected()){  
            amount+=1.50;  
            msg3+="black olives, ";  
        }  
        if(cb4.isSelected()){  
            amount+=1.50;  
            msg3+="mushrooms, ";  
        }  
        if(cb5.isSelected()){  
            amount+=1.50;  
            msg3+="extra cheese, ";  
        }  
        if(cb6.isSelected()){  
            amount+=1.50;  
            msg3+="pepproni, ";  
        }  
        if(cb7.isSelected()){  
            amount+=1.50;  
            msg3+="sausage,";  
        }  
        if(rb1.isSelected()){  
            amount+=6.50;  
            msg2+="small,";  
        }  
        if(rb2.isSelected()){  
            amount+=8.50;  
            msg2+="medium,";  
        }  
        if(rb3.isSelected()){  
            amount+=10.00;  
            msg2+="large,";  
        }  
        if(rb4.isSelected()){   
            msg1+="thin crust";  
        }  
        if(rb5.isSelected()){    
            msg1+="medium crust";  
        }  
        if(rb6.isSelected()){   
            msg1+="pan";  
        }
        if(cb1.isSelected()==false && cb2.isSelected()==false && cb3.isSelected()==false && cb4.isSelected()==false && cb5.isSelected()==false && cb6.isSelected()==false && cb7.isSelected()==false )
        {
        	JOptionPane.showMessageDialog(this,"Something Went Wrong"); 
        }
        //JOptionPane.showMessageDialog(this,msg1+"\n"+msg2+"\n"+msg3+"\nAmount Due: $"+amount); 
        else {
        ol1.setText(msg1);
        ol2.setText(msg2);
        ol3.setText(msg3);
        ol4.setText("Amount Due: $"+amount);}
        //System.out.println(msg1+"\n"+msg2+"\n"+msg3+"\nAmount Due: $"+amount);
    }  
    public static void main(String[] args) {  
        new AdminPortal();  
    }  
}  
