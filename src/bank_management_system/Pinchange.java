package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pinchange extends JFrame implements ActionListener{
    JPasswordField pin ,repin;
    JButton change,back;
    String pinnumber;
    
    Pinchange (String pinnumber){
        this.pinnumber=pinnumber;
//        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,850,850);
        add(image);
        JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setBounds(200,220,700,35);
        text.setForeground( Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        
        JLabel pintext=new JLabel("New PIN:");
        pintext.setBounds(140,300,100,25);
        pintext.setForeground( Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);
        
         pin=new  JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        pin.setBounds(280,300,200,25);
        image.add(pin);
        
        JLabel repintext=new JLabel("Re-enter New PIN:");
        repintext.setBounds(140,330,300,25);
        repintext.setForeground( Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        image.add(repintext);
        
         repin=new  JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,16));
        repin.setBounds(280,330,200,25);
        image.add(repin);
        
         change=new JButton("CHANGE");
        change.setBounds (180,390,120,30);
        change.addActionListener(this);
        image.add(change);
        
         back=new JButton("BACK");
        back.setBounds(320,390,120,30);
        back.addActionListener(this);
        image.add(back);
        
        
//        
//        imag e.add(text);
        setSize(850,800);
        setLocation (300,0);
        setUndecorated(true);
        setVisible(true);
}
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==change){
     try{
         String npin=pin.getText();
         String rpin=repin.getText();
         
         if(!npin.equals(rpin)){
             JOptionPane.showMessageDialog(null,"Entered pin does not match");
             return;
         }
         if(npin.equals("")){
             JOptionPane.showMessageDialog(null,"Please Enter the PIN");
             return;
         }
        
         if(rpin.equals("")){
             JOptionPane.showMessageDialog(null,"Please Re-Enter the PIN");
             return;
         }
         Conn conn=new Conn();
         String query1="update bank set pin='"+rpin+"' where pin ='"+pinnumber+"'";
         String query2="update login set pin='"+rpin+"' where pin ='"+pinnumber+"'";
         String query3="update signupthree set pin='"+rpin+"' where pin ='"+pinnumber+"'";

     conn.s.executeUpdate(query1);
     conn.s.executeUpdate(query2);
     conn.s.executeUpdate(query3);
     JOptionPane.showMessageDialog(null,"PIN changed successfully");
     setVisible(false);
     new Transaction(rpin).setVisible(true);
     }
          catch(Exception e){
            System.out.println(e);
        
     }  
     
    }else{
         setVisible(false);
         new Transaction(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Pinchange("").setVisible(true);
    }
}
