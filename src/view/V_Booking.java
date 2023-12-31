/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.C__Booking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.MyDatabaseconnection;

/**
 *
 * @author User
 */
public class V_Booking extends javax.swing.JFrame {

    /**
     * Creates new form V_Booking
     */
    public V_Booking() {
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

        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_nic1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_cname1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_address1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_duration = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cost = new javax.swing.JTextField();
        txt_contact1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_cal = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txt_vtype = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_bill = new javax.swing.JTextArea();
        txt_bid1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(440, 230));
        setMinimumSize(new java.awt.Dimension(563, 663));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(839, 663));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW ORDER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 16, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 90));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, 580, 10));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIC");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 60, 30));

        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_search.setForeground(new java.awt.Color(0, 0, 0));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel3.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 145, 27));

        txt_nic1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_nic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 148, -1));

        txt_cname1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_cname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 148, -1));

        txt_address1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 240, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Booking Id");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 145, 27));

        txt_duration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 240, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 145, 27));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vehical Type");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 145, 27));

        txt_cost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 240, -1));

        txt_contact1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 240, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Duration (days)");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 145, 27));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Cost");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 145, 27));

        btn_cal.setBackground(new java.awt.Color(51, 102, 255));
        btn_cal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cal.setForeground(new java.awt.Color(0, 0, 0));
        btn_cal.setText("Calculate Bill");
        btn_cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        btn_close.setBackground(new java.awt.Color(255, 51, 51));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(0, 0, 0));
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, 30));

        btn_confirm.setBackground(new java.awt.Color(102, 255, 51));
        btn_confirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_confirm.setForeground(new java.awt.Color(0, 0, 0));
        btn_confirm.setText("Confirm Booking");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });
        jPanel3.add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, 30));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 810, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 820, 10));
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 240, 30));

        txt_vtype.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_vtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 240, -1));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 473, 820, 10));

        btn_reset.setBackground(new java.awt.Color(51, 102, 255));
        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(0, 0, 0));
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, 30));

        txt_bill.setColumns(20);
        txt_bill.setRows(5);
        jScrollPane1.setViewportView(txt_bill);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 320, 250));

        txt_bid1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(txt_bid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 240, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 840, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String nic=txt_nic1.getText();
        try
        {
            Connection con = model.MyDatabaseconnection.getMyConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where nic = '"+nic+"'");
            if(rs.next())
            {
                txt_cname1.setText(rs.getString(1));
                txt_contact1.setText(rs.getString(3));
                txt_address1.setText(rs.getString(4));
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "Customer ID does not Exist");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try 
        {
        Connection con = MyDatabaseconnection.getMyConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(rec_number) AS max_rec_number FROM new_order");
        if (rs.next()) 
        {
            int id = rs.getInt("max_rec_number");
            id = id + 1;
            String str = String.valueOf(id);
            txt_bid1.setText(str);
        } 
        else 
        {
            txt_bid1.setText("1");
        }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_formComponentShown

    private void btn_calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calActionPerformed
        
        try {
            
            int total = 0;
            String name =txt_cname1.getText();
            String vtype = txt_vtype.getText();
            int duration = Integer.parseInt(txt_duration.getText());
            Connection con = model.MyDatabaseconnection.getMyConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Cost_per_Day from vehical where Vehical_Name = '"+vtype+"'");
            
            int cost = 0;
            if (rs.next())
            {
               cost = rs.getInt(1);
            }
            total = duration * cost;
     
            
             txt_cost.setText(String.valueOf(total));
             
            txt_bill.setText("******************************************************\n"
                           + "            Taxi Company            \n"
                           + "******************************************************\n"
                           + "CustomerName :    " + name + "\n"
                                   + "\n"
                           + "Vehical Type\t:    " + vtype + "\n"
                                   + "\n"
                           + "Duration\t:    " + duration + "\n"
                                   + "\n"
                           + "******************************************************\n"
                           + "Total Amount  :" + total + "\n"
                           + "******************************************************\n"
                           + "        Thank You Come Again        \n"
                           + "******************************************************\n");


            
            

            }
       catch (Exception e) 
          {
             JOptionPane.showMessageDialog(null, e.getMessage());
          }

        
    }//GEN-LAST:event_btn_calActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
              try
              {
              int rec_number = Integer.parseInt(txt_bid1.getText());
              String nic =txt_nic1.getText();
              String name =txt_cname1.getText();
              String vtype =txt_vtype.getText();
              int duration =Integer.parseInt(txt_duration.getText());
              SimpleDateFormat dFormat=new SimpleDateFormat("dd-mm-yyyy");
              String date=dFormat.format(jDateChooser1.getDate());
              int cost = Integer.parseInt(txt_cost.getText()); 
              
              C__Booking cctmreg = new C__Booking();
              cctmreg.submitcorder(rec_number,nic,name,vtype,duration,date,cost);
              }
              catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"Invalid number format. Please enter a valid duration.");
        }
              
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new V_Booking().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    public void booking() {
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
            java.util.logging.Logger.getLogger(V_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cal;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_search;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txt_address1;
    private javax.swing.JTextField txt_bid1;
    private javax.swing.JTextArea txt_bill;
    private javax.swing.JTextField txt_cname1;
    private javax.swing.JTextField txt_contact1;
    private javax.swing.JTextField txt_cost;
    private javax.swing.JTextField txt_duration;
    private javax.swing.JTextField txt_nic1;
    private javax.swing.JTextField txt_vtype;
    // End of variables declaration//GEN-END:variables
}
