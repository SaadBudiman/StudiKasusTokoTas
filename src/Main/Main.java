package Main;

import Views.RegisView;
// import Views.TasView;
// import controller.Controller_Admin;
// import controller.Controller_Tas;
// import java.util.Scanner;

public class Main {

    // public Controller_Tas Ctas = new Controller_Tas();
    // public Controller_Admin CAdmin = new Controller_Admin();
    // Scanner input = new Scanner(System.in);
    // static public Main INPO = new Main();

    public static void main(String[] args) {
//        INPO.MenuCLI();
       RegisView tst = new RegisView();
    //    TasView ts = new TasView();
    }

    // public void MenuCLI() {
    //     int pilihan;
    //     do {
    //         System.out.println("===========================================");
    //         System.out.println("|           Toko Tas Budiman              |");
    //         System.out.println("===========================================");
    //         System.out.println("1. Registrasi Admin");
    //         System.out.println("2. Login Admin");
    //         System.out.println("3. Keluar ");
    //         System.out.print("Masukkan pilihan : ");
    //         pilihan = input.nextInt();
    //         switch (pilihan) {
    //             case 1:
    //                 INPO.menuRegisterData();
    //                 break;
    //             case 2:
    //                 INPO.menuLogin();
    //                 break;
    //             case 3:
    //                 System.exit(0);
    //                 break;
    //             default:
    //                 System.out.println("Pilihan Salah");
    //                 break;
    //         }
    //     } while (pilihan != 0);

    // }

    // public void menuLogin() {
    //     System.out.println("\nLOGINNNN");
    //     System.out.print("Masukkan Username : ");
    //     String nama = input.next();
    //     System.out.print("Masukkan Password : ");
    //     String password = input.next();
    //     INPO.login(nama, password);
    // }

    // public void menuRegisterData() {
    //     INPO.InsertAdmin();
    // }

    // public void menuUtama() {
    //     int pil;
    //     while (true) {
    //         do {
    //             System.out.println("===========================================");
    //             System.out.println("|           Toko Tas Budiman              |");
    //             System.out.println("===========================================");
    //             System.out.println("1. Input data barang  ");
    //             System.out.println("2. Ouput data barang  ");
    //             System.out.println("3. Hapus data barang  ");
    //             System.out.println("4. Update data barang ");
    //             System.out.println("------------------------");
    //             System.out.println("5. Output data Admin  ");
    //             System.out.println("6. Hapus data Admin  ");
    //             System.out.println("7. Update data Admin ");
    //             System.out.println("0. Keluar ");
    //             System.out.print("Masukan Pilihan : ");
    //             pil = input.nextInt();
    //             switch (pil) {
    //                 case 1:
    //                     INPO.InsertTas();
    //                     break;
    //                 case 2:
    //                     INPO.ReadTas();
    //                     break;
    //                 case 3:
    //                     INPO.DeleteTas();;
    //                     break;
    //                 case 4:
    //                     INPO.UpdateTas();
    //                     break;
    //                 case 5:
    //                     INPO.Tampildata();
    //                     break;
    //                 case 6:
    //                     INPO.DeleteAdmin();
    //                     break;
    //                 case 7:
    //                     INPO.UpdateAdmin();
    //                     break;
    //                 case 0:
    //                     INPO.MenuCLI();
    //                     break;
    //                 default:
    //                     System.out.println("Maaf pilihan Anda salah ");
    //                     break;
    //             }
    //         } while (pil != 0);
    //     }
    // }

    // void login(String id, String password) {
    //     boolean cekLogin = false;
    //     int i;
    //     for (i = 0; i < CAdmin.viewData().size(); i++) {
    //         // mengecek pass & id
    //         try {
    //             if (id.equals(CAdmin.viewData().get(i).getUsername()) &&
    //                     password.equals(CAdmin.viewData().get(i).getPassword())) {
    //                 cekLogin = true;
    //                 break;
    //             }
    //         } catch (Exception e) {
    //             cekLogin = false;
    //         }
    //     }
    //     if (cekLogin) {
    //         System.out.println(
    //                 "\n" + "Hallo " + CAdmin.viewData().get(i).getUsername() + " Selamat Datang di Perpustakaan!!");
    //         menuUtama();
    //     } else {
    //         System.out.println("Maaf Password atau ID SALAH!!");
    //         INPO.menuLogin();
    //     }
    // }

