
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jayant
 */
public class GameJFrame extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form GameJFrame
     */
    JButton[] jb ;
    int value[];
    boolean isO;
    ImageIcon imgO,imgX,imgNull;
    int[][][] d3;
    int[] faceWin;
    public GameJFrame() {
    
        initComponents();
        jb = new JButton[63];
        value = new int[63];
        faceWin = new int[7];
        for(int i=0 ;i<63 ;i++){
            value[i]=0;
        }
        isO=true;
/*        imgO=new ImageIcon("C:\\Users\\user\\Desktop\\o.png");
        imgX=new ImageIcon("C:\\Users\\user\\Desktop\\x.png");
        imgNull=new ImageIcon("C:\\Users\\user\\Desktop\\null.png");*/
        
      /*  imgO=new ImageIcon("E:\\3rd\\ Semester\\PDLab\\XO3D\\JavaApplication18\\o.png");
        imgX=new ImageIcon("E:\\3rd\\ Semester\\PDLab\\XO3D\\JavaApplication18\\x.png");
        imgNull=new ImageIcon("E:\\3rd\\ Semester\\PDLab\\XO3D\\JavaApplication18\\null.png");*/
       
        imgO=new ImageIcon("o.png");
        imgX=new ImageIcon("x.png");
        imgNull=new ImageIcon("null.png");
        
        
        int count=0;
        for(int i=0 ; i<9;i++){
            jb[count] = new JButton();
            jPanel1.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel2.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel3.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel4.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel5.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel6.add(jb[count]);
            count++;
        }
        for (int i = 0; i < 9; i++) {
            jb[count] = new JButton();
            jPanel7.add(jb[count]);
            count++;
        }
        
       
          
        for(int i=0 ;i<63 ;i++){
            jb[i].setIcon(imgNull);
            jb[i].addMouseListener(this);
        }            
               
        
        setSize(1800, 950);
        GameJFrame.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(120, 60, 300, 300);

        jPanel2.setLayout(new java.awt.GridLayout(3, 3));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(251, 58, 100, 100);

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(364, 58, 100, 100);

        jPanel4.setLayout(new java.awt.GridLayout(3, 3));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(139, 220, 100, 100);

        jPanel5.setLayout(new java.awt.GridLayout(3, 3));
        getContentPane().add(jPanel5);
        jPanel5.setBounds(251, 220, 100, 100);

        jPanel6.setLayout(new java.awt.GridLayout(3, 3));
        getContentPane().add(jPanel6);
        jPanel6.setBounds(369, 220, 100, 100);

        jPanel7.setLayout(new java.awt.GridLayout(1, 3));
        getContentPane().add(jPanel7);
        jPanel7.setBounds(481, 220, 100, 100);

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(480, 60, 127, 108);

        jToggleButton1.setText("jToggleButton1");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(318, 13, 119, 25);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(265, 17, 41, 16);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(449, 17, 41, 16);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(175, 176, 41, 16);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(277, 176, 41, 16);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(394, 176, 41, 16);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(172, 361, 41, 16);

        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(273, 361, 41, 16);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(391, 361, 41, 16);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(512, 361, 41, 16);

        jLabel10.setIcon(new javax.swing.ImageIcon("H:\\Image\\NATURE\\1024x600_03.jpg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1800, 960);

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
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

 public void update(int i){
        switch(i){
            case 0:
                value[27]=value[i];
                value[38]=value[i];
                break;
            case 1:
                value[28]=value[i];
                break;
            case 2:
                value[29]=value[i];
                value[54]=value[i];
                break;
            case 3:
                value[37]=value[i];
                break;
            case 4:
                break;
            case 5:
                value[55]=value[i];
                
                break;
            case 6:
                value[47]=value[i];
                value[36]=value[i];
                break;
            case 7:
                value[46]=value[i];
                break;
            case 8:
                value[45]=value[i];
                value[56]=value[i];
                break;
            case 9:
                value[30]=value[i];
                value[41]=value[i];
                break;
            case 10:
                value[31]=value[i];
                break;
            case 11:
                value[32]=value[i];
                value[57]=value[i];
                break;
            case 12:
                value[40]=value[i];
                break;
            case 13:
                break;
            case 14:
                value[58]=value[i];
                break;
            case 15:
                value[39]=value[i];
                value[50]=value[i];
                break;
            case 16:
                value[49]=value[i];
                break;
            case 17:
                value[48]=value[i];
                value[59]=value[i];
                break;
            case 18:
                value[33]=value[i];
                value[44]=value[i];
                break;
            case 19:
                value[34]=value[i];
                break;
            case 20:
                value[35]=value[i];
                value[60]=value[i];
                break;
            case 21:
                value[43]=value[i];
                break;
            case 22:
                break;
            case 23:
                value[61]=value[i];
                break;
            case 24:
                value[42]=value[i];
                value[53]=value[i];
                break;
            case 25:
                value[52]=value[i];
                break;
            case 26:
                value[51]=value[i];
                value[62]=value[i];
                break;
        }
        
        
    }
    public void paint3D() {
    	for(int i=27 ; i<63 ;i++) {
    		if(value[i]==1) {
    			jb[i].setIcon(imgO);
    		}
    		if(value[i]==2) {
    			jb[i].setIcon(imgX);
    		}
    	}
    }
    
    public void faceWinner(int[] facenos) {
    	for(int faceno :facenos) {
	    	int t = faceno*9;
	    	if(faceWin[faceno]!=0) {
		    	for(int i=0 ;i<3 ; i++) {
		    		if(value[t]==value[t+1]&& value[t+1]==value[t+2] ) {
		    			faceWin[faceno]=value[t];
		    		}
		    		if(value[t]==value[t+3]&& value[t+3]==value[t+6] ) {
		    			faceWin[faceno]=value[t];
		    		}
		    		t++;
		    	}
		    	t-=3;
		    	if(value[t]==value[t+4]&& value[t+4]==value[t+8]) {
		    		faceWin[faceno]=value[t];
		    	}
		    	if(value[t+2]==value[t+4]&& value[t+4]==value[t+6]) {
		    		faceWin[faceno]=value[t];
		    	}
	    	}
    	}
    	
    	
    }
    public void checkFaceWin(int i) {
    	int[] a = new int[3];
    	if(i<=8) {
    		a[0]=0;
    	}
    	if(i>8 && i>=17) {
    		a[0]=1;
    	}
    	if(i>17) {
    		a[0]=2;
    	}
    	switch(i) {
    	case 0:
    		a[1]=3;
    		a[2]=4;
    	case 1:
    		a[1]=3;
    	case 2:
    		a[1]=3;
    		a[2]=6;
    	case 3:
    	case 4:
    		a[1]=6;
    	case 5:
    		a[1]=5;
    		a[2]=4;
    	case 6:
    		a[1]=5;
    	case 7:
    		a[1]=5;
    		a[2]=6;
    	case 8:
    		a[1]=3;
    		a[2]=4;
    	case 9:
    		a[1]=3;
    	case 10:
    		a[1]=3;
    		a[2]=4;
    	case 11:
    		a[1]=3;
    		a[2]=4;
    	case 12:
    		a[1]=3;
    		a[2]=4;
    	case 13:
    		a[1]=3;
    		a[2]=4;
    	case 14:
    		a[1]=3;
    		a[2]=4;
    	case 15:
    		a[1]=3;
    		a[2]=4;
    	case 16:
    		a[1]=3;
    		a[2]=4;
    	case 17:
    		a[1]=3;
    		a[2]=4;
    	case 18:
    		a[1]=3;
    		a[2]=4;
    	case 19:
    		a[1]=3;
    		a[2]=4;
    	case 20:
    		a[1]=3;
    		a[2]=4;
    	case 21:
    		a[1]=3;
    		a[2]=4;
    	case 22:
    		a[1]=3;
    		a[2]=4;
    	case 23:
    		a[1]=3;
    		a[2]=4;
    	case 24:
    		a[1]=3;
    		a[2]=4;
    	case 25:
    		a[1]=3;
    		a[2]=4;
    	case 26:
    		a[1]=3;
    		a[2]=4;
    		
    	
    	
    	
    	}
   
   
    
    }
        @Override
    public void mouseClicked(MouseEvent e) {
        for(int i=0 ;i<27 ;i++){
            if(e.getSource().equals(jb[i])){
            	
                if(value[i]==0){
                    if(isO){
                        value[i]=1;
                        jb[i].setIcon(imgO);
                        update(i);
                        paint3D();
                        checkFaceWin(i);
                        isO=false;
                    }
                    else{
                        value[i]=2;
                        jb[i].setIcon(imgX);
                        update(i);
                        paint3D();
                        checkFaceWin(i);
                        isO=true;
                    }
                }
            }
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}