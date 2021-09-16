package javaapplication;

import java.io.IOException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListModel;

public class LandscapeGUI extends javax.swing.JFrame {
    DefaultListModel<Customer> customerList = new DefaultListModel();
    private final double GRASS_PER_SQFT = 5.00;
    private final double GRAVEL_PER_SQFT = 2.00;

    public LandscapeGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        btgYardtype1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btgYardtype = new javax.swing.ButtonGroup();
        tabMain = new javax.swing.JTabbedPane();
        pnlWelcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblGrassCost = new java.awt.Label();
        btnReset = new java.awt.Button();
        btnNext = new java.awt.Button();
        lblInstruction1 = new java.awt.Label();
        lblGravelCost = new java.awt.Label();
        rdoGrass = new javax.swing.JRadioButton();
        rdoGravel = new javax.swing.JRadioButton();
        lblPhoto = new javax.swing.JLabel();
        lblPhoto1 = new javax.swing.JLabel();
        pnlInformation = new javax.swing.JPanel();
        txtWidth = new java.awt.TextField();
        txtLength = new java.awt.TextField();
        label5 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOrderInfo = new javax.swing.JTextPane();
        label6 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        txtName = new java.awt.TextField();
        txtAddress = new java.awt.TextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        btnCalculate = new java.awt.Button();
        btnSubmit = new java.awt.Button();
        lstCustomers1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lstCustomers = new javax.swing.JScrollPane();
        lstCustomer1 = new javax.swing.JList<>();
        txaCustomerInfo = new javax.swing.JScrollPane();
        txaCustDetails = new javax.swing.JTextArea();
        btnLoad = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        mnbMain = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        mniSubmitOrder = new javax.swing.JMenuItem();
        mniReset = new javax.swing.JMenuItem();

