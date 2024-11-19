package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JButton b1, b2;

    JPasswordField p1, p2;

    String pin;

    PinChange(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,880,1000);
        add(l3);

        JLabel label1 = new JLabel("UPDATE YOUR LOGIN PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,23));
        label1.setBounds(293,350,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("Enter Your New PIN : ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(270,400,300,30);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(4, 44, 253));
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("Raleway",Font.BOLD,20));
        p1.setBounds(530,400,80,30);
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter Your New PIN : ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System",Font.BOLD,20));
        label3.setBounds(270,450,300,30);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(4, 44, 253));
        p2.setForeground(Color.WHITE);
        p2.setFont(new Font("Raleway",Font.BOLD,20));
        p2.setBounds(530,450,80,30);
        l3.add(p2);

        b1 = new JButton("CHANGE");
        b1.setFont(new Font("System",Font.BOLD,16));
        b1.setBounds(490,565,150,35);
        b1.setBackground(new Color(4, 44, 253));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("System",Font.BOLD,16));
        b2.setBounds(490,620,150,35);
        b2.setBackground(new Color(4, 44, 253));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(900,1080);
        setLocation(350,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN Does Not Match");
                return;
            }
            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                setVisible(false);
                new main_class(pin);

            } else if (e.getSource()==b2) {
                new main_class(pin);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new PinChange("");
    }
}

