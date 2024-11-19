package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;

    JTextField textPan, textAadhaar;

    JRadioButton  p1, p2, r1, r2, e1, e2;

    JButton next;

    String formno;

    Signup2( String formno){

        super("APPLICATION FROM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,120,120,30);
        add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
//        comboBox.setBackground(new Color(91, 246, 170));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,170,120,30);
        add(l4);

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
//        comboBox2.setBackground(new Color(91, 246, 170));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,220,120,30);
        add(l5);

        String income[] = {"Null", "<50,000", "<1,00,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
//        comboBox3.setBackground(new Color(91, 246, 170));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational Qf :");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,270,180,30);
        add(l6);

        String educational[] = {"Secondary", "Higher Secondary", "Graduate", "Post Graduate", "Doctorate", "Other"};
        comboBox4 = new JComboBox(educational);
//        comboBox4.setBackground(new Color(91, 246, 170));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,320,180,30);
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
//        comboBox5.setBackground(new Color(91, 246, 170));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,370,180,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,20));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhaar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,420,180,30);
        add(l9);

        textAadhaar = new JTextField();
        textAadhaar.setFont(new Font("Raleway",Font.BOLD,20));
        textAadhaar.setBounds(350,420,320,30);
        add(textAadhaar);

        JLabel l10 = new JLabel("Personal Disability :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,470,200,30);
        add(l10);

        p1 = new JRadioButton("Yes");
        p1.setFont(new Font("Raleway",Font.BOLD,14));
//        p1.setBackground(new Color(91, 246, 170));
        p1.setBounds(350,470,100,30);
        add(p1);

        p2 = new JRadioButton("No");
        p2.setFont(new Font("Raleway",Font.BOLD,14));
//        p2.setBackground(new Color(91, 246, 170));
        p2.setBounds(460,470,100,30);
        add(p2);

        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(p1);
        buttonGroup.add(p2);

        JLabel l11 = new JLabel("Senior Citizen :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,520,180,30);
        add(l11);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
//        r1.setBackground(new Color(91, 246, 170));
        r1.setBounds(350,520,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
//        r2.setBackground(new Color(91, 246, 170));
        r2.setBounds(460,520,100,30);
        add(r2);

        ButtonGroup buttonGroup1 =new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l12 = new JLabel("Existing Account :");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(100,570,180,30);
        add(l12);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
//        e1.setBackground(new Color(91, 246, 170));
        e1.setBounds(350,570,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
//        e2.setBackground(new Color(91, 246, 170));
        e2.setBounds(460,570,100,30);
        add(e2);

        ButtonGroup buttonGroup2 =new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel l13 = new JLabel("Form No :");
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(670,10,100,30);
        add(l13);

        JLabel l14 = new JLabel(formno);
        l14.setFont(new Font("Raleway",Font.BOLD,20));
        l14.setBounds(760,10,80,30);
        add(l14);

        next = new JButton("Next");
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/background1.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(1620,1080,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(0,0,1620,1080);
        add(iimage);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
//        getContentPane().setBackground(new Color(91, 246, 170));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    String rel = (String) comboBox.getSelectedItem();
    String cat = (String) comboBox2.getSelectedItem();
    String inc = (String) comboBox3.getSelectedItem();
    String edu = (String) comboBox4.getSelectedItem();
    String occ = (String) comboBox5.getSelectedItem();

    String pan = textPan.getText();
    String aadhaar = textAadhaar.getText();

    String pdisability = " ";
    if (p1.isSelected()) {
        pdisability = "Yes";
    } else if (p2.isSelected()) {
        pdisability = "no";
    }

    String scitizen = " ";
    if (r1.isSelected()) {
        scitizen = "Yes";
    } else if (r2.isSelected()) {
        scitizen = "no";
    }

    String eaccount = " ";
    if (e1.isSelected()) {
        eaccount = "Yes";
    } else if (e2.isSelected()) {
        eaccount = "no";
    }

    try{
        if (textPan.getText().equals("") || textAadhaar.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill all the fields");
        }else {
            Con c1 = new Con();
            String q = "insert into Signup2 values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhaar+"','"+pdisability+"','"+scitizen+"','"+eaccount+"')";
            c1.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);
        }
    }catch (Exception E){
        E.printStackTrace();
    }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
