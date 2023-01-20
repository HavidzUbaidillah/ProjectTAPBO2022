package Models;
import Entity.entity_akun;
import java.util.ArrayList;

public class models_akun
{
    private ArrayList<entity_akun> AkunArrlst;
    public models_akun(){AkunArrlst = new ArrayList<>();};
    public void create(entity_akun entity_akun)
    {
        AkunArrlst.add(entity_akun);
    }
    public void read()
    {

    }
    public void update(int index, entity_akun entity_akun)
    {
        AkunArrlst.set(index,entity_akun);
    }
    public void delete(int index)
    {
        AkunArrlst.remove(index);
    }
    public ArrayList<entity_akun> getAkunArrlst(){return AkunArrlst;};
    public int ArrSizeAkun(){return AkunArrlst.size();};

}
