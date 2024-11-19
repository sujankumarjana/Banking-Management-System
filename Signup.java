package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, m1, m2;

    JButton next;

    JTextField textName, textFname, textMobile, textEmail, textAdd, textCity, textPin, textState;

    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 =(ran.nextLong() % 9000L) +1000L;

    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FROM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,30));
        label2.setBounds(330,70,600,35);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,110,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,160,100,30);
        add(labelName);

        textName =new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,160,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,210,200,30);
        add(labelfName);

        textFname =new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,210,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,260,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(82, 104, 255, 250));
        dateChooser.setBounds(300,260,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,310,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
//        r1.setBackground(new Color(239, 11, 70, 255));
        r1.setBounds(300,310,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
//        r2.setBackground(new Color(239, 11, 70, 255));
        r2.setBounds(450,310,90,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
//        r3.setBackground(new Color(239, 11, 70, 255));
        r3.setBounds(600,310,90,30);
        add(r3);

        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel labelMobile = new JLabel("Mobile No :");
        labelMobile.setFont(new Font("Raleway",Font.BOLD,20));
        labelMobile.setBounds(100,360,200,30);
        add(labelMobile);

        textMobile =new JTextField();
        textMobile.setFont(new Font("Raleway",Font.BOLD,14));
        textMobile.setBounds(300,360,400,30);
        add(textMobile);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,410,200,30);
        add(labelEmail);

        textEmail =new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,410,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,460,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
//        m1.setBackground(new Color(239, 11, 70, 255));
        m1.setBounds(300,460,100,30);
        add(m1);

        m2 = new JRadioButton("UnMarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
//        m2.setBackground(new Color(239, 11, 70, 255));
        m2.setBounds(450,460,100,30);
        add(m2);

        ButtonGroup mbuttonGroup =new ButtonGroup();
        mbuttonGroup.add(m1);
        mbuttonGroup.add(m2);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,510,200,30);
        add(labelAdd);

        textAdd =new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,510,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,560,200,30);
        add(labelCity);

        textCity =new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,560,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,610,200,30);
        add(labelPin);

        textPin =new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,610,400,30);
        add(textPin);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,660,200,30);
        add(labelState);

        textState =new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,660,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/background1.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(1620,1080,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0,0,1620,1080);
        add(iimage);

//        getContentPane().setBackground(new Color(82, 104, 255, 250));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()){
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String mobile = textMobile.getText();
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Singal";
        } else if (m2.isSelected()){
            marital = "Married";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")){
               JOptionPane.showConfirmDialog(null, "Fill all the fields");
            }else {
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+mobile+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
