
 package bank_management_system;
import javax.swing.*;
import java.awt.*;
//import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

//import j/?ava.lang.Exception;



public class  SignupTwo extends JFrame implements ActionListener{
    
//    long random;
    JTextField  pan,adhr;
    JButton next;
    JRadioButton eyes,eno,syes,sno;
//    JDateChooser dateChooser;
    JComboBox Religion,category,inc,qual,ocu;
      String formno;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
setTitle("NEW ACCOUNT APPLICATION FROM PAGE 2");

//bydefault border layout deta hai


//        Random ran=new Random();
//         random=(Math.abs(ran.nextLong()%9000L)+1000L);
//        JLabel formno=new JLabel("");
//        formno.setFont(new Font("Raleway",Font.BOLD,38));
//        formno.setBounds(140,20,600,40);Page 2: Additional details
//        add(formno);
        
        JLabel Additionaldetails=new JLabel("Page 2: Additional details");
        Additionaldetails.setFont(new Font("Raleway",Font.BOLD,38));
        Additionaldetails.setBounds(200,70,700,55);
        add(Additionaldetails);
        
        JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,38));
        name.setBounds(100,140,200,50);
        add(name);
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Others"};         
         Religion=new JComboBox(valReligion);
        Religion.setBounds(380,140,400,30);
        Religion.setBackground(Color.WHITE);
        add(Religion);
        
