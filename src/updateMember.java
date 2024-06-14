import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class updateMember extends javax.swing.JFrame {

    /**
     * Creates new form updateMember
     */
    public updateMember() {
        initComponents();
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
            
            String i, n, m, a, s, em, eb, p;
            
            while(rs.next()){
                i = rs.getString("id");
                n = rs.getString("name");
                m = rs.getString("mobile_number");
                a = rs.getString("age");
                s = rs.getString("sex");
                em = rs.getString("emergency_contact_name");
                eb = rs.getString("emergency_contact_number");
                p = rs.getString("plan");
            }
        }catch(Exception e){
        System.out.println("Error " + e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UpdateDelete = new javax.swing.JButton();
        NewMember = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Payment = new javax.swing.JButton();
        Logs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        d = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        g = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(UpdateDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new Color(210, 97, 69));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Update/Delete");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mobile Number");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Sex");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Emergency Contact Name");

        d.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female" }));
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Emergency Contact Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Plan");

        g.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Daily", "Half Month", "Monthly" }));
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setText("Clear All");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        search.setBorder(null);
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Search");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(g, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDeleteActionPerformed
        
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
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_PaymentActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String ID;
        int notFound = 0;
        String nE, mR, aE, sX, eE, eR, pN, query2, dP, dE, aM;
        
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
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime startDateTime = LocalDateTime.now();
                Duration duration = Duration.ofDays(30);
                Duration duration2 = Duration.ofDays(15);
                LocalDateTime expirationDateTime = startDateTime.plus(duration);
                LocalDateTime expirationDateTime2 = startDateTime.plus(duration2);
                String formattedExpirationDateTime = expirationDateTime.format(formatter);
                String formattedExpirationDateTime2 = expirationDateTime2.format(formatter);
                
                String sql = "SELECT * FROM member WHERE id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                
                LocalDateTime now = LocalDateTime.now();
                    String formattedDateTime = now.format(formatter);
                    
                while(rs.next()){
                    notFound = 1;
                    nE = a.getText();
                    mR = b.getText();
                    aE = c.getText();
                    sX = (String) d.getSelectedItem();
                    eE = e.getText();
                    eR = f.getText();
                    pN = (String) g.getSelectedItem();
                    String sql2 = "UPDATE member SET name='"+nE+"', mobile_number='"+mR+"', age='"+aE+"', sex='"+sX+"', emergency_contact_name='"+eE+"', emergency_contact_number='"+eR+"', plan='"+pN+"' WHERE id=" + ID;
                    st.executeUpdate(sql2);
                    
                    if("Daily".equals(pN)){
                    aM = String.valueOf(70);
                    dP = formattedDateTime;
                    dE = formattedDateTime;
                    
                    query2 = "UPDATE payment SET amount='"+aM+"', date_paid='"+dP+"', date_expiration='"+dE+"' WHERE id=" + ID;
                    st.executeUpdate(query2);
                }else if("Half Month".equals(pN)){
                    aM = String.valueOf(400);
                    dP = formattedDateTime;
                    dE = formattedExpirationDateTime2;
                    
                    query2 = "UPDATE payment SET amount='"+aM+"', date_paid='"+dP+"', date_expiration='"+dE+"' WHERE id=" + ID;
                    st.executeUpdate(query2);
                }else if("Monthly".equals(pN)){
                    aM = String.valueOf(700);
                    dP = formattedDateTime;
                    dE = formattedExpirationDateTime;
                    
                    query2 = "UPDATE payment SET amount='"+aM+"', date_paid='"+dP+"', date_expiration='"+dE+"' WHERE id=" + ID;
                    st.executeUpdate(query2);
                }
                    
                    loadData();
                    con.close();
                }if(notFound == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog", JOptionPane.ERROR_MESSAGE);   
                }
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        a.setText("");
        b.setText("");
        c.setText("");
        e.setText("");
        f.setText("");
        d.setSelectedItem(" ");
        g.setSelectedItem(" ");
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
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
                while(rs.next()){
                    notFound = 1;
                    String sql2 = "DELETE FROM member WHERE id=" + ID;
                    st.executeUpdate(sql2);
                    loadData();
                    con.close();
                }if (notFound == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        String ID;
        int notFound = 0;
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
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
                while(rs.next()){
                    a.setText(rs.getString("name"));
                    b.setText(rs.getString("mobile_number"));
                    c.setText(rs.getString("age"));
                    d.setSelectedItem(rs.getString("sex"));
                    e.setText(rs.getString("emergency_contact_name"));
                    f.setText(rs.getString("emergency_contact_number"));
                    g.setSelectedItem(rs.getString("plan"));
                    notFound = 1;
                    
                    con.close();
                }if(notFound == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog", JOptionPane.ERROR_MESSAGE);   
                }
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
            }
        }    
    }//GEN-LAST:event_searchKeyPressed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        dispose();
        gymProfile x = new gymProfile();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_ProfileActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void LogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogsActionPerformed

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
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                updateMember x = new updateMember();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logs;
    private javax.swing.JButton NewMember;
    private javax.swing.JButton Payment;
    private javax.swing.JButton Profile;
    private javax.swing.JButton UpdateDelete;
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> d;
    private javax.swing.JButton delete;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JComboBox<String> g;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
