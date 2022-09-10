
package impossible;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

 class end extends javax.swing.JFrame {

   static int sc; 
   static String us;
   static String id;
   Connection con=null;
   String url="jdbc:mysql://localhost:3306/examination";
   String uname1="root";
   String pass="";
   String query="";
   PreparedStatement st;
  
    public end() {
        initComponents();
         s1.setText("score::"+ sc);
         s2.setText("CONGRATS!!! "+us);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        s2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        jLabel1.setText("Result");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 0, -1, -1));

        s1.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setText("Score");
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 162, 191, -1));

        jButton1.setText("Play Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 94, -1, -1));

        jButton2.setText("exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 94, 83, -1));

        s2.setFont(new java.awt.Font("DotumChe", 3, 18)); // NOI18N
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setText("User");
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 92, 232, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gautham\\Downloads\\Quotefancy-17167-3840x2160.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 310));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

dispose();
login l=new login();
l.start();
// TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public  void ending(int score,String user,String userid) {
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
            java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
       
   sc=score;
   us=user;
   id=userid;
   try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,uname1,pass);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
   query="insert into userscore values(?,?)";
   try
	{
	    st =con.prepareStatement(query);
		st.setString(1,id);
		st.setInt(2, sc);
		int i = st.executeUpdate();
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new end().setVisible(true);
                
            }
        });
    }
                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;            
   
}
