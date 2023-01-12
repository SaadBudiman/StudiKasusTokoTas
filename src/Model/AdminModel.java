package Model;

import Entity.AdminEntity;
import java.util.ArrayList;

public class AdminModel implements InterfaceModel {
    
    AdminEntity adm = new AdminEntity("Sandi", "Surabaya", "saad", "123");

    ArrayList<AdminEntity> DatabaseAdmin = new ArrayList<>();

    //input data
    public void InsertAdmin(AdminEntity admin) {
        DatabaseAdmin.add(admin);
    }

    public ArrayList<AdminEntity> getDatabaseAdmin(){
        return DatabaseAdmin;
    }
    //output data
    @Override
    public void output() {
        System.out.println("+------------------------------------------+");
        for (int i = 0; i < DatabaseAdmin.size(); i++) {
            System.out.println("Index     : "+i);
            System.out.println("Nama      : " + adm.getNama());
            System.out.println("Alamat    : " + adm.getAlamat());
            System.out.println("Username  : " + adm.getUsername());
            System.out.println("Passwword : " + adm.getPassword());
        }
        System.out.println("+------------------------------------------+");
    }

    //hapus data
    public void delete(int index) {
        DatabaseAdmin.remove(index);
    }

    //update data
    public void update(int index, String nama, String alamat, String Username, String password) {
        DatabaseAdmin.set(index, new AdminEntity(nama, alamat, Username, password));
    }

    //2
    public int cekData(String username, String passwordAdmin) {
        int loop = 0;
        for (AdminEntity AdminE : DatabaseAdmin) {
            if (AdminE.getUsername().equals(username) && AdminE.getPassword().equals(passwordAdmin)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public AdminEntity showDataAdmin(int index) {
        return DatabaseAdmin.get(index);
    }
}
