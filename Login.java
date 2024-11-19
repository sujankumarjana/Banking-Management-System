package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;

    JTextField textField1;

    JPasswordField passwordField2;

    JButton button1, button2, button3;
    Login(){

        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/Card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(670,400,200,100);
        add(iimage);

        label1 = new JLabel("BANK LOGIN PAGE");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Time New RoMen",Font.BOLD,38));
        label1.setBounds(220,125,450,40);
        add(label1);

        label2 = new JLabel("CARD NO: ");
        label2.setFont(new Font("Ralway",Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(210,200,375,30);
        add(label2);

        textField1 = new JTextField(15);
        textField1.setBounds(355,200,230,30);
        textField1.setFont(new Font("Arial",Font.BOLD,14));
        add(textField1);

        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(250,250,375,30);
        add(label3);

        passwordField2 =new JPasswordField(15);
        passwordField2.setBounds(355,250,230,30);
        passwordField2.setFont(new Font("Arial", Font.BOLD,14));
        add(passwordField2);

        button1 =new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(310,300,90,20);
        button1.addActionListener(this);
        add(button1);

        button2 =new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(415,300,90,20);
        button2.addActionListener(this);
        add(button2);

        button3 =new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(345,335,120,20);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backGround.jpg"));
        Image iii2 = iii1.getImage().getScaledInstance(850,550,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,550);
        add(iiimage);

        setLayout(null);
        setSize(850,550);
        setLocation(450,200);
//        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1){
                Con c = new Con();
                String cardno = textField1.getText();
                String pin = passwordField2.getText();
                String q = "select * from login where Card_no = '"+cardno+"' and  Pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number & PIN");
                }

            }else if (e.getSource()==button2){
                textField1.setText("");
                passwordField2.setText("");
            } else if (e.getSource()==button3){
                new Signup();
                setVisible(false);
            }
        }
        catch (Exception E){
          E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
