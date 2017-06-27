package Account;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ATMGUI extends javax.swing.JFrame {

    ArrayList<Customer> customer = new <Customer>ArrayList();
    ArrayList<Customer> customerFile = new ArrayList();

    //Setting File
    private int custID = 1;
    private String name = "Jason!";
    private String address = "test!";
    private String phone = "test!";
    private double balanceC = 33;
    private double balanceD = 33;
    private int IDC = 3;
    private int IDD = 2;
    private Date date = new Date();
    //Testing

    private int idInput;
    private int amountInput;
    Customer activeCustomer;
    boolean currentOrDeposit, both;

    SimpleDateFormat ft = new SimpleDateFormat("MM-YYYY");
    DecimalFormat df = new DecimalFormat("0.00");

    public ATMGUI() {
        initComponents();

        fileSetUp();

        /*
         0. Customer with Current Account - ID 1
         1. Customer with Deposit Account - ID 2
         2. Customer with Both - ID 3
         */
        customer.add(new Customer(1, new CurrentAccount(1000, 12, new Date()), "Jason Kelly", "4 Pella RD", "089-2002239"));
        customer.add(new Customer(2, new DepositAccount(1000, 13, new Date()), "Joe Bloggs", "10 Ennis RD", "087-2002658"));
        customer.add(new Customer(3, new CurrentAccount(2000, 14, new Date()), new DepositAccount(3000, 15, new Date()), "Kate Kelly", "40 Limerick RD", "086-2077239"));

        currentRadioButton.setVisible(both);
        depositARadioButton.setVisible(both);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountbuttonGroup = new javax.swing.ButtonGroup();
        actionbuttonGroup = new javax.swing.ButtonGroup();
        ATMTabbedPane = new javax.swing.JTabbedPane();
        customerPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        IDTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        iDjLabel = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        informationPanel = new javax.swing.JPanel();
        typeHeaderLabel = new javax.swing.JLabel();
        dateHeaderLabel = new javax.swing.JLabel();
        balanceHeaderLabel = new javax.swing.JLabel();
        accountHeaderLabel = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        account2Label = new javax.swing.JLabel();
        balance2Label = new javax.swing.JLabel();
        type2Label = new javax.swing.JLabel();
        date2Label = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        withdrawRadioButton = new javax.swing.JRadioButton();
        depositRadioButton = new javax.swing.JRadioButton();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        amountButton = new javax.swing.JButton();
        currentRadioButton = new javax.swing.JRadioButton();
        depositARadioButton = new javax.swing.JRadioButton();
        customerDetailPanel = new javax.swing.JPanel();
        detailsLabel = new javax.swing.JLabel();
        nameHeaderLabel = new javax.swing.JLabel();
        addressHeaderLabel = new javax.swing.JLabel();
        phoneHeaderLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        bankerPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bankerPanel1 = new javax.swing.JPanel();
        customerPanel1 = new javax.swing.JPanel();
        loginPanel2 = new javax.swing.JPanel();
        IDTextField2 = new javax.swing.JTextField();
        submitButton2 = new javax.swing.JButton();
        iDjLabel2 = new javax.swing.JLabel();
        footer2 = new javax.swing.JPanel();
        chargeButton = new javax.swing.JButton();
        cAccoutLabel = new javax.swing.JLabel();
        dAccountLabel = new javax.swing.JLabel();
        currentChargeLabel = new javax.swing.JLabel();
        depositChargeLabel = new javax.swing.JLabel();
        informationPanel2 = new javax.swing.JPanel();
        typeHeaderLabel2 = new javax.swing.JLabel();
        dateHeaderLabel2 = new javax.swing.JLabel();
        balanceHeaderLabel2 = new javax.swing.JLabel();
        accountHeaderLabel2 = new javax.swing.JLabel();
        accountLabel2 = new javax.swing.JLabel();
        balanceLabel2 = new javax.swing.JLabel();
        typeLabel2 = new javax.swing.JLabel();
        dateLabel2 = new javax.swing.JLabel();
        account2Label2 = new javax.swing.JLabel();
        balance2Label2 = new javax.swing.JLabel();
        type2Label2 = new javax.swing.JLabel();
        date2Label2 = new javax.swing.JLabel();
        actionPanel2 = new javax.swing.JPanel();
        withdrawRadioButton2 = new javax.swing.JRadioButton();
        depositRadioButton2 = new javax.swing.JRadioButton();
        amountLabel2 = new javax.swing.JLabel();
        amountTextField2 = new javax.swing.JTextField();
        amountButton2 = new javax.swing.JButton();
        currentRadioButton2 = new javax.swing.JRadioButton();
        depositARadioButton2 = new javax.swing.JRadioButton();
        customerDetailPanel2 = new javax.swing.JPanel();
        detailsLabel2 = new javax.swing.JLabel();
        nameHeaderLabel2 = new javax.swing.JLabel();
        addressHeaderLabel2 = new javax.swing.JLabel();
        phoneHeaderLabel2 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        addressLabel2 = new javax.swing.JLabel();
        phoneLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        createDepositRadioButton = new javax.swing.JRadioButton();
        createCurrentRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        accountIDcurrentTextField = new javax.swing.JTextField();
        accountIDdepositTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        balanceCurrentTextField = new javax.swing.JTextField();
        balanceDepositTextField = new javax.swing.JTextField();
        customerIDTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        createAccountButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        deleteAccountTextField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        accountInfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM");

        customerPanel.setBackground(new java.awt.Color(204, 255, 255));
        customerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerPanel.setForeground(new java.awt.Color(204, 255, 255));

        loginPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        iDjLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        iDjLabel.setText("Please Enter Your ID");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addComponent(iDjLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iDjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        footer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        informationPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        typeHeaderLabel.setText("Type");

        dateHeaderLabel.setText("Date");

        balanceHeaderLabel.setText("Balance");

        accountHeaderLabel.setText("Account");

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(account2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(balanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balanceHeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typeHeaderLabel)
                    .addComponent(typeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(type2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateHeaderLabel)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(date2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountHeaderLabel)
                    .addComponent(balanceHeaderLabel)
                    .addComponent(typeHeaderLabel)
                    .addComponent(dateHeaderLabel))
                .addGap(18, 18, 18)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        actionPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        actionbuttonGroup.add(withdrawRadioButton);
        withdrawRadioButton.setText("Withdraw");

        actionbuttonGroup.add(depositRadioButton);
        depositRadioButton.setText("Deposit");

        amountLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        amountLabel.setText("Amount");

        amountButton.setText("Submit");
        amountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountButtonActionPerformed(evt);
            }
        });

        accountbuttonGroup.add(currentRadioButton);
        currentRadioButton.setText("Current");
        currentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentRadioButtonActionPerformed(evt);
            }
        });

        accountbuttonGroup.add(depositARadioButton);
        depositARadioButton.setText("Deposit");

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(amountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositRadioButton)
                            .addComponent(currentRadioButton))
                        .addGap(33, 33, 33)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositARadioButton)
                            .addComponent(withdrawRadioButton))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentRadioButton)
                    .addComponent(depositARadioButton))
                .addGap(18, 18, 18)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositRadioButton)
                    .addComponent(withdrawRadioButton))
                .addGap(18, 18, 18)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amountButton)
                .addGap(21, 21, 21))
        );

        customerDetailPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        detailsLabel.setText("Details");

        nameHeaderLabel.setText("Name:");

        addressHeaderLabel.setText("Address:");

        phoneHeaderLabel.setText("Phone:");

        javax.swing.GroupLayout customerDetailPanelLayout = new javax.swing.GroupLayout(customerDetailPanel);
        customerDetailPanel.setLayout(customerDetailPanelLayout);
        customerDetailPanelLayout.setHorizontalGroup(
            customerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerDetailPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(customerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressHeaderLabel)
                    .addComponent(nameHeaderLabel)
                    .addComponent(phoneHeaderLabel))
                .addGap(26, 26, 26)
                .addGroup(customerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerDetailPanelLayout.createSequentialGroup()
                        .addComponent(detailsLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        customerDetailPanelLayout.setVerticalGroup(
            customerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameHeaderLabel)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressHeaderLabel)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(customerDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneHeaderLabel)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(informationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(informationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        ATMTabbedPane.addTab("Customer", customerPanel);

        bankerPanel.setBackground(new java.awt.Color(204, 255, 255));
        bankerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bankerPanel.setForeground(new java.awt.Color(204, 255, 255));

        bankerPanel1.setBackground(new java.awt.Color(204, 255, 255));
        bankerPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bankerPanel1.setForeground(new java.awt.Color(204, 255, 255));

        customerPanel1.setBackground(new java.awt.Color(204, 255, 255));
        customerPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerPanel1.setForeground(new java.awt.Color(204, 255, 255));

        loginPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        IDTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextField2ActionPerformed(evt);
            }
        });

        submitButton2.setText("Submit");
        submitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton2ActionPerformed(evt);
            }
        });

        iDjLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        iDjLabel2.setText("Please Enter Your ID");

        javax.swing.GroupLayout loginPanel2Layout = new javax.swing.GroupLayout(loginPanel2);
        loginPanel2.setLayout(loginPanel2Layout);
        loginPanel2Layout.setHorizontalGroup(
            loginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(loginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanel2Layout.createSequentialGroup()
                                .addComponent(IDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addComponent(iDjLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanel2Layout.setVerticalGroup(
            loginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iDjLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        footer2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        chargeButton.setText("Charge Account");
        chargeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeButtonActionPerformed(evt);
            }
        });

        cAccoutLabel.setText("Current Account");

        dAccountLabel.setText("Deposit Account");

        javax.swing.GroupLayout footer2Layout = new javax.swing.GroupLayout(footer2);
        footer2.setLayout(footer2Layout);
        footer2Layout.setHorizontalGroup(
            footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footer2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(chargeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cAccoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositChargeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        footer2Layout.setVerticalGroup(
            footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footer2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAccoutLabel)
                    .addComponent(dAccountLabel))
                .addGap(8, 8, 8)
                .addGroup(footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentChargeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(footer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chargeButton)
                        .addComponent(depositChargeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        footer2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {currentChargeLabel, depositChargeLabel});

        informationPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        typeHeaderLabel2.setText("Type");

        dateHeaderLabel2.setText("Date");

        balanceHeaderLabel2.setText("Balance");

        accountHeaderLabel2.setText("Account");

        javax.swing.GroupLayout informationPanel2Layout = new javax.swing.GroupLayout(informationPanel2);
        informationPanel2.setLayout(informationPanel2Layout);
        informationPanel2Layout.setHorizontalGroup(
            informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(account2Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountHeaderLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(balanceLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balanceHeaderLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance2Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typeHeaderLabel2)
                    .addComponent(typeLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(type2Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateHeaderLabel2)
                    .addComponent(dateLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(date2Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        informationPanel2Layout.setVerticalGroup(
            informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountHeaderLabel2)
                    .addComponent(balanceHeaderLabel2)
                    .addComponent(typeHeaderLabel2)
                    .addComponent(dateHeaderLabel2))
                .addGap(18, 18, 18)
                .addGroup(informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balanceLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        actionPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        actionbuttonGroup.add(withdrawRadioButton2);
        withdrawRadioButton2.setText("Withdraw");

        actionbuttonGroup.add(depositRadioButton2);
        depositRadioButton2.setText("Deposit");

        amountLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        amountLabel2.setText("Amount");

        amountButton2.setText("Submit");
        amountButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountButton2ActionPerformed(evt);
            }
        });

        accountbuttonGroup.add(currentRadioButton2);
        currentRadioButton2.setText("Current");
        currentRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentRadioButton2ActionPerformed(evt);
            }
        });

        accountbuttonGroup.add(depositARadioButton2);
        depositARadioButton2.setText("Deposit");

        javax.swing.GroupLayout actionPanel2Layout = new javax.swing.GroupLayout(actionPanel2);
        actionPanel2.setLayout(actionPanel2Layout);
        actionPanel2Layout.setHorizontalGroup(
            actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanel2Layout.createSequentialGroup()
                .addGroup(actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(amountLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(actionPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(amountTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(actionPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositRadioButton2)
                            .addComponent(currentRadioButton2))
                        .addGap(33, 33, 33)
                        .addGroup(actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositARadioButton2)
                            .addComponent(withdrawRadioButton2))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        actionPanel2Layout.setVerticalGroup(
            actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentRadioButton2)
                    .addComponent(depositARadioButton2))
                .addGap(18, 18, 18)
                .addGroup(actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositRadioButton2)
                    .addComponent(withdrawRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(actionPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amountButton2)
                .addGap(21, 21, 21))
        );

        customerDetailPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        detailsLabel2.setText("Details");

        nameHeaderLabel2.setText("Name:");

        addressHeaderLabel2.setText("Address:");

        phoneHeaderLabel2.setText("Phone:");

        javax.swing.GroupLayout customerDetailPanel2Layout = new javax.swing.GroupLayout(customerDetailPanel2);
        customerDetailPanel2.setLayout(customerDetailPanel2Layout);
        customerDetailPanel2Layout.setHorizontalGroup(
            customerDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerDetailPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(customerDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressHeaderLabel2)
                    .addComponent(nameHeaderLabel2)
                    .addComponent(phoneHeaderLabel2))
                .addGap(26, 26, 26)
                .addGroup(customerDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerDetailPanel2Layout.createSequentialGroup()
                        .addComponent(detailsLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        customerDetailPanel2Layout.setVerticalGroup(
            customerDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerDetailPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameHeaderLabel2)
                    .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressHeaderLabel2)
                    .addComponent(addressLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(customerDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneHeaderLabel2)
                    .addComponent(phoneLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customerPanel1Layout = new javax.swing.GroupLayout(customerPanel1);
        customerPanel1.setLayout(customerPanel1Layout);
        customerPanel1Layout.setHorizontalGroup(
            customerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(customerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(customerPanel1Layout.createSequentialGroup()
                        .addComponent(actionPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerDetailPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(customerPanel1Layout.createSequentialGroup()
                        .addComponent(loginPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(informationPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(footer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        customerPanel1Layout.setVerticalGroup(
            customerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(informationPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerDetailPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(footer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bankerPanel1Layout = new javax.swing.GroupLayout(bankerPanel1);
        bankerPanel1.setLayout(bankerPanel1Layout);
        bankerPanel1Layout.setHorizontalGroup(
            bankerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bankerPanel1Layout.createSequentialGroup()
                .addComponent(customerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
        );
        bankerPanel1Layout.setVerticalGroup(
            bankerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bankerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check Account", bankerPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Name:");

        jLabel2.setText("Address:");

        jLabel3.setText("Phone:");

        jLabel4.setText("CustomerID:");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        createDepositRadioButton.setText("Deosit Account");
        createDepositRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDepositRadioButtonActionPerformed(evt);
            }
        });

        createCurrentRadioButton.setText("Current Account");
        createCurrentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCurrentRadioButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("AccountID:");

        jLabel6.setText("Balance:");

        balanceCurrentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceCurrentTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createCurrentRadioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(createDepositRadioButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accountIDcurrentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceCurrentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balanceDepositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountIDdepositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {accountIDcurrentTextField, accountIDdepositTextField, balanceCurrentTextField, balanceDepositTextField});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCurrentRadioButton)
                    .addComponent(createDepositRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(accountIDcurrentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountIDdepositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(balanceCurrentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceDepositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        createAccountButton.setText("Create");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter All Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(createAccountButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressTextField, customerIDTextField, nameTextField, phoneTextField});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(customerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(createAccountButton)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("Remove Account");

        deleteAccountTextField.setText("Account Id");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteAccountTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteAccountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(accountInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(accountInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add/Remove Account", jPanel1);

        javax.swing.GroupLayout bankerPanelLayout = new javax.swing.GroupLayout(bankerPanel);
        bankerPanel.setLayout(bankerPanelLayout);
        bankerPanelLayout.setHorizontalGroup(
            bankerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
            .addGroup(bankerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bankerPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bankerPanelLayout.setVerticalGroup(
            bankerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(bankerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bankerPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ATMTabbedPane.addTab("Banker", bankerPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ATMTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ATMTabbedPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void currentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentRadioButtonActionPerformed

    }//GEN-LAST:event_currentRadioButtonActionPerformed

    private void amountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountButtonActionPerformed

        amountInput = Integer.parseInt(amountTextField.getText());
        if (withdrawRadioButton.isSelected()) {
            withdrawableBalance(amountInput);
        } else if (depositRadioButton.isSelected()) {
            depositBalance(amountInput);
        }
        displayDetail();

    }//GEN-LAST:event_amountButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        try {
            idInput = Integer.parseInt(IDTextField.getText());
            checkAccount(idInput);
            displayDetail();
        } catch (NoCust | NumberFormatException e) {
            JOptionPane.showMessageDialog(actionPanel, "Please Try again: " + e.getMessage());
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed

    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void currentRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRadioButton2ActionPerformed

    private void amountButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountButton2ActionPerformed
        amountInput = Integer.parseInt(amountTextField2.getText());
        if (withdrawRadioButton2.isSelected()) {
            withdrawableBalance2(amountInput);
        } else if (depositRadioButton2.isSelected()) {
            depositBalance2(amountInput);
        }
    }//GEN-LAST:event_amountButton2ActionPerformed

    private void submitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton2ActionPerformed
        try {
            idInput = Integer.parseInt(IDTextField2.getText());
            checkAccount(idInput);
            displayDetail2();
        } catch (NoCust | NumberFormatException e) {
            JOptionPane.showMessageDialog(actionPanel, "Please Try again: " + e.getMessage());
        }
    }//GEN-LAST:event_submitButton2ActionPerformed

    private void IDTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextField2ActionPerformed

    private void chargeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeButtonActionPerformed

        chargeAccount();
        displayDetail2();
    }//GEN-LAST:event_chargeButtonActionPerformed

    private void createCurrentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCurrentRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createCurrentRadioButtonActionPerformed

    private void createDepositRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDepositRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createDepositRadioButtonActionPerformed

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void balanceCurrentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceCurrentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceCurrentTextFieldActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed

        custID = Integer.parseInt(customerIDTextField.getText());
        name = nameTextField.getText();
        address = addressTextField.getText();
        phone = phoneTextField.getText();
        date = new Date();

        if (createCurrentRadioButton.isSelected() && createDepositRadioButton.isSelected()) {
            balanceC = Double.parseDouble(balanceCurrentTextField.getText());
            balanceD = Double.parseDouble(balanceDepositTextField.getText());
            IDC = Integer.parseInt(accountIDcurrentTextField.getText());
            IDD = Integer.parseInt(accountIDdepositTextField.getText());
            customer.add(new Customer(custID, new CurrentAccount(balanceC, IDC, date), new DepositAccount(balanceD, IDD, date), name, address, phone));

        } else if (createCurrentRadioButton.isSelected()) {
            balanceC = Double.parseDouble(balanceCurrentTextField.getText());
            IDC = Integer.parseInt(accountIDcurrentTextField.getText());

            customer.add(new Customer(custID, new CurrentAccount(balanceC, IDC, date), name, address, phone));
        } else if (createDepositRadioButton.isSelected()) {
            balanceD = Double.parseDouble(balanceDepositTextField.getText());
            IDD = Integer.parseInt(accountIDdepositTextField.getText());
            customer.add(new Customer(custID, new DepositAccount(balanceD, IDD, date), name, address, phone));
        }
        accountInfoLabel.setText("Account Created");

    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        idInput = Integer.parseInt(deleteAccountTextField.getText());
        deleteAccount(idInput);
        accountInfoLabel.setText("Account Deleted");
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ATMTabbedPane;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField IDTextField2;
    private javax.swing.JLabel account2Label;
    private javax.swing.JLabel account2Label2;
    private javax.swing.JLabel accountHeaderLabel;
    private javax.swing.JLabel accountHeaderLabel2;
    private javax.swing.JTextField accountIDcurrentTextField;
    private javax.swing.JTextField accountIDdepositTextField;
    private javax.swing.JLabel accountInfoLabel;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel accountLabel2;
    private javax.swing.ButtonGroup accountbuttonGroup;
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel actionPanel2;
    private javax.swing.ButtonGroup actionbuttonGroup;
    private javax.swing.JLabel addressHeaderLabel;
    private javax.swing.JLabel addressHeaderLabel2;
    private javax.swing.JLabel addressHeaderLabel3;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressLabel2;
    private javax.swing.JLabel addressLabel3;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton amountButton;
    private javax.swing.JButton amountButton2;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel amountLabel2;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JTextField amountTextField2;
    private javax.swing.JLabel balance2Label;
    private javax.swing.JLabel balance2Label2;
    private javax.swing.JTextField balanceCurrentTextField;
    private javax.swing.JTextField balanceDepositTextField;
    private javax.swing.JLabel balanceHeaderLabel;
    private javax.swing.JLabel balanceHeaderLabel2;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceLabel2;
    private javax.swing.JPanel bankerPanel;
    private javax.swing.JPanel bankerPanel1;
    private javax.swing.JLabel cAccoutLabel;
    private javax.swing.JButton chargeButton;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JRadioButton createCurrentRadioButton;
    private javax.swing.JRadioButton createDepositRadioButton;
    private javax.swing.JLabel currentChargeLabel;
    private javax.swing.JRadioButton currentRadioButton;
    private javax.swing.JRadioButton currentRadioButton2;
    private javax.swing.JPanel customerDetailPanel;
    private javax.swing.JPanel customerDetailPanel2;
    private javax.swing.JPanel customerDetailPanel3;
    private javax.swing.JTextField customerIDTextField;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JPanel customerPanel1;
    private javax.swing.JLabel dAccountLabel;
    private javax.swing.JLabel date2Label;
    private javax.swing.JLabel date2Label2;
    private javax.swing.JLabel dateHeaderLabel;
    private javax.swing.JLabel dateHeaderLabel2;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JTextField deleteAccountTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton depositARadioButton;
    private javax.swing.JRadioButton depositARadioButton2;
    private javax.swing.JLabel depositChargeLabel;
    private javax.swing.JRadioButton depositRadioButton;
    private javax.swing.JRadioButton depositRadioButton2;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JLabel detailsLabel2;
    private javax.swing.JLabel detailsLabel3;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel footer2;
    private javax.swing.JLabel iDjLabel;
    private javax.swing.JLabel iDjLabel2;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JPanel informationPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel loginPanel2;
    private javax.swing.JLabel nameHeaderLabel;
    private javax.swing.JLabel nameHeaderLabel2;
    private javax.swing.JLabel nameHeaderLabel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel phoneHeaderLabel;
    private javax.swing.JLabel phoneHeaderLabel2;
    private javax.swing.JLabel phoneHeaderLabel3;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel2;
    private javax.swing.JLabel phoneLabel3;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitButton2;
    private javax.swing.JLabel type2Label;
    private javax.swing.JLabel type2Label2;
    private javax.swing.JLabel typeHeaderLabel;
    private javax.swing.JLabel typeHeaderLabel2;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeLabel2;
    private javax.swing.JRadioButton withdrawRadioButton;
    private javax.swing.JRadioButton withdrawRadioButton2;
    // End of variables declaration//GEN-END:variables

    private void checkAccount(int idInput) throws NoCust {

        for (int i = 0; i < customer.size(); i++) {

            if (customer.get(i).getCustID() == idInput) {
                activeCustomer = customer.get(i);
                if (activeCustomer.current == true && activeCustomer.deposit == true) {
                    both = true;
                } else if (activeCustomer.current == true) {
                    currentOrDeposit = true;
                    both = false;
                } else {
                    currentOrDeposit = false;
                    both = false;
                }
                return;
            }

        }
        throw new NoCust(custID);

    }

    private void deleteAccount(int idInput) {

        for (int i = 0; i < customer.size(); i++) {

            if (customer.get(i).getCustID() == idInput) {
                customer.remove(i);

            }
        }

    }

    private void withdrawableBalance(int amountInput) {

        if (both) {
            if (currentRadioButton.isSelected()) {
                activeCustomer.currentA.withdraw(amountInput);

            } else if (depositARadioButton.isSelected()) {
                activeCustomer.depositA.withdraw(amountInput);

            }
        } else if (currentOrDeposit) {
            activeCustomer.currentA.withdraw(amountInput);
        } else {
            activeCustomer.depositA.withdraw(amountInput);
        }
    }

    private void depositBalance(int amountInput) {
        if (both) {
            if (currentRadioButton.isSelected()) {
                activeCustomer.currentA.deposit(amountInput);

            } else if (depositARadioButton.isSelected()) {
                activeCustomer.depositA.deposit(amountInput);

            }
        } else if (currentOrDeposit) {
            activeCustomer.currentA.deposit(amountInput);
        } else {
            activeCustomer.depositA.deposit(amountInput);
        }
    }

    private void displayDetail() {
        if (both) {
            accountLabel.setText(activeCustomer.currentA.getID() + "");
            balanceLabel.setText(activeCustomer.currentA.getBalance() + "");
            typeLabel.setText("CA");
            dateLabel.setText(ft.format(activeCustomer.currentA.getDate()));

            account2Label.setText(activeCustomer.depositA.getID() + "");
            balance2Label.setText(activeCustomer.depositA.getBalance() + "");
            type2Label.setText("DA");
            date2Label.setText(ft.format(activeCustomer.depositA.getDate()) + "");

        } else if (currentOrDeposit) {
            accountLabel.setText(activeCustomer.currentA.getID() + "");
            balanceLabel.setText(activeCustomer.currentA.getBalance() + "");
            typeLabel.setText("CA");
            dateLabel.setText(ft.format(activeCustomer.currentA.getDate()));

            account2Label.setText("");
            balance2Label.setText("");
            type2Label.setText("");
            date2Label.setText("");

            both = false;
        } else {
            accountLabel.setText(activeCustomer.depositA.getID() + "");
            balanceLabel.setText(activeCustomer.depositA.getBalance() + "");
            typeLabel.setText("DA");
            dateLabel.setText(ft.format(activeCustomer.depositA.getDate()));

            account2Label.setText("");
            balance2Label.setText("");
            type2Label.setText("");
            date2Label.setText("");

            both = false;
        }
        nameLabel.setText(activeCustomer.getName());
        addressLabel.setText(activeCustomer.getAddress());
        phoneLabel.setText(activeCustomer.getPhone());

        currentRadioButton.setVisible(both);
        depositARadioButton.setVisible(both);
    }

    private void fileSetUp() {
        String fileName;
        File f1;

        fileName = "account.txt";

        try {
            f1 = new File(fileName);

            if (f1.createNewFile()) {
                System.out.println("file created " + f1.getAbsolutePath());
            } else {
                System.out.println("file not created");
            }

            FileOutputStream fOut = new FileOutputStream(f1);
            DataOutputStream dOut = new DataOutputStream(fOut);

            for (int i = 0; i < 1; i++) {
                dOut.writeInt(custID);
                dOut.writeChars(name);
                dOut.writeChars(address);
                dOut.writeChars(phone);
                dOut.writeDouble(balanceC);
                dOut.writeInt(IDC);

            }

            FileInputStream fln = new FileInputStream(f1);
            DataInputStream dln = new DataInputStream(fln);
            while (dln.available() > 0) {
                int x = dln.readInt();
                custID = dln.readInt();
                name = readString(dln);
                address = readString(dln);
                phone = readString(dln);
                balanceC = dln.readDouble();
                IDC = dln.readInt();

                customerFile.add((new Customer(custID, new CurrentAccount(balanceC, IDC, new Date()), name, address, phone)));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static String readString(DataInputStream dIn) throws IOException {
        String s = "";

        char c = dIn.readChar();
        while (c != '!') {
            s += c;
            c = dIn.readChar();
        }
        return s;

    }

    //Banker panel
    private void withdrawableBalance2(int amountInput) {

        if (both) {
            if (currentRadioButton2.isSelected()) {
                activeCustomer.currentA.withdraw(amountInput);

            } else if (depositARadioButton2.isSelected()) {
                activeCustomer.depositA.withdraw(amountInput);

            }
        } else if (currentOrDeposit) {
            activeCustomer.currentA.withdraw(amountInput);
        } else {
            activeCustomer.depositA.withdraw(amountInput);
        }
    }

    private void depositBalance2(int amountInput) {
        if (both) {
            if (currentRadioButton2.isSelected()) {
                activeCustomer.currentA.deposit(amountInput);

            } else if (depositARadioButton2.isSelected()) {
                activeCustomer.depositA.deposit(amountInput);

            }
        } else if (currentOrDeposit) {
            activeCustomer.currentA.deposit(amountInput);
        } else {
            activeCustomer.depositA.deposit(amountInput);
        }
    }

    private void displayDetail2() {
        if (both) {
            accountLabel2.setText(activeCustomer.currentA.getID() + "");
            balanceLabel2.setText(df.format(activeCustomer.currentA.getBalance()));
            typeLabel2.setText("CA");
            dateLabel2.setText(ft.format(activeCustomer.currentA.getDate()));

            account2Label2.setText(activeCustomer.depositA.getID() + "");
            balance2Label2.setText(df.format(activeCustomer.depositA.getBalance()));
            type2Label2.setText("DA");
            date2Label2.setText(ft.format(activeCustomer.depositA.getDate()) + "");

        } else if (currentOrDeposit) {
            accountLabel2.setText(activeCustomer.currentA.getID() + "");
            balanceLabel2.setText(df.format(activeCustomer.currentA.getBalance()));
            typeLabel2.setText("CA");
            dateLabel2.setText(ft.format(activeCustomer.currentA.getDate()));

            account2Label2.setText("");
            balance2Label2.setText("");
            type2Label2.setText("");
            date2Label2.setText("");

            both = false;
        } else {
            accountLabel2.setText(activeCustomer.depositA.getID() + "");
            balance2Label2.setText(df.format(activeCustomer.depositA.getBalance()));
            typeLabel2.setText("DA");
            dateLabel2.setText(ft.format(activeCustomer.depositA.getDate()));

            account2Label2.setText("");
            balance2Label2.setText("");
            type2Label2.setText("");
            date2Label2.setText("");

            both = false;
        }
        nameLabel2.setText(activeCustomer.getName());
        addressLabel2.setText(activeCustomer.getAddress());
        phoneLabel2.setText(activeCustomer.getPhone());

        currentRadioButton2.setVisible(both);
        depositARadioButton2.setVisible(both);
    }

    private void chargeAccount() {
        if (both) {
            activeCustomer.currentA.chargeAccount();
            activeCustomer.depositA.chargeAccount();

            currentChargeLabel.setText(activeCustomer.currentA.getMonthlFee() + "");
            depositChargeLabel.setText(activeCustomer.depositA.calculatedAnnualInterestPayment() + "");

        } else if (currentOrDeposit) {
            activeCustomer.currentA.chargeAccount();
            currentChargeLabel.setText(activeCustomer.currentA.getMonthlFee() + "");
            depositChargeLabel.setText("");
        } else {
            activeCustomer.depositA.chargeAccount();
            depositChargeLabel.setText(df.format(activeCustomer.depositA.getannualInterestPayment()));
            currentChargeLabel.setText("");
        }

    }

}
