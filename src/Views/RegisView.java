package Views;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisView {
    JFrame Registrasi = new JFrame();
    JLabel usernameLbl, passwordLbl, namaLbl, alamatLbl, usrLogin, pwLogin, UtamaLbl;
    JTextField usernameTxt, namaTxt, alamatTxt, usrLoginTxt;
    JPasswordField passwordTxt, pwLoginTxt;
    JButton loginbtn, regisbtn;

    public RegisView() {
        Registrasi.setTitle("Menu Utama"); // set judul frame
        Registrasi.setSize(900, 700); // set ukuran
        Registrasi.setLayout(null);
        // Registrasi.setResizable(false);
        Registrasi.getContentPane().setBackground(new Color(113, 223, 32)); // memberi warna

        UtamaLbl = new JLabel("DATA ADMIN");
        UtamaLbl.setBackground(new Color(32, 198, 223));
        UtamaLbl.setFont(new Font("Calibri", Font.BOLD, 30));
        UtamaLbl.setBounds(350, 100, 200, 30);
        Registrasi.add(UtamaLbl);

        usernameLbl = new JLabel("Username");
        usernameLbl.setBackground(new Color(32, 198, 223));
        usernameLbl.setFont(new Font("Calibri", Font.BOLD, 25));
        usernameLbl.setBounds(600, 180, 200, 30);
        Registrasi.add(usernameLbl);

        usernameTxt = new JTextField();
        usernameTxt.setBounds(600, 210, 120, 30);
        Registrasi.add(usernameTxt);

        passwordLbl = new JLabel("Password");
        passwordLbl.setBackground(new Color(32, 198, 223));
        passwordLbl.setFont(new Font("Calibri", Font.BOLD, 25));
        passwordLbl.setBounds(600, 250, 200, 30);
        Registrasi.add(passwordLbl);

        passwordTxt = new JPasswordField();
        passwordTxt.setBounds(600, 280, 120, 30);
        Registrasi.add(passwordTxt);

        namaLbl = new JLabel("Nama");
        namaLbl.setBackground(new Color(32, 198, 223));
        namaLbl.setFont(new Font("Calibri", Font.BOLD, 25));
        namaLbl.setBounds(600, 320, 200, 30);
        Registrasi.add(namaLbl);

        namaTxt = new JTextField();
        namaTxt.setBounds(600, 350, 120, 30);
        Registrasi.add(namaTxt);

        alamatLbl = new JLabel("Alamat");
        alamatLbl.setBackground(new Color(32, 198, 223));
        alamatLbl.setFont(new Font("Calibri", Font.BOLD, 25));
        alamatLbl.setBounds(600, 390, 200, 30);
        Registrasi.add(alamatLbl);

        alamatTxt = new JTextField();
        alamatTxt.setBounds(600, 420, 120, 30);
        Registrasi.add(alamatTxt);

        loginbtn = new JButton("LOGIN");
        loginbtn.setBounds(200, 320, 100, 30);
        Registrasi.add(loginbtn);

        regisbtn = new JButton("REGISTRASI");
        regisbtn.setBounds(600, 460, 110, 30);
        Registrasi.add(regisbtn);

        // Login Page
        usrLogin = new JLabel("Username");
        usrLogin.setBackground(new Color(32, 198, 223));
        usrLogin.setFont(new Font("Calibri", Font.BOLD, 25));
        usrLogin.setBounds(200, 180, 200, 30);
        Registrasi.add(usrLogin);
        usrLoginTxt = new JTextField();
        usrLoginTxt.setBounds(200, 210, 120, 30);
        Registrasi.add(usrLoginTxt);

        pwLogin = new JLabel("Password");
        pwLogin.setBackground(new Color(32, 198, 223));
        pwLogin.setFont(new Font("Calibri", Font.BOLD, 25));
        pwLogin.setBounds(200, 250, 200, 30);
        Registrasi.add(pwLogin);
        pwLoginTxt = new JPasswordField();
        pwLoginTxt.setBounds(200, 280, 120, 30);
        Registrasi.add(pwLoginTxt);

        Registrasi.setVisible(true); // melihat frame
        Registrasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // diclose tanpa klik stop
        Registrasi.setLocationRelativeTo(null); // set ke tengah

        regisbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String username = usernameTxt.getText();
                    String password = passwordTxt.getText();
                    String nama = namaTxt.getText();
                    String alamat = alamatTxt.getText();
                    AllObjectControllerView.CtrlAdmin.create(nama, alamat, username, password);
                    JOptionPane.showMessageDialog(null, "Registrasi Berhasil", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Format penulisan salan ", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (AllObjectControllerView.CtrlAdmin.getDataAdmin().isEmpty() == true) {
                        JOptionPane.showMessageDialog(null, "Data Kosong", "Informasi",
                                JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    } else {
                        int loop1 = 0;
                        boolean tf = false;
                        for (int i = 0; i < AllObjectControllerView.CtrlAdmin.getDataAdmin().size(); i++) {
                            if (usrLoginTxt.getText()
                                    .equals(AllObjectControllerView.CtrlAdmin.getDataAdmin().get(i).getUsername()) &&
                                    pwLoginTxt.getText().equals(
                                            AllObjectControllerView.CtrlAdmin.getDataAdmin().get(i).getPassword())) {
                                JOptionPane.showMessageDialog(null, "Login Berhasil", "Informasi",
                                        JOptionPane.INFORMATION_MESSAGE);
                                kosong();
                                TasView ts = new TasView();
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Login Gagal", "Informasi",
                                        JOptionPane.INFORMATION_MESSAGE);
                                kosong();
                                loop1++;
                            }
                        }
                    }

                    // if (AllObjectControllerView.CtrlTas.viewTas().isEmpty() == true) {
                    // JOptionPane.showMessageDialog(null, "Data Kosong", "Informasi",
                    // JOptionPane.INFORMATION_MESSAGE);
                    // kosong();
                    // } else {
                    // TasView ts = new TasView();
                    // JOptionPane.showMessageDialog(null, "Login Berhasil", "Informasi",
                    // JOptionPane.INFORMATION_MESSAGE);

                    // kosong();
                    // }
                } catch (Exception exc) {
                    JOptionPane.showMessageDialog(null, "Format penulisan salan ", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });

        Registrasi.setVisible(true); // melihat frame
        Registrasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // diclose tanpa klik stop
        Registrasi.setLocationRelativeTo(null); // set ke tengah
    }

    void kosong() {
        passwordTxt.setText(null);
        usernameTxt.setText(null);
        namaTxt.setText(null);
        alamatTxt.setText(null);
        usrLoginTxt.setText(null);
        pwLoginTxt.setText(null);
    }

}
