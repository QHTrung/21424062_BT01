/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg21424062_bt01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class StudentJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentJFrame
     */
    List<Student> studentList = new ArrayList<>();

    public StudentJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMHS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenHS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        jPanelBtn = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnSortMHSTang = new javax.swing.JButton();
        btnSortDiemGiam = new javax.swing.JButton();
        btnSortMHSGiam = new javax.swing.JButton();
        btnSortDiemTang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUANLYHOCSINH");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QU???N L?? H???C SINH");

        jLabel2.setText("M?? HS");

        jLabel3.setText("T??n HS");

        jLabel4.setText("?????a ch???");

        jLabel5.setText("Ghi ch??");

        jLabel6.setText("??i???m");

        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setText("C???p nh???t");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnLayout = new javax.swing.GroupLayout(jPanelBtn);
        jPanelBtn.setLayout(jPanelBtnLayout);
        jPanelBtnLayout.setHorizontalGroup(
            jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnLayout.createSequentialGroup()
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBtnLayout.createSequentialGroup()
                        .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBtnLayout.setVerticalGroup(
            jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnLayout.createSequentialGroup()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnSortMHSTang.setText("M?? HS T??ng D???n");
        btnSortMHSTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortMHSTangActionPerformed(evt);
            }
        });

        btnSortDiemGiam.setText("??i???m Gi???m D???n");
        btnSortDiemGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDiemGiamActionPerformed(evt);
            }
        });

        btnSortMHSGiam.setText("M?? HS Gi???m D???n");
        btnSortMHSGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortMHSGiamActionPerformed(evt);
            }
        });

        btnSortDiemTang.setText("??i???m T??ng D???n");
        btnSortDiemTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortDiemTangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnSortMHSTang, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSortMHSGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnSortDiemTang, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSortDiemGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortMHSTang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSortMHSGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSortDiemTang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSortDiemGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        studentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? HS", "T??n HS", "?????a ch???", "Ghi ch??", "??i???m"
            }
        ));
        studentJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDiem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMHS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenHS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ThemHocSinh();
        HienThongTinHocSinh();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        XoaHocSinh();
        HienThongTinHocSinh();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        CapNhatHccSinh();
        HienThongTinHocSinh();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void studentJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentJTableMouseClicked
        // TODO add your handling code here:
        HienThongTinChiTiet();
    }//GEN-LAST:event_studentJTableMouseClicked

    private void btnSortMHSTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortMHSTangActionPerformed
        // TODO add your handling code here:
        DSMHSTangDan();
        HienThongTinHocSinh();
    }//GEN-LAST:event_btnSortMHSTangActionPerformed

    private void btnSortDiemGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDiemGiamActionPerformed
        // TODO add your handling code here:
        DSDiemGiamDan();
        HienThongTinHocSinh();
    }//GEN-LAST:event_btnSortDiemGiamActionPerformed

    private void btnSortMHSGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortMHSGiamActionPerformed
        // TODO add your handling code here:
        DSMHSGiamDan();
        HienThongTinHocSinh();
    }//GEN-LAST:event_btnSortMHSGiamActionPerformed

    private void btnSortDiemTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortDiemTangActionPerformed
        // TODO add your handling code here:
        DSDiemTangDan();
        HienThongTinHocSinh();
    }//GEN-LAST:event_btnSortDiemTangActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        try {
            FileReader fr = new FileReader("data/student.csv");
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel model = (DefaultTableModel) studentJTable.getModel();
            Object[] lines = br.lines().toArray();
            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                int mahs = Integer.parseInt(row[0]);
                String tenhs = row[1];
                String diachi = row[2];
                String ghichu = row[3];
                float diem = Float.parseFloat(row[4]);
                studentList.add(new Student(mahs, tenhs, diachi, ghichu, diem));
                model.addRow(row);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Import file th???t b???i", "Export file CSV", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileFilter csvFilter = new FileNameExtensionFilter("CSV files", "csv");
        fileChooser.setFileFilter(csvFilter);
        fileChooser.setDialogTitle("Export file csv");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(fileToSave + ".csv");
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < studentJTable.getRowCount(); i++) {
                    for (int j = 0; j < studentJTable.getColumnCount(); j++) {
                        bw.write(studentJTable.getValueAt(i, j).toString() + ",");
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(null, "Export file th??nh c??ng", "Export file CSV", JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Export file th???t b???i", "Export file CSV", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExportActionPerformed
    public boolean isNumeric(String s) {
        return s.matches("[+-]?([0-9]*[.])?[0-9]+");
    }

    public void ThemHocSinh() {
        Student st = new Student();
        if (txtMHS.getText().equals("") || !isNumeric(txtMHS.getText())) {
            JOptionPane.showMessageDialog(null, "M?? h???c sinh ph???i l?? s??? v?? kh??ng ???????c b??? tr???ng");
        } else if (txtTenHS.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "T??n h???c sinh kh??ng ???????c b??? tr???ng");
        } else if (txtDiem.getText().equals("") || !isNumeric(txtDiem.getText()) || Float.parseFloat(txtDiem.getText()) < 0 || Float.parseFloat(txtDiem.getText()) > 10) {
            JOptionPane.showMessageDialog(null, "??i???m ph???i l???n h??n 0 v?? nh??? h??n 10 v?? kh??ng ???????c b??? tr???ng");
        } else {
            st.MHS = Integer.parseInt(txtMHS.getText());
            st.TenHS = txtTenHS.getText();
            st.DiaChi = txtDiaChi.getText();
            st.GhiChu = txtGhiChu.getText();
            st.Diem = Float.parseFloat(txtDiem.getText());
            studentList.add(st);
        }
    }

    public void XoaHocSinh() {
        int delRow = studentJTable.getSelectedRow();
        studentList.remove(delRow);
    }

    public void CapNhatHccSinh() {
        int updRow = studentJTable.getSelectedRow();
        Student s = studentList.get(updRow);
        s.MHS = Integer.parseInt(txtMHS.getText());
        s.TenHS = txtTenHS.getText();
        s.DiaChi = txtDiaChi.getText();
        s.GhiChu = txtGhiChu.getText();
        s.Diem = Float.parseFloat(txtDiem.getText());
    }

    public void HienThongTinHocSinh() {
        DefaultTableModel model = (DefaultTableModel) studentJTable.getModel();
        model.setRowCount(0);
        for (Student student : studentList) {
            Object[] row = new Object[]{
                student.MHS, student.TenHS, student.DiaChi, student.GhiChu, student.Diem
            };
            model.addRow(row);
        }
    }

    public void HienThongTinChiTiet() {
        int row = studentJTable.getSelectedRow();
        Student s = studentList.get(row);
        txtMHS.setText(String.valueOf(s.MHS));
        txtTenHS.setText(s.TenHS);
        txtDiaChi.setText(s.DiaChi);
        txtGhiChu.setText(s.GhiChu);
        txtDiem.setText(String.valueOf(s.Diem));
    }

    public void DSMHSTangDan() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student std1, Student std2) {
                if (std1.getMHS() < std2.getMHS()) {
                    return -1;
                }
                return 1;
            }
        });
    }

    public void DSMHSGiamDan() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student std1, Student std2) {
                if (std1.getMHS() > std2.getMHS()) {
                    return -1;
                }
                return 1;
            }
        });
    }

    public void DSDiemTangDan() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student std1, Student std2) {
                if (std1.getDiem() < std2.getDiem()) {
                    return -1;
                }
                return 1;
            }
        });
    }

    public void DSDiemGiamDan() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student std1, Student std2) {
                if (std1.getDiem() > std2.getDiem()) {
                    return -1;
                }
                return 1;
            }
        });
    }

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
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new StudentJFrame().setVisible(true);
                StudentJFrame fr = new StudentJFrame();
                fr.setLocationRelativeTo(null);
                fr.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSortDiemGiam;
    private javax.swing.JButton btnSortDiemTang;
    private javax.swing.JButton btnSortMHSGiam;
    private javax.swing.JButton btnSortMHSTang;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentJTable;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMHS;
    private javax.swing.JTextField txtTenHS;
    // End of variables declaration//GEN-END:variables
}
