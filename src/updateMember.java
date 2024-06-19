import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class updateMember extends javax.swing.JFrame {

    /**
     * Creates new form updateMember
     */
    public updateMember() {
        initComponents();
        setTitle("Update Member");
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

        Header = new javax.swing.JPanel();
        UpdateDelete = new javax.swing.JButton();
        NewMember = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Payment = new javax.swing.JButton();
        Logs = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Update_Delete = new javax.swing.JLabel();
        name_Text = new javax.swing.JLabel();
        name_Label = new javax.swing.JTextField();
        mobilenumber_Text = new javax.swing.JLabel();
        mobile_numberLabel = new javax.swing.JTextField();
        age_Text = new javax.swing.JLabel();
        ageLabel = new javax.swing.JTextField();
        sex_Text = new javax.swing.JLabel();
        emergencycontactName_Text = new javax.swing.JLabel();
        contactname_Label = new javax.swing.JTextField();
        sexComboBox = new javax.swing.JComboBox<>();
        emergencycontactNumber_Text = new javax.swing.JLabel();
        contactnumber_Label = new javax.swing.JTextField();
        plan_Text = new javax.swing.JLabel();
        planComboBox = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        member_searchButton = new javax.swing.JButton();

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
                .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Logs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new Color(210, 97, 69));

        Update_Delete.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Update_Delete.setText("Update/Delete");

        name_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_Text.setText("Name");

        mobilenumber_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mobilenumber_Text.setText("Mobile Number");

        mobile_numberLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_numberLabelActionPerformed(evt);
            }
        });

        age_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age_Text.setText("Age");

        sex_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sex_Text.setText("Sex");

        emergencycontactName_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emergencycontactName_Text.setText("Emergency Contact Name");

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female" }));
        sexComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexComboBoxActionPerformed(evt);
            }
        });

        emergencycontactNumber_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emergencycontactNumber_Text.setText("Emergency Contact Number");

        plan_Text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        plan_Text.setText("Plan");

        planComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Daily", "Half Month", "Monthly" }));
        planComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planComboBoxActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        member_searchButton.setBackground(new Color(210, 97, 69));
        member_searchButton.setText("Search");
        member_searchButton.setBorder(null);
        member_searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                member_searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilenumber_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile_numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sex_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(member_searchButton))
                    .addComponent(contactname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencycontactName_Text)
                    .addComponent(emergencycontactNumber_Text)
                    .addComponent(contactnumber_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plan_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(planComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_searchButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencycontactName_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactname_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilenumber_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emergencycontactNumber_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobile_numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactnumber_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plan_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(sex_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_PaymentActionPerformed

    private void sexComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexComboBoxActionPerformed

    private void planComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planComboBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
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
                    nE = name_Label.getText();
                    mR = mobile_numberLabel.getText();
                    aE = ageLabel.getText();
                    sX = (String) sexComboBox.getSelectedItem();
                    eE = contactname_Label.getText();
                    eR = contactnumber_Label.getText();
                    pN = (String) planComboBox.getSelectedItem();
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
                }if(notFound == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog", JOptionPane.ERROR_MESSAGE);   
                }
                con.close();
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        name_Label.setText("");
        mobile_numberLabel.setText("");
        ageLabel.setText("");
        contactname_Label.setText("");
        contactnumber_Label.setText("");
        sexComboBox.setSelectedItem(" ");
        planComboBox.setSelectedItem(" ");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
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
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        dispose();
        gymProfile x = new gymProfile();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_ProfileActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void LogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsActionPerformed
        dispose();
        gymLogs x = new gymLogs();
                x.setVisible(true);
                x.loadData();
                x.setLocationRelativeTo(null);
    }//GEN-LAST:event_LogsActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void mobile_numberLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_numberLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_numberLabelActionPerformed

    private void member_searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_searchButtonActionPerformed
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
                    name_Label.setText(rs.getString("name"));
                    mobile_numberLabel.setText(rs.getString("mobile_number"));
                    ageLabel.setText(rs.getString("age"));
                    sexComboBox.setSelectedItem(rs.getString("sex"));
                    contactname_Label.setText(rs.getString("emergency_contact_name"));
                    contactnumber_Label.setText(rs.getString("emergency_contact_number"));
                    planComboBox.setSelectedItem(rs.getString("plan"));
                    notFound = 1;
                    
                    
                }if (notFound == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog", JOptionPane.ERROR_MESSAGE);
                }
                con.close();
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_member_searchButtonActionPerformed

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
    private javax.swing.JPanel Header;
    private javax.swing.JButton Logs;
    private javax.swing.JButton NewMember;
    private javax.swing.JButton Payment;
    private javax.swing.JButton Profile;
    private javax.swing.JButton UpdateDelete;
    private javax.swing.JLabel Update_Delete;
    private javax.swing.JTextField ageLabel;
    private javax.swing.JLabel age_Text;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField contactname_Label;
    private javax.swing.JTextField contactnumber_Label;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emergencycontactName_Text;
    private javax.swing.JLabel emergencycontactNumber_Text;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton member_searchButton;
    private javax.swing.JTextField mobile_numberLabel;
    private javax.swing.JLabel mobilenumber_Text;
    private javax.swing.JTextField name_Label;
    private javax.swing.JLabel name_Text;
    private javax.swing.JComboBox<String> planComboBox;
    private javax.swing.JLabel plan_Text;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> sexComboBox;
    private javax.swing.JLabel sex_Text;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