//         nameTextField=new  JTextField();
//        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        nameTextField.setBounds(380,145,410,30);
//        add(nameTextField);
        
         JLabel Cat=new JLabel("Category:");
        Cat.setFont(new Font("Raleway",Font.BOLD,38));
        Cat.setBounds(100,190,300,50);
        add(Cat);
        String valcategory[]={"General","OBC","SC","ST","Others"};         
         category=new JComboBox(valcategory);
        category.setBounds(380,195,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
//         fnameTextField=new  JTextField();
//        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        fnameTextField.setBounds(380,195,410,30);
//        add(fnameTextField);
        
         JLabel Income=new JLabel("Income:");
        Income.setFont(new Font("Raleway",Font.BOLD,38));
        Income.setBounds(100,245,350,30);
        add(Income);
        
        
        String incomecategory[]={"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};         
        inc=new JComboBox(incomecategory);
        inc.setBounds(380,245,400,30);
        inc.setBackground(Color.WHITE);
        add(inc);
//        JTextField dobTextField=new  JTextField();
//        dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
      
       
//         dateChooser=new JDateChooser();
//        dateChooser.setBounds(380,245,410,30);
//        dateChooser.setForeground(new Color(105,105,105));
//         add(dateChooser);

         
//         
         JLabel Education=new JLabel("Educational");
        Education.setFont(new Font("Raleway",Font.BOLD,38));
        Education.setBounds(100,305,390,30);
        add(Education);
        
//        JTextField genderTextField=new  JTextField();
//        genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        genderTextField.setBounds(380,295,410,30);
//        add(genderTextField);
//
//         male=new JRadioButton("Male");
//        male.setBounds(370,290,60,30);
//        male.setBackground(Color.WHITE);
//        add(male);
//        
//         female=new JRadioButton("Female");
//        female.setBounds(500,290,90,30);
//        female.setBackground(Color.WHITE);
//        add(female);
//        
//        ButtonGroup gendergroup=new ButtonGroup();
//        gendergroup.add(male);
//        gendergroup.add(female);

        JLabel Qualification=new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway",Font.BOLD,38));
        Qualification.setBounds(100,340,400,30);
        add(Qualification);
        
        String educategory[]={"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};         
        qual=new JComboBox(educategory);
        qual.setBounds(380,345,400,30);
        qual.setBackground(Color.WHITE);
        add(qual);
        
//         emailTextField=new  JTextField();
//        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        emailTextField.setBounds(380,345,410,30);
//        add(emailTextField);
        
        JLabel Occupation=new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway",Font.BOLD,38));
        Occupation.setBounds(100,390,450,30);
        add(Occupation);
        
        String occupcategory[]={"Salaried","Self-Employed","Bussiness","Student","Retired"};         
         ocu=new JComboBox(occupcategory);
        ocu.setBounds(380,395,400,30);
        ocu.setBackground(Color.WHITE);
        add(ocu);
        
//         married =new JRadioButton("married");
//        married.setBounds(370,395,80,30);
//        married.setBackground(Color.WHITE);
//        add(married);
//        
//         unmarried=new JRadioButton("unmarried");
//        unmarried.setBounds(470,395,100,30);
//        unmarried.setBackground(Color.WHITE);
//        add(unmarried);
//        
//         others=new JRadioButton("others");
//        others.setBounds(570,395,120,30);
//        others.setBackground(Color.WHITE);
//        add(others);
        
//        ButtonGroup maritalgroup=new ButtonGroup();
//        maritalgroup.add(married);
//        maritalgroup.add(unmarried);
//        maritalgroup.add(others);
        
//        JTextField maritalTextField=new  JTextField();
//        maritalTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        maritalTextField.setBounds(380,395,410,30);
//        add(maritalTextField);
        
        JLabel panno=new JLabel("Pan no.:");
        panno.setFont(new Font("Raleway",Font.BOLD,38));
        panno.setBounds(100,440,400,30);
        add(panno);
        
        
        pan=new  JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(380,445,410,30);
        add(pan);
        
        JLabel aadhar=new JLabel("Aadhar no.:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,38));
        aadhar.setBounds(100,490,400,45);
        add(aadhar);
        
         adhr =new  JTextField();
        adhr.setFont(new Font("Raleway",Font.BOLD,14));
        adhr.setBounds(380,495,410,30);
        add(adhr);
        
        JLabel seniorcitizen=new JLabel("Senior citizen or not:");
        seniorcitizen.setFont(new Font("Raleway",Font.BOLD,38));
        seniorcitizen.setBounds(100,540,380,50);
        add(seniorcitizen);
        
        syes =new JRadioButton("Yes");
        syes.setBounds(500,550,80,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
         sno=new JRadioButton("No");
        sno.setBounds(600,550,80,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
         ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
//        maritalgroup.add(others);
        
//         others=new JRadioButton("others");
//        others.setBounds(570,395,120,30);
//        others.setBackground(Color.WHITE);
//        add(others);
        
//         stateTextField=new  JTextField();
//        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        stateTextField.setBounds(380,545,410,30);
//        add(stateTextField);
       
        JLabel existacc=new JLabel("Existing Account:");
        existacc.setFont(new Font("Raleway",Font.BOLD,38));
        existacc.setBounds(100,590,380,50);
        add(existacc);
        


        eyes =new JRadioButton("Yes");
        eyes.setBounds(500,600,80,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(600,600,80,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
         ButtonGroup emaritalgroup=new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
//         pinTextField=new  JTextField();
//        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        pinTextField.setBounds(380,595,410,30);
//        add(pinTextField);
        
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
//        String formno = "" + random;
        String name=(String)Religion.getSelectedItem();
        String sCat =(String)category.getSelectedItem();
        String sIncome=(String)inc.getSelectedItem();
        String seducation=(String)qual.getSelectedItem();
        String soccupation=(String)ocu.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
        

        
//        String existaccount=emailTextField.getText();
        String existacc=null;
        if(eyes.isSelected()){
            existacc="Yes";
        }
        else if(eno.isSelected()){
            existacc="No";
        }
        
       String span =pan.getText();
       String sadhr =adhr.getText();
//       String state =stateTextField.getText();
//        String pin =pinTextField.getText();
        
        try{
//            if(name.equals("")){
//                JOptionPane.showMessageDialog(null, "Name is required");
//            }
//            
            Conn c=new Conn();
            String query="insert into signuptwo values('"+formno+"','"+name+"','"+sCat+"','"+sIncome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+existacc+"','"+span+"','"+sadhr+"')";
            c.s.executeUpdate(query) ;
            setVisible(false);
            new signupthree(formno).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        }
        
    public String getFormno() {
        return formno;
    }

    public static void main(String  args[]){
        new SignupTwo("");
        
    }
}
