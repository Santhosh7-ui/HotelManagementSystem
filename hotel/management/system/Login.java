package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel userLabel = new JLabel("UserName");
        userLabel.setBounds(40,50,100,30);
        add(userLabel);

        JTextField userName = new JTextField();
        userName.setBounds(150,50,200,30);
        add(userName);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(40,90,100,30);
        add(passwordLabel);

        JTextField password = new JTextField();
        password.setBounds(150,90,200,30);
        add(password);

        JButton login = new JButton("Login");
        login.setBounds(80,160,100,40);
        login.setBackground(Color.BLACK);
        login.setFont(new Font("serif",Font.PLAIN,15));
        //login.setForeground(Color.WHITE);
        add(login);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(200,160,100,40);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif",Font.PLAIN,15));
        cancel.setBackground(Color.BLACK);
        //cancel.setForeground(Color.WHITE);
        add(cancel);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = il.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,200,200);
        add(image);

        setBounds(500,200,600,300);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Hotelmanagementsystem();
}
    public static void main(String[] args){
        new Login();
    }
}
