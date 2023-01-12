package controller;
import Entity.TasEntity;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class Controller_Tas {
    int index = 0;

    public ArrayList<TasEntity> viewTas() {
        return AllObjekController.tasModel.getDataTas();
    }

    public void insert(String merk, String warna) {
        AllObjekController.tasModel.insert(new TasEntity(merk, warna));
    }

    public TasEntity tasModelEntity() {
        return AllObjekController.tasModel.getTasArrayList(index);
    }

    public void hapus(int index) {
        AllObjekController.tasModel.hapus(index);
    }

    public void update(int index, TasEntity tas) {
        AllObjekController.tasModel.update(index, tas);
    }

    public void view() {
        AllObjekController.tasModel.output();
    }

    public DefaultTableModel daftarTas() {
        DefaultTableModel dtmdaftarTas = new DefaultTableModel();
        Object[] kolom = { "index", "Merk Tas", "Warna Tas" };
        dtmdaftarTas.setColumnIdentifiers(kolom);
        int size = AllObjekController.tasModel.getDataTas().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[5];
            data[0] = i;
            data[1] = AllObjekController.tasModel.getDataTas().get(i).getMerk();
            data[2] = AllObjekController.tasModel.getDataTas().get(i).getWarna();
            dtmdaftarTas.addRow(data);
        }
        return dtmdaftarTas;
    }
}
