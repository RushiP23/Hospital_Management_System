/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;
//import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
/**
 *
 * @author DURGA
 */
public class RegisterPage extends javax.swing.JFrame
{

    /**
     * Creates new form LoginPage
     */
    public RegisterPage()
    {
        initComponents();
        //CommonClassImage_hms.addLabelBackgroundimage(lbluser, "C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\pass_icon3.jpg");
        //CommonClassImage_hms.addLabelBackgroundimage(lblpass, "C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\passicon2.jpg");
        CommonClassImage_hms.addLabelBackgroundimage(lblregister, "C:\\Users\\DURGA\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\main\\java\\images\\register.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        txtmiddle = new javax.swing.JTextField();
        btnregister = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblregister = new javax.swing.JLabel();
        btnbacktologin = new javax.swing.JButton();
        txtfirstname = new javax.swing.JTextField();
        txtlast = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        lblmiddlename = new javax.swing.JLabel();
        lblfirstname = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lbllastname = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        btnregister.setBackground(new java.awt.Color(0, 0, 255));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnregisterActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("    Register");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(lblregister, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblregister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnbacktologin.setBackground(new java.awt.Color(255, 102, 0));
        btnbacktologin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbacktologin.setText("Back to Login");
        btnbacktologin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnbacktologinActionPerformed(evt);
            }
        });

        txtfirstname.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtfirstnameActionPerformed(evt);
            }
        });

        lblmiddlename.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblmiddlename.setForeground(new java.awt.Color(255, 255, 255));
        lblmiddlename.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblmiddlename.setText("Middle Name");

        lblfirstname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblfirstname.setForeground(new java.awt.Color(255, 255, 255));
        lblfirstname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfirstname.setText("First Name");

        lblpass.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblpass.setText("Password");

        lblusername.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("Username");

        lbllastname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbllastname.setForeground(new java.awt.Color(255, 255, 255));
        lbllastname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllastname.setText("Last Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbllastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtlast, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblmiddlename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnbacktologin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtpass))))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmiddle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlast, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllastname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpass, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtpass))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbacktologin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnregisterActionPerformed
    {//GEN-HEADEREND:event_btnregisterActionPerformed
        String firstString=txtfirstname.getText();
        String lastString=txtlast.getText();
        String middleString=txtmiddle.getText();
        String userString=txtusername.getText();
        String passString=txtpass.getPassword().toString();
        if(firstString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Firstname Field should not be empty.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(middleString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Middlename Field should not be empty.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(lastString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Lastname Field should not be empty.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(userString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Username Field should not be empty.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(passString.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Password Field should not be empty.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            String URL = "jdbc:mysql://localhost:3306/hms";
            String username = "root";
            String pass = "Zalte@2001";
            //String fnameString,middleString,lastString,userString,passString;
            String fnameString=txtfirstname.getText();
            String middlenameString=txtmiddle.getText();
            String lastnameString=txtlast.getText();
            String usernameString=txtusername.getText();
            String passwordString=String.valueOf(txtpass.getPassword());
           try{
            Connection con=DriverManager.getConnection(URL,username,pass);
            PreparedStatement pst = con.prepareStatement(
            "insert into register(firstname,middlename,lastname,username,password)values(?,?,?,?,?)");
            pst.setString(1,fnameString);
            pst.setString(2,middlenameString);
             pst.setString(3,lastnameString);
             pst.setString(4,usernameString);
              pst.setString(5,passwordString);
              pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Register Successfully!!","InfoMessage",JOptionPane.INFORMATION_MESSAGE);  
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error "+e);
            }
            
            
            
        }
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtfirstnameActionPerformed
    {//GEN-HEADEREND:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void btnbacktologinActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnbacktologinActionPerformed
    {//GEN-HEADEREND:event_btnbacktologinActionPerformed
        LoginPage obLoginPage = new LoginPage();
        obLoginPage.setVisible(true);
        this.setVisible(false);
        obLoginPage.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnbacktologinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbacktologin;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblmiddlename;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblregister;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlast;
    private javax.swing.JTextField txtmiddle;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}