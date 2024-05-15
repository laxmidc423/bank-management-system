
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Withdraw extends JFrame implements ActionListener   {
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    Withdraw(String pinnumber){
//        setLayout(null);
         this.pinnumber=pinnumber;
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Enter the amount you want to withdraw");
        text.setBounds(190,220,700,35);
        text.setForeground( Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        amount=new  JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,14));
        amount.setBounds(180,270,300,25);
        
        image.add(amount);
        
         withdraw=new JButton("Withdraw");
        withdraw.setBounds(250,330,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
         back=new JButton("Back");
        back.setBounds(250,370,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation (300,0);
        setVisible(true);
        
        
}
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==withdraw){
            String cashnumber=amount.getText();
            Date date=new Date();
            if(cashnumber.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
}
            else {
                try{
                Conn conn=new Conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Withdraw','"+cashnumber+"')";
           conn.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null,"Rs " +cashnumber+" withdrawn successfully");
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
            
                }
                catch(Exception e){
                    System.out.println(e);
                    }
            }
          
        }
        else if (ae.getSource()==back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }
    
    
    public String getpnumber() {
        return pinnumber;
    }
    public static void main(String args[]){
        new Withdraw("");
    }
}
