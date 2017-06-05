
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


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * crop.java
 *
 * Created on 2 Oct, 2014, 3:04:17 PM
 */

/**
 *
 * @author MY HP
 */


public class crop extends javax.swing.JFrame {

    /** Creates new form crop */
    public crop() {
        initComponents();
          getContentPane().setBackground(new Color(255,255,204));
          setIcon();
          Fillcombo();
            setResizable(false);
            try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
         PreparedStatement pst = con.prepareStatement("select * from cropmain");
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
          //setIcon();

    }
    public void Fillcombo()
    { try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");


         PreparedStatement pst8 = con.prepareStatement("select c_name from cropmain ");
        // pst8.setString(1,(String)jComboBox1.getSelectedItem());
         ResultSet rs22 = pst8.executeQuery();

         while (rs22.next())
         {
          String value1= rs22.getString("c_name");
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
*     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

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

        jLabel2.setText("Crop Name");

        jLabel3.setText("Gen. Info");

        jLabel4.setText("Discription");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("C ID");

        jButton5.setText("General information About Crops");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY HP\\Desktop\\New folder\\index.jpg")); // NOI18N
        jLabel6.setText("jLabel6");

        jTextField5.setBackground(new java.awt.Color(255, 204, 204));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("AGRICULTURAL CROPS");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                            .addGap(59, 59, 59))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton5))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4))
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
 try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");


        /* PreparedStatement pst8 = con.prepareStatement("select c_name from cropmain ");
        // pst8.setString(1,(String)jComboBox1.getSelectedItem());
         ResultSet rs22 = pst8.executeQuery();

         while (rs22.next())
         {
          String value1= rs22.getString("c_name");
          jComboBox1.addItem(value1);

         }
             */

         PreparedStatement pst3 = con.prepareStatement("select c_id from cropmain where c_name=?");
         pst3.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs3 = pst3.executeQuery();

         if (rs3.next())
         {

           jTextField1.setText(rs3.getString(1));

         }
         PreparedStatement pst = con.prepareStatement("select c_name from cropmain where c_name=?");
         pst.setString(1,(String)jComboBox1.getSelectedItem());
         
         ResultSet rs = pst.executeQuery();

         if (rs.next())
         {
             
           jTextField2.setText(rs.getString(1));
           
         }

         PreparedStatement pst1 = con.prepareStatement("select g_info from cropmain where c_name=?");
         pst1.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs1 = pst1.executeQuery();

         if (rs1.next())
         {

           jTextField3.setText(rs1.getString(1));

         }

         PreparedStatement pst2 = con.prepareStatement("select c_state from cropmain where c_name=?");
         pst2.setString(1,(String)jComboBox1.getSelectedItem());

         ResultSet rs2 = pst2.executeQuery();

         if (rs2.next())
         {

           jTextField4.setText(rs2.getString(1));

         }

 }
catch( Exception ae)
{
    JOptionPane.showMessageDialog(null,"Access Not Allowed");

}
   



  // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

 private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

 }//GEN-LAST:event_jTextField2ActionPerformed

 private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
     // TODO add your handling code here:
 }//GEN-LAST:event_jTextField4ActionPerformed

 private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
     // TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

 private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 dispose();     // TODO add your handling code here:
 }//GEN-LAST:event_jButton3ActionPerformed

 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


try{      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
         String value1 = jTextField2.getText();
         String value2 = jTextField3.getText();
         String value3 = jTextField4.getText();
         PreparedStatement pst = con.prepareStatement("update cropmain set g_info='"+value2+"',c_state='"+value3+"' where c_name='"+value1+"'");
        int rs67 = pst.executeUpdate();
         if(rs67>0)
         {
            JOptionPane.showMessageDialog(null,"Updated");
         }
         else
        JOptionPane.showMessageDialog(null,"Updated");

}
         catch(Exception e)
{
  JOptionPane.showMessageDialog(null,e);

}

      

 }//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
       // String value1 = jTextField1.getText();
         PreparedStatement pst = con.prepareStatement("delete from cropmain where c_idss=? ");
         pst.setString(1,jTextField1.getText());
         int rs60 = pst.executeUpdate();
         if(rs60>0)
         {
            JOptionPane.showMessageDialog(null,"Deleted");
         }
         else
        JOptionPane.showMessageDialog(null,"Deleted");

    }
         catch(Exception e)
{
  JOptionPane.showMessageDialog(null,e);

}
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         Connection con = DriverManager.getConnection("jdbc:odbc:mydsn","sa","SA@admin");
         PreparedStatement pst = con.prepareStatement("insert into cropmain(c_id,c_name,g_info,c_state) values(?,?,?,?)");
         
             pst.setString(1,jTextField1.getText());
             pst.setString(2,jTextField2.getText());
             pst.setString(3,jTextField3.getText());
             pst.setString(4,jTextField4.getText());
            int rs68 = pst.executeUpdate();
         if(rs68>0)
         {
            JOptionPane.showMessageDialog(null,"Saved");
         }
         else
        JOptionPane.showMessageDialog(null,"Saved");



    }
          catch(Exception e)
{
  JOptionPane.showMessageDialog(null,e);
          }// TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try{
    Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"C:\\Users\\MY HP\\Desktop\\Project doc\\New Microsoft Word Document (6).docx");
    }
catch(Exception e)
{
  JOptionPane.showMessageDialog(null,"Access Not Allowed");
          }    // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed
 /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crop().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ICON.jpeg")));
    }

}

