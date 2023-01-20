package View;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MenuStaffGUI {
    JFrame frame = new JFrame();
    JLabel label, rect, n, t, h,indx;
    JTextField nama, tipe, harga,index;
    JButton okbtn,backbtn,look;
    JTable tabel = new JTable();
    JScrollPane scrollPane;

    public void create() {
        frame.setSize(400, 600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogStaff.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("okBtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0, 0, 400, 80);
        label = new JLabel("TAMBAH DATA OBAT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD, 24));
        label.setBounds(58, 30, 285, 24);
        n = new JLabel("NAMA OBAT");
        n.setBounds(160, 175, 88, 14);
        nama = new JTextField();
        nama.setBackground(new Color(217, 217, 217));
        nama.setHorizontalAlignment(JLabel.CENTER);
        nama.setBounds(59, 197, 281, 31);
        t = new JLabel("TIPE OBAT");
        t.setBounds(165,242,71,14);
        tipe = new JTextField();
        tipe.setBackground(new Color(217, 217, 217));
        tipe.setHorizontalAlignment(JLabel.CENTER);
        tipe.setBounds(60, 269, 281, 31);
        h = new JLabel("HARGA OBAT");
        h.setBounds(155,314,90,14);
        harga = new JTextField();
        harga.setBackground(new Color(217, 217, 217));
        harga.setHorizontalAlignment(JLabel.CENTER);
        harga.setBounds(60, 341, 281, 31);
        okbtn = new JButton(img1);
        okbtn.setBackground(Color.WHITE);
        okbtn.setBorder(new LineBorder(Color.WHITE));
        okbtn.setBounds(172, 413, 57, 36);

        frame.add(label);
        frame.add(rect);
        frame.add(n);
        frame.add(nama);
        frame.add(t);
        frame.add(tipe);
        frame.add(h);
        frame.add(harga);
        frame.add(okbtn);
        frame.setVisible(true);

        okbtn.addActionListener((e)->{
            String name = nama.getText();
            String type = tipe.getText();
            Double price = Double.valueOf(harga.getText());
            if(name.isBlank() || type.isBlank() || harga.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Field Tidak Boleh Kosong","Notification",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                AllObjController.Obat.create(name,type,price);
                new LoginStaffGUI().menuStaff();
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
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogStaff.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("backbtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0,0,400,80);
        label =new JLabel("DATA OBAT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD,24));
        label.setBounds(120,30,285,24);
        tabel.setModel(AllObjController.Obat.listObat());
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
            new LoginStaffGUI().menuStaff();
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
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogStaff.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("lihatObat.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("okBtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0,0,400,80);
        label =new JLabel("UBAH DATA OBAT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Dialog", Font.BOLD,24));
        label.setBounds(80,30,241,24);
        indx = new JLabel("Nomor yang akan diubah");
        indx.setBounds(108,112,184,14);
        index = new JTextField();
        index.setBackground(new Color(217,217,217));
        index.setHorizontalAlignment(JLabel.CENTER);
        index.setBounds(34,132,332,28);
        n = new JLabel("Nama Obat Baru");
        n.setBounds(141,177,119,14);
        nama = new JTextField();
        nama.setBackground(new Color(217,217,217));
        nama.setHorizontalAlignment(JLabel.CENTER);
        nama.setBounds(34,197,332,28);
        t = new JLabel("Tipe Obat Baru");
        t.setBounds(154,239,92,14);
        tipe = new JTextField();
        tipe.setBackground(new Color(217,217,217));
        tipe.setHorizontalAlignment(JLabel.CENTER);
        tipe.setBounds(34,270,332,28);
        h = new JLabel("Harga Obat Baru");
        h.setBounds(127,315,146,14);
        harga = new JTextField();
        harga.setBackground(new Color(217,217,217));
        harga.setHorizontalAlignment(JLabel.CENTER);
        harga.setBounds(34,343,332,28);
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
        frame.add(t);
        frame.add(tipe);
        frame.add(h);
        frame.add(harga);
        frame.add(look);
        frame.add(okbtn);
        frame.setVisible(true);

        look.addActionListener((e)->{
            new MenuStaffGUI().read();
            frame.dispose();
        });

        okbtn.addActionListener((e)->{
            String name = nama.getText();
            String type = tipe.getText();
            Double price = Double.valueOf(harga.getText());
            int ind = Integer.parseInt(index.getText());
            if(index.getText().isBlank() || name.isBlank() || type.isBlank() || harga.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Field Tidak Boleh Kosong","Notification",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                AllObjController.Obat.create(name,type,price);
                new LoginStaffGUI().menuStaff();
                frame.dispose();
            }
        });
    }

    public void delete()
    {
        frame.setSize(400,600);
        frame.setTitle("Project TA Apotek");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("logo.jpg"));
        ImageIcon img0 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("rectLogStaff.png"));
        ImageIcon img1 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("lihatObat.png"));
        ImageIcon img2 = new ImageIcon(LoginAdminGUI.class.getClassLoader().getResource("okBtn.png"));
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        rect = new JLabel(img0);
        rect.setBounds(0,0,400,80);
        label =new JLabel("HAPUS DATA OBAT");
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
            new MenuStaffGUI().read();
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
                AllObjController.Obat.delete(ind-1);
                new LoginStaffGUI().menuStaff();
                frame.dispose();
            }
        });
    }

}
