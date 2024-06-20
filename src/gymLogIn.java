import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

public class gymLogIn extends javax.swing.JFrame {
    private final gymLogs logsFormInstance;
    
    ImageIcon logo = new ImageIcon( "Gym.png");
    //ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("Gym.png")); //---if turn into jar file.setIconImage(logo.getImage()); 
    
    public gymLogIn(gymLogs logsFormInstance) {
        this.logsFormInstance = logsFormInstance;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Gym Log In");
        //setIconImage(logo.getImage());
    }
    
    public void loadData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/gym";
            String user = "root";
            String pass = "";
        
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            String sql = "SELECT * FROM member";
            ResultSet rs = st.executeQuery(sql);
            
            String i, n, d, t;
            
            while(rs.next()){
                i = rs.getString("id");
                n = rs.getString("name");
                d = rs.getString("date");
                t = rs.getString("time_in");
            }
            
        }catch(Exception e){
        System.out.println("Error " + e.getMessage());
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel(logo);
        jPanel1 = new javax.swing.JPanel();
        Search = new javax.swing.JTextField();
        loginMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setSize(650, 450);
        jLabel1.setText(null);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new Color(98, 39, 24));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        Search.setEditable(false);
        Search.setForeground(Color.lightGray);
        Search.setText("Enter Member ID");
        Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchFocusLost(evt);
            }
        });
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchMouseExited(evt);
            }
        });
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchKeyPressed(evt);
            }
        });

        loginMember.setText("Log In");
        loginMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(loginMember, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(loginMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Search.setFocusable(false);
        Search.setFocusable(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchFocusLost
        if("".equals(Search.getText())){
            Search.setText("Enter Member ID");
            Search.setForeground(Color.lightGray);
            Search.setEditable(false);
        }
    }//GEN-LAST:event_SearchFocusLost

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        if("Enter Member ID".equals(Search.getText())){
            Search.setText("");
            Search.setForeground(Color.black);
            Search.setEditable(true);
        }
    }//GEN-LAST:event_SearchMouseClicked

    private void SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseExited

    }//GEN-LAST:event_SearchMouseExited

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed
        
    }//GEN-LAST:event_SearchKeyPressed

    private void loginMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMemberActionPerformed
        String ID, query2;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/gym";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            ID = Search.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(new JFrame(), "Insert Member ID", "Dialog", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM member WHERE id = '" + ID + "'";
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    String memberID = rs.getString("id");
                    String memberName = rs.getString("name");
                    
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
                    String time_in = LocalTime.now().format(formatter);
                    String date = LocalDate.now().toString();
                    
                    logsFormInstance.addLogEntry(memberID, memberName);
                    
                    query2 = "INSERT INTO time (date, time_in)" + "VALUES ('"+date+"', '"+time_in+"')";
                    st.executeUpdate(query2);
                    
                    showMessageDialog(null, "Successfully registered");
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Member ID not found", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
            loadData();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_loginMemberActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Search.setFocusable(false);
        Search.setFocusable(true);
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(gymLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gymLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gymLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gymLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gymLogs logsFormInstance = new gymLogs();
                gymLogIn x = new gymLogIn(logsFormInstance);
                x.setVisible(true);
                x.setLocationRelativeTo(null);
                x.loadData();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginMember;
    // End of variables declaration//GEN-END:variables
}
