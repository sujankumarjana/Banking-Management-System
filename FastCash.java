package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class FastCash extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7;

    String pin;

    FastCash(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,880,1000);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,22));
        label.setBounds(262,350,400,35);
        l3.add(label);

        b1 = new JButton("RS. 100");
        b1.setFont(new Font("System",Font.BOLD,13));
        b1.setBounds(231,505,170,35);
        b1.setBackground(new Color(4, 44, 253));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("RS.500");
        b2.setFont(new Font("System",Font.BOLD,13));
        b2.setBounds(480,505,170,35);
        b2.setBackground(new Color(4, 44, 253));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("RS. 2000");
        b3.setFont(new Font("System",Font.BOLD,13));
        b3.setBounds(480,565,170,35);
        b3.setBackground(new Color(4, 44, 253));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("RS. 1000");
        b4.setFont(new Font("System",Font.BOLD,13));
        b4.setBounds(231,565,170,35);
        b4.setBackground(new Color(4, 44, 253));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("RS. 5000");
        b5.setFont(new Font("System",Font.BOLD,13));
        b5.setBounds(231,625,170,35);
        b5.setBackground(new Color(4, 44, 253));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("RS. 10000");
        b6.setFont(new Font("System",Font.BOLD,13));
        b6.setBounds(480,625,170,35);
        b6.setBackground(new Color(4, 44, 253));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setFont(new Font("System",Font.BOLD,9));
        b7.setBounds(495,797,60,30);
        b7.setBackground(new Color(243, 230, 4));
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

        if (e.getSource()==b7){
            setVisible(false);
            new main_class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Con c = new Con();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != b7 && balance < Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null,"Insufficient Balance");
                return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')");
                JOptionPane.showMessageDialog(null,"RS. "+amount+" Debited Successfully");

            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
