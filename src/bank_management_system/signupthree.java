package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class signupthree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    signupthree(String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1=new JLabel("Page 3:Accounts Details");
        l1.setFont(new Font("Raleway",Font.BOLD,38));
        l1.setBounds(200,30,700,55);
        add(l1);
        
        
        JLabel type=new JLabel("Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD,33));
        type.setBounds(90,100,700,55);
        add(type);
        
      
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r1.setBackground( Color.WHITE);
        r1.setBounds(90,160,250,30);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBackground( Color.WHITE);
        r2.setBounds(90,200,250,30);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,20));
        r3.setBackground( Color.WHITE);
        r3.setBounds(500,150,250,30);
        add(r3);
        
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,20));
        r4.setBackground( Color.WHITE);
        r4.setBounds(500,200,280,30);
        add(r4);
        
        
        ButtonGroup groupaccout=new ButtonGroup();
        groupaccout.add(r1);
        groupaccout.add(r2);
        groupaccout.add(r3);
        groupaccout.add(r4);
        
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,33));
        card.setBounds(90,250,700,55);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4104");
        number.setFont(new Font("Raleway",Font.BOLD,25));
        number.setBounds(400,250,700,55);
        add(number);
        
        JLabel carddetail=new JLabel("Your 16 digit card number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,15));
        carddetail.setBounds(90,280,700,55);
        add(carddetail);
        
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,33));
        pin.setBounds(90,330,700,55);
        add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,25));
        pnumber.setBounds(400,330,700,55);
        add(pnumber);
        
        JLabel pindetail=new JLabel("Your 4 digit Password");
        pindetail.setFont(new Font("Raleway",Font.BOLD,15));
        pindetail.setBounds(90,360,700,55);
        add(pindetail);
        
        JLabel service=new JLabel("Services Required:");
        service.setFont(new Font("Raleway",Font.BOLD,33));
        service.setBounds(90,410,700,55);
        add(service);
        
        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBackground( Color.WHITE);
        c1.setBounds(90,460,280,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBackground( Color.WHITE);
        c2.setBounds(400,460,280,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBackground( Color.WHITE);
        c3.setBounds(90,500,280,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS ALERT");
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBackground( Color.WHITE);
        c4.setBounds(400,500,280,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBackground( Color.WHITE);
        c5.setBounds(90,540,280,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBackground( Color.WHITE);
        c6.setBounds(400,540,280,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Raleway",Font.BOLD,13));
        c7.setBackground( Color.WHITE);
        c7.setBounds(90,580,800,30);
        add(c7);
        
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE );
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,620,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE );
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(500,620,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public  void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accounttype=null;
            if(r1.isSelected()){
                accounttype="Saving Account";
            }
            else if(r2.isSelected()){
                accounttype="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accounttype="Current Account";
            }
            else if(r4.isSelected()){
                accounttype="Recurring Deposit Account";
            }
        Random random=new Random();   
        String cardnumber=""+ Math.abs((random.nextLong()% 90000000L)+ 5040936000000000L);
        String pinnumber=""+ Math.abs((random.nextLong()% 9000L)+ 1000L);
        String facility=" ";
        if(c1.isSelected()){
                facility=facility+"ATM Card";
            }
        else if(c2.isSelected()){
                facility=facility+"Internet Banking";
            }
        else if(c3.isSelected()){
                facility=facility+"Mobile Banking";
            }
        else if(c4.isSelected()){
                facility=facility+"EMAIL & SMS ALERT";
            }
        else if(c5.isSelected()){
                facility=facility+"Cheque Book";
            }
        else if(c6.isSelected()){
                facility=facility+"E-Statement";
            }
        
        
        try{
            if(accounttype.equals("")){
                JOptionPane.showMessageDialog(null, "Account type is required");
            }
            else{
                Conn conn=new Conn();
                String query1="insert into signupthreee values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                
                conn.s.executeUpdate(query1) ;
                conn.s.executeUpdate(query2) ;
            JOptionPane.showMessageDialog(null,"Card Number: "+ cardnumber +"\n Pin: " + pinnumber );
             setVisible(false);
             new deposit(pinnumber).setVisible(false);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        }
       
     else if(ae.getSource()==cancel){
         setVisible(false);
         new Login().setVisible(true);
    }
        
    }
    public String getFormno() {
        return formno;
    }
    public static void main(String  args[]){
        new signupthree("");
        
    }
   }

