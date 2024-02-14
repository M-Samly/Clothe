/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import database.db;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

/**
 *
 * @author M_Samly
 */
public class dashboard extends javax.swing.JFrame {

    private DrawerController drawer;

    /**
     * Creates new form Home
     */
    public dashboard() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/store.png")));
        drawer = Drawer.newDrawer(this)
                .header(new header())
                .separator(1, Color.BLACK)
                .drawerWidth(200)
                .addChild(createDrawerItem("Home", "/img/home.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showHomePage();
                    }
                }))
                .addChild(createDrawerItem("Products", "/img/product.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        itemPage();
                    }
                }))
                .addChild(createDrawerItem("Barcode Print", "/img/barcode.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        barcodePage();
                    }
                }))
                .addChild(createDrawerItem("Cashier", "/img/cashier.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cashierPage();
                    }
                }))
                .addChild(createDrawerItem("Loan", "/img/loan.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        loanPage();
                    }
                }))
                .addChild(createDrawerItem("Cheque", "/img/cheque.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        chequePage();
                    }
                }))
                .addChild(createDrawerItem("Report", "/img/report.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        reportPage();
                    }
                }))
                .addChild(createDrawerItem("Income", "/img/income.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        incomePage();
                    }
                }))
                .addChild(createDrawerItem("Settings", "/img/setting.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        settingPage();
                    }
                }))
                .addChild(createDrawerItem("Print", "/img/re bill.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        print();
                    }
                }))
                .addChild(createDrawerItem("BackUp", "/img/backup.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        BackupOption();
                    }
                }))
                .addFooter(createDrawerItem("Exit", "/img/power-off.png", new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        logOut();
                    }
                }))
                .build();

        shop();
    }

    public void shop() {
        String name = "";
        String jrmxl = "";
        Connection conn = db.getConnection();
        try {
            Statement st = conn.createStatement();
            String query = "Select name from shop_details where sh_id = 1";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                name = rs.getString("name");
            }
            txtShopName.setText("Welcome To " + name);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private DrawerItem createDrawerItem(String label, String iconPath, ActionListener actionListener) {
        DrawerItem drawerItem = new DrawerItem(label)
                .icon(new ImageIcon(getClass().getResource(iconPath)));
        drawerItem.addActionListener(actionListener);

        return drawerItem.build();
    }

    private void showHomePage() {
        String user = dashboard.txtUsername.getText();
        drawer.hide();
        dashboard hm = new dashboard();
        this.dispose();
        hm.setVisible(true);
        dashboard.txtUsername.setText(user);
    }

    private void itemPage() {
        product itm = new product();
        jDesktopPane1.add(itm).setVisible(true);
        drawer.hide();
    }

    private void barcodePage() {
        barcodeproductList bar = new barcodeproductList();
        jDesktopPane1.add(bar).setVisible(true);
        drawer.hide();
    }

    private void settingPage() {
        settings stt = new settings();
        jDesktopPane1.add(stt).setVisible(true);
        drawer.hide();
    }

    private void cashierPage() {
        cashier cashi = new cashier();
        jDesktopPane1.add(cashi).setVisible(true);
        cashier.txtSearchBarcode.requestFocus();
        cashier.txtUserName.setText(txtUsername.getText());
        drawer.hide();
    }

    private void loanPage() {
        loanList ln = new loanList();
        jDesktopPane1.add(ln).setVisible(true);
        drawer.hide();
    }

    private void reportPage() {
        try {
            String user = dashboard.txtUsername.getText();
            Connection con;
            Statement st;
            con = db.getConnection();
            st = con.createStatement();
            String query = "Select role from user where name = '" + user + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String role = rs.getString("role");
                if (role.equals("admin")) {
                    report rp = new report();
                    jDesktopPane1.add(rp).setVisible(true);
                    drawer.hide();
                } else {
                    JOptionPane.showMessageDialog(null, "You Can't access to the Income Page");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void chequePage() {
        chequeList chq = new chequeList();
        jDesktopPane1.add(chq).setVisible(true);
        drawer.hide();
    }

    private void incomePage() {
        try {
            String user = dashboard.txtUsername.getText();
            Connection con;
            Statement st;
            con = db.getConnection();
            st = con.createStatement();
            String query = "Select role from user where name = '" + user + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String role = rs.getString("role");
                if (role.equals("admin")) {
                    income inc = new income();
                    jDesktopPane1.add(inc).setVisible(true);
                    drawer.hide();
                } else {
                    JOptionPane.showMessageDialog(null, "You Can't access to the Income Page");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void logOut() {
        this.dispose();
        login lg = new login();
        lg.setVisible(true);
        BackUP();
    }

    private void print() {
        dailyIncome();
        monthIncome();
        monthlyIncome();
        productIncome();
        yearIncome();
        yearlyIncome();
        report();
        income();
        Barcode();
        BackUP();
        drawer.hide();
    }

    public void dailyIncome() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\incomeDBD.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/dailyIncome.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void monthIncome() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\incomeMonth.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/monthIncome.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void monthlyIncome() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\incomeMBM.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/monthlyIncome.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void productIncome() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\incomeProduct.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/ProductIncome.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void yearIncome() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\incomeYear.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/yearIncome.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void yearlyIncome() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\incomeYBY.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/yearlyIncome.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void report() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\report.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/report.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void income() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\income.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/allincome.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void Barcode() {
        try {
            String folder = "";
            String jrmxl = "";
            Connection conn = db.getConnection();
            try {
                Statement st = conn.createStatement();
                String query = "Select printfolderpath,jrxml from shop_details where sh_id = 1";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    folder = rs.getString("printfolderpath");
                    jrmxl = rs.getString("jrxml");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            String reportPath = jrmxl + "\\barcodeList.jrxml";
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(folder + "/BarcodeList.pdf")); // Output PDF file path

            exporter.exportReport();

        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    public void BackUP() {
        String dbName = "cloth";
        String backup = "";
        Connection conn = db.getConnection();
        try {
            Statement st = conn.createStatement();
            String query = "Select backup from shop_details where sh_id = 1";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                backup = rs.getString("backup");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        String backupPath = backup + "\\backup.sql";

        String command = "C:\\xampp\\mysql\\bin\\mysqldump.exe -uroot --add-drop-database -B " + dbName + " -r " + backupPath;

        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec(command);

            int processComplete = p.waitFor();
            /*if (processComplete == 0) {
                JOptionPane.showMessageDialog(this, "Print Successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Can't Print.", "Error", JOptionPane.ERROR_MESSAGE);
            }*/
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (p != null) {
                p.destroy();
            }
        }
    }

    public void BackupOption() {
        BackUP();
        JOptionPane.showMessageDialog(null, "BackUp Successfully Completed!");
        drawer.hide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtUsername = new javax.swing.JLabel();
        txtShopName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 703));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1024, 703));

        txtUsername.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtUsername.setText("admin");

        txtShopName.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        txtShopName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtShopName.setText("Welcome to SHOP");

        jDesktopPane1.setLayer(txtUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtShopName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtShopName, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtUsername)
                .addGap(52, 52, 52)
                .addComponent(txtShopName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_jMenu1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtShopName;
    public static javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
