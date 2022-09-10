package impossible;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.sun.speech.freetts.Voice; 
import com.sun.speech.freetts.VoiceManager;
import java.util.logging.Level;
import java.util.logging.Logger;

 class game extends javax.swing.JFrame {
    static String s;
    static String userId;
    String[][] qpa;
    String[][] qca;
    int score;
    int q=1;
    int count;
    /**
     * Creates new form game
     */
    public game() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        initComponents();
        score=0;
        count=0;
         qpa=new String[10][5];

                        qpa[0][0]="In computer world, Trojan refer to?";
                        qpa[0][1]="Virus";
                        qpa[0][2]="Malware";
                        qpa[0][3]="Worm";
                        qpa[0][4]="Spyware";

                        qpa[1][0]="Which protocol is used to received e-mail?";
                        qpa[1][1]="SMTP";
                        qpa[1][2]="POP3";
                        qpa[1][3]="HTTP";
                        qpa[1][4]="FTP";
                       
                        qpa[2][0]="Which of the following is not a web browser?";
                        qpa[2][1]="MOSAIC";
                        qpa[2][2]="WWW";
                        qpa[2][3]="FACEBOOK";
                        qpa[2][4]="Netscape navigator";

                        qpa[3][0]="Who is known as the father of internet?";
                        qpa[3][1]="Alan Perlis";
                        qpa[3][2]="Jean E. Sammet";
                        qpa[3][3]="Vint Cerf";
                        qpa[3][4]="Steve Lawrence";

                        qpa[4][0]="Who created the C programming Language?";
                        qpa[4][1]="Ken Thompson";
                        qpa[4][2]="Dennis Ritchie";
                        qpa[4][3]="Robin Milner";
                        qpa[4][4]="Frieder Nake";

                        qpa[5][0]="Which one is the first high level programming language?";
                        qpa[5][1]="C";
                        qpa[5][2]="COBOL";
                        qpa[5][3]="FORTRAN";
                        qpa[5][4]="C++";

                        qpa[6][0]="Which one is the current fastest Supercomputer in India?";
                        qpa[6][1]="PARAM Padma";
                        qpa[6][2]=" SAGA-220";
                        qpa[6][3]="PARAM YUVA II";
                        qpa[6][4]="EKA";

                        qpa[7][0]="Who developed Java Programming Language?";
                        qpa[7][1]="James Gosling";
                        qpa[7][2]="Douglas Engelbart";
                        qpa[7][3]="Edmund M. Clarke";
                        qpa[7][4]="James D. Foley";

                        qpa[8][0]="Which operating system is developed and used by Apple Inc?";
                        qpa[8][1]="Windows";
                        qpa[8][2]="Android";
                        qpa[8][3]="iOS";
                        qpa[8][4]="UNIX";

                        qpa[9][0]="Which one is volatile memory in a computer system?";
                        qpa[9][1]="HardDisk"; 
                        qpa[9][2]="RAM";
                        qpa[9][3]="ROM";
                        qpa[9][4]="Optical Drive";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="In computer world, Trojan refer to?t?";
                        qca[0][1]="Malware";

                        qca[1][0]="Which protocol is used to received e-mail?";
                        qca[1][1]="POP3";

                        qca[2][0]="Which of the following is not a web browser?";
                        qca[2][1]="FACEBOOK";

                        qca[3][0]="Who is known as the father of internet?";
                        qca[3][1]="Vint Cerf";


                        qca[4][0]="Who created the C programming Language?";
                        qca[4][1]="Dennis Ritchie";

                        qca[5][0]="Which one is the first high level programming language?";
                        qca[5][1]="FORTRAN";

                        qca[6][0]="Which one is the current fastest Supercomputer in India?";
                        qca[6][1]="PARAM YUVA II";
                       
                        qca[7][0]="Who developed Java Programming Language?";
                        qca[7][1]="James Gosling";
                       
                        qca[8][0]="Which operating system is developed and used by Apple Inc?";
                        qca[8][1]="iOS";

                        qca[9][0]="Which one is volatile memory in a computer system?";
                        qca[9][1]="RAM";
                       
                        
      start(0);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        bg = new javax.swing.ButtonGroup();
        b1 = new javax.swing.JRadioButton();
        b1.setMnemonic(KeyEvent.VK_D);
        b2 = new javax.swing.JRadioButton();
        b2.setMnemonic(KeyEvent.VK_F);
        b3 = new javax.swing.JRadioButton();
        b3.setMnemonic(KeyEvent.VK_C);
        b4 = new javax.swing.JRadioButton();
        b4.setMnemonic(KeyEvent.VK_V);
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bbnxt = new javax.swing.JButton();
        skip = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.add(b1);
        b1.setText("option1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bg.add(b2);
        b2.setText("jRadioButton2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        bg.add(b3);
        b3.setText("jRadioButton3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        bg.add(b4);
        b4.setText("jRadioButton4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel2.setText("Score:000");

        bbnxt.setText("Next");
        
        bbnxt.addKeyListener(new KeyListener()
        {
            @Override 
            public void keyPressed(KeyEvent event) {
String VOICENAME = "kevin16";
Voice voice;
// Taking instance of voice from VoiceManager factory.
VoiceManager voiceManager = VoiceManager.getInstance();
voice = voiceManager.getVoice(VOICENAME);
// Allocating voice
voice.allocate();
// word per minute
voice.setRate(120);
voice.setPitch(100);
if(event.getKeyCode()==KeyEvent.VK_R)
{
voice.speak("Next Question");	
voice.speak(jLabel1.getText());
voice.speak("Options are:");
voice.speak("Option 1:");
voice.speak(b1.getText());

voice.speak("Option 2:");
voice.speak(b2.getText());
voice.speak("Option3:");
voice.speak(b3.getText());
voice.speak("Option4:");
voice.speak(b4.getText());
}
        }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }
             );
        
        bbnxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbnxtActionPerformed(evt);
            }
        });	

        skip.setText("Skip");
        skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(b3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2)
                    .addComponent(b4))
                .addGap(60, 60, 60))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(642, 642, 642)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bbnxt, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(skip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bbnxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skip))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3)
                    .addComponent(b4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        }
        bbnxtActionPerformed(evt);
   //     b1.requestFocus(false);
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        }
        bbnxtActionPerformed(evt);
