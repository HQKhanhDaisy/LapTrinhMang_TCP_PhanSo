/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ltm_giuaky;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;

/**
 *
 * @author khanhs
 */
public class Sever extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Sever
     */
    public Sever() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAdd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        btnChay = new javax.swing.JButton();
        jlbListen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        btnGiaiMa = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHienThi = new javax.swing.JTextPane();

        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("N18DCCN098_HuynhQuocKhanh");
        jLabel3.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SERVER");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Cổng kết nối:");

        txtPort.setText("8080");
        txtPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPortFocusLost(evt);
            }
        });
        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        btnChay.setBackground(new java.awt.Color(153, 255, 153));
        btnChay.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnChay.setText("Chạy server");
        btnChay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChayActionPerformed(evt);
            }
        });

        jlbListen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbListen.setForeground(new java.awt.Color(255, 0, 0));
        jlbListen.setText("Đang chờ...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPort)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlbListen, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChay)
                        .addGap(19, 19, 19))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChay)
                    .addComponent(jlbListen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Khoá:");

        txtKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeyActionPerformed(evt);
            }
        });

        btnGiaiMa.setBackground(new java.awt.Color(153, 255, 153));
        btnGiaiMa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGiaiMa.setText("Gửi");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGiaiMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGiaiMa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Các phân số có mẫu số là số nguyên tố:");

        txtHienThi.setEditable(false);
        jScrollPane2.setViewportView(txtHienThi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean isRunning = false;
    private boolean isCnn = false;
    int port = 8080;

    ServerSocket server = null;
    Socket clientA = null;
    DataInputStream din = null;
    DataOutputStream dout = null;
    String chuoiPS = null;
    String chuoiPSDinhDang = null;
    String daMaHoa = null;
    String daGiaiMa = null;
    String docFile = null;
    ArrayList<PhanSo> DSPhanSo = null;
    ArrayList<PhanSo> DSPhanSoNguyenTo = null;

    public boolean isIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public boolean getIsCnn() {
        return isCnn;
    }

    public void setIsCnn(boolean isCnn) {
        this.isCnn = isCnn;
    }
    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortActionPerformed

    private void btnChayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChayActionPerformed
        if (!isRunning) {
            try {
                port = Integer.parseInt(txtPort.getText());
                System.out.println("Nhap port: " + port);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Không thể bắt đầu với cổng bạn vừa nhập, chương trình sẽ sử dụng cổng mặc định 8080\nChi tiết: " + e,
                        "Lỗi khi đọc cổng", JOptionPane.ERROR_MESSAGE);
                txtPort.setText("8080");
            }
        }
        isRunning = !isRunning;
        try {
            //Hiểu nôm na là chạy Server tại port này
            if (!isRunning) {
                if (server != null) {
                    server.close();
                }
            } else {
                server = new ServerSocket(port);
                JOptionPane.showMessageDialog(this, "Server đang chạy: " + port, "Đã bắt đầu server", JOptionPane.INFORMATION_MESSAGE);
            }
            if (isRunning) {
                btnChay.setText("Dừng server");
                btnChay.setBackground(Color.red);
            } else {
                btnChay.setText("Chạy server");
                btnChay.setBackground(Color.green);
            }

        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(this, "Chi tiết: " + e, "Lỗi khi bắt đầu server",
                    JOptionPane.ERROR_MESSAGE);
        }

        Thread t = new Thread(this);
        t.start();
    }//GEN-LAST:event_btnChayActionPerformed

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyActionPerformed

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        // TODO add your handling code here:
        if (isRunning == false) {
            JOptionPane.showMessageDialog(null, "Chưa chạy server \nVui lòng chạy server");
        } else if (isCnn == false) {
            JOptionPane.showMessageDialog(null, "Chưa kết nối client \nVui lòng kết nối");
        } else if (txtKey.getText().equals(MaHoa.SECRET_KEY)) {
            try {
                System.out.println("Doc file ma hoa: " + daMaHoa);
                daGiaiMa = MaHoa.giaiMa(daMaHoa, MaHoa.SECRET_KEY);
                System.out.println("Da giai ma: " + daGiaiMa);
                DSPhanSo = HamPhanSo.chuyenStringThanhPhanSo(daGiaiMa);
                DSPhanSoNguyenTo = HamPhanSo.DSPhanSoCoMauNguyenTo(DSPhanSo);
                if (DSPhanSoNguyenTo != null) {
                    chuoiPSDinhDang = HamPhanSo.hienThiPhanSo(DSPhanSoNguyenTo);
                } else {

                    chuoiPSDinhDang = "Không có phân số nào có mẫu số là số nguyên tố";
                }
                dout.writeUTF(chuoiPSDinhDang);
                txtHienThi.setText("");
                txtHienThi.setText(chuoiPSDinhDang);
                
            } catch (IOException ex) {
                Logger.getLogger(Sever.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Khoá nhập không chính xác! \nVui lòng nhập lại!");
        }

        Thread t = new Thread(this);
        t.start();
    }//GEN-LAST:event_btnGiaiMaActionPerformed

    private void txtPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPortFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPortFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sever().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChay;
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbListen;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextPane txtHienThi;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            try {
                jlbListen.setText("Đang chạy server...");
                jlbListen.setForeground(Color.green);
                if (!isRunning) {
                    jlbListen.setText("Đang chờ...");
                    jlbListen.setForeground(Color.red);
                    break;
                }
                clientA = server.accept();
                setIsCnn(clientA.isConnected());
                System.out.println("Trang thai client: " + clientA.isConnected());
                if (isCnn) {
                System.out.println("Da ket noi client");
                //Tạo lớp on và out để lấy và gửi dữ liệu
                din = new DataInputStream(clientA.getInputStream());
                dout = new DataOutputStream(clientA.getOutputStream());
                chuoiPS = din.readUTF();
                System.out.println("Chuoi: " + chuoiPS);
                daMaHoa = MaHoa.maHoa(chuoiPS);
                DocGhiFile.ghiFile(daMaHoa);
                System.out.println("Da ma hoa: " + daMaHoa);
                docFile = DocGhiFile.docFile();
                System.out.println("Trong file ma hoa: " + docFile);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}