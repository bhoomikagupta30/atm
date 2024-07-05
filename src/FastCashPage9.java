
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class FastCashPage9 extends javax.swing.JFrame {

    /**
     * Creates new form FastCashPage9
     */
    String z;
    int n,i=1;
    public FastCashPage9() {
        initComponents();
    }
    public FastCashPage9(String y) {
        initComponents();
        z=y;
        
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
            PreparedStatement p =c.prepareStatement("select * from SignUp where AccountNo=?");
            p.setString(1,z);
            ResultSet r=p.executeQuery();
            if(r.next()){
                String a=r.getString(10);
                jLabel4.setText(a);
                n=Integer.parseInt(a);
                
            }
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UNITY TRUST BANK");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FAST CASH");

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Rs 100");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Rs 500");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Rs 1000");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Rs 2000");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Rs 5000");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Rs 10000");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("CURRENT BALANCE:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(365, 365, 365)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
          PreparedStatement p = c.prepareStatement("update SignUp set Balance=? where AccountNo=?");
          p.setString(2,z);
          int m=n-100;
          p.setString(1,m+"");
          p.execute();
          if(m<0){
              JOptionPane.showMessageDialog(rootPane,"Not enough balance");
          }
          else{
              JOptionPane.showMessageDialog(rootPane,"Balance Updated");
          }
          
          
          
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
           PreparedStatement p = c.prepareStatement("insert into MiniStm values(?,?,?,?,?)");
          
           Calendar b =Calendar.getInstance();
           String a="100";
           int d=b.get(Calendar.DATE);
           int m=b.get(Calendar.MONTH);
           int x=b.get(Calendar.YEAR);
           p.setString(1,i+"");
           p.setString(2,z);
           p.setString(3,"FastCash");
           p.setString(4,d+"-"+(m+1)+"-"+x);
           p.setString(5,a);
           p.execute();
           
}
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
          PreparedStatement p = c.prepareStatement("update SignUp set Balance=? where AccountNo=?");
          p.setString(2,z);
          int m=n-500;
          p.setString(1,m+"");
          p.execute();
          if(m<0){
              JOptionPane.showMessageDialog(rootPane,"Not enough balance");
          }
          else{
              JOptionPane.showMessageDialog(rootPane,"Balance Updated");
          }
          
          
          
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
           PreparedStatement p = c.prepareStatement("insert into MiniStm values(?,?,?,?,?)");
          
           Calendar b =Calendar.getInstance();
           String a="500";
           int d=b.get(Calendar.DATE);
           int m=b.get(Calendar.MONTH);
           int x=b.get(Calendar.YEAR);
           p.setString(1,i+"");
           p.setString(2,z);
           p.setString(3,"FastCash");
           p.setString(4,d+"-"+(m+1)+"-"+x);
           p.setString(5,a);
           p.execute();
           
}
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
          PreparedStatement p = c.prepareStatement("update SignUp set Balance=? where AccountNo=?");
          p.setString(2,z);
          int m=n-1000;
          p.setString(1,m+"");
          p.execute();
          if(m<0){
              JOptionPane.showMessageDialog(rootPane,"Not enough balance");
          }
          else{
              JOptionPane.showMessageDialog(rootPane,"Balance Updated");
          }
          
          
          
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
           PreparedStatement p = c.prepareStatement("insert into MiniStm values(?,?,?,?,?)");
          
           Calendar b =Calendar.getInstance();
           String a="1000";
           int d=b.get(Calendar.DATE);
           int m=b.get(Calendar.MONTH);
           int x=b.get(Calendar.YEAR);
           p.setString(1,i+"");
           p.setString(2,z);
           p.setString(3,"FastCash");
           p.setString(4,d+"-"+(m+1)+"-"+x);
           p.setString(5,a);
           p.execute();
           
}
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
          PreparedStatement p = c.prepareStatement("update SignUp set Balance=? where AccountNo=?");
          p.setString(2,z);
          int m=n-2000;
          p.setString(1,m+"");
          p.execute();
          if(m<0){
              JOptionPane.showMessageDialog(rootPane,"Not enough balance");
          }
          else{
              JOptionPane.showMessageDialog(rootPane,"Balance Updated");
          }
          
          
          
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
           PreparedStatement p = c.prepareStatement("insert into MiniStm values(?,?,?,?,?)");
          
           Calendar b =Calendar.getInstance();
           String a="2000";
           int d=b.get(Calendar.DATE);
           int m=b.get(Calendar.MONTH);
           int x=b.get(Calendar.YEAR);
           p.setString(1,i+"");
           p.setString(2,z);
           p.setString(3,"FastCash");
           p.setString(4,d+"-"+(m+1)+"-"+x);
           p.setString(5,a);
           p.execute();
           
}
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
          PreparedStatement p = c.prepareStatement("update SignUp set Balance=? where AccountNo=?");
          p.setString(2,z);
          int m=n-5000;
          p.setString(1,m+"");
          p.execute();
          if(m<0){
              JOptionPane.showMessageDialog(rootPane,"Not enough balance");
          }
          else{
              JOptionPane.showMessageDialog(rootPane,"Balance Updated");
          }
          
          
          
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
        try{
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
           PreparedStatement p = c.prepareStatement("insert into MiniStm values(?,?,?,?,?)");
          
           Calendar b =Calendar.getInstance();
           String a="5000";
           int d=b.get(Calendar.DATE);
           int m=b.get(Calendar.MONTH);
           int x=b.get(Calendar.YEAR);
           p.setString(1,i+"");
           p.setString(2,z);
           p.setString(3,"FastCash");
           p.setString(4,d+"-"+(m+1)+"-"+x);
           p.setString(5,a);
           p.execute();
           
}
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try{
          Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
          PreparedStatement p = c.prepareStatement("update SignUp set Balance=? where AccountNo=?");
          p.setString(2,z);
          int m=n-10000;
          p.setString(1,m+"");
          p.execute();
          if(m<0){
              JOptionPane.showMessageDialog(rootPane,"Not enough balance");
          }
          else{
              JOptionPane.showMessageDialog(rootPane,"Balance Updated");
          }
          
          
          
        }
        catch(Exception ex){
            System.out.println(ex);
        }
       
       try{
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
           PreparedStatement p = c.prepareStatement("insert into MiniStm values(?,?,?,?,?)");
          
           Calendar n =Calendar.getInstance();
           String a="10000";
           int d=n.get(Calendar.DATE);
           int m=n.get(Calendar.MONTH);
           int x=n.get(Calendar.YEAR);
           p.setString(1,i+"");
           p.setString(2,z);
           p.setString(3,"FastCash");
           p.setString(4,d+"-"+(m+1)+"-"+x);
           p.setString(5,a);
           p.execute();
           
}
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        OptionsPage4 o = new OptionsPage4(z);
        o.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(FastCashPage9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCashPage9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCashPage9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCashPage9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCashPage9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
