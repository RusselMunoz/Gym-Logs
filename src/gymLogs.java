import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class gymLogs extends javax.swing.JFrame {
    
    public gymLogs() {
        initComponents();
        setTitle("Member Log");
    }
    
    public void loadData(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:MySQL://localhost:3306/gym";
        String user = "root";
        String pass = "";
        
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Date", "Time In"}, 0);
        logsForm.setModel(model);
        
        String sql = "SELECT member.id, member.name, time.date, time.time_in " + "FROM member " + "JOIN time ON member.id = time.id";
        
        ResultSet rs = st.executeQuery(sql);
        
        String i, n, tn, to;
        
        while(rs.next()){
            i = rs.getString("id");
            n = rs.getString("name");
            tn = rs.getString("date");
            to = rs.getString("time_in");
            model.addRow(new Object[]{i, n, tn, to});
        }  
        
        
    }catch(Exception e){
        System.out.println("Error " + e.getMessage());
    }
}
    
    public void addLogEntry(String memberID, String memberName) {
        // Get current time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String timeIn = LocalTime.now().format(formatter);
        String date = LocalDate.now().toString();
        
        // Add a new row to the JTable
        DefaultTableModel model = (DefaultTableModel) logsForm.getModel();
        model.addRow(new Object[]{memberID, memberName, date, timeIn});
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UpdateDelete = new javax.swing.JButton();
        NewMember = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        Logs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logsForm = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchLogs = new javax.swing.JButton();
        gymLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(98, 39, 24));

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

        payment.setBackground(new Color(96, 81, 41));
        payment.setForeground(new java.awt.Color(255, 255, 255));
        payment.setText("Payments");
        payment.setBorder(null);
        payment.setContentAreaFilled(false);
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
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
        jLabel1.setText("Logs");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        logsForm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Name", "Date", "Time In"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logsForm.setShowGrid(true);
        logsForm.getTableHeader().setReorderingAllowed(false);
        logsForm.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                logsFormPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(logsForm);
        if (logsForm.getColumnModel().getColumnCount() > 0) {
            logsForm.getColumnModel().getColumn(0).setResizable(false);
            logsForm.getColumnModel().getColumn(1).setResizable(false);
            logsForm.getColumnModel().getColumn(2).setResizable(false);
            logsForm.getColumnModel().getColumn(3).setResizable(false);
        }

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        searchLogs.setText("Search");
        searchLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLogsActionPerformed(evt);
            }
        });

        gymLog.setText("Gym Log in");
        gymLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gymLogActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gymLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchLogs))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLogs)
                            .addComponent(gymLog)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(NewMember)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateDelete)
                        .addGap(18, 18, 18)
                        .addComponent(Profile)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed

    }//GEN-LAST:event_searchKeyPressed

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
        x.loadData();
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_NewMemberActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        dispose();
        gymProfile x = new gymProfile();
        x.setVisible(true);
        x.loadData();
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_ProfileActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        dispose();
        gymPayment x = new gymPayment();
        x.setVisible(true);
        x.loadData();
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_paymentActionPerformed

    private void LogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogsActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void logsFormPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_logsFormPropertyChange
    JTableHeader tableHeader = logsForm.getTableHeader();
    //profileTable.setBack
    
    // Create a custom renderer for the header
    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
    headerRenderer.setBackground(Color.decode("#191919"));
    headerRenderer.setForeground(Color.WHITE);
    headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
     // Set header height
     tableHeader.setPreferredSize(new Dimension(tableHeader.getPreferredSize().width, 40));


    // Set the custom renderer for each column
    for (int i = 0; i < logsForm.getColumnModel().getColumnCount(); i++) {
        logsForm.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
    }

    // This is optional to ensure the header re-renders properly
    tableHeader.repaint();
    }//GEN-LAST:event_logsFormPropertyChange

    private void searchLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLogsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchLogsActionPerformed

    private void gymLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gymLogActionPerformed
        gymLogIn x = new gymLogIn(this);
        x.setVisible(true); 
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_gymLogActionPerformed

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
            java.util.logging.Logger.getLogger(gymLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gymLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gymLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gymLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gymLogs x = new gymLogs();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logs;
    private javax.swing.JButton NewMember;
    private javax.swing.JButton Profile;
    private javax.swing.JButton UpdateDelete;
    private javax.swing.JButton gymLog;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable logsForm;
    private javax.swing.JButton payment;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchLogs;
    // End of variables declaration//GEN-END:variables
}
