package Models;
import Entity.entity_obat;
import java.util.ArrayList;

public class models_obat implements models_interface
{
    private ArrayList<entity_obat> ObatArrlist;
    public models_obat()
    {
        ObatArrlist = new ArrayList<>();
    }
    public void create(entity_obat entity_obat)
    {
        ObatArrlist.add(entity_obat);
    }
    public void read()
    {

    }
    public void update(int index, entity_obat entity_obat)
    {
        ObatArrlist.set(index,entity_obat);
    }
    public void delete(int index)
    {
        ObatArrlist.remove(index);
    }
    public ArrayList<entity_obat> getObatArrlist() {
        return ObatArrlist;
    }
    public int ArrsizeObat()
    {
        return ObatArrlist.size();
    }

}
