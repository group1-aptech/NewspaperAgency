package newspaper.gui;

import java.awt.Toolkit;

/**
 * @since Aug - 19 - 2013
 * @author Nguyen Hoang Anh
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        settingLookAndFeel();    }
    
    
    private void settingLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMnuItem = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        logoutMnuItem = new javax.swing.JMenuItem();
        masterMnuItem = new javax.swing.JMenu();
        productMnuItem = new javax.swing.JMenuItem();
        supplierMnuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        customerMnuItem = new javax.swing.JMenuItem();
        lineMnuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        receiverMnuItem = new javax.swing.JMenuItem();
        transactionMenuItem = new javax.swing.JMenu();
        inwardByFormMnuItem = new javax.swing.JMenuItem();
        inwardByGridMnuItem = new javax.swing.JMenuItem();
        supplierPaymentMnuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        requirementMnuItem = new javax.swing.JMenuItem();
        transactionMnuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Newspaper Agency System");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon.png")));

        jDesktopPane2.setBackground(new java.awt.Color(180, 180, 180));

        fileMnuItem.setMnemonic('F');
        fileMnuItem.setText("File");
        fileMnuItem.add(jSeparator4);

        logoutMnuItem.setText("Logout");
        fileMnuItem.add(logoutMnuItem);

        jMenuBar1.add(fileMnuItem);

        masterMnuItem.setMnemonic('M');
        masterMnuItem.setText("Master");

        productMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        productMnuItem.setMnemonic('P');
        productMnuItem.setText("Product");
        productMnuItem.setToolTipText("Product master");
        productMnuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productMnuItemActionPerformed(evt);
            }
        });
        masterMnuItem.add(productMnuItem);

        supplierMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        supplierMnuItem.setMnemonic('S');
        supplierMnuItem.setText("Supplier");
        supplierMnuItem.setToolTipText("Supplier master");
        masterMnuItem.add(supplierMnuItem);
        masterMnuItem.add(jSeparator1);

        customerMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        customerMnuItem.setMnemonic('C');
        customerMnuItem.setText("Customer");
        customerMnuItem.setToolTipText("Customer master");
        masterMnuItem.add(customerMnuItem);

        lineMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        lineMnuItem.setMnemonic('L');
        lineMnuItem.setText("Line");
        lineMnuItem.setToolTipText("Line master");
        masterMnuItem.add(lineMnuItem);
        masterMnuItem.add(jSeparator2);

        receiverMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        receiverMnuItem.setMnemonic('R');
        receiverMnuItem.setText("Payment Receiver");
        receiverMnuItem.setToolTipText("Payment Receiver Master");
        masterMnuItem.add(receiverMnuItem);

        jMenuBar1.add(masterMnuItem);

        transactionMenuItem.setMnemonic('T');
        transactionMenuItem.setText("Transaction");
        transactionMenuItem.setToolTipText("Transaction");

        inwardByFormMnuItem.setText("Daily Stock Inward by Form");
        transactionMenuItem.add(inwardByFormMnuItem);

        inwardByGridMnuItem.setText("Daily Stock Inward by Grid");
        transactionMenuItem.add(inwardByGridMnuItem);

        supplierPaymentMnuItem.setMnemonic('m');
        supplierPaymentMnuItem.setText("Supplier Payment");
        transactionMenuItem.add(supplierPaymentMnuItem);
        transactionMenuItem.add(jSeparator3);

        requirementMnuItem.setMnemonic('q');
        requirementMnuItem.setText("Customer Requirement");
        requirementMnuItem.setToolTipText("Customer Requirement");
        transactionMenuItem.add(requirementMnuItem);

        transactionMnuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        transactionMnuItem.setMnemonic('T');
        transactionMnuItem.setText("Transaction");
        transactionMnuItem.setToolTipText("Transaction");
        transactionMenuItem.add(transactionMnuItem);
        transactionMenuItem.add(jSeparator5);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('D');
        jMenuItem1.setText("Daily Activity Check");
        jMenuItem1.setToolTipText("");
        transactionMenuItem.add(jMenuItem1);

        jMenuBar1.add(transactionMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(814, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productMnuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productMnuItemActionPerformed
        
    }//GEN-LAST:event_productMnuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem customerMnuItem;
    private javax.swing.JMenu fileMnuItem;
    private javax.swing.JMenuItem inwardByFormMnuItem;
    private javax.swing.JMenuItem inwardByGridMnuItem;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuItem lineMnuItem;
    private javax.swing.JMenuItem logoutMnuItem;
    private javax.swing.JMenu masterMnuItem;
    private javax.swing.JMenuItem productMnuItem;
    private javax.swing.JMenuItem receiverMnuItem;
    private javax.swing.JMenuItem requirementMnuItem;
    private javax.swing.JMenuItem supplierMnuItem;
    private javax.swing.JMenuItem supplierPaymentMnuItem;
    private javax.swing.JMenu transactionMenuItem;
    private javax.swing.JMenuItem transactionMnuItem;
    // End of variables declaration//GEN-END:variables
}
