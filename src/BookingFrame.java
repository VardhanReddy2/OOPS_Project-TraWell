/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author me
 */
public class BookingFrame extends javax.swing.JFrame implements AllFrames{
    
    /**
     * Creates new form BookingFrame
     */
    static String driverName;
    static int vehicleID;
    static float rating;
    static String phoneNumber;
    static int nearestDriverIndex = 0;
    static String PuP = null;
    static String DP = "Select Drop Point";
     
    public BookingFrame() {
        initComponents();
        System.gc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        sourceDropDown = new javax.swing.JComboBox<>();
        destinationDropDown = new javax.swing.JComboBox<>();
        requestCabButton = new javax.swing.JButton();
        BookingFrameBackButton = new javax.swing.JButton();
        samePD = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fromLabel.setText("From");

        toLabel.setText("To");

        sourceDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pick Up Point", "BITS-Pilani", "Thumkunta", "Hakimpet", "Bolarum", "Alwal", "Lothukunta ", "Lal Bazaar ", "Tirumelgherry", "JBS", "Secunderabad Railway Station" }));
        sourceDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceDropDownActionPerformed(evt);
            }
        });

        destinationDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Drop Point", "BITS-Pilani", "Thumkunta", "Hakimpet", "Bolarum", "Alwal", "Lothukunta", "Lal Bazaar", "Tirumelgherry", "JBS", "Secunderabad Railway Station" }));
        destinationDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationDropDownActionPerformed(evt);
            }
        });

        requestCabButton.setText("Request Cab");
        requestCabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestCabButtonActionPerformed(evt);
            }
        });

        BookingFrameBackButton.setText("Back");
        BookingFrameBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingFrameBackButtonActionPerformed(evt);
            }
        });

        samePD.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sourceDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinationDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BookingFrameBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(requestCabButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(samePD, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BookingFrameBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(requestCabButton)
                .addGap(38, 38, 38)
                .addComponent(samePD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void requestCabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestCabButtonActionPerformed
        // TODO add your handling code here:
        PuP = (String)sourceDropDown.getSelectedItem();
        DP = (String)destinationDropDown.getSelectedItem();
        boolean flag1 = true;
        switch(PuP){
            case "BITS-Pilani" : PuP = "1";break;
            case "Thumkunta" : PuP = "2";break;
            case "Hakimpet" : PuP = "3";break;
            case "Bolarum" : PuP = "4";break;
            case "Alwal" : PuP = "5";break;
            case "Lothukunta" : PuP = "6";break;
            case "Lal Bazaar" : PuP = "7";break;
            case "Tirumelgherry" : PuP = "8";break;
            case "JBS" : PuP = "9";break;
            case "Secunderabad Railway Station" : PuP = "10";break;
        }
        switch(DP){
            case "BITS-Pilani" : DP = "1";break;
            case "Thumkunta" : DP = "2";break;
            case "Hakimpet" : DP = "3";break;
            case "Bolarum" : DP = "4";break;
            case "Alwal" : DP = "5";break;
            case "Lothukunta" : DP = "6";break;
            case "Lal Bazaar" : DP = "7";break;
            case "Tirumelgherry" : DP = "8";break;
            case "JBS" : DP = "9";break;
            case "Secunderabad Railway Station" : DP = "10";break;
        }
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","OOPlite");
            String sql1 = "select * from user_info where UserID = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setString(1,Login_Frame.uid);
            ResultSet rs1 = pstmt1.executeQuery();
            if(rs1.next()){
                if(rs1.getInt("State") == 1){
                    JOptionPane.showMessageDialog(null,"Please complete your trip before booking another cab","ERROR!!",JOptionPane.ERROR_MESSAGE);
                    flag1 = false;
                }
            }
        }catch(Exception e){}
        if(DP.equals("Select Drop Point") || PuP.equals("Select Pick Up Point")){
            samePD.setText("Invalid PickUp or Drop Point!");
            flag1= false;
        }
        if(PuP.equals(DP)){
            samePD.setText("Source and Destination can't be the same!");
            flag1 = false;
        }
        if(flag1){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/drivers","root","OOPlite");
                String sql = "select * from driv_info where State = 0";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                //ArrayList<DriverInfo> d = new ArrayList<DriverInfo>();
                ResultSet rs = pstmt.executeQuery();
                //DriverInfo dr = null;
                int min = 10000; double maxr=0.0; 
                int userLoc = Integer.parseInt(PuP);int distance = 0;
                while(rs.next()){
                    distance = java.lang.Math.abs(userLoc - rs.getInt("Location"));
                    if(distance<min){
                        min = distance;
                        maxr = rs.getDouble("Rating");
                        nearestDriverIndex = rs.getInt("VehicleID");
                    }else if(distance==min && maxr<rs.getDouble("Rating")){
                        maxr = rs.getDouble("Rating");
                        nearestDriverIndex = rs.getInt("VehicleID");
                    }
                }
                conn.close();
                if(nearestDriverIndex == 0){
                    JOptionPane.showMessageDialog(null,"Request timed out.\n Please try after some time","NO DRIVER AVAILABLE!!!",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    sourceDropDown.setSelectedItem("Select Pick Up Point");
                    destinationDropDown.setSelectedItem("Select Drop Point");
                    samePD.setText(null);
                    this.setVisible(false);
                    new ConfirmationFrame().setVisible(true);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }         
        }
    }//GEN-LAST:event_requestCabButtonActionPerformed

    private void BookingFrameBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingFrameBackButtonActionPerformed
        // TODO add your handling code here:
        samePD.setText(null);
        sourceDropDown.setSelectedItem("Select Pick Up Point");
        destinationDropDown.setSelectedItem("Select Drop Point");
        this.setVisible(false);
//        if(hf == null)
//            hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_BookingFrameBackButtonActionPerformed

    private void sourceDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceDropDownActionPerformed

    private void destinationDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationDropDownActionPerformed

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
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                bf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookingFrameBackButton;
    private javax.swing.JComboBox<String> destinationDropDown;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JButton requestCabButton;
    private javax.swing.JLabel samePD;
    private javax.swing.JComboBox<String> sourceDropDown;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}
