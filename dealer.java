/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dealer.java
 *
 * Created on 3 Oct, 2014, 7:50:10 PM
 */

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MY HP
 */
public class dealer extends javax.swing.JFrame {

    /** Creates new form dealer */
    public dealer() {
        initComponents();
         getContentPane().setBackground(new Color(204,204,255));
         setIcon();
         Fillcombo();
         setResizable(false);
         try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
         PreparedStatement pst = con.prepareStatement("select * from dealer_master");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsm= rs.getMetaData();
            int column = rsm.getColumnCount();
            DefaultTableModel  dtm= new DefaultTableModel();
            Vector columns_name= new Vector();
            Vector datarows= new Vector();

            for(int i=1;i<=column;i++)
            { columns_name.addElement(rsm.getColumnName(i));

            }
          dtm.setColumnIdentifiers(columns_name);
          while(rs.next())
          { datarows= new Vector();
            for(int j=1;j<=column;j++)
            { datarows.addElement(rs.getString(j));
            }
            dtm.addRow(datarows);

          }
          jTable1.setModel(dtm);

        }
         catch(Exception e){

         JOptionPane.showMessageDialog(null,"Access Denied");

    }
    }
    public void Fillcombo()
    { try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");


         PreparedStatement pst10 = con.prepareStatement("select d_id from dealer_master ");
        // pst8.setString(1,(String)jComboBox1.getSelectedItem());
         ResultSet rs28 = pst10.executeQuery();

         while (rs28.next())
         {
          String value1= rs28.getString("d_id");
          jComboBox1.addItem(value1);

         }
      }
         catch( Exception ae)
{
    JOptionPane.showMessageDialog(null,"Access Not Allowed");

}
      }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Dealer ID");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("D ID");

        jLabel4.setText("Dealer Name");

        jLabel5.setText("Dealer State");

        jLabel6.setText("Dealer Phone no");

        jLabel7.setText("Dealer Address");

        jLabel8.setText("Licence Id");

        jLabel9.setText("Validity Of Licence");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Dealer Type");

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(255, 153, 153));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("LIST OF DEALERS FOR FERTILIZERS AND PESTICIDES");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY HP\\Desktop\\New folder\\pest.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel2)
                                        .addGap(34, 34, 34)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                                        .addGap(154, 154, 154))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1)
                        .addGap(48, 48, 48)
                        .addComponent(jButton4)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addGap(201, 201, 201))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
         String value1 = jTextField2.getText();
         String value2 = jTextField3.getText();
         String value3 = jTextField4.getText();
         String value4 = jTextField5.getText();
         String value5 = jTextField6.getText();
         String value6 = jTextField7.getText();
         String value7 = jTextField8.getText();
         String value8 = jTextField1.getText();
         PreparedStatement pst = con.prepareStatement("update dealer_master set d_type='"+value1+"',d_name='"+value2+"', d_state='"+value3+"',d_phone_no='"+value4+"',d_address='"+value5+"',d_licence_id='"+value6+"',d_validity_licence='"+value7+"' where d_id='"+value8+"'");
        int rs= pst.executeUpdate();
         if(rs>0)
         {
            JOptionPane.showMessageDialog(null,"Updated");
         }
         else
        JOptionPane.showMessageDialog(null,"Updated");


 }
catch(Exception e)
{
  JOptionPane.showMessageDialog(null,e);

}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try
       {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
         PreparedStatement pst = con.prepareStatement("select d_type from dealer_master where d_id =?");
         pst.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs = pst.executeQuery();

         if (rs.next())
         {

           jTextField1.setText(rs.getString(1));

         }

         PreparedStatement pst1 = con.prepareStatement("select d_id from dealer_master where d_id =?");
         pst1.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs1 = pst1.executeQuery();

         if (rs1.next())
         {

           jTextField2.setText(rs1.getString(1));

         }

         PreparedStatement pst2 = con.prepareStatement("select d_name from dealer_master where d_id =?");
         pst2.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs2 = pst2.executeQuery();

         if(rs2.next())
         {

           jTextField3.setText(rs2.getString(1));

         }
         PreparedStatement pst3 = con.prepareStatement("select d_state from dealer_master where d_id =?");
         pst3.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs3 = pst3.executeQuery();

         if (rs3.next())
         {

           jTextField4.setText(rs3.getString(1));

         }
         PreparedStatement pst4 = con.prepareStatement("select d_phone_no from dealer_master where d_id =?");
         pst4.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs4 = pst4.executeQuery();

         if (rs4.next())
         {

           jTextField5.setText(rs4.getString(1));

         }
         PreparedStatement pst5 = con.prepareStatement("select d_address  from dealer_master where d_id =?");
         pst5.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs5 = pst5.executeQuery();

         if (rs5.next())
         {

           jTextField6.setText(rs5.getString(1));

         }
         PreparedStatement pst6 = con.prepareStatement("select d_licence_id validity_licence from dealer_master where d_id =?");
         pst6.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs6 = pst6.executeQuery();

         if (rs6.next())
         {

           jTextField7.setText(rs6.getString(1));

         }
         PreparedStatement pst7 = con.prepareStatement("select d_validity_licence from dealer_master where d_id =?");
         pst7.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs7 = pst7.executeQuery();

         if (rs7.next())
         {

           jTextField8.setText(rs7.getString(1));

         }
        }
         catch( Exception ae)
{
    JOptionPane.showMessageDialog(null,"Access Not Allowed");

}

        



    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
         PreparedStatement pst = con.prepareStatement("insert into dealer_master(d_type,d_id,d_name,d_state, d_phone_no,d_address,d_licence_id,d_validity_licence) values(?,?,?,?,?,?,?,?)");

             pst.setString(1,jTextField1.getText());
             pst.setString(2,jTextField2.getText());
             pst.setString(3,jTextField3.getText());
             pst.setString(4,jTextField4.getText());
             pst.setString(5,jTextField5.getText());
             pst.setString(6,jTextField6.getText());
             pst.setString(7,jTextField7.getText());
             pst.setString(8,jTextField8.getText());
            int rs9 = pst.executeUpdate();
         if(rs9>0)
         {
            JOptionPane.showMessageDialog(null,"Saved");
         }
         else
        JOptionPane.showMessageDialog(null,"Not Saved");
          }
          catch(Exception e)
{
  JOptionPane.showMessageDialog(null,e);
          }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
       // String value1 = jTextField1.getText();
         PreparedStatement pst = con.prepareStatement("delete from dealer_master where d_id=? ");
         pst.setString(1,jTextField2.getText());
         int rs41 = pst.executeUpdate();
         if(rs41>0)
         {
            JOptionPane.showMessageDialog(null,"Deleted");
         }
         else
        JOptionPane.showMessageDialog(null,"Not Deleted");
          }
         catch(Exception e)
{
  JOptionPane.showMessageDialog(null,e);

}          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dealer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.jpeg")));
    }

}