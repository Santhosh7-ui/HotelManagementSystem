package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    Dashboard(){
        setBounds(0,0,1550,1000);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);

        JLabel text = new JLabel("TAJ Group Welcome You");
        text.setBounds(500,200,1000,50);
        text.setForeground(Color.black);
        text.setFont(new Font("serif",Font.PLAIN,40));
        System.out.println("Hi..");
        image.add(text);

        JMenuBar menu = new JMenuBar();
        menu.setBounds(0,0,1550,30);
        image.add(menu);

        JMenu hotel = new JMenu("Hotel Management System");
        hotel.setForeground(Color.RED);
        menu.add(hotel);

        JMenuItem reception = new JMenuItem("Reception");
        hotel.add(reception);

        JMenu admin = new JMenu("Admin");
        menu.add(admin);

        JMenuItem addDriver = new JMenuItem("ADD Drivers");
        admin.add(addDriver);

        JMenuItem addRooms = new JMenuItem("ADD Rooms");
        admin.add(addRooms);

        JMenuItem addEmployee = new JMenuItem("ADD Employee");
        admin.add(addEmployee);

        setVisible(true);
    }
    public static void main(String[] args){
        new Dashboard();
    }
}
