package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7;

    String pin;

    main_class(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,880,1000);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,22));
        label.setBounds(270,350,400,35);
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("System",Font.BOLD,13));
        b1.setBounds(231,505,170,35);
        b1.setBackground(new Color(4, 44, 253));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWAL");
        b2.setFont(new Font("System",Font.BOLD,13));
        b2.setBounds(480,505,170,35);
        b2.setBackground(new Color(4, 44, 253));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setFont(new Font("System",Font.BOLD,13));
        b3.setBounds(480,565,170,35);
        b3.setBackground(new Color(4, 44, 253));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setFont(new Font("System",Font.BOLD,13));
        b4.setBounds(231,565,170,35);
        b4.setBackground(new Color(4, 44, 253));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setFont(new Font("System",Font.BOLD,13));
        b5.setBounds(231,625,170,35);
        b5.setBackground(new Color(4, 44, 253));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setFont(new Font("System",Font.BOLD,13));
        b6.setBounds(480,625,170,35);
        b6.setBackground(new Color(4, 44, 253));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("System",Font.BOLD,9));
        b7.setBounds(495,737,55,25);
        b7.setBackground(new Color(250, 7, 36));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(900,1080);
        setLocation(350,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==b7) {
            System.exit(0);
        }else if (e.getSource()==b2) {
            new Withdrawal(pin);
            setVisible(false);
        }else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        }else if (e.getSource()==b5) {
            new PinChange(pin);
            setVisible(false);
        }else if (e.getSource()==b4){
            new Mini_S(pin);
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
