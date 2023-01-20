package View;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class HomeGUI
{
    JFrame frame = new JFrame();
    JLabel rectangle,pict,label;
    JButton adm,usr,exit, backmenu;

    public void menu()
    {
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logofix 1.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("Rectangle 2.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("user.png"));
        ImageIcon img3 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("users-alt.png"));
        ImageIcon img4 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("exit.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        pict = new JLabel(img0);
        pict.setBounds(-30,82,400,309);
        rectangle = new JLabel(img1);
        rectangle.setBounds(0,461,400,122);
        adm = new JButton(img2);
        adm.setBackground(new Color(6,117,97));
        adm.setBorder(new LineBorder(new Color(6,117,97)));
        adm.setBounds(14,484,78,76);
        usr = new JButton(img3);
        usr.setBackground(new Color(6,117,97));
        usr.setBorder(new LineBorder(new Color(6,117,97)));
        usr.setBounds(163,484,74,76);
        exit = new JButton(img4);
        exit.setBackground(new Color(6,117,97));
        exit.setBorder(new LineBorder(new Color(6,117,97)));
        exit.setBounds(294,484,78,76);

        frame.add(pict);
        frame.add(rectangle);
        frame.add(adm);
        frame.add(usr);
        frame.add(exit);
        frame.setVisible(true);

        adm.addActionListener((e)->{
            new LoginAdminGUI().login();
            frame.dispose();
        });

        usr.addActionListener((e)->{
            new LoginStaffGUI().loginStaff();
            frame.dispose();
        });

        exit.addActionListener((e)->{
            new HomeGUI().exit();
            frame.dispose();
        });
    }

    public void exit()
    {
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logofix 1.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("Rectangle 2.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("backmenu.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        pict = new JLabel(img0);
        pict.setBounds(-30,82,400,309);
        rectangle = new JLabel(img1);
        rectangle.setBounds(0,418,400,73);
        label = new JLabel("ANDA TELAH KELUAR DARI PROGRAM");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD,16));
        label.setBounds(45,452,309,19);
        backmenu = new JButton(img2);
        backmenu.setBackground(Color.WHITE);
        backmenu.setBorder(new LineBorder(Color.WHITE));
        backmenu.setBounds(95,495,211,68);

        frame.add(pict);
        frame.add(label);
        frame.add(rectangle);
        frame.add(backmenu);
        frame.setVisible(true);

        backmenu.addActionListener((e)->{
            new HomeGUI().menu();
            frame.dispose();
        });
    }

    public static void main(String[] args) {
        HomeGUI home = new HomeGUI();
        home.menu();
    }
}
