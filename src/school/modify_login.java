/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import AppPackage.AnimationClass;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author tj.rumesh
 */
public class modify_login extends javax.swing.JFrame {

    int timeRun = 0;
    private Timer t = null;
    private int count1 =0;
    AnimationClass AC = new AnimationClass();
    Connection con= null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    /**
     * Creates new form modify_login
     */
    public modify_login() {
       
        initComponents();
        slideshow();
        con = db.connect();
       // jProgressBar1.setVisible(false);
        jLabel34.setVisible(false);
        
        // hidden 
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jButton4.setVisible(false);
        // 1
        // end hidden
        
        // show
        
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        jLabel18.setVisible(true);
     //   username.setVisible(true);
        jTextField7.setVisible(true);
        jPasswordField3.setVisible(true);
        jLabel23.setVisible(true);
        jPanel1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel19.setVisible(true);
        
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jTextField8.setVisible(false);
        jLabel35.setVisible(false);
        jLabel36.setVisible(false);
        jPasswordField4.setVisible(false);
        jPasswordField5.setVisible(false);
        
        
        // end show
        
        // start clock
         new Thread()
        {
            public void run()
            {
                while(timeRun==0)
                {
                    Calendar cal=new GregorianCalendar();
                    int hour=cal.get(Calendar.HOUR);
                    if(hour==0)
                    {
                        hour=hour+12;
                    }
                    int min=cal.get(Calendar.MINUTE);
                    int sec=cal.get(Calendar.SECOND);
                    int AM_PM=cal.get(Calendar.AM_PM);
            
            
                    String day_night=""; 
                    if(AM_PM==1)
                    {
                        day_night="PM";
                    }
                    else
                    {
                        day_night="AM";
                    }
            
                    String time =hour+":"+min+":"+sec+"  "+day_night;
            
                    jLabel26.setText(time);
                }
            }
        }.start();
           
         // -- end clock --
         
          // -- calendar --
         
        Calendar now = Calendar.getInstance();
          
		int month = now.get(Calendar.MONTH); 
                int date = now.get(Calendar.DATE); 
                int year = now.get(Calendar.YEAR);
                String Date = date + " - " + month + " - " + year;
                jLabel28.setText(Date);
                
        // -- end calendar --
        
    }

