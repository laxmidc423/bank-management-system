
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

//import j/?ava.lang.Exception;



public class  SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField  nameTextField,fnameTextField,emailTextField,addrTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,others,married,unmarried;
    JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);//bydefault border layout deta hai
        Random ran=new Random();
         random=(Math.abs(ran.nextLong()%9000L)+1000L);
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personaldetails=new JLabel("Page 1:Personal Details");
        personaldetails.setFont(new Font("Raleway",Font.BOLD,38));
        personaldetails.setBounds(200,70,700,55);
        add(personaldetails);
        
         JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,38));
        name.setBounds(100,140,200,30);
        add(name);
        
        
         nameTextField=new  JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(380,145,410,30);
        add(nameTextField);
        
         JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,38));
        fname.setBounds(100,190,300,30);
        add(fname);
        
         fnameTextField=new  JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(380,195,410,30);
        add(fnameTextField);
        
         JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,38));
        dob.setBounds(100,240,350,30);
        add(dob);
        
//        JTextField dobTextField=new  JTextField();
//        dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
      
       
         dateChooser=new JDateChooser();
        dateChooser.setBounds(380,245,410,30);
        dateChooser.setForeground(new Color(105,105,105));
         add(dateChooser);
         
         
         JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,38));
        gender.setBounds(100,290,390,30);
        add(gender);
        
//        JTextField genderTextField=new  JTextField();
//        genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        genderTextField.setBounds(380,295,410,30);
//        add(genderTextField);

         male=new JRadioButton("Male");
        male.setBounds(370,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female=new JRadioButton("Female");
        female.setBounds(500,290,90,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email=new JLabel("EMail:");
        email.setFont(new Font("Raleway",Font.BOLD,38));
        email.setBounds(100,340,400,30);
        add(email);
        
         emailTextField=new  JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(380,345,410,30);
        add(emailTextField);
        
        JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,38));
        marital.setBounds(100,390,450,30);
        add(marital);
        
        
         married =new JRadioButton("married");
        married.setBounds(370,395,80,30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried=new JRadioButton("unmarried");
        unmarried.setBounds(470,395,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         others=new JRadioButton("others");
        others.setBounds(570,395,120,30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(others);
        
//        JTextField maritalTextField=new  JTextField();
//        maritalTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        maritalTextField.setBounds(380,395,410,30);
//        add(maritalTextField);
        
        JLabel addr=new JLabel("Address:");
        addr.setFont(new Font("Raleway",Font.BOLD,38));
        addr.setBounds(100,440,400,30);
        add(addr);
        
        
         addrTextField=new  JTextField();
        addrTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addrTextField.setBounds(380,445,410,30);
        add(addrTextField);
        
        JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,38));
        city.setBounds(100,490,400,45);
        add(city);
        
         cityTextField=new  JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(380,495,410,30);
        add(cityTextField);
        
        JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,38));
        state.setBounds(100,540,400,30);
        add(state);
        
         stateTextField=new  JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(380,545,410,30);
        add(stateTextField);
       
        JLabel pincode=new JLabel("Pin code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,38));
        pincode.setBounds(100,590,400,30);
        add(pincode);
        
         pinTextField=new  JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(380,595,410,30);
        add(pinTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setBackground(Color.BLACK );
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    } 
        public void actionPerformed(ActionEvent ae){
        String formno=" "+random;
        String name=nameTextField.getText();
        String fname =fnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(others.isSelected()){
            marital="others";
        } 
       String addr =addrTextField.getText();
       String city =cityTextField.getText();
       String state =stateTextField.getText();
        String pincode =pinTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else{
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+addr+"','"+city+"','"+pincode+"','"+state+"')";
            c.s.executeUpdate(query) ;
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        }
        
    
    public static void main(String  args[]){
        new SignupOne();
        
    }
}
