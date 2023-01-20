package Models;
import Entity.entity_obat;
public interface models_interface
{
    public void create(entity_obat entity_obat);
    public void read();
    public void update(int index, entity_obat entity_obat);
    public void delete (int index);
}
