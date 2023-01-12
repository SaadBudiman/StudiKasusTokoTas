package controller;

import java.util.ArrayList;

import Entity.AdminEntity;

public class Controller_Admin {

    public ArrayList<AdminEntity> viewData() {
        return AllObjekController.adminModel.getDatabaseAdmin();
    }

    public void create(String nama, String alamat, String username, String password) {
        AllObjekController.adminModel.InsertAdmin(new AdminEntity(nama, alamat, username, password));
    }

    public void update(int index, String nama, String alamat, String username, String password) {
        AllObjekController.adminModel.update(index, nama, alamat, username, password);
    }

    public void delete(int index) {
        AllObjekController.adminModel.delete(index);
    }

    public ArrayList<AdminEntity> getDataAdmin(){
        return AllObjekController.adminModel.getDatabaseAdmin();
    }


}
