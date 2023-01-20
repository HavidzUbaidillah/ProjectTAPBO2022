package View;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import Controllers.Controller_Akun;

public class LoginAdminGUI {

    Controller_Akun Akun = new Controller_Akun();
    JFrame frame = new JFrame();
    JLabel label,rectangle,id,pw,rect,rectlab;
    JTextField idlog;
    JButton loginBtn,c,r,u,d,logout;
    JPasswordField pwlog;

    public void login(){
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("Rectangle 1.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("Button.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(1,147,209));
        rectangle = new JLabel(img1);
        rectangle.setBounds(36,61,327,479);
        label = new JLabel("LOGIN ADMIN");
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
            if(Akun.cekLogAdmin(id,pw)){
                new LoginAdminGUI().menuAdmin();
                frame.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"ID atau Password salah bro","Notification",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void menuAdmin(){
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon imgrec = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogAdm.png"));
        ImageIcon imgc = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("c-admin.png"));
        ImageIcon imgr = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("r-admin.png"));
        ImageIcon imgu = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("u-admin.png"));
        ImageIcon imgd = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("d-admin.png"));
        ImageIcon log = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logout-btn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(imgrec);
        rect.setBounds(0,0,400,80);
        rectlab = new JLabel("MENU ADMIN");
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
            new MenuAdminGUI().create();
            frame.dispose();
        });

        r.addActionListener((e)->{
            new MenuAdminGUI().read();
            frame.dispose();
        });

        u.addActionListener((e)->{
            new MenuAdminGUI().update();
            frame.dispose();
        });

        d.addActionListener((e)->{
            new MenuAdminGUI().delete();
            frame.dispose();
        });

        logout.addActionListener((e)->{
            new HomeGUI().menu();
            frame.dispose();
        });

    }
}
