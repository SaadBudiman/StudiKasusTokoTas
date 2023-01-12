package Model;

import Entity.TasEntity;
import java.util.ArrayList;

public class TasModel implements InterfaceModel {

    ArrayList<TasEntity> ArrayListTas;

    // composite
    public TasModel() {
        ArrayListTas = new ArrayList<>();
    }

    // ambil Data
    public ArrayList<TasEntity> getDataTas() {
        return ArrayListTas;
    }

    // input data
    public void insert(TasEntity tas) {
        ArrayListTas.add(tas);
    }

    // outputdata
    @Override
    public void output() {
    }

    // hapus data
    public void hapus(int a) {
        ArrayListTas.remove(a);
    }

    // update data
    public void update(int a, TasEntity tas) {
        ArrayListTas.set(a, tas);
    }

    public TasEntity getTasArrayList(int index) {
        return ArrayListTas.get(index);
    }
}