        label2.setText("label2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel1.setText("Bethany Landscapes");

        lblGrassCost.setText("$5 per sqft");

        btnReset.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnReset.setLabel("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnNext.setLabel("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblInstruction1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblInstruction1.setText("Would you like a grass or gravel yard?");

        lblGravelCost.setText("$2 per sqft");

        btgYardtype.add(rdoGrass);
        rdoGrass.setText("Grass");
        rdoGrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGrassActionPerformed(evt);
            }
        });

        btgYardtype.add(rdoGravel);
        rdoGravel.setText("Gravel");
        rdoGravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGravelActionPerformed(evt);
            }
        });

        lblPhoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication/dirt.jpeg"))); // NOI18N

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoGrass, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGrassCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoGravel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGravelCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(233, 233, 233))
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblInstruction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(lblPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 77, Short.MAX_VALUE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(lblInstruction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoGrass)
                            .addComponent(rdoGravel))
                        .addGap(2, 2, 2)
                        .addComponent(lblGravelCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGrassCost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblPhoto)
                .addGap(52, 52, 52))
        );

        tabMain.addTab("Welcome", pnlWelcome);

        txtWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWidthActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        label5.setText("Pleas enter your information");

        txaOrderInfo.setEditable(false);
        jScrollPane1.setViewportView(txaOrderInfo);

        label6.setText("Length(ft):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Order Summary:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("Bethany Landscapes");

        jLabel4.setText("Name:");

        label1.setText("Address:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setText("Enter the length and width of your yard:");

        label4.setText("Width(ft):");

        btnCalculate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCalculate.setLabel("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSubmit.setLabel("Submit Order");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInformationLayout = new javax.swing.GroupLayout(pnlInformation);
        pnlInformation.setLayout(pnlInformationLayout);
        pnlInformationLayout.setHorizontalGroup(
            pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformationLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(97, 97, 97))
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlInformationLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInformationLayout.createSequentialGroup()
                                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlInformationLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformationLayout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))))))
            .addGroup(pnlInformationLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel2)
                .addGap(45, 45, 45))
        );
        pnlInformationLayout.setVerticalGroup(
            pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformationLayout.createSequentialGroup()
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWidth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        tabMain.addTab("Information", pnlInformation);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("Bethany Landscapes");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Customer List");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Customer Details");

        lstCustomer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstCustomer1.setModel(customerList);
        lstCustomer1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCustomer1ValueChanged(evt);
            }
        });
        lstCustomers.setViewportView(lstCustomer1);

        txaCustDetails.setColumns(20);
        txaCustDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txaCustDetails.setRows(5);
        txaCustomerInfo.setViewportView(txaCustDetails);

        btnLoad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLoad.setText("Load List");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete Customer");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lstCustomers1Layout = new javax.swing.GroupLayout(lstCustomers1);
        lstCustomers1.setLayout(lstCustomers1Layout);
        lstCustomers1Layout.setHorizontalGroup(
            lstCustomers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lstCustomers1Layout.createSequentialGroup()
                .addGroup(lstCustomers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lstCustomers1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel5))
                    .addGroup(lstCustomers1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel6)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel7))
                    .addGroup(lstCustomers1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnDelete))
                    .addGroup(lstCustomers1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lstCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txaCustomerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        lstCustomers1Layout.setVerticalGroup(
            lstCustomers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lstCustomers1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lstCustomers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(lstCustomers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txaCustomerInfo)
                    .addComponent(lstCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(lstCustomers1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad)
                    .addComponent(btnDelete))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        tabMain.addTab("Customer List", lstCustomers1);

        mnuFile.setText("File");

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuFile.add(mniExit);

        mnbMain.add(mnuFile);

        mnuOrder.setText("Order");

        mniSubmitOrder.setText("Submit Order");
        mniSubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSubmitOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mniSubmitOrder);

        mniReset.setText("Reset");
        mniReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniResetActionPerformed(evt);
            }
        });
        mnuOrder.add(mniReset);

        mnbMain.add(mnuOrder);

        setJMenuBar(mnbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
    if (rdoGrass.isSelected() == false && rdoGravel.isSelected() == false)
        {
     JOptionPane.showMessageDialog(this, "Please select the type of yard.",
          "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
     tabMain.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void rdoGrassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGrassActionPerformed
        if (rdoGrass.isSelected())
        {
            URL location = this.getClass().getResource("grass.jpg");
            ImageIcon icon = new ImageIcon(location);
           lblPhoto1.setIcon(icon);
        }
    }//GEN-LAST:event_rdoGrassActionPerformed

    private void rdoGravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGravelActionPerformed
        if (rdoGravel.isSelected())
        {
           lblPhoto1.setIcon(new ImageIcon(this.getClass().getResource("gravel.jpg")));
        }
    }//GEN-LAST:event_rdoGravelActionPerformed

    private void txtWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWidthActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        if (validateInputs() == false) {
            return;      // end the method if validation failed
        }// create the Customer object and show the information
        Customer cust = createCustomer();
        txaOrderInfo.setText(cust.getDetails());
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            submitOrder();
        } catch (IOException ex) {
            Logger.getLogger(LandscapeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        try
		{
			// get the selected object
			Customer old = lstCustomer1.getSelectedValue();

			// if something is selected, delete it and clear the details textarea
			if (old != null)
			{
				DataIO data = new DataIO();
				data.delete(old.getCustomerID());   // get the name only
				txaCustDetails.setText("");
				loadCustomers();
			}
		}
		catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
                }

		try
		{
			// get the selected object
			Customer old = lstCustomer1.getSelectedValue();

			// if something is selected, delete it and clear the details textarea
			if (old != null)
			{
				DataIO data = new DataIO();
				data.delete(old.getCustomerID());   // get the name only
				txaCustDetails.setText("");
				loadCustomers();
			}
		}
		catch (SQLException ex)
		{
			JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void lstCustomer1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCustomer1ValueChanged
        int index = lstCustomer1.getSelectedIndex();
        if (index > -1)
        {
            Customer cust = customerList.getElementAt(index);
            txaCustDetails.setText(cust.getDetails());
        }
    }//GEN-LAST:event_lstCustomer1ValueChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // get the selected object
            Customer old = lstCustomer1.getSelectedValue();

            // if something is selected then delete it and clear the details text area
            if (old != null) {

                DataIO data = new DataIO();
                data.delete(old.getCustomerID());
                txaCustDetails.setText("");
                loadCustomers();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Dtatabase Error", JOptionPane.ERROR_MESSAGE);
       
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void mniSubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSubmitOrderActionPerformed
        try {
            submitOrder();
        } catch (IOException ex) {
            Logger.getLogger(LandscapeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mniSubmitOrderActionPerformed

    private void mniResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniResetActionPerformed
        reset();
    }//GEN-LAST:event_mniResetActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private boolean validateInputs() {
        // get inputs from user using the textboxes
        String name = txtName.getText();
        String sAddress = txtAddress.getText();
        String sWidth = txtWidth.getText();
        String sLength = txtLength.getText();
        
        // confirm that a radiobutton has been selected
        if (btgYardtype.getSelection() == null)
        {
            JOptionPane.showMessageDialog(this,
                    "Error. Please select the type of yard.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // make sure we have a name for the order
        if (name.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Name",
                    "Name Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocusInWindow();
            return false;
        }

        // make sure we have an address for the order
        if (sAddress.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Address",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sAddress.length() < 6)
        {
            JOptionPane.showMessageDialog(this, "Address must be six characters or more.",
                    "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sWidth.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Width",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.requestFocusInWindow();
            return false;
        }
        try
        {
            Double.parseDouble(sWidth);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Width must be a number",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.setText("");
            txtWidth.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sWidth) <= 0)
        {
            JOptionPane.showMessageDialog(this, "Width must be greater than 0",
                    "Width Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }

        if (sLength.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Enter a Length",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.requestFocusInWindow();
            return false;
        }
        try
        {
            Double.parseDouble(sLength);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Length must be a number",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }
        if (Double.parseDouble(sLength) <= 0)
        {
            JOptionPane.showMessageDialog(this,
                    "Length must be must be greater than 0",
                    "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }
        return true;
    }

    private Customer createCustomer()
    {
        String name = txtName.getText();
        String address = txtAddress.getText();
        double width = Double.parseDouble(txtWidth.getText());
        double length = Double.parseDouble(txtLength.getText());
        String yardType = "";
        double totalCost = 0.0;

        if (rdoGrass.isSelected())
        {
            yardType = "Grass";
            totalCost = GRASS_PER_SQFT * width * length;
        }
        else if (rdoGravel.isSelected())
        {
            yardType = "Gravel";
            totalCost = GRAVEL_PER_SQFT * width * length;
        }
        else
        {
            JOptionPane.showMessageDialog(this, 
 			"Error. Please select a yard type.");
            totalCost = 0.0;
        }
        Customer cust = new Customer(0, name, address, yardType, length, width, totalCost);
        return cust;
    }

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandscapeGUI().setVisible(true);
            }
        });
    }
    
    private void submitOrder() throws IOException {
        {
            if (validateInputs() == false)
	{
		return;    // end the method if validation failed
	}

	Customer cust = createCustomer();
	customerList.addElement(cust);
	txaCustDetails.setText(cust.getDetails());

	try
	{
		DataIO data = new DataIO(); // create DataIO object
		data.add(cust);
		loadCustomers();  // load all customers

		// reset for the next customer
		reset();

		//move to the client orders tab
		tabMain.setSelectedIndex(2);
	}
	catch (SQLException ex)
	{
		JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
			"Database Error", JOptionPane.ERROR_MESSAGE);
	}
	catch (ClassNotFoundException ex)
	{
		JOptionPane.showMessageDialog(this, "heyo Driver Not Found Error: " + ex.getMessage(),
			"Database Driver Error", JOptionPane.ERROR_MESSAGE);
	}
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgYardtype;
    private javax.swing.ButtonGroup btgYardtype1;
    private java.awt.Button btnCalculate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private java.awt.Button btnNext;
    private java.awt.Button btnReset;
    private java.awt.Button btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label lblGrassCost;
    private java.awt.Label lblGravelCost;
    private java.awt.Label lblInstruction1;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhoto1;
    private javax.swing.JList<Customer> lstCustomer1;
    private javax.swing.JScrollPane lstCustomers;
    private javax.swing.JPanel lstCustomers1;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniReset;
    private javax.swing.JMenuItem mniSubmitOrder;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JPanel pnlInformation;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JRadioButton rdoGrass;
    private javax.swing.JRadioButton rdoGravel;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTextArea txaCustDetails;
    private javax.swing.JScrollPane txaCustomerInfo;
    private javax.swing.JTextPane txaOrderInfo;
    private java.awt.TextField txtAddress;
    private java.awt.TextField txtLength;
    private java.awt.TextField txtName;
    private java.awt.TextField txtWidth;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        tabMain.setSelectedIndex(0);
        btgYardtype.clearSelection();
        lblPhoto1.setIcon(new ImageIcon(
               this.getClass().getResource("dirt.jpg")) );
        txtName.setText("");
        this.txtName.requestFocusInWindow();
        txtAddress.setText("");
        txtLength.setText("");
        txtWidth.setText("");
        txaOrderInfo.setText("");
    }

    private void loadCustomers() {
        try {
            DataIO data = new DataIO();
            ArrayList<Customer> customers = data.getList();

            // clear out the DefaultListModel and the text area
            customerList.clear();
            txaOrderInfo.setText("");

            // copy each object from the ArrayList over to the DefaultListModel
            customerList.addAll(customers);
            lstCustomer1.setSelectedIndex(0);
            

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
}