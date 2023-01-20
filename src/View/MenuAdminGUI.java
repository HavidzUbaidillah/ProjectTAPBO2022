package View;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MenuAdminGUI
{
    JFrame frame = new JFrame();
    JLabel label,rect,n,i,p,indx;
    JTextField nama, id, pw,index;
    JButton okbtn,backbtn,look;
    JTable tabel = new JTable();
    JScrollPane scrollPane;

    public void create()
    {
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogAdm.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("okBtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0,0,400,80);
        label =new JLabel("TAMBAH DATA STAFF");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD,24));
        label.setBounds(58,30,285,24);
        n = new JLabel("NAMA STAFF");
        n.setBounds(160,175,88,14);
        nama = new JTextField();
        nama.setBackground(new Color(217,217,217));
        nama.setHorizontalAlignment(JLabel.CENTER);
        nama.setBounds(59,197,281,31);
        i = new JLabel("ID");
        i.setBounds(193,242,15,14);
        id = new JTextField();
        id.setBackground(new Color(217,217,217));
        id.setHorizontalAlignment(JLabel.CENTER);
        id.setBounds(60,269,281,31);
        p = new JLabel("PASSWORD");
        p.setBounds(161,314,79,14);
        pw = new JTextField();
        pw.setBackground(new Color(217,217,217));
        pw.setHorizontalAlignment(JLabel.CENTER);
        pw.setBounds(60,341,281,31);
        okbtn= new JButton(img1);
        okbtn.setBackground(Color.WHITE);
        okbtn.setBorder(new LineBorder(Color.WHITE));
        okbtn.setBounds(172,413,57,36);

        frame.add(label);
        frame.add(rect);
        frame.add(n);
        frame.add(nama);
        frame.add(i);
        frame.add(id);
        frame.add(p);
        frame.add(pw);
        frame.add(okbtn);
        frame.setVisible(true);

        okbtn.addActionListener((e)->{
            String name = nama.getText();
            String Id = id.getText();
            String pass = pw.getText();
            if(name.isBlank() || Id.isBlank() || pass.isBlank() )
            {
                JOptionPane.showMessageDialog(null,"Field Tidak Boleh Kosong","Notification",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                AllObjController.Akun.create(name, Id, pass);
                new LoginAdminGUI().menuAdmin();
                frame.dispose();
            }

        });
    }

    public void read()
    {
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogAdm.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("backbtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0,0,400,80);
        label =new JLabel("DATA STAFF");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD,24));
        label.setBounds(120,30,285,24);
        tabel.setModel(AllObjController.Akun.listStaff());
        scrollPane = new JScrollPane(tabel);
        scrollPane.setBackground(Color.WHITE);
        scrollPane.setBounds(0,81,390,495);
        backbtn = new JButton(img1);
        backbtn.setBackground(new Color(238,238,238));
        backbtn.setBorder(new LineBorder(new Color(238,238,238)));
        backbtn.setBounds(147,488,110,70);

        frame.add(label);
        frame.add(rect);
        frame.add(backbtn);
        frame.add(scrollPane);
        frame.setVisible(true);

        backbtn.addActionListener((e)->{
            new LoginAdminGUI().menuAdmin();
            frame.dispose();
        });
    }

    public void update()
    {
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogAdm.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("lihatdata.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("okBtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0,0,400,80);
        label =new JLabel("UBAH AKUN STAFF");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD,24));
        label.setBounds(80,30,241,24);
        indx = new JLabel("Nomor yang akan diubah");
        indx.setBounds(108,112,184,14);
        index = new JTextField();
        index.setBackground(new Color(217,217,217));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setBounds(34,132,332,28);
        n = new JLabel("Nama Baru Staff");
        n.setBounds(141,177,119,14);
        nama = new JTextField();
        nama.setBackground(new Color(217,217,217));
        nama.setHorizontalAlignment(JLabel.CENTER);
        nama.setBounds(34,197,332,28);
        i = new JLabel("ID Baru Staff");
        i.setBounds(154,239,92,14);
        id = new JTextField();
        id.setBackground(new Color(217,217,217));
        id.setHorizontalAlignment(JLabel.CENTER);
        id.setBounds(34,270,332,28);
        p = new JLabel("Password Baru Staff");
        p.setBounds(127,315,146,14);
        pw = new JTextField();
        pw.setBackground(new Color(217,217,217));
        pw.setHorizontalAlignment(JLabel.CENTER);
        pw.setBounds(34,343,332,28);
        look = new JButton(img1);
        look.setBackground(Color.WHITE);
        look.setBorder(new LineBorder(Color.WHITE));
        look.setBounds(134,413,134,36);
        okbtn = new JButton(img2);
        okbtn.setBackground(Color.WHITE);
        okbtn.setBorder(new LineBorder(Color.WHITE));
        okbtn.setBounds(171,481,57,36);

        frame.add(label);
        frame.add(rect);
        frame.add(indx);
        frame.add(index);
        frame.add(n);
        frame.add(nama);
        frame.add(i);
        frame.add(id);
        frame.add(p);
        frame.add(pw);
        frame.add(look);
        frame.add(okbtn);
        frame.setVisible(true);

        look.addActionListener((e)->{
            new MenuAdminGUI().read();
            frame.dispose();
        });

        okbtn.addActionListener((e)->{
            int ind = Integer.parseInt(index.getText());
            String name = nama.getText();
            String Id = id.getText();
            String pass = pw.getText();
            if(index.getText().isBlank() || name.isBlank() || Id.isBlank() || pass.isBlank() )
            {
                JOptionPane.showMessageDialog(null,"Field Tidak Boleh Kosong","Notification",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                AllObjController.Akun.create(name, Id, pass);
                new LoginAdminGUI().menuAdmin();
                frame.dispose();
            }
            AllObjController.Akun.update(ind-1,name, Id, pass);
            new LoginAdminGUI().menuAdmin();
            frame.dispose();
        });
    }

    public void delete()
    {
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogAdm.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("lihatdata.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("okBtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0,0,400,80);
        label =new JLabel("HAPUS AKUN STAFF");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD,24));
        label.setBounds(80,30,241,24);
        indx= new JLabel("Nomor yang akan dihapus");
        indx.setBounds(105,239,188,14);
        index = new JTextField();
        index.setBackground(new Color(217,217,217));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setBounds(34,270,332,28);
        look = new JButton(img1);
        look.setBackground(Color.WHITE);
        look.setBorder(new LineBorder(Color.WHITE));
        look.setBounds(134,413,134,36);
        okbtn = new JButton(img2);
        okbtn.setBackground(Color.WHITE);
        okbtn.setBorder(new LineBorder(Color.WHITE));
        okbtn.setBounds(171,481,57,36);

        frame.add(label);
        frame.add(rect);
        frame.add(indx);
        frame.add(index);
        frame.add(look);
        frame.add(okbtn);
        frame.setVisible(true);

        look.addActionListener((e)->{
            new MenuAdminGUI().read();
            frame.dispose();
        });

        okbtn.addActionListener((e)->{
            int ind = Integer.parseInt(index.getText());
            if(index.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Field Tidak Boleh Kosong","Notification",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                AllObjController.Akun.delete(ind-1);
                new LoginAdminGUI().menuAdmin();
                frame.dispose();
            }

        });
    }
}