    // public void InsertAdmin() {
    //     System.out.println("\nREGISTER DATA");
    //     System.out.print("Masukkan Nama : ");
    //     String nama = input.next();
    //     System.out.print("Masukkan Alamat : ");
    //     String Alamat = input.next();
    //     System.out.print("Masukkan Username : ");
    //     String User = input.next();
    //     System.out.print("Masukkan Password : ");
    //     String Pw = input.next();
    //     CAdmin.create(nama, Alamat, User, Pw);
    // }

    // public void UpdateAdmin() {
    //     if (CAdmin.viewData().size() > 0) {
    //         System.out.println("\nUPDATE DATA");
    //         System.out.print("Masukkan Nama : ");
    //         String nama = input.next();
    //         System.out.print("Masukkan Alamat : ");
    //         String Alamat = input.next();
    //         System.out.print("Masukkan Username : ");
    //         String User = input.next();
    //         System.out.print("Masukkan Password : ");
    //         String Pw = input.next();
    //         System.out.print("Masukkan index : ");
    //         int index = input.nextInt();
    //         CAdmin.update(index, nama, Alamat, User, Pw);
    //     } else {
    //         System.out.println("Data kosong");
    //     }
    // }

    // public void DeleteAdmin() {
    //     if (CAdmin.viewData().size() > 0) {
    //         System.out.println("\nDELETE DATA");
    //         System.out.print("Masukkan index : ");
    //         int index = input.nextInt();
    //         CAdmin.delete(index);
    //     } else {
    //         System.out.println("Data kosong");
    //     }
    // }

    // public void Tampildata() {
    //     if (CAdmin.viewData().size() > 0) {
    //         for (int i = 0; i < CAdmin.viewData().size(); i++) {
    //             System.out.println("---");
    //             System.out.println("Index Admin : " + i);
    //             System.out.println("Nama : " + CAdmin.viewData().get(i).getNama());
    //             System.out.println("Alamat :" + CAdmin.viewData().get(i).getAlamat());
    //             System.out.println("Username : " + CAdmin.viewData().get(i).getUsername());
    //             System.out.println("Password: " + CAdmin.viewData().get(i).getPassword());
    //             System.out.println("---");
    //         }
    //     } else {
    //         System.out.println("Data kosong");
    //     }

    // }

    // public void InsertTas() {
    //     System.out.println("\nMasukan Data Tas");
    //     System.out.print("Masukkan MERK : ");
    //     String merk = input.next();
    //     System.out.print("Masukkan Warna : ");
    //     String warna = input.next();
    //     Ctas.insert(merk,warna);
    // }

    // public void UpdateTas() {
    //     if (Ctas.viewTas().size() > 0) {
    //         System.out.println("\nUPDATE DATA");
    //         System.out.print("Masukkan Merk : ");
    //         String merk = input.next();
    //         System.out.print("Masukkan Warna : ");
    //         String warna = input.next();
    //         System.out.print("Masukkan index : ");
    //         int index = input.nextInt();
    //         Ctas.update(index, merk, warna);
    //     } else {
    //         System.out.println("Data kosong");
    //     }
    // }

    // public void DeleteTas() {
    //     if (Ctas.viewTas().size() > 0) {
    //         System.out.println("\nDELETE DATA");
    //         System.out.print("Masukkan index : ");
    //         int index = input.nextInt();
    //         Ctas.hapus(index);
    //     } else {
    //         System.out.println("Data kosong");
    //     }
    // }

    // public void ReadTas() {
    //     if (Ctas.viewTas().size() > 0) {
    //         for (int i = 0; i < Ctas.viewTas().size(); i++) {
    //             System.out.println("---");
    //             System.out.println("Index Tas : " + i);
    //             System.out.println("MERK: " + Ctas.viewTas().get(i).getMerk());
    //             System.out.println("WARNA :" + Ctas.viewTas().get(i).getWarna());
    //             System.out.println("---");
    //         }
    //     } else {
    //         System.out.println("Data kosong");
    //     }
    // }

}
