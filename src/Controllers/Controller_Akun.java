package Controllers;
import Entity.entity_akun;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Controller_Akun
{
    private final String id_super = "Havidz";
    private final String pw_super = "0000";
    public ArrayList<entity_akun> getArrlistAkun (){return AllObjModels.Akun.getAkunArrlst();};
    public Controller_Akun()
    {

    }
    public void create(String nama, String id, String pw)
    {
        AllObjModels.Akun.create(new entity_akun(nama, id, pw));
    }
    public void update(int index,String nama, String id, String pw)
    {
        AllObjModels.Akun.update(index, new entity_akun(nama,id,pw));
    }
    public void delete(int index)
    {
        AllObjModels.Akun.delete(index);
    }
    public int getSize(){return AllObjModels.Akun.ArrSizeAkun();};

    public Boolean cekLogAdmin(String id, String pw)
    {
        if(id.equals(getId_super()) && pw.equals(getPw_super())){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean cekLogStaff(String id, String pw)
    {
        for(int i=0; i<AllObjModels.Akun.ArrSizeAkun();i++)
        {
            if(id.equals(AllObjModels.Akun.getAkunArrlst().get(i).getId()) &&
                    pw.equals(AllObjModels.Akun.getAkunArrlst().get(i).getPw()))
            {
                return true;
            }
            else {
                return false;
            }
        }
        return cekLogAdmin(id,pw);
    }

    public String getId_super() {
        return id_super;
    }

    public String getPw_super() {
        return pw_super;
    }

    public DefaultTableModel listStaff ()
    {
        DefaultTableModel staff = new DefaultTableModel();
        String kolom[]= {"No","Nama","ID","Password"};
        staff.setColumnIdentifiers(kolom);

        for(int i = 0; i<AllObjModels.Akun.ArrSizeAkun();i++)
        {
            String[] data = new String[4];
            data[0] = String.valueOf(i+1);
            data[1] = AllObjModels.Akun.getAkunArrlst().get(i).getNama();
            data[2] = AllObjModels.Akun.getAkunArrlst().get(i).getId();
            data[3] = AllObjModels.Akun.getAkunArrlst().get(i).getPw();
            staff.addRow(data);
        }
        return staff;
    }
}
