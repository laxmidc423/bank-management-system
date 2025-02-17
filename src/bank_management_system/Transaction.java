package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener {
    JButton deposit,withdraw,ministatement,pinchange,fastcash,balanceenquiry,exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber=pinnumber;
//        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(200,220,700,35);
        text.setForeground( Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
         deposit=new JButton("Deposit");
        deposit.setBounds(180,280,130,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdraw=new JButton("Cash withdrawal");
        withdraw.setBounds(350,280,130,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
         fastcash=new JButton("Fast Cash");
        fastcash.setBounds(180,320,130,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         ministatement=new JButton("Mini Statement");
        ministatement.setBounds(350,320,130,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         pinchange=new JButton("Pin Change");
        pinchange.setBounds(180,370,130,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
         balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setBounds(350,370,130,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit=new JButton("Exit");
        exit.setBounds(270,420,130,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900,900);
        setLocation (300,0);
//        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource()==deposit){
            setVisible(false);
            new deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdraw){
            setVisible(false);
            new Withdraw(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fastcash){
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==ministatement){
            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public String getpinumber() {
        return pinnumber;
    }
    public static void main(String args[]){
        new Transaction("");
    }
}
