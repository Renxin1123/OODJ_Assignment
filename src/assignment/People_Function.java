/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class People_Function extends javax.swing.JFrame {


    public People_Function() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbPeople = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeople = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtICPass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Register, Modify, View and Search Records of Citizens or Non-Citizens");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Please choose a group:");

        cmbPeople.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbPeople.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Citizens", "Non-Citizens" }));
        cmbPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPeopleActionPerformed(evt);
            }
        });

        tblPeople.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblPeople.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Phone Number", "Address", "IC/Passport No.", "Dose", "Date", "Time", "Center Code", "Center Name", "Center Address", "Vaccine", "Batch", "Dose", "Date", "Time", "Center Code", "Center Name", "Center Address", "Vaccine", "Batch"
            }
        ));
        jScrollPane1.setViewportView(tblPeople);

        btnView.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Search Here:");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("IC/Passport No.:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Username:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Password:");

        btnRegister.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnHome.setText("<< Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName)
                                        .addComponent(cmbPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtICPass)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(222, 222, 222)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(60, 60, 60)
                                            .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9))
                                            .addGap(72, 72, 72)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(92, 92, 92)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(317, 317, 317)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnHome)))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(440, 440, 440))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnHome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnRegister)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnModify))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnView))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmbPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtICPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel8)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))))
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPeopleActionPerformed
        
    }//GEN-LAST:event_cmbPeopleActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)tblPeople.getModel();
        model.setNumRows(0);
        
        if(cmbPeople.getSelectedIndex()==0)
        {
            File file = new File("Citizens.txt");     
        
            try
            {
                Scanner Sc = new Scanner(file);
                while(Sc.hasNext())
                {
                    String[] line = Sc.nextLine().split(";");
                    model.addRow(line);
                }
            }
            catch(FileNotFoundException ex)
            {
            
            }   
        }
        else if(cmbPeople.getSelectedIndex()==1)
        {
            File file = new File("NonCitizens.txt");     
        
            try
            {
                Scanner Sc = new Scanner(file);
                while(Sc.hasNext())
                {
                    String[] line = Sc.nextLine().split(";");
                    model.addRow(line);
                }
            }
            catch(FileNotFoundException ex)
            {
            
            }   
        }
        else if(cmbPeople.getSelectedIndex()==2)
        {
            File file1 = new File("Citizens.txt");  
            File file2 = new File("NonCitizens.txt");  
        
            try
            {
                Scanner Sc1 = new Scanner(file1);
                Scanner Sc2 = new Scanner(file2);
                while(Sc1.hasNext())
                {
                    String[] line = Sc1.nextLine().split(";");
                    model.addRow(line);
                }
                while(Sc2.hasNext())
                {
                    String[] line = Sc2.nextLine().split(";");
                    model.addRow(line);
                }
            }
            catch(FileNotFoundException ex)
            {
            
            }  
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)tblPeople.getModel();
        model.setNumRows(0);
        
        if(cmbPeople.getSelectedIndex()==0)
        {
            File file = new File("Citizens.txt");
        
            try
            {
                Scanner Sc = new Scanner(file);
                while(Sc.hasNext())
                {
                    String[] line = Sc.nextLine().split(";");
                    if(line[0].equals(txtSearch.getText()) || line[1].equals(txtSearch.getText()) || 
                        line[2].equals(txtSearch.getText()) || line[3].equals(txtSearch.getText()) ||
                        line[4].equals(txtSearch.getText()) || line[5].equals(txtSearch.getText()) || 
                        line[6].equals(txtSearch.getText()) || line[7].equals(txtSearch.getText()) || 
                        line[8].equals(txtSearch.getText()) || line[9].equals(txtSearch.getText()) || 
                        line[10].equals(txtSearch.getText()) || line[11].equals(txtSearch.getText()) || 
                        line[12].equals(txtSearch.getText()) || line[13].equals(txtSearch.getText()) ||
                        line[14].equals(txtSearch.getText()) || line[15].equals(txtSearch.getText()) || 
                        line[16].equals(txtSearch.getText()) || line[17].equals(txtSearch.getText()) || 
                        line[18].equals(txtSearch.getText()) || line[19].equals(txtSearch.getText()) || 
                        line[20].equals(txtSearch.getText()))
                    {   
                        // Add data from text file to jtable
                        Object[] obj = new Object[25];
                        obj[0] = line[0];
                        obj[1] = line[1];
                        obj[2] = line[2];
                        obj[3] = line[3];   
                        obj[4] = line[4];
                        obj[5] = line[5];
                        obj[6] = line[6];
                        obj[7] = line[7];
                        obj[8] = line[8];   
                        obj[9] = line[9];
                        obj[10] = line[10];
                        obj[11] = line[11];
                        obj[12] = line[12];
                        obj[13] = line[13];   
                        obj[14] = line[14];
                        obj[15] = line[15];
                        obj[16] = line[16];
                        obj[17] = line[17];
                        obj[18] = line[18];   
                        obj[19] = line[19];
                        obj[20] = line[20];
                        model.addRow(obj);
                    
                        System.out.println("People Found!");
                    }
                    else
                    {
                        System.out.println("People Not Found!!!");
                    }
                }
            }
            catch(FileNotFoundException fx)
            {
            
            }     
        }
        else if(cmbPeople.getSelectedIndex()==1)
        {
            File file = new File("NonCitizens.txt");
        
            try
            {
                Scanner Sc = new Scanner(file);
                while(Sc.hasNext())
                {
                    String[] line = Sc.nextLine().split(";");
                    if(line[0].equals(txtSearch.getText()) || line[1].equals(txtSearch.getText()) || 
                        line[2].equals(txtSearch.getText()) || line[3].equals(txtSearch.getText()) ||
                        line[4].equals(txtSearch.getText()) || line[5].equals(txtSearch.getText()) || 
                        line[6].equals(txtSearch.getText()) || line[7].equals(txtSearch.getText()) || 
                        line[8].equals(txtSearch.getText()) || line[9].equals(txtSearch.getText()) || 
                        line[10].equals(txtSearch.getText()) || line[11].equals(txtSearch.getText()) || 
                        line[12].equals(txtSearch.getText()) || line[13].equals(txtSearch.getText()) ||
                        line[14].equals(txtSearch.getText()) || line[15].equals(txtSearch.getText()) || 
                        line[16].equals(txtSearch.getText()) || line[17].equals(txtSearch.getText()) || 
                        line[18].equals(txtSearch.getText()) || line[19].equals(txtSearch.getText()) || 
                        line[20].equals(txtSearch.getText()))
                    {   
                        // Add data from text file to jtable
                        Object[] obj = new Object[25];
                        obj[0] = line[0];
                        obj[1] = line[1];
                        obj[2] = line[2];
                        obj[3] = line[3];   
                        obj[4] = line[4];
                        obj[5] = line[5];
                        obj[6] = line[6];
                        obj[7] = line[7];
                        obj[8] = line[8];   
                        obj[9] = line[9];
                        obj[10] = line[10];
                        obj[11] = line[11];
                        obj[12] = line[12];
                        obj[13] = line[13];   
                        obj[14] = line[14];
                        obj[15] = line[15];
                        obj[16] = line[16];
                        obj[17] = line[17];
                        obj[18] = line[18];   
                        obj[19] = line[19];
                        obj[20] = line[20];
                        model.addRow(obj);
                    
                        System.out.println("People Found!");
                    }
                    else
                    {
                        System.out.println("People Not Found!!!");
                    }
                }
            }
            catch(FileNotFoundException fx)
            {
            
            }     
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)tblPeople.getModel();
        int choice;
        if(cmbPeople.getSelectedIndex()==0)
        {
            choice = JOptionPane.showOptionDialog(null, "Register for Citizens ??? ", "confirmation", JOptionPane.YES_NO_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
        else
        {
            choice = JOptionPane.showOptionDialog(null, "Register for Non-Citizens ??? ", "confirmation", JOptionPane.YES_NO_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
        
        Appointment2 app = new Appointment2(null, null);
       
        if(choice==0)
        {
            if(cmbPeople.getSelectedIndex()==0)
            {
                
                Person C1 = new Person(txtName.getText(), txtUsername.getText(), 
                txtPassword.getText(),"Citizen");
            
                Citizens C2 = new Citizens(txtName.getText(), txtEmail.getText(), 
                    txtPno.getText(), txtAddress.getText(), txtICPass.getText(),app);
                
                Object[] obj = new Object[25];
                obj[0] = C2.getName();
                obj[1] = C2.getEmail();
                obj[2] = C2.getPhoneNumber();
                obj[3] = C2.getAddress();
                obj[4] = C2.getIC();
                obj[5] = "null";
                obj[6] = "null";
                obj[7] = "null";
                obj[8] = "null";
                obj[9] = "null";
                obj[10] = "null";
                obj[11] = "null";
                obj[12] = "null";
                obj[13] = "null";
                obj[14] = "null";
                obj[15] = "null";
                obj[16] = "null";
                obj[17] = "null";
                obj[18] = "null";
                obj[19] = "null";
                obj[20] = "null";
                model.addRow(obj);

                //write to file
                FileOperation Fop = new FileOperation();
                Fop.Write2SerFile("LoginDetails.ser", C1);
                Fop.Write2File("Citizens.txt", C2.toString2());
                //Fop.ReadfromSerFile("LoginDetails.ser", "Citizens");    //error
            }
            else if(cmbPeople.getSelectedIndex()==1)
            {
                Person C1 = new Person(txtName.getText(), txtUsername.getText(), 
                txtPassword.getText(),"NonCitizen");
            
                NonCitizens C2 = new NonCitizens(txtName.getText(), txtEmail.getText(), 
                    txtPno.getText(), txtAddress.getText(), txtICPass.getText(),app);
                
                Object[] obj = new Object[25];
                obj[0] = C2.getName();
                obj[1] = C2.getEmail();
                obj[2] = C2.getPhoneNumber();
                obj[3] = C2.getAddress();
                obj[4] = C2.getPassportNo();
                obj[5] = "null";
                obj[6] = "null";
                obj[7] = "null";
                obj[8] = "null";
                obj[9] = "null";
                obj[10] = "null";
                obj[11] = "null";
                obj[12] = "null";
                obj[13] = "null";
                obj[14] = "null";
                obj[15] = "null";
                obj[16] = "null";
                obj[17] = "null";
                obj[18] = "null";
                obj[19] = "null";
                obj[20] = "null";
                model.addRow(obj);
                
                //write to file
                FileOperation Fop = new FileOperation();
                Fop.Write2SerFile("LoginDetails.ser", C1);
                Fop.Write2File("NonCitizens.txt", C2.toString2());
                //Fop.ReadfromSerFile("LoginDetails.ser", "Citizens");    //error
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)tblPeople.getModel();
        int SelRow = tblPeople.getSelectedRow();
        
        // Display the data from the selected rows into textfield
        txtName.setText(model.getValueAt(SelRow, 0).toString());
        txtEmail.setText(model.getValueAt(SelRow, 1).toString());
        txtPno.setText(model.getValueAt(SelRow, 2).toString());
        txtAddress.setText(model.getValueAt(SelRow, 3).toString());
        txtICPass.setText(model.getValueAt(SelRow, 4).toString());
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)tblPeople.getModel();
        int SelRow = tblPeople.getSelectedRow();
        /*Citizens C1 = new Citizens(model.getValueAt(SelRow, 0).toString(),
                model.getValueAt(SelRow, 1).toString(),model.getValueAt(SelRow, 2).toString(),
                model.getValueAt(SelRow, 3).toString(),model.getValueAt(SelRow, 4).toString());*/

        //Display updated data in jtable
        model.setValueAt(txtName.getText(),SelRow,0);
        model.setValueAt(txtEmail.getText(),SelRow,1);
        model.setValueAt(txtPno.getText(),SelRow,2);
        model.setValueAt(txtAddress,SelRow,3);
        model.setValueAt(txtICPass.getText(),SelRow,4);
        
        Appointment1 app1 = new Appointment1(model.getValueAt(SelRow, 6).toString(), model.getValueAt(SelRow, 6).toString());
        Vaccination_Center vacCenter1 = new Vaccination_Center(model.getValueAt(SelRow, 8).toString(), 
                model.getValueAt(SelRow, 9).toString(),model.getValueAt(SelRow, 10).toString(), 
                model.getValueAt(SelRow, 11).toString(),model.getValueAt(SelRow, 12).toString());
        app1.setVacCenter(vacCenter1);
        
        Appointment2 app2 = new Appointment2(model.getValueAt(SelRow, 6).toString(), model.getValueAt(SelRow, 7).toString(), vacCenter1,
            model.getValueAt(SelRow, 14).toString(), model.getValueAt(SelRow, 15).toString());
        Vaccination_Center vacCenter2 = new Vaccination_Center(model.getValueAt(SelRow, 16).toString(), 
                model.getValueAt(SelRow, 17).toString(),model.getValueAt(SelRow, 18).toString(), 
                model.getValueAt(SelRow, 19).toString(),model.getValueAt(SelRow, 20).toString());
        app2.setVacCenter(vacCenter2);
        
        Citizens C1 = new Citizens(txtName.getText(), txtEmail.getText(), 
                    txtPno.getText(), txtAddress.getText(), txtICPass.getText(),app2);
        
        FileOperation fop = new FileOperation();
        fop.ModifyTextFile("Citizens.txt", SelRow, C1.toString2());
        
        System.out.println("Updated Successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        
        JOptionPane.showMessageDialog(null,"Home Page");
        this.dispose();    //hide the login form after validated
        Committee_Home home = new Committee_Home();        //go to another frame
        home.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(People_Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(People_Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(People_Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(People_Function.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new People_Function().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbPeople;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeople;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtICPass;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPno;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