//    	b2.requestFocus(false);
    }
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        }
        bbnxtActionPerformed(evt);
  //     	b3.requestFocus(false);

    }
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        }
        bbnxtActionPerformed(evt);
 //   	b4.requestFocus(false);
    }

    String getSelectedButtonText(ButtonGroup buttonGroup) {
    for (Enumeration buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = (AbstractButton) buttons.nextElement();

        if (button.isSelected()) {
            return button.getText();
        }
    }

    return null;
}
    private void bbnxtActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	bbnxt.requestFocus();
     if(q<9)
     {
        
         
        if(getSelectedButtonText(bg)==qca[q][1])
        {score=score+100;
        
        }
         count++;
         q++;
         start(q);
         jLabel2.setText("Score :"+q);
        System.out.println(score+" and " + count);
     
     }
     else
     { 
    	 if(getSelectedButtonText(bg)==qca[q-1][1])
         {score=score+100;
         
         }
    	 dispose();
          end e=new end();
          e.ending(score,s,userId);}
// TODO add your handling code here:
    }                                     

    private void skipActionPerformed(java.awt.event.ActionEvent evt) {                                     
            q++;
            start(q);
        // TODO add your handling code here:
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
System.exit(0);
        // TODO add your handling code here:
    }                                        
    public void start(int i){
        
            jLabel1.setText(qpa[i][0]);
            b1.setText(qpa[i][1]);
            b2.setText(qpa[i][2]);
            b3.setText(qpa[i][3]);
            b4.setText(qpa[i][4]);
       
    }
    
    public static void Newgame(String user,String id) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
s=user;
userId=id;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }                   
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JButton bbnxt;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton skip;                
}
