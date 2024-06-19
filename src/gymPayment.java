import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class gymPayment extends javax.swing.JFrame {

    /**
     * Creates new form gymPayment
     */
    public gymPayment() {
        initComponents();
        setTitle("Payment");
    }

    public void loadData(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:MySQL://localhost:3306/gym";
        String user = "root";
        String pass = "";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Plan", "Amount", "Date paid", "Date expiration"}, 0);
        paymentTable.setModel(model);
        
        String sql = "SELECT member.id, member.name, member.plan, payment.amount, payment.date_paid, payment.date_expiration " + "FROM member " + "JOIN payment ON member.id = payment.id";
        ResultSet rs = st.executeQuery(sql);
        
        String i, n, p, am, dp, de;
        
        while(rs.next()){
            i = rs.getString("id");
            n = rs.getString("name");
            p = rs.getString("plan");
            am = rs.getString("amount");
            dp = rs.getString("date_paid");
            de = rs.getString("date_expiration");
            model.addRow(new Object[]{i, n, p, am, dp, de});
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
        jButton6 = new javax.swing.JButton();
        Logs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        payment_logs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchpaymentTable = new javax.swing.JTable();
        searchButton_Payment = new javax.swing.JButton();

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

        jButton6.setBackground(new Color(96, 81, 41));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Payments");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(UpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new Color(210, 97, 69));

        payment_logs.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        payment_logs.setText("Payment Logs");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jScrollPane1PropertyChange(evt);
            }
        });

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Name", "Plan", "Amount", "Date Paid", "Date Expiration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        paymentTable.setShowGrid(true);
        paymentTable.getTableHeader().setReorderingAllowed(false);
        paymentTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                paymentTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(paymentTable);
        if (paymentTable.getColumnModel().getColumnCount() > 0) {
            paymentTable.getColumnModel().getColumn(0).setResizable(false);
            paymentTable.getColumnModel().getColumn(1).setResizable(false);
            paymentTable.getColumnModel().getColumn(2).setResizable(false);
            paymentTable.getColumnModel().getColumn(3).setResizable(false);
            paymentTable.getColumnModel().getColumn(4).setResizable(false);
            paymentTable.getColumnModel().getColumn(5).setResizable(false);
        }

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        searchpaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        searchpaymentTable.setShowGrid(true);
        searchpaymentTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(searchpaymentTable);

        searchButton_Payment.setText("Search");
        searchButton_Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton_PaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(payment_logs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton_Payment))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment_logs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton_Payment)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed

    }//GEN-LAST:event_searchKeyPressed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        dispose();
        gymProfile x = new gymProfile();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_ProfileActionPerformed

    private void LogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsActionPerformed
        dispose();
        gymLogs x = new gymLogs();
        x.setVisible(true);
        x.loadData();
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_LogsActionPerformed

    private void paymentTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_paymentTablePropertyChange
    JTableHeader tableHeader = paymentTable.getTableHeader();
    //profileTable.setBack
    
    // Create a custom renderer for the header
    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
    headerRenderer.setBackground(Color.decode("#191919"));
    headerRenderer.setForeground(Color.WHITE);
    headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
     // Set header height
     tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 40));


    // Set the custom renderer for each column
    for (int i = 0; i < paymentTable.getColumnModel().getColumnCount(); i++) {
        paymentTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    }

    // This is optional to ensure the header re-renders properly
    tableHeader.repaint();
    }//GEN-LAST:event_paymentTablePropertyChange

    private void jScrollPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jScrollPane1PropertyChange

    }//GEN-LAST:event_jScrollPane1PropertyChange

    private void searchButton_PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton_PaymentActionPerformed
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

                DefaultTableModel model = (DefaultTableModel) searchpaymentTable.getModel();
                model.setRowCount(0);
                
                if (rs.next()) {
                    Object[] row = new Object[7];
                    row[0] = rs.getString("name");
                    row[1] = rs.getString("mobile_number");
                    row[2] = rs.getString("age");
                    row[3] = rs.getString("sex");
                    row[4] = rs.getString("emergency_contact_name");
                    row[5] = rs.getString("emergency_contact_number");
                    row[6] = rs.getString("plan");
                    
                    model.addRow(row);
                    notFound = 1;
                    
                    con.close();
                }if (notFound == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_searchButton_PaymentActionPerformed

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
            java.util.logging.Logger.getLogger(gymPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gymPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gymPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gymPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gymPayment x = new gymPayment();
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
    private javax.swing.JButton Profile;
    private javax.swing.JButton UpdateDelete;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable paymentTable;
    private javax.swing.JLabel payment_logs;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchButton_Payment;
    private javax.swing.JTable searchpaymentTable;
    // End of variables declaration//GEN-END:variables
}
