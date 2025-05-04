package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hotelmanagementsystem extends JFrame implements ActionListener {
    Hotelmanagementsystem(){
            //setSize(1366,555);
            //setLocation(100,100);
        setBounds(0,0,1366,544); //location x, location y, width, height
        ImageIcon iI = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel image = new JLabel(iI);
        add(image);

        JLabel text = new JLabel("Hotel Management System");
        text.setBounds(50,450,700,50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.PLAIN,40));
        image.add(text);

        JButton button = new JButton("Next");
        button.setBounds(700,440,400,50);
        button.addActionListener(this);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("serif",Font.PLAIN,40));
        image.add(button);

        setVisible(true);

        while (true){
            text.setVisible(false);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
            text.setVisible(true);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
}
    public static  void main(String[] args){
        new Hotelmanagementsystem();
        System.out.println("Hi..");
    }
}
