package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    Dashboard(){
        setBounds(0,0,1550,1000);
        //setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel();
        image.setBounds(0,0,1550,1000);
        add(image);

        JLabel text = new JLabel("TAJ Group Welcome You");
        text.setBounds(400,80,1000,50);

        setVisible(true);
    }
    public static void main(String[] args){
        new Dashboard();
    }
}