    public void slideshow(){
        new Thread()
        {
            int count;
            @Override
            public void run()
            {
             try
             {
                 while(true)
                 {
                     switch(count){
                         case 0:
                             
                     ImageIcon II = new ImageIcon(getClass().getResource("/images/1a.jpg"));
                     jLabel1.setIcon(II);
//                     ImageIcon II5 = new ImageIcon(getClass().getResource("/images/5.jpeg"));
//                     jLabel2.setIcon(II5);
                     
                             Thread.sleep(6000);
                             AC.jLabelXLeft(0, -590, 22, 5,jLabel1);
                             AC.jLabelXLeft(590,0, 22, 5,jLabel2);
                             count = 1;
                         break;
                         
                         case 1:
                    
                    ImageIcon II1 = new ImageIcon(getClass().getResource("/images/1b.jpg"));
                     jLabel2.setIcon(II1);
                             
                             Thread.sleep(6000);
                             AC.jLabelXRight(-590,0, 22, 5,jLabel1);
                             AC.jLabelXRight(0,590, 22, 5,jLabel2);
                             count = 2;
                         break;
                         
                         case 2:
                    ImageIcon II2 = new ImageIcon(getClass().getResource("/images/1c.jpg"));
                     jLabel1.setIcon(II2);
                             Thread.sleep(6000);
                             AC.jLabelXLeft(0, -590, 22, 5,jLabel1);
                             AC.jLabelXLeft(590,0, 22, 5,jLabel2);
                             count = 3;
                         break;
                         
                         case 3:
                    ImageIcon II3 = new ImageIcon(getClass().getResource("/images/1d.jpg"));
                     jLabel2.setIcon(II3);
                             Thread.sleep(6000);
                             AC.jLabelXRight(-590,0, 22, 5,jLabel1);
                             AC.jLabelXRight(0,590, 22, 5,jLabel2);
                             count = 0;
                         break;
                     }
                 }
                 
             }
             catch(Exception e)
             {
                 
             }
            }
        }.start();
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
        jPasswordField4 = new javax.swing.JPasswordField();
        jPasswordField5 = new javax.swing.JPasswordField();
        jLabel33 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 30, 0, 0));
        setMaximumSize(new java.awt.Dimension(1171, 630));
        setMinimumSize(new java.awt.Dimension(1171, 630));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1171, 630));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPasswordField4.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jPasswordField4);
        jPasswordField4.setBounds(120, 60, 320, 30);

        jPasswordField5.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField5KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField5);
        jPasswordField5.setBounds(120, 100, 320, 30);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Hi !");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(290, 30, 30, 14);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(320, 20, 120, 30);

        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel35);
        jLabel35.setBounds(20, 190, 420, 30);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel36.setText("Go To Signin Page");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel36);
        jLabel36.setBounds(320, 154, 110, 20);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/abc4.png"))); // NOI18N
        jPanel1.add(jLabel32);
        jLabel32.setBounds(0, 0, 460, 230);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setText("Go to Sign up ");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(360, 160, 80, 14);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Forget Your Password");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel31);
        jLabel31.setBounds(30, 160, 130, 14);

        jLabel23.setToolTipText("click here to login the system");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23);
        jLabel23.setBounds(20, 194, 420, 30);

        jTextField7.setOpaque(false);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(120, 66, 330, 30);

        jPasswordField3.setOpaque(false);
        jPasswordField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField3KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField3);
        jPasswordField3.setBounds(120, 106, 330, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/abc3.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(2, 2, 460, 230);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(650, 200, 460, 230);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("-");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1090, 0, 40, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(680, 60, 150, 30);

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(830, 60, 250, 30);

        jTextField2.setBackground(new java.awt.Color(0, 153, 153));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setOpaque(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(830, 100, 250, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(680, 100, 150, 30);

        jLabel6.setBackground(new java.awt.Color(0, 51, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRATION");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(670, 10, 410, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 140, 140, 30);

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        jComboBox1.setOpaque(false);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(830, 140, 250, 30);

        jTextField3.setBackground(new java.awt.Color(0, 153, 153));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.setOpaque(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(830, 180, 250, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("School Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(680, 270, 150, 30);

        jTextArea1.setBackground(new java.awt.Color(0, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextArea1.setOpaque(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(255, 153, 0));
        jTextArea1.setSelectionColor(new java.awt.Color(0, 51, 0));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(830, 260, 250, 88);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("School Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(680, 220, 130, 30);

        jTextField4.setBackground(new java.awt.Color(0, 153, 153));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(830, 220, 250, 30);

        jTextField5.setBackground(new java.awt.Color(0, 153, 153));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.setOpaque(false);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(830, 370, 250, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mobile No");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(680, 370, 160, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Username");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(680, 410, 150, 30);

        jTextField6.setBackground(new java.awt.Color(0, 153, 153));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField6.setOpaque(false);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(830, 410, 250, 30);

        jPasswordField1.setBackground(new java.awt.Color(0, 153, 153));
        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.setOpaque(false);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(830, 470, 250, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(680, 470, 150, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIC Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(680, 183, 110, 20);

        jPasswordField2.setBackground(new java.awt.Color(0, 153, 153));
        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField2.setOpaque(false);
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(830, 510, 250, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGNUP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(830, 550, 160, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("jLabel34");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(830, 450, 250, 14);

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SIGNIN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1000, 550, 80, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Confirm Password");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(680, 510, 180, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(660, 463, 280, 20);
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(660, 500, 440, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Copy Right, All Right Reserved - 2018");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(780, 570, 210, 14);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("School Evaluation System - User Experience in Engineering");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(710, 550, 320, 14);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("LOGIN FORM");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(660, 90, 290, 40);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("If you already has an account, please signin the system.");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(660, 130, 310, 13);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" Otherwise you must register to the system, therfore use signup");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(660, 150, 370, 13);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1130, 0, 40, 20);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/z1.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 0, 580, 620);

        jLabel26.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("jLabel26");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(30, 14, 210, 30);

        jLabel28.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("jLabel28");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(350, 570, 210, 40);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("School Evaluation Systems");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(260, 20, 320, 20);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Copy Right, All Right Reserved - 2018 Dec");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(30, 580, 270, 20);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/z2.png"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 4, 590, 50);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/z5.png"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(0, 560, 590, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1b.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(590, 0, 620, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1a.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))||(vchar == KeyEvent.VK_BACK_SPACE)||(vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased

//        jProgressBar1.setVisible(true);
//        switch(evt.getKeyCode()) {
//            case KeyEvent.VK_BACK_SPACE:
//            jProgressBar1.setValue(jProgressBar1.getValue()-10);
//            checks();
//            pro1();
//            break;
//            default:
//            jProgressBar1.setValue(jProgressBar1.getValue()+10);
//            checks();
//            pro1();
//        }
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        //
        //
        //         switch(evt.getKeyCode()) {
            //          case KeyEvent.VK_BACK_SPACE:
            //                jProgressBar1.setValue(jProgressBar1.getValue()-10);
            //              break;
            //            default:
            //              jProgressBar1.setValue(jProgressBar1.getValue()+10);
            //        }
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            // Fname validations
            String name1 = jTextField1.getText();
            int count_Fname = 0;
            boolean Fname = false;

            if (name1.length() == 0) {
                jTextField1.setBackground(Color.GREEN);
            }

            for (int i = 0; i < name1.length(); i++) {
                if (Character.isLetter(name1.charAt(i))) {
                    count_Fname++;
                }
            }
            if (count_Fname == name1.length()) {
                Fname = true;
                System.out.println("error in true");
            } else {
                //         jTextField1.setCaretColor(Color.red); // cursor
                //         jTextField1.setBackground(Color.red); // background
                jTextField1.setForeground(Color.red); // foreground
            }

            // end of Fname validations

            // Lname validations
            String name2 = jTextField2.getText();
            int count_Lname = 0;
            boolean Lname = false;

            if (name2.length() == 0) {
                jTextField2.setBackground(Color.GREEN);
            }

            for (int i = 0; i < name2.length(); i++) {
                if (Character.isLetter(name2.charAt(i))) {
                    count_Lname++;
                }
            }
            if (count_Lname == name2.length()) {
                Lname = true;
                System.out.println("error in true");
            } else {
                //         jTextField1.setCaretColor(Color.red); // cursor
                //         jTextField1.setBackground(Color.red); // background
                jTextField2.setForeground(Color.red); // foreground
            }

            // end of Lname validations

            //Tel Validation
            String ph = jTextField5.getText();
            int count_Phone = 0;
            boolean Phn = false;
            if (ph.length()==10) {
                for (int i = 0; i < ph.length(); i++) {
                    if (Character.isDigit(ph.charAt(i))) {
                        count_Phone++;
                    }
                }
                if (count_Phone == ph.length()) {
                    Phn = true;
                } else {
                    jTextField5.setForeground(Color.red);
                }
            } else if (ph.length() == 0) {
                jTextField5.setBackground(Color.GREEN);
            } else {
                jTextField5.setForeground(Color.red);
            }

            // end of TP Validation

            // username validation
            String un = jTextField6.getText();
            boolean usrn = false;
            if (un.length()>=4){
                usrn = true;
            }
            else if (un.length() == 0) {
                jTextField6.setBackground(Color.GREEN);
            }
            else {
                jTextField6.setForeground(Color.red);
            }
            // end of username validation

            // password validation
            String pwd = jPasswordField1.getText();
            boolean pwrd = false;
            if (pwd.length()>=5){
                pwrd = true;
            }
            else if (pwd.length() == 0) {
                jPasswordField1.setBackground(Color.GREEN);
            }
            else {
                jPasswordField1.setForeground(Color.red);
            }
            // end of password validation

            // NIC Validation
            //NIC Validation
            boolean getCount = false;
            boolean letter = false;
            int count = 0;
            boolean NIC = false;

            String nic = jTextField3.getText();
            if (nic.length() == 10) {
                String dig = nic.substring(0, 8);
                for (int i = 0; i < dig.length(); i++) {
                    if (Character.isDigit(dig.charAt(i))) {
                        count++;
                    }
                }
                if (count != dig.length()) {
                    jTextField3.setForeground(Color.red);
                } else {
                    getCount = true;
                }
                if (nic.charAt(9) == 'V' || nic.charAt(9) == 'v') {
                    letter = true;
                } else {
                    jTextField3.setForeground(Color.red);
                }
                if (getCount == true && letter == true) {
                    NIC = true;
                } else {
                    jTextField3.setForeground(Color.red);
                }
            } else if (nic.length() == 0) {
                jTextField3.setBackground(Color.GREEN);
            } else {
                jTextField3.setForeground(Color.red);
            }

            // end of NIC Validation

            String pw = jPasswordField1.getText();
            String cpw = jPasswordField2.getText();
            if(Fname == true && name1.length() != 0 && Lname == true && name2.length() != 0 && usrn == true && un.length() != 0 && pwrd == true && pwd.length() != 0 && NIC == true && nic.length() != 0) {

                if (pw.equals(cpw))
                {

                    try {
                        String sql1 = "INSERT INTO profile(fname,lname,gender,nic,address,email,mobile,un,pw,change_pw) VALUES('" + jTextField1.getText() + "','" + jTextField2.getText() + "','" + jComboBox1.getSelectedItem() + "','" + jTextField3.getText() + "','" + jTextArea1.getText() +"','" + jTextField4.getText()  +"','" + jTextField5.getText() +"','" + jTextField6.getText() +"','" + jPasswordField1.getText() +"','" + jPasswordField1.getText()+"' )";
                        pst = con.prepareStatement(sql1);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Data Saved Successfully");
                        resets();
                                   // new
                     // hidden 
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jButton4.setVisible(false);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        
        // end hidden
        
        // show
        
        jLabel18.setVisible(true);
    //    username.setVisible(true);
        jTextField7.setVisible(true);
        jPasswordField3.setVisible(true);
        jLabel23.setVisible(true);
        jPanel1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        // 2
        
        // end show
        
                    // end new


                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data save Failed");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Password Not Match","Access Denied",JOptionPane.ERROR_MESSAGE);
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                }
            }
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Fname validations
        String name1 = jTextField1.getText();
        int count_Fname = 0;
        boolean Fname = false;

        if (name1.length() == 0) {
            jTextField1.setBackground(Color.GREEN);
        }

        for (int i = 0; i < name1.length(); i++) {
            if (Character.isLetter(name1.charAt(i))) {
                count_Fname++;
            }
        }
        if (count_Fname == name1.length()) {
            Fname = true;
            System.out.println("error in true");
        } else {
            //         jTextField1.setCaretColor(Color.red); // cursor
            //         jTextField1.setBackground(Color.red); // background
            jTextField1.setForeground(Color.red); // foreground
        }

        // end of Fname validations

        // Lname validations
        String name2 = jTextField2.getText();
        int count_Lname = 0;
        boolean Lname = false;

        if (name2.length() == 0) {
            jTextField2.setBackground(Color.GREEN);
        }

        for (int i = 0; i < name2.length(); i++) {
            if (Character.isLetter(name2.charAt(i))) {
                count_Lname++;
            }
        }
        if (count_Lname == name2.length()) {
            Lname = true;
            System.out.println("error in true");
        } else {
            //         jTextField1.setCaretColor(Color.red); // cursor
            //         jTextField1.setBackground(Color.red); // background
            jTextField2.setForeground(Color.red); // foreground
        }

        // end of Lname validations

        //Tel Validation
        String ph = jTextField5.getText();
        int count_Phone = 0;
        boolean Phn = false;
        if (ph.length()==10) {
            for (int i = 0; i < ph.length(); i++) {
                if (Character.isDigit(ph.charAt(i))) {
                    count_Phone++;
                }
            }
            if (count_Phone == ph.length()) {
                Phn = true;
            } else {
                jTextField5.setForeground(Color.red);
            }
        } else if (ph.length() == 0) {
            jTextField5.setBackground(Color.GREEN);
        } else {
            jTextField5.setForeground(Color.red);
        }

        // end of TP Validation

        // username validation
        String un = jTextField6.getText();
        boolean usrn = false;
        if (un.length()>=4){
            usrn = true;
        }
        else if (un.length() == 0) {
            jTextField6.setBackground(Color.GREEN);
        }
        else {
            jTextField6.setForeground(Color.red);
        }
        // end of username validation

        // password validation
        String pwd = jPasswordField1.getText();
        boolean pwrd = false;
        if (pwd.length()>=5){
            pwrd = true;
        }
        else if (pwd.length() == 0) {
            jPasswordField1.setBackground(Color.GREEN);
        }
        else {
            jPasswordField1.setForeground(Color.red);
        }
        // end of password validation

        // NIC Validation
        //NIC Validation
        boolean getCount = false;
        boolean letter = false;
        int count = 0;
        boolean NIC = false;

        String nic = jTextField3.getText();
        if (nic.length() == 10) {
            String dig = nic.substring(0, 8);
            for (int i = 0; i < dig.length(); i++) {
                if (Character.isDigit(dig.charAt(i))) {
                    count++;
                }
            }
            if (count != dig.length()) {
                jTextField3.setForeground(Color.red);
            } else {
                getCount = true;
            }
            if (nic.charAt(9) == 'V' || nic.charAt(9) == 'v') {
                letter = true;
            } else {
                jTextField3.setForeground(Color.red);
            }
            if (getCount == true && letter == true) {
                NIC = true;
            } else {
                jTextField3.setForeground(Color.red);
            }
        } else if (nic.length() == 0) {
            jTextField3.setBackground(Color.GREEN);
        } else {
            jTextField3.setForeground(Color.red);
        }

        // end of NIC Validation
        
        
        // already exists
       
        // end of exists

        String pw = jPasswordField1.getText();
        String cpw = jPasswordField2.getText();
        
        
        
        
        if(Fname == true && name1.length() != 0 && Lname == true && name2.length() != 0 && usrn == true && un.length() != 0 && pwrd == true && pwd.length() != 0 && NIC == true && nic.length() != 0) {
            if (pw.equals(cpw))
            {

                try {
                    String sql1 = "INSERT INTO profile(fname,lname,gender,nic,address,email,mobile,un,pw,change_pw) VALUES('" + jTextField1.getText() + "','" + jTextField2.getText() + "','" + jComboBox1.getSelectedItem() + "','" + jTextField3.getText() + "','" + jTextArea1.getText() +"','" + jTextField4.getText()  +"','" + jTextField5.getText() +"','" + jTextField6.getText() +"','" + jPasswordField1.getText() +"','" + jPasswordField1.getText()+"' )";
                    pst = con.prepareStatement(sql1);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Data Saved Successfully");
                    resets();
                    
                    // new
                     // hidden 
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
       jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jButton4.setVisible(false);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        
        // end hidden
        
        // show
        
        jLabel18.setVisible(true);
    //    username.setVisible(true);
        jTextField7.setVisible(true);
        jPasswordField3.setVisible(true);
        jLabel23.setVisible(true);
        jPanel1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        // 3
        // end show
        
                    // end new

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data save Failed");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Password Not Match","Access Denied",JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText("");
                jPasswordField2.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

     public void reset(){
        jTextField7.setText("");
        jPasswordField3.setText("");
    } private void pro(){
        
//        index indx = new index();
//        indx.setVisible(true);
//        this.dispose();

        String log_user = jTextField7.getText();
        index lo_indx= new index(log_user);
        lo_indx.setVisible(true);
        this.dispose();
        
    }
 
 private void progress(int t){
 
     String new_usr = jTextField7.getText();
     
        if(t < 15){
            jLabel17.setText("Hi "+ new_usr + " , Your Profile Creating .");
        }
        else if(t < 18){
            jLabel17.setText("Hi "+ new_usr + " , Your Profile Creating . .");
           }
        else if(t < 21){
            jLabel17.setText("Hi "+ new_usr + " , Your Profile Creating . . .");
           }
        else if(t < 25){
            jLabel17.setText("Student Records Searching . ");
           }
        else if(t < 28){
            jLabel17.setText("Student Records Searching . . ");
           }
        else if(t < 32){
            jLabel17.setText("Student Records Searching . . . ");
           }
        else if(t < 37){
            jLabel17.setText("Student Records Searching . . . .");
           }
        else if(t < 42){
            jLabel17.setText("Student Records Searching . . . . .");
           }
         else if(t < 47){
            jLabel17.setText("Student Records Searching . . . . . .");
           }
        else if(t < 50){
            jLabel17.setText("Calculating Assaignment Marks . ");
        }
        else if(t < 55){
            jLabel17.setText("Calculating Assaignment Marks . . ");
        }
        else if(t < 59){
            jLabel17.setText("Calculating Assaignment Marks . . . ");
        }
        else if(t < 62){
            jLabel17.setText("Calculating Assaignment Marks . . . .");
        }
         else if(t < 65){
            jLabel17.setText("Calculating Term Test Marks . ");
            }
         else if(t < 68){
            jLabel17.setText("Calculating Term Test Marks . .");
            }
         else if(t < 72){
            jLabel17.setText("Calculating Term Test Marks . . .");
            }
          else if(t < 75){
            jLabel17.setText("Resolving . . ");
          }
          else if(t < 78){
            jLabel17.setText("Resolving . . . .");
          }
        else if(t < 80){
            jLabel17.setText("Home Page Analysing and Designing .");
           }
        else if(t < 82){
            jLabel17.setText("Home Page Analysing and Designing . . ");
           }
        else if(t < 84){
            jLabel17.setText("Home Page Analysing and Designing . . . ");
           }
        else if(t < 86){
            jLabel17.setText("Home Page Analysing and Designing . . . . ");
           }
        else if(t < 88){
            jLabel17.setText("Finalizing . ");
        }
        else if(t < 90){
            jLabel17.setText("Finalizing . . ");
        }
        else if(t < 92){
            jLabel17.setText("Finalizing . . . ");
        }
        else if(t < 94){
            jLabel17.setText("Finalizing . . . .");
        }
        else if(t < 96){
            jLabel17.setText("Finalizing . . . . .");
        }
        
        else {
            jLabel17.setText(new_usr + " Please Wait . . . ."); 
            }
    }

 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         // hidden 
         jButton4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        
        // end hidden
        
        // show
        
        jLabel18.setVisible(true);
     //   username.setVisible(true);
        jTextField7.setVisible(true);
        jPasswordField3.setVisible(true);
        jLabel23.setVisible(true);
        jPanel1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        // 5
        // end show
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPasswordField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            con = db.connect();
            String sql = "Select * from profile where un=? and pw=?";
            try{
                pst = con.prepareStatement(sql);
                pst.setString(1,jTextField7.getText());
                pst.setString(2,jPasswordField3.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    jLabel17.setVisible(true);
                    jProgressBar2.setVisible(true);
                    //             String usr = jTextField1.getText();
                    //             index indx = new index(usr);
                    //             indx.setVisible(true);
                    //             this.dispose();
//                    String usr = jTextField7.getText();
//                    loading load = new loading(usr);
//                    load.setVisible(true);
//                    this.dispose();
 // add new
                
        t = new Timer(100,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            count1++;
            jProgressBar2.setValue(count1);
                 if(jProgressBar2.getValue()<100)
                 {
                  jProgressBar2.setValue(jProgressBar2.getValue()+1);
                  progress(jProgressBar2.getValue());
                 }
                 else
                 {
                   t.stop();
                   pro();
                 }
            }
        });
        t.start();
            // end new 

                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid username or password","Access Denied",JOptionPane.ERROR_MESSAGE);
                    reset();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jPasswordField3KeyPressed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
 con = db.connect();
        String sql = "Select * from profile where un=? and pw=?";
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1,jTextField7.getText());
            pst.setString(2,jPasswordField3.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                jLabel17.setVisible(true);
                jProgressBar2.setVisible(true);
                //             String usr = jTextField1.getText();
                //             index indx = new index(usr);
                //             indx.setVisible(true);
                //             this.dispose();
//                String usr = jTextField7.getText();
//                loading load = new loading(usr);
//                load.setVisible(true);
//                this.dispose();

            // add new
                
        t = new Timer(100,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            count1++;
            jProgressBar2.setValue(count1);
                 if(jProgressBar2.getValue()<100)
                 {
                  jProgressBar2.setValue(jProgressBar2.getValue()+1);
                  progress(jProgressBar2.getValue());
                 }
                 else
                 {
                   t.stop();
                   pro();
                 }
            }
        });
        t.start();
            // end new 

            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid username or password","Access Denied",JOptionPane.ERROR_MESSAGE);
                reset();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }        
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
         // hidden 
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jComboBox1.setVisible(true);
        jTextArea1.setVisible(true);
        jButton1.setVisible(true);
    //    jProgressBar1.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
    //    jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
        jLabel16.setVisible(true);
        jScrollPane1.setVisible(true);
        jPasswordField1.setVisible(true);
        jPasswordField2.setVisible(true);
        jButton4.setVisible(true);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        
        // end hidden
        
        // show
        
        jLabel18.setVisible(false);
    //    username.setVisible(false);
        jTextField7.setVisible(false);
        jPasswordField3.setVisible(false);
        jLabel23.setVisible(false);
        jPanel1.setVisible(false);
        jLabel15.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        // 4
        // end show
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
           // hidden 
        jButton4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);

        
        // end hidden
        
          jLabel18.setVisible(false);
    //    username.setVisible(false);
        jTextField7.setVisible(false);
        jPasswordField3.setVisible(false);
        jLabel23.setVisible(false);
       // jPanel1.setVisible(false);
       // jLabel15.setVisible(false);
       // jLabel19.setVisible(false);
       // jLabel20.setVisible(false);
       // jLabel21.setVisible(false);
       // jLabel22.setVisible(false);
        
        // show
        jLabel32.setVisible(true);
        jLabel33.setVisible(true);
        jTextField8.setVisible(true);
        jLabel35.setVisible(true);
        jLabel36.setVisible(true);
        jPasswordField4.setVisible(true);
        jPasswordField5.setVisible(true);
        // end show
        
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked

         // username validation
            String un1 = jTextField8.getText();
            boolean usrn1 = false;
        if (un1.length()>=4){
            usrn1 = true;
        }
        else if (un1.length() == 0) {
            JOptionPane.showMessageDialog(null,"Please Enter Username","Access Denied",JOptionPane.ERROR_MESSAGE);
        }
        else {
            jTextField8.setForeground(Color.red);
        }
        // end of username validation
        
        
        
        // password validation
            String pwd1 = jPasswordField4.getText();
            boolean pwrd1 = false;
        if (pwd1.length()>=5){
            pwrd1 = true;
        }
        else if (pwd1.length() == 0) {
            jPasswordField4.setBackground(Color.GREEN);
        }
        else {
            jPasswordField4.setForeground(Color.red);
        }
        // end of password validation
        
        // password validation
            String pwd2 = jPasswordField5.getText();
            boolean pwrd2 = false;
        if (pwd2.length()>=5){
            pwrd2 = true;
        }
        else if (pwd2.length() == 0) {
            jPasswordField5.setBackground(Color.GREEN);
        }
        else {
            jPasswordField5.setForeground(Color.red);
        }
        // end of password validation
        
        if (pwrd1 == true && pwd1.length() != 0 && pwrd2 == true && pwd2.length() != 0 && usrn1 == true && un1.length() != 0) {
             try {
                String sql1 = "UPDATE profile set pw = '" + jPasswordField5.getText() + "',change_pw = '" + jPasswordField5.getText() + "' WHERE un = '" + jTextField8.getText() + "'";            
                pst = con.prepareStatement(sql1);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Password Changed Successfully");
                resets();
                 // hidden 
         jButton4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jTextField8.setVisible(false);
        jLabel35.setVisible(false);
        jLabel36.setVisible(false);
        jPasswordField4.setVisible(false);
        jPasswordField5.setVisible(false);
        
        // end hidden
        
        // show
        
        jLabel18.setVisible(true);
     //   username.setVisible(true);
        jTextField7.setVisible(true);
        jPasswordField3.setVisible(true);
        jLabel23.setVisible(true);
        jPanel1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        // 5
        // end show
        
           
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Password Changed Failed, Try Again !");
            } 
        }
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // hidden 
         jButton4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jTextField8.setVisible(false);
        jLabel35.setVisible(false);
        jLabel36.setVisible(false);
        jPasswordField4.setVisible(false);
        jPasswordField5.setVisible(false);
        
        // end hidden
        
        // show
        
        jLabel18.setVisible(true);
     //   username.setVisible(true);
        jTextField7.setVisible(true);
        jPasswordField3.setVisible(true);
        jLabel23.setVisible(true);
        jPanel1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        // 5
        // end show
        
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jPasswordField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField5KeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
        
        // username validation
            String un1 = jTextField8.getText();
            boolean usrn1 = false;
        if (un1.length()>=4){
            usrn1 = true;
        }
        else if (un1.length() == 0) {
            JOptionPane.showMessageDialog(null,"Please Enter Username","Access Denied",JOptionPane.ERROR_MESSAGE);
        }
        else {
            jTextField8.setForeground(Color.red);
        }
        // end of username validation
        
        
        
        // password validation
            String pwd1 = jPasswordField4.getText();
            boolean pwrd1 = false;
        if (pwd1.length()>=5){
            pwrd1 = true;
        }
        else if (pwd1.length() == 0) {
            jPasswordField4.setBackground(Color.GREEN);
        }
        else {
            jPasswordField4.setForeground(Color.red);
        }
        // end of password validation
        
        // password validation
            String pwd2 = jPasswordField5.getText();
            boolean pwrd2 = false;
        if (pwd2.length()>=5){
            pwrd2 = true;
        }
        else if (pwd2.length() == 0) {
            jPasswordField5.setBackground(Color.GREEN);
        }
        else {
            jPasswordField5.setForeground(Color.red);
        }
        // end of password validation
        
        if (pwrd1 == true && pwd1.length() != 0 && pwrd2 == true && pwd2.length() != 0 && usrn1 == true && un1.length() != 0) {
             try {
                String sql1 = "UPDATE profile set pw = '" + jPasswordField5.getText() + "',change_pw = '" + jPasswordField5.getText() + "' WHERE un = '" + jTextField8.getText() + "'";            
                pst = con.prepareStatement(sql1);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Password Changed Successfully");
                resets();
                 // hidden 
         jButton4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox1.setVisible(false);
        jTextArea1.setVisible(false);
        jButton1.setVisible(false);
//        jProgressBar1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel34.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jScrollPane1.setVisible(false);
        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jLabel17.setVisible(false);
        jProgressBar2.setVisible(false);
        
        jLabel32.setVisible(false);
        jLabel33.setVisible(false);
        jTextField8.setVisible(false);
        jLabel35.setVisible(false);
        jLabel36.setVisible(false);
        jPasswordField4.setVisible(false);
        jPasswordField5.setVisible(false);
        
        // end hidden
        
        // show
        
        jLabel18.setVisible(true);
     //   username.setVisible(true);
        jTextField7.setVisible(true);
        jPasswordField3.setVisible(true);
        jLabel23.setVisible(true);
        jPanel1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        // 5
        // end show
        
           
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Password Changed Failed, Try Again !");
            } 
        }
//        // password validation
//            String pwd1 = jPasswordField4.getText();
//            boolean pwrd1 = false;
//        if (pwd1.length()>=5 && pwd1.length()<=10){
//            pwrd1 = true;
//        }
//        else if (pwd1.length() == 0) {
//            jPasswordField4.setBackground(Color.GREEN);
//        }
//        else {
//            jPasswordField4.setForeground(Color.red);
//        }
//        // end of password validation
//        
//        // password validation
//            String pwd2 = jPasswordField5.getText();
//            boolean pwrd2 = false;
//        if (pwd2.length()>=5 && pwd2.length()<=10){
//            pwrd2 = true;
//        }
//        else if (pwd2.length() == 0) {
//            jPasswordField5.setBackground(Color.GREEN);
//        }
//        else {
//            jPasswordField5.setForeground(Color.red);
//        }
//        // end of password validation
//        
//        if (pwrd1 == true && pwd1.length() != 0 && pwrd2 == true && pwd2.length() != 0 ) {
//             try {
//                String sql1 = "UPDATE profile set pw = '" + jPasswordField5.getText() + "',change_pw = '" + jPasswordField5.getText() + "' WHERE un = '" + jTextField8.getText() + "' AND pw = '"+jPasswordField4.getText()+"')";            
//                pst = con.prepareStatement(sql1);
//                pst.execute();
//                JOptionPane.showMessageDialog(null, "Password Changed Successfully");
//                resets();
//                 // hidden 
//         jButton4.setVisible(false);
//        jTextField1.setVisible(false);
//        jTextField2.setVisible(false);
//        jTextField3.setVisible(false);
//        jTextField4.setVisible(false);
//        jTextField5.setVisible(false);
//        jTextField6.setVisible(false);
//        jComboBox1.setVisible(false);
//        jTextArea1.setVisible(false);
//        jButton1.setVisible(false);
////        jProgressBar1.setVisible(false);
//        jLabel4.setVisible(false);
//        jLabel5.setVisible(false);
//        jLabel6.setVisible(false);
//        jLabel7.setVisible(false);
//        jLabel8.setVisible(false);
//       jLabel34.setVisible(false);
//        jLabel10.setVisible(false);
//        jLabel11.setVisible(false);
//        jLabel12.setVisible(false);
//        jLabel13.setVisible(false);
//        jLabel14.setVisible(false);
//        jLabel16.setVisible(false);
//        jScrollPane1.setVisible(false);
//        jPasswordField1.setVisible(false);
//        jPasswordField2.setVisible(false);
//        jLabel17.setVisible(false);
//        jProgressBar2.setVisible(false);
//        
//        jLabel32.setVisible(false);
//        jLabel33.setVisible(false);
//        jTextField8.setVisible(false);
//        jLabel35.setVisible(false);
//        jLabel36.setVisible(false);
//        jPasswordField4.setVisible(false);
//        jPasswordField5.setVisible(false);
//        
//        // end hidden
//        
//        // show
//        
//        jLabel18.setVisible(true);
//     //   username.setVisible(true);
//        jTextField7.setVisible(true);
//        jPasswordField3.setVisible(true);
//        jLabel23.setVisible(true);
//        jPanel1.setVisible(true);
//        jLabel15.setVisible(true);
//        jLabel19.setVisible(true);
//        jLabel20.setVisible(true);
//        jLabel21.setVisible(true);
//        jLabel22.setVisible(true);
//        // 5
//        // end show
//        
//           
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Password Changed Failed, Try Again !");
//            } 
//        }
    }//GEN-LAST:event_jPasswordField5KeyPressed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
//       try {
//            
//                Connection conn = db.connect();
//                Statement s = conn.createStatement();
//             
//            rs = s.executeQuery("SELECT * FROM profile WHERE un='" + jTextField6.getText() + "'");
//            while (rs.next()) {
//
//              jLabel34.setText("username already exists..");
//         }
//           
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Invalid Index No");
//            
//        }        
//            
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setExtendedState(modify_login.ICONIFIED);
    }//GEN-LAST:event_jButton3ActionPerformed

//    public void pro1(){
//        if(jProgressBar1.getValue()==0){
//            jProgressBar1.setVisible(false);
//            jLabel9.setVisible(false);
//        }
//        else {
//            jProgressBar1.setVisible(true);
//            jLabel9.setVisible(true);
//        }
//    }
    
//    public void checks(){
//        jLabel9.setVisible(true);
//        if(jProgressBar1.getValue()==100){
//            jLabel9.setForeground(Color.GREEN);
//            jLabel9.setText("Excelent");
//        }
//        else if(jProgressBar1.getValue()<100 && jProgressBar1.getValue()>=80) {
//            jLabel9.setForeground(Color.YELLOW);
//            jLabel9.setText("Perfeect");
//        }
//        else if(jProgressBar1.getValue()<80 && jProgressBar1.getValue()>=50) {
//            jLabel9.setForeground(Color.ORANGE);
//            jLabel9.setText("Good");
//        }
//        else {
//            jLabel9.setForeground(Color.red);
//            jLabel9.setText("Weak");
//        }
//    }
    
     public void resets(){
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextArea1.setText("");
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        modify_login.setDefaultLookAndFeelDecorated(true);
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
            java.util.logging.Logger.getLogger(modify_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modify_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modify_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modify_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modify_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
