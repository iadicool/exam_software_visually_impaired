package impossible;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

 class login extends javax.swing.JFrame 
{

     String user="";
     Connection con=null;
     String url="jdbc:mysql://localhost:3306/examination";
     String uname1="root";
     String pass="";
     String query="";
     PreparedStatement st;
	  Voice voice=null;
	  String VOICENAME;
	  VoiceManager voiceManager;
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    
    	  // Taking instance of voice from VoiceManager factory.
    	      VOICENAME = "kevin16";
    	   voiceManager = VoiceManager.getInstance();
    	  voice = voiceManager.getVoice(VOICENAME);
    	  // Allocating voice
    	  voice.allocate();
    	  // word per minute
    	  voice.setRate(120);
    	  voice.setPitch(100);

        Textname = new javax.swing.JTextField();
        text = new javax.swing.JLabel();
        Playgame = new javax.swing.JButton();
//      Speak = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelid=new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Textname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnameActionPerformed(evt);
            }
        });
        getContentPane().add(Textname, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 141, 257, -1));

        text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        text.setText("Username");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 106, -1, -1));

        Playgame.setText("Speak");
        Playgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaygameActionPerformed(evt);
            }
        });
        getContentPane().add(Playgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 198, -1, -1));

        
    /*    Speak.setText("Speak");
        Speak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakActionPerformed(evt);
            }
        });
        getContentPane().add(Speak, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 198, 34, -1));
      */  
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 239, 79, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel1.setText("JAM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\article-2386904-1B3313F3000005DC-883_964x844.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 370));

        labelid.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        labelid.setText("");
        getContentPane().add(labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 200, 100));
        
        pack();
    }// </editor-fold>                        

    private void TextnameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        user=Textname.getText();
        System.out.println(user);// TODO add your handling code here:
    }                                        

    private void PlaygameActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	/*user=Textname.getText().toString();
        if (user.equals("")){
            text.setText("Enter valid User name");
//           dispose();
//            start();
        }
        else
        {
        pack();
          System.out.println(user); 
          text.setText(user);
          
            try { 
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
         
          dispose();
          game g=new game();
          g.Newgame(user);
        }*/
    	String id="";
		voce.SpeechInterface.init("E:\\j2ee new workspace\\voce\\lib", false, true, 
			"file:\\E:\\j2ee new workspace\\voce\\lib\\gram", "digits");
        //jLabel1.setText("Hi");
		System.out.println("This is a speech recognition test. " 
			+ "Speak digits from 0-9 into the microphone. " 
			+ "Speak 'quit' to quit.");
		voice.speak("speak");
       try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		boolean quit = false;
		while (!quit)
		{
			// Normally, applications would do application-specific things 
			// here.  For this sample, we'll just sleep for a little bit.
			try
			{
				Thread.sleep(200);
			}
			catch (InterruptedException e)
			{
			}

			while (voce.SpeechInterface.getRecognizerQueueSize() > 0)
			{
				String s = voce.SpeechInterface.popRecognizedString();
				if(s.indexOf("one")!=-1)
				{
					id=id+'1';
				}
				else if(s.indexOf("two")!=-1)
				{
					id=id+'2';
				}
				else if(s.indexOf("three")!=-1)
				{
					id=id+'3';
				}
				else if(s.indexOf("four")!=-1)
				{
					id=id+'4';
				}
				else if(s.indexOf("seven")!=-1)
				{
					id=id+'7';
				}
				else if(s.indexOf("eight")!=-1)
				{
					id=id+'8';
				}
				else if(s.indexOf("nine")!=-1)
				{
					id=id+'9';
				}
				// Check if the string contains 'quit'.
				if (-1 != s.indexOf("zero"))
				{
					quit = true;
				}

//				labelid.setText(s);
				System.out.println("You said: " + s);
				voice.speak(s);
/*				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				//voce.SpeechInterface.synthesize(s);
			}
		}
		System.out.println("Your id is "+id);
//		jLabel1.setText("Your id is "+id);
		Textname.setText(id);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname1,pass);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		query="select * from register where  uid=?";
		try
		{
		    st =con.prepareStatement(query);
			st.setString(1,id);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				user=rs.getString("fname");
				try { 
	                TimeUnit.SECONDS.sleep(1);
	            } catch (InterruptedException ex) {
	                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
	            }
	         
	          dispose();
	          game g=new game();
	          g.Newgame(user,id);
			}
			else
			{
				text.setText("Speak again");
				dispose();
				start();
			}

		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		voce.SpeechInterface.destroy();
//		System.exit(0);
        
        
// TODO add your handling code here:
    }                                        
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        System.exit(0);

    }                                        

 
    public  void start() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
                    
    private javax.swing.JButton Playgame;
    private javax.swing.JTextField Textname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel text;
    private javax.swing.JLabel labelid;
                
}
