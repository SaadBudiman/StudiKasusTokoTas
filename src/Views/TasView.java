package Views;

import javax.swing.*;

import Entity.TasEntity;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TasView {
    JFrame MenuTas = new JFrame();
    JLabel mrklbl, wrnlbl, mrkLblU, wrnLblU, indexLblU; // crd
    JLabel aditLbl, buatLbl; // upd
    JLabel indexLbl, dataLbl; // del
    JTextField mrkTxt, wrnTxt, indexTxt, mrkTxtU, wrnTxtU, indexDelTxt;
    JButton createBtn, updateBtn, hapusBtn, backButton;
    JTable tabelTas = new JTable();
    JScrollPane scrollTas = new JScrollPane(tabelTas);
    JTextArea area = new JTextArea();

    public TasView() {

        MenuTas.setTitle("Menu Tas"); // set judul frame
        MenuTas.setSize(900, 700); // set ukuran
        MenuTas.setLayout(null);
        MenuTas.setResizable(false);

        buatLbl = new JLabel("Buat Data");
        buatLbl.setBounds(50, 50, 150, 30);
        buatLbl.setFont(new Font("Calibri", Font.BOLD, 25));
        MenuTas.add(buatLbl);

        dataLbl = new JLabel("Data Tas");
        dataLbl.setBounds(300, 50, 150, 30);
        dataLbl.setFont(new Font("Calibri", Font.BOLD, 25));
        MenuTas.add(dataLbl);

        tabelTas.setModel(AllObjectControllerView.CtrlTas.daftarTas());
        scrollTas.setBounds(300, 100, 500, 200);
        MenuTas.add(scrollTas);

        mrklbl = new JLabel("Merek Tas");
        mrklbl.setBounds(50, 100, 140, 40);
        mrklbl.setFont(new Font("Calibri", Font.BOLD, 20));
        MenuTas.add(mrklbl);
        mrkTxt = new JTextField();
        mrkTxt.setBounds(50, 130, 100, 30);
        MenuTas.add(mrkTxt);

        wrnlbl = new JLabel("Warna Tas");
        wrnlbl.setBounds(50, 160, 140, 40);
        wrnlbl.setFont(new Font("Calibri", Font.BOLD, 20));
        MenuTas.add(wrnlbl);
        wrnTxt = new JTextField();
        wrnTxt.setBounds(50, 190, 100, 30);
        MenuTas.add(wrnTxt);

        createBtn = new JButton("Tambah");
        createBtn.setBounds(50, 240, 100, 30);
        MenuTas.add(createBtn);

        aditLbl = new JLabel("Update");
        aditLbl.setBounds(60, 300, 100, 30);
        aditLbl.setFont(new Font("Calibri", Font.BOLD, 20));
        MenuTas.add(aditLbl);

        indexLblU = new JLabel("Index");
        indexLblU.setBounds(50, 350, 100, 30);
        indexLblU.setFont(new Font("Calibri", Font.BOLD, 20));
        MenuTas.add(indexLblU);
        indexTxt = new JTextField();
        indexTxt.setBounds(50, 380, 100, 30);
        MenuTas.add(indexTxt);

        mrkLblU = new JLabel("Merek Tas");
        mrkLblU.setBounds(50, 410, 140, 30);
        mrkLblU.setFont(new Font("Calibri", Font.BOLD, 20));
        MenuTas.add(mrkLblU);
        mrkTxtU = new JTextField();
        mrkTxtU.setBounds(50, 440, 100, 30);
        MenuTas.add(mrkTxtU);

        wrnLblU = new JLabel("Warna Tas");
        wrnLblU.setBounds(50, 470, 140, 30);
        wrnLblU.setFont(new Font("Calibri", Font.BOLD, 20));
        MenuTas.add(wrnLblU);
        wrnTxtU = new JTextField();
        wrnTxtU.setBounds(50, 500, 100, 30);
        MenuTas.add(wrnTxtU);

        updateBtn = new JButton("Ganti");
        updateBtn.setBounds(50, 550, 100, 30);
        MenuTas.add(updateBtn);

        indexLbl = new JLabel("Index");
        indexLbl.setBounds(300, 350, 100, 30);
        indexLbl.setFont(new Font("Calibri", Font.BOLD, 20));
        MenuTas.add(indexLbl);
        indexDelTxt = new JTextField();
        indexDelTxt = new JTextField();
        indexDelTxt.setBounds(300, 380, 100, 30);
        MenuTas.add(indexDelTxt);

        hapusBtn = new JButton("Hapus");
        hapusBtn.setBounds(300, 430, 100, 30);
        MenuTas.add(hapusBtn);

        backButton = new JButton("Back");
        backButton.setBounds(300, 550, 100, 30);
        backButton.setBackground(Color.RED);
        MenuTas.add(backButton);

        String user = loginSbg();
        area.setText(user);
        area.setBounds(500, 400, 150, 100);
        MenuTas.add(area);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuTas.dispose();
                RegisView rgs = new RegisView();
                kosong();
            }
        });

        createBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String merek = mrkTxt.getText();
                    String warna = wrnTxt.getText();
                    AllObjectControllerView.CtrlTas.insert(merek, warna);
                    tabelTas.setModel(AllObjectControllerView.CtrlTas.daftarTas());
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Data Eror", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        hapusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (cekDataKosong()) {
                        JOptionPane.showMessageDialog(null, "Data Kosong", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        String ind = indexDelTxt.getText();
                        int i = Integer.parseInt(ind);
                        AllObjectControllerView.CtrlTas.hapus(i);
                        tabelTas.setModel(AllObjectControllerView.CtrlTas.daftarTas());
                        JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Data Eror karena " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (cekDataKosong()) {
                        JOptionPane.showMessageDialog(null, "Data Kosong", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        String merek = mrkTxtU.getText();
                        String warna = wrnTxtU.getText();
                        String ind = indexTxt.getText();
                        int i = Integer.parseInt(ind);
                        AllObjectControllerView.CtrlTas.update(i, new TasEntity(merek, warna));
                        tabelTas.setModel(AllObjectControllerView.CtrlTas.daftarTas());
                        JOptionPane.showMessageDialog(null, "Data Berhasil DiUpdate", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Data Eror karena " + exc, "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        MenuTas.getContentPane().setBackground(new Color(113, 223, 32)); // memberi warna
        MenuTas.setVisible(true); // melihat frame
        MenuTas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // diclose tanpa klik stop
        MenuTas.setLocationRelativeTo(null); // set ke tengah

    }

    void kosong() {
        mrkTxt.setText(null);
        wrnTxt.setText(null);
        indexTxt.setText(null);
        mrkTxtU.setText(null);
        wrnTxtU.setText(null);
        indexDelTxt.setText(null);
    }

    boolean cekDataKosong() {
        if (AllObjectControllerView.CtrlTas.viewTas().isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }

    public String loginSbg() {
        String text = "kosong";
        for (int i = 0; i < AllObjectControllerView.CtrlAdmin.getDataAdmin().size();) {
            text = "Username : " + AllObjectControllerView.CtrlAdmin.getDataAdmin().get(i).getUsername() +"\nAlamat : "
            +AllObjectControllerView.CtrlAdmin.getDataAdmin().get(i).getAlamat();
            break;
        }
        return text;
    }
}
