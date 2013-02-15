import javax.swing.JFrame;

public class Test extends JFrame {

   private javax.swing.JPanel jContentPane = null;

   private javax.swing.JCheckBox jCheckBox = null;
   private javax.swing.JLabel jLabel = null;
   public static void main(String[] args) {
      Test test = new Test();
      test.setDefaultCloseOperation(EXIT_ON_CLOSE);
      test.setVisible(true);
   }
   /**
    * This is the default constructor
    */
   public Test() {
      super();
      initialize();
   }
   /**
    * This method initializes this
    * 
    * @return void
    */
   private void initialize() {
      this.setContentPane(getJContentPane());
      this.setSize(300, 200);
   }
   /**
    * This method initializes jContentPane
    * 
    * @return javax.swing.JPanel
    */
   private javax.swing.JPanel getJContentPane() {
      if (jContentPane == null) {
         jContentPane = new javax.swing.JPanel();
         jContentPane.setLayout(null);
         jContentPane.add(getJCheckBox(), null);
         jContentPane.add(getJLabel(), null);
      }
      return jContentPane;
   }
   /**
    * This method initializes jCheckBox
    * 
    * @return javax.swing.JCheckBox
    */
   private javax.swing.JCheckBox getJCheckBox() {
      if (jCheckBox == null) {
         jCheckBox = new javax.swing.JCheckBox();
         jCheckBox.setBounds(45, 75, 21, 21);
         jCheckBox
            .addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
               jLabel.setText(
                  jCheckBox.isSelected() ? "Checked" : "Unchecked");
            }
         });
      }
      return jCheckBox;
   }
   /**
    * This method initializes jLabel
    * 
    * @return javax.swing.JLabel
    */
   private javax.swing.JLabel getJLabel() {
      if (jLabel == null) {
         jLabel = new javax.swing.JLabel();
         jLabel.setBounds(87, 75, 110, 22);
         jLabel.setText("Unchecked");
      }
      return jLabel;
   }
} //  @jve:visual-info  decl-index=0 visual-constraint="9,8"
