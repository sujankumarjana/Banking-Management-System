package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4, r5, r6;

    JCheckBox c1, c2, c3, c4, c5, c6;

    JButton s, c;

    String formno;

    Signup3(String formno){

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3:-");
        l1.setFont(new Font("raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("raleway",Font.BOLD,20));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
//        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
//        r2.setBackground(new Color(215,252,252));
        r2.setBounds(100,220,150,30);
        add(r2);

        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
//        r3.setBackground(new Color(215,252,252));
        r3.setBounds(350,180,300,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
//        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,300,30);
        add(r4);

        r5 = new JRadioButton("Student Account");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
//        r5.setBackground(new Color(215,252,252));
        r5.setBounds(100,260,150,30);
        add(r5);

        r6 = new JRadioButton("Senior Citizen Account");
        r6.setFont(new Font("Raleway",Font.BOLD,14));
//        r6.setBackground(new Color(215,252,252));
        r6.setBounds(350,260,300,30);
        add(r6);

        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);
        buttonGroup.add(r5);
        buttonGroup.add(r6);

        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("raleway",Font.BOLD,20));
        l4.setBounds(100,310,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Enter Your 16-Digit Card Number)");
        l5.setFont(new Font("raleway",Font.BOLD,12));
        l5.setBounds(100,340,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-1234");
        l6.setFont(new Font("raleway",Font.BOLD,20));
        l6.setBounds(330,310,300,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM Card/Cheque Book & Statements)");
        l7.setFont(new Font("raleway",Font.BOLD,12));
        l7.setBounds(330,340,400,20);
        add(l7);

        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("raleway",Font.BOLD,20));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("raleway",Font.BOLD,20));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(Enter 4-Digit Password)");
        l10.setFont(new Font("raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("raleway",Font.BOLD,20));
        l11.setBounds(100,430,200,30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
//        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBounds(100,470,150,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
//        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBounds(350,470,150,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
//        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBounds(100,510,150,30);
        add(c3);

        c4 = new JCheckBox("SMS Alerts");
//        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBounds(350,510,150,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
//        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBounds(100,550,150,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
//        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBounds(350,550,150,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my Knowledge.",true);
//        c7.setBackground();
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,600,600,20);
        add(c7);

        JLabel l13 = new JLabel("Form No :");
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(670,10,100,30);
        add(l13);

        JLabel l14 = new JLabel(formno);
        l14.setFont(new Font("Raleway",Font.BOLD,14));
        l14.setBounds(760,10,80,30);
        add(l14);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(210,650,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,650,100,30);
        c.addActionListener(this);
        add(s);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/background1.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(1620,1080,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0,0,1620,1080);
        add(iimage);

//        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,750);
        setLayout(null);
        setLocation(480,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        }else if (r2.isSelected()) {
            atype = "Current Account";
        }else if (r3.isSelected()) {
            atype = "Fixed Deposit Account";
        }else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }else if (r5.isSelected()) {
            atype = "Student Account";
        }else if (r6.isSelected()) {
            atype = "Senior Citizen Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if (c1.isSelected()){
            fac += "ATM Card ";
        }if (c2.isSelected()) {
            fac += "Internet Banking ";
        }if (c3.isSelected()) {
            fac += "Mobile Banking ";
        }if (c4.isSelected()) {
            fac += "SMS Alerts ";
        }if (c5.isSelected()) {
            fac += "Cheque Book ";
        }if (c6.isSelected()) {
            fac += "E-Statement";
        }

        try {
            if (e.getSource()==s){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the Fields");
                }else {
                    Con c1 = new Con();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number :"+cardno+"\n Pin :"+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
