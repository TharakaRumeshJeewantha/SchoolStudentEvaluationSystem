/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author tj.rumesh
 */
public class loading extends javax.swing.JFrame {
    private Timer t = null;
    private int count =0;
    String new_usr;
    /**
     * Creates new form loading
     */
    public loading() {
//        
//        t = new Timer(100,new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            count++;
//            jProgressBar1.setValue(count);
//                 if(jProgressBar1.getValue()<100)
//                 {
//                  jProgressBar1.setValue(jProgressBar1.getValue()+1);
//                  progress(jProgressBar1.getValue());
//                 }
//                 else
//                 {
//                   t.stop();
//                   pro();
//                 }
//            }
//        });
//        t.start();
        initComponents();
    }

    loading(String usr) {
        initComponents();
       jLabel2.setVisible(false);
        new_usr = usr;
       jLabel2.setText(usr);
                
        t = new Timer(100,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            count++;
            jProgressBar1.setValue(count);
                 if(jProgressBar1.getValue()<100)
                 {
                  jProgressBar1.setValue(jProgressBar1.getValue()+1);
                  progress(jProgressBar1.getValue());
                 }
                 else
                 {
                   t.stop();
                   pro();
                 }
            }
        });
        t.start();
    }

     private void pro(){
        
//        index indx = new index();
//        indx.setVisible(true);
//        this.dispose();

        String log_user = jLabel2.getText();
        index lo_indx= new index(log_user);
        lo_indx.setVisible(true);
        this.dispose();
        
    }
    
      private void progress(int t){
 
        if(t < 15){
            progress_box.setText("Hi "+ new_usr + " , Your Profile Creating .");
        }
        else if(t < 18){
            progress_box.setText("Hi "+ new_usr + " , Your Profile Creating . .");
           }
        else if(t < 21){
            progress_box.setText("Hi "+ new_usr + " , Your Profile Creating . . .");
           }
        else if(t < 25){
            progress_box.setText("Student Records Searching . ");
           }
        else if(t < 28){
            progress_box.setText("Student Records Searching . . ");
           }
        else if(t < 32){
            progress_box.setText("Student Records Searching . . . ");
           }
        else if(t < 37){
            progress_box.setText("Student Records Searching . . . .");
           }
        else if(t < 42){
            progress_box.setText("Student Records Searching . . . . .");
           }
         else if(t < 47){
            progress_box.setText("Student Records Searching . . . . . .");
           }
        else if(t < 50){
            progress_box.setText("Calculating Assaignment Marks . ");
        }
        else if(t < 55){
            progress_box.setText("Calculating Assaignment Marks . . ");
        }
        else if(t < 59){
            progress_box.setText("Calculating Assaignment Marks . . . ");
        }
        else if(t < 62){
            progress_box.setText("Calculating Assaignment Marks . . . .");
        }
         else if(t < 65){
            progress_box.setText("Calculating Term Test Marks . ");
            }
         else if(t < 68){
            progress_box.setText("Calculating Term Test Marks . .");
            }
         else if(t < 72){
            progress_box.setText("Calculating Term Test Marks . . .");
            }
          else if(t < 75){
            progress_box.setText("Resolving . . ");
          }
          else if(t < 78){
            progress_box.setText("Resolving . . . .");
          }
        else if(t < 80){
            progress_box.setText("Home Page Analysing and Designing .");
           }
        else if(t < 82){
            progress_box.setText("Home Page Analysing and Designing . . ");
           }
        else if(t < 84){
            progress_box.setText("Home Page Analysing and Designing . . . ");
           }
        else if(t < 86){
            progress_box.setText("Home Page Analysing and Designing . . . . ");
           }
        else if(t < 88){
            progress_box.setText("Finalizing . ");
        }
        else if(t < 90){
            progress_box.setText("Finalizing . . ");
        }
        else if(t < 92){
            progress_box.setText("Finalizing . . . ");
        }
        else if(t < 94){
            progress_box.setText("Finalizing . . . .");
        }
        else if(t < 96){
            progress_box.setText("Finalizing . . . . .");
        }
        
        else {
            progress_box.setText(new_usr + " Please Wait . . . ."); 
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        progress_box = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 250, 0, 0));
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(0, 51, 0));
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 0, 150, 14);

        progress_box.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        progress_box.setForeground(new java.awt.Color(255, 153, 0));
        progress_box.setText("jLabel2");
        jPanel1.add(progress_box);
        progress_box.setBounds(20, 30, 340, 14);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(20, 50, 560, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school/ab1.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel progress_box;
    // End of variables declaration//GEN-END:variables
}
