package View;
import Controllers.*;
import Utils.Utils;

import java.util.Scanner;

public class CLI
{
    private Controller_Obat Obat = new Controller_Obat();
    private Controller_Akun Akun =new Controller_Akun();
    private static Boolean isExit = false;
    Scanner input = new Scanner(System.in);
    private static CLI cli = new CLI();
    public void exe()
    {
        int pilihan;
        do
        {
            System.out.println("1. Login Super Admin");
            System.out.println("2. Login Staff");
            System.out.println("3. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = Integer.parseInt(input.nextLine());
            switch (pilihan)
            {
                case 1->loginSuperAdmin();
                case 2->loginStaff();
                case 3->{System.out.println("Exit program...");
                isExit = true;}
                default -> {
                    System.out.println("Input tidak tepat, silahkan memilih ulang");
                }
            }
        }while (pilihan!=3 && !isExit);
    }
    protected void loginSuperAdmin()
    {
        String id, pw;
        System.out.println("\tLogin Super Admin");
        System.out.println("============================");
        System.out.print("Masukkan Username : ");
        id = input.nextLine();
        System.out.print("Masukkan Password : ");
        pw = input.nextLine();

        if(Akun.cekLogAdmin(id,pw))
        {
            menuAkun();
        }
        else {
            System.out.println("Login Gagal :(");
            System.out.println("Silahkan cek ID atau Password Anda");
            cli.exe();
        }
    }
    protected void loginStaff()
    {
        String id, pw;
        System.out.println("\t\tLogin Staff");
        System.out.println("============================");
        System.out.print("Masukkan Username : ");
        id = input.nextLine();
        System.out.print("Masukkan Password : ");
        pw = input.nextLine();
        if(Akun.cekLogStaff(id,pw))
        {
            menuObat();
        }
        else{
            System.out.println("Login Gagal :(");
            System.out.println("Silahkan cek ID atau Password Anda");
            cli.exe();
        }
    }
    protected void menuObat()
    {
        int pilihan;
        do {
            System.out.println("=======================");
            System.out.println("1.Tambah Data Obat");
            System.out.println("2.Tampilkan Data Obat");
            System.out.println("3.Ubah Data Obat");
            System.out.println("4.Hapus Data Obat");
            System.out.println("5.Logout");
            System.out.println("6.Exit Program");
            System.out.print("Pilihan anda : ");
            pilihan = Integer.parseInt(input.nextLine());
            switch (pilihan)
            {
                case 1 -> createObat();
                case 2 -> readObat();
                case 3 -> updateObat();
                case 4 -> deleteObat();
                case 5 -> {
                    System.out.println("Anda Logout");
                    cli.exe();
                }
                case 6 -> {
                    System.out.println("Exit program...");
                    isExit = true;
                }

                default -> System.out.println("Input anda kurang tepat");
            }
        }
        while(pilihan!=5 && pilihan!=6);
    }
    protected void menuAkun()
    {
        int pilihan;
        do {
            System.out.println("=======================");
            System.out.println("1.Tambah Data Staff");
            System.out.println("2.Tampilkan Data Staff");
            System.out.println("3.Ubah Data Staff");
            System.out.println("4.Hapus Data Staff");
            System.out.println("5.Logout");
            System.out.println("6.Exit Program");
            System.out.print("Pilihan anda : ");
            pilihan = Integer.parseInt(input.nextLine());
            switch (pilihan)
            {
                case 1 -> createAkun();
                case 2 -> readAkun();
                case 3 -> updateAkun();
                case 4 -> deleteAkun();
                case 5 -> {
                    System.out.println("Anda Logout");
                    cli.exe();
                }
                case 6 -> {
                    System.out.println("Exit program...");
                    isExit = true;
                }

                default -> System.out.println("Input anda kurang tepat");
            }
        }
        while(pilihan!=5 && pilihan!=6);
    }
    protected void createObat()
    {
        System.out.print("Nama Obat  : ");
        String nama = input.nextLine();
        System.out.print("Tipe Obat  : ");
        String tipe = input.nextLine();
        String inputharga;
        do
        {
            System.out.print("Harga Obat : ");
        }while (!Utils.cekInput(inputharga = input.nextLine()));
        Double harga = Double.valueOf(inputharga);
        Obat.create(nama,tipe,harga);
        System.out.println("Obat berhasil ditambahkan!");
    }
    protected void readObat()
    {
        if(AllObjController.Obat.getArrlistObat().isEmpty())
        {
            System.out.println("Data Obat Kosong!");
        }
        else
        {
            System.out.println("--------------------------------");
            for(int i =0; i< Obat.getSize(); i++)
            {
                System.out.println("\t\tData obat ke -"+(i+1));
                System.out.println("--------------------------------");
                System.out.println("Nama Obat : "+Obat.getArrlistObat().get(i).getNama());
                System.out.println("Tipe Obat : "+Obat.getArrlistObat().get(i).getTipe());
                System.out.println("Tipe Obat : "+Obat.getArrlistObat().get(i).getHarga());
                System.out.println("--------------------------------");
            }
        }
    }
    protected void updateObat()
    {
        readObat();
        System.out.print("Masukkan nomor yang dipilih : ");
        int index = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Nama Obat yang baru  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tipe Obat yang baru  : ");
        String tipe = input.nextLine();
        String inputharga;
        do
        { System.out.print("Harga Obat : "); }
        while (!Utils.cekInput(inputharga = input.nextLine()));
        Double harga = Double.valueOf(inputharga);
        Obat.update(index-1,nama,tipe,harga);
        System.out.println("Data Obat berhasil di Update!");

    }
    protected void deleteObat()
    {
        readObat();
        System.out.print("Masukkan nomor yang dihapus : ");
        int index = Integer.parseInt(input.nextLine());
        Obat.delete(index-1);
        System.out.println("Data Obat berhasil dihapus!");
    }

    protected void createAkun()
    {
        System.out.print("Masukkan Nama     : ");
        String nama = input.nextLine();
        System.out.print("Masukkan ID       : ");
        String id = input.nextLine();
        System.out.print("Masukkan Password : ");
        String pw = input.nextLine();
        Akun.create(nama,id,pw);
        System.out.println("Data Staff berhasil ditambahkan!");
    }
    protected void readAkun()
    {
        if(AllObjController.Akun.getArrlistAkun().isEmpty())
        {
            System.out.println("Data Staff Kosong!");
        }
        else
        {
            System.out.println("--------------------------------");
            for(int i =0; i< Akun.getSize(); i++)
            {
                System.out.println("\t\tData obat ke -"+(i+1));
                System.out.println("--------------------------------");
                System.out.println("Nama Staff     : "+Akun.getArrlistAkun().get(i).getNama());
                System.out.println("ID Staff       : "+Akun.getArrlistAkun().get(i).getId());
                System.out.println("Password Staff : "+Akun.getArrlistAkun().get(i).getPw());
                System.out.println("--------------------------------");
            }
        }
    }
    protected void updateAkun()
    {
        readObat();
        System.out.print("Masukkan nomor yang dipilih : ");
        int index = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan Nama Obat yang baru  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tipe Obat yang baru  : ");
        String id = input.nextLine();
        System.out.print("Masukkan Harga Obat yang baru : ");
        String pw = input.nextLine();
        Akun.update(index-1,nama,id,pw);
        System.out.println("Data Staff berhasil di Update!");
    }
    protected void deleteAkun()
    {
        readAkun();
        System.out.print("Masukkan nomor yang dihapus : ");
        int index = Integer.parseInt(input.nextLine());
        Akun.delete(index-1);
        System.out.println("Data Staff berhasil dihapus!");
    }
}