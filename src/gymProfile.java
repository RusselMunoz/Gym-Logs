import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;


public class gymProfile extends javax.swing.JFrame {

    /**
     * Creates new form gymProfile
     */
    public gymProfile() {
        initComponents();
        setTitle("Member's Profile");
    }

public void loadData(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:MySQL://localhost:3306/gym";
        String user = "root";
        String pass = "";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Mobile number", "Age", "Sex", "Emergency contact name", "Emergency contact number" }, 0);
        profileTable.setModel(model);
        
        String sql = "SELECT * FROM member";
        ResultSet rs = st.executeQuery(sql);
        
        String i, n, m, a, s, em, eb;
        
        while(rs.next()){
            i = rs.getString("id");
            n = rs.getString("name");
            m = rs.getString("mobile_number");
            a = rs.getString("age");
            s = rs.getString("sex");
            em = rs.getString("emergency_contact_name");
            eb = rs.getString("emergency_contact_number");
            
            model.addRow(new Object[]{i, n, m, a, s, em, eb});
        }
        
    }catch(Exception e){
        System.out.println("Error " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        UpdateDelete = new javax.swing.JButton();
        NewMember = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Payment = new javax.swing.JButton();
        Logs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        profileTable = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchMember = new javax.swing.JTable();
        searchButton_Member = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new Color(98, 39, 24));

        UpdateDelete.setBackground(new Color(96, 81, 41));
        UpdateDelete.setForeground(new java.awt.Color(255, 255, 255));
        UpdateDelete.setText("Update/Delete");
        UpdateDelete.setBorder(null);
        UpdateDelete.setContentAreaFilled(false);
        UpdateDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDeleteActionPerformed(evt);
            }
        });

        NewMember.setBackground(new Color(96, 81, 41));
        NewMember.setForeground(new java.awt.Color(255, 255, 255));
        NewMember.setText("New Member");
        NewMember.setBorder(null);
        NewMember.setContentAreaFilled(false);
        NewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewMemberActionPerformed(evt);
            }
        });

        Profile.setBackground(new Color(96, 81, 41));
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setText("Profiles");
        Profile.setBorder(null);
        Profile.setContentAreaFilled(false);
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        jButton5.setBackground(new Color(96, 81, 41));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Plans");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Payment.setBackground(new Color(96, 81, 41));
        Payment.setForeground(new java.awt.Color(255, 255, 255));
        Payment.setText("Payments");
        Payment.setBorder(null);
        Payment.setContentAreaFilled(false);
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });

        Logs.setBackground(new Color(96, 81, 41));
        Logs.setForeground(new java.awt.Color(255, 255, 255));
        Logs.setText("Logs");
        Logs.setBorder(null);
        Logs.setContentAreaFilled(false);
        Logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogsActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new Color(210, 97, 69));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Members Profile");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPane1PropertyChange(evt);
            }
        });

        profileTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        profileTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileTable.setGridColor(new java.awt.Color(0, 0, 0));
        profileTable.setShowGrid(true);
        profileTable.getTableHeader().setReorderingAllowed(false);
        profileTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                profileTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(profileTable);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        searchMember.setShowGrid(true);
        jScrollPane2.setViewportView(searchMember);

        searchButton_Member.setText("Search");
        searchButton_Member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton_MemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(385, 385, 385)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton_Member))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1052, 1052, 1052)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton_Member)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(NewMember)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateDelete)
                        .addGap(18, 18, 18)
                        .addComponent(Profile)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDeleteActionPerformed
        dispose();
        updateMember x = new updateMember();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_UpdateDeleteActionPerformed

    private void NewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewMemberActionPerformed
        dispose();
        NewMember x = new NewMember();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_NewMemberActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        dispose();
        gymPayment x = new gymPayment();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_PaymentActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
       
    }//GEN-LAST:event_searchKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void LogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsActionPerformed
     dispose();
        gymLogs x = new gymLogs();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_LogsActionPerformed

    private void profileTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_profileTablePropertyChange
    JTableHeader tableHeader = profileTable.getTableHeader();
    
    //profileTable.setBack
    
    // Create a custom renderer for the header
    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
    headerRenderer.setBackground(Color.decode("#191919"));
    headerRenderer.setForeground(Color.WHITE);
    headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
    // Set header height
    tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 40));

    // Set the custom renderer for each column
    for (int i = 0; i < profileTable.getColumnModel().getColumnCount(); i++) {
        profileTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    }

    // This is optional to ensure the header re-renders properly
    tableHeader.repaint();
    }//GEN-LAST:event_profileTablePropertyChange

    private void jScrollPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPane1PropertyChange

    }//GEN-LAST:event_jScrollPane1PropertyChange

    private void searchButton_MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton_MemberActionPerformed
        String ID;
        int notFound = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/gym";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID = search.getText();
            if("".equals(ID)){
                JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Dialog", JOptionPane.ERROR_MESSAGE);
            }else{
                String sql = "SELECT * FROM member WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                    
                DefaultTableModel model = (DefaultTableModel) searchMember.getModel();
                searchMember.setModel(model);
                
                String name,mobile_number,age,sex,ecn,ecnum,plan;
                
                while (rs.next()) {
                    name = (rs.getString("name"));
                    mobile_number = (rs.getString("mobile_number"));
                    age = (rs.getString("age"));
                    sex =(rs.getString("sex"));
                    ecn = (rs.getString("emergency_contact_name"));
                    ecnum = (rs.getString("emergency_contact_number"));
                    plan = (rs.getString("plan"));
                    
                    model.addRow(new Object[]{name, mobile_number,age, sex,ecn,ecnum,plan});
                    notFound = 1;
                    
                    
                }if (notFound == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog", JOptionPane.ERROR_MESSAGE);
                }con.close();
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_searchButton_MemberActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileActionPerformed

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
            java.util.logging.Logger.getLogger(gymProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gymProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gymProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gymProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gymProfile x = new gymProfile();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
            }
        });
        

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton Logs;
    private javax.swing.JButton NewMember;
    private javax.swing.JButton Payment;
    private javax.swing.JButton Profile;
    private javax.swing.JButton UpdateDelete;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable profileTable;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchButton_Member;
    private javax.swing.JTable searchMember;
    // End of variables declaration//GEN-END:variables
}
