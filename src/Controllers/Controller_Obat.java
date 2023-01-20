package Controllers;
import Entity.entity_obat;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Controller_Obat
{
    public ArrayList<entity_obat> getArrlistObat() { return AllObjModels.Obat.getObatArrlist(); }
    public Controller_Obat()
    {

    }
    public void create(String namaobat, String tipeobat, Double hargaobat)
    {
        AllObjModels.Obat.create(new entity_obat(namaobat, tipeobat, hargaobat));
    }
    public void update(int index, String namaobat, String tipeobat, Double hargaobat)
    {
        AllObjModels.Obat.update(index,new entity_obat(namaobat,tipeobat, hargaobat));
    }
    public void delete(int index)
    {
        AllObjModels.Obat.delete(index);
    }
    public int getSize()
    {
        return AllObjModels.Obat.ArrsizeObat();
    }

    public DefaultTableModel listObat ()
    {
        DefaultTableModel obat = new DefaultTableModel();
        String kolom[]= {"No","Nama Obat","Tipe Obat","Harga"};
        obat.setColumnIdentifiers(kolom);

        for(int i = 0; i<AllObjModels.Obat.ArrsizeObat();i++)
        {
            String[] data = new String[4];
            data[0] = String.valueOf(i+1);
            data[1] = AllObjModels.Obat.getObatArrlist().get(i).getNama();
            data[2] = AllObjModels.Obat.getObatArrlist().get(i).getTipe();
            data[3] = String.valueOf(AllObjModels.Obat.getObatArrlist().get(i).getHarga());

            obat.addRow(data);
        }
        return obat;
    }
}
