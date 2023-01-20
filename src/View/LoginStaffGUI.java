package View;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class LoginStaffGUI {

    JFrame frame = new JFrame();
    JLabel label,rectangle,id,pw,rect,rectlab;
    JTextField idlog;
    JButton loginBtn,c,r,u,d,logout;
    JPasswordField pwlog;

    public void loginStaff(){
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("Rectangle 1.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("Button.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(6,117,97));
        rectangle = new JLabel(img1);
        rectangle.setBounds(36,61,327,479);
        label = new JLabel("LOGIN STAFF");
        label.setFont(new Font("Dialog", Font.BOLD,32));
        label.setBounds(90,93,220,100);
        id = new JLabel("ID");
        id.setFont(new Font("Dialog", Font.BOLD,17));
        id.setHorizontalAlignment(JLabel.CENTER);
        id.setBounds(129,240,134,14);
        idlog = new JTextField();
        idlog.setBackground(new Color(217,217,217));
        idlog.setHorizontalAlignment(JLabel.CENTER);
        idlog.setBounds(88,266,223,35);
        pw = new JLabel("PASSWORD");
        pw.setFont(new Font("Dialog", Font.BOLD,17));
        pw.setHorizontalAlignment(JLabel.CENTER);
        pw.setBounds(126,306,136,14);
        pwlog = new JPasswordField();
        pwlog.setBackground(new Color(217,217,217));
        pwlog.setHorizontalAlignment(JLabel.CENTER);
        pwlog.setBounds(88,331,223,35);
        loginBtn = new JButton(img2);
        loginBtn.setBackground(Color.WHITE);
        loginBtn.setBorder(new LineBorder(Color.WHITE));
        loginBtn.setBounds(138,396,130,65);

        frame.add(id);
        frame.add(idlog);
        frame.add(pw);
        frame.add(pwlog);
        frame.add(loginBtn);
        frame.add(label);
        frame.add(rectangle);
        frame.setVisible(true);

        loginBtn.addActionListener((e)->{
            String id = idlog.getText();
            String pw = pwlog.getText();
            if(AllObjController.Akun.cekLogStaff(id,pw)){
                new LoginStaffGUI().menuStaff();
                frame.dispose();
            }
            else if(AllObjController.Akun.getArrlistAkun().isEmpty()){
                JOptionPane.showMessageDialog(null,"Data Staff Masih Kosong","Notification",JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"ID atau Password salah bro","Notification",JOptionPane.ERROR_MESSAGE);
            }

        });
    }

    public void menuStaff(){
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon imgrec = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogStaff.png"));
        ImageIcon imgc = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("c-staff.png"));
        ImageIcon imgr = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("r-staff.png"));
        ImageIcon imgu = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("u-staff.png"));
        ImageIcon imgd = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("d-staff.png"));
        ImageIcon log = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logout-staff.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(imgrec);
        rect.setBounds(0,0,400,80);
        rectlab = new JLabel("MENU STAFF");
        rectlab.setForeground(Color.WHITE);
        rectlab.setFont(new Font("Dialog", Font.BOLD,32));
        rectlab.setBounds(85,30,230,32);
        c = new JButton(imgc);
        c.setBackground(Color.WHITE);
        c.setBorder(new LineBorder(Color.WHITE));
        c.setBounds(88,100,229,70);
        r = new JButton(imgr);
        r.setBackground(Color.WHITE);
        r.setBorder(new LineBorder(Color.WHITE));
        r.setBounds(88,181,229,70);
        u = new JButton(imgu);
        u.setBackground(Color.WHITE);
        u.setBorder(new LineBorder(Color.WHITE));
        u.setBounds(91,262,223,70);
        d = new JButton(imgd);
        d.setBackground(Color.WHITE);
        d.setBorder(new LineBorder(Color.WHITE));
        d.setBounds(91,343,224,70);
        logout = new JButton(log);
        logout.setBackground(Color.WHITE);
        logout.setBorder(new LineBorder(Color.WHITE));
        logout.setBounds(91,424,223,70);

        frame.add(rectlab);
        frame.add(rect);
        frame.add(c);
        frame.add(r);
        frame.add(u);
        frame.add(d);
        frame.add(logout);
        frame.setVisible(true);

        c.addActionListener((e)->{
            new MenuStaffGUI().create();
            frame.dispose();
        });

        r.addActionListener((e)->{
            new MenuStaffGUI().read();
            frame.dispose();
        });

        u.addActionListener((e)->{
            new MenuStaffGUI().update();
            frame.dispose();
        });

        d.addActionListener((e)->{
            new MenuStaffGUI().delete();
            frame.dispose();
        });

        logout.addActionListener((e)->{
            new HomeGUI().menu();
            frame.dispose();
        });

    }
}
