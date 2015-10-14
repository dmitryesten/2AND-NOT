
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;



public class logicFunction extends javax.swing.JFrame implements Runnable{

    boolean a, b, c, f; int x=5;
    
    Thread th;
    
   // Move move = new Move();
    
    
    public logicFunction() {
        setResizable(false);
        initComponents();
        jPanelSchema();
    }
 
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton_A0 = new javax.swing.JRadioButton("0",true);
        jRadioButton_A1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton_B0 = new javax.swing.JRadioButton("0", true);
        jRadioButton_B1 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton_C0 = new javax.swing.JRadioButton("0", true);
        jRadioButton_C1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanelXY = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                jPanelSchema();
            }};
            jScrollPane1 = new javax.swing.JScrollPane();
            jTable1 = new javax.swing.JTable();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setName("jframe"); // NOI18N

            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("A"));

            buttonGroup1.add(jRadioButton_A0);
            jRadioButton_A0.setText("0");

            buttonGroup1.add(jRadioButton_A1);
            jRadioButton_A1.setText("1");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton_A1)
                        .addComponent(jRadioButton_A0))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jRadioButton_A0)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton_A1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("B"));

            buttonGroup2.add(jRadioButton_B0);
            jRadioButton_B0.setText("0");

            buttonGroup2.add(jRadioButton_B1);
            jRadioButton_B1.setText("1");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton_B0)
                    .addContainerGap())
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jRadioButton_B1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jRadioButton_B0)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton_B1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("C"));

            buttonGroup3.add(jRadioButton_C0);
            jRadioButton_C0.setText("0");

            buttonGroup3.add(jRadioButton_C1);
            jRadioButton_C1.setText("1");

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton_C0, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton_C1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jRadioButton_C0)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton_C1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jButton1.setText("Подать сигналы");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jPanelXY.setBackground(new java.awt.Color(255, 255, 255));
            jPanelXY.addAncestorListener(new javax.swing.event.AncestorListener() {
                public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                    jPanelXYAncestorMoved(evt);
                }
                public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                }
                public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                }
            });

            javax.swing.GroupLayout jPanelXYLayout = new javax.swing.GroupLayout(jPanelXY);
            jPanelXY.setLayout(jPanelXYLayout);
            jPanelXYLayout.setHorizontalGroup(
                jPanelXYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 398, Short.MAX_VALUE)
            );
            jPanelXYLayout.setVerticalGroup(
                jPanelXYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 223, Short.MAX_VALUE)
            );

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {"0", "0", "0", "1", "0", "0", "        0 "},
                    {"0", "0", "1", "0", "0", "0", "        0"},
                    {"0", "1", "0", "1", "0", "0", "        0"},
                    {"0", "1", "1", "0", "0", "0", "        0"},
                    {"1", "0", "0", "1", "0", "1", "        1"},
                    {"1", "0", "1", "0", "0", "0", "        0"},
                    {"1", "1", "0", "1", "1", "1", "        1"},
                    {"1", "1", "1", "0", "1", "0", "        1"}
                },
                new String [] {
                    "A", "B", "C", "(НЕ)C", "AB", "A( (НЕ)C)", "AB+(A( (НЕ)C) )"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jTable1.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(jTable1);
            if (jTable1.getColumnModel().getColumnCount() > 0) {
                jTable1.getColumnModel().getColumn(0).setMaxWidth(25);
                jTable1.getColumnModel().getColumn(1).setMaxWidth(25);
                jTable1.getColumnModel().getColumn(2).setMaxWidth(25);
                jTable1.getColumnModel().getColumn(3).setMaxWidth(44);
                jTable1.getColumnModel().getColumn(4).setMaxWidth(35);
                jTable1.getColumnModel().getColumn(5).setMaxWidth(65);
                jTable1.getColumnModel().getColumn(6).setMaxWidth(100);
            }

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 102, 102));
            jLabel1.setText("F=AB+A(НЕ(C)");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanelXY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(jLabel1)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jPanelXY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        Graphics g = jPanelXY.getGraphics();
        th = new Thread(this);
        
       
                
        if(jRadioButton_A0.isSelected()== true){ a=false;   }
        if(jRadioButton_A1.isSelected()== true){ a=true;    }
        if(jRadioButton_B0.isSelected()== true){ b=false;   }
        if(jRadioButton_B1.isSelected()== true){ b=true;    }
        if(jRadioButton_C0.isSelected()== true){ c=false;   }
        if(jRadioButton_C1.isSelected()== true){ c=true;    }
        
       
        
        
        f=(  (a&&b)||(a&&(!c))  );
       //th.start();
        
         aAND_NOTb_andSignalOnConuctr3(); 
         A(); B(); C(); 
         a_AND_NOT_notc();
         finishResalt();
     
       
        
      
            
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void A(){
    Graphics g = jPanelXY.getGraphics();
    Color gree = new Color(48, 116, 51);
    
     if(a==true){
         g.setColor(Color.WHITE);
         g.clearRect(79, 29, 10, 10);
         g.clearRect(150, 104, 10, 10);
             
           g.setColor(gree);
            g.drawString("1", 80, 38); //сигнал на коньюктор 1 
            g.drawString("1", 152, 113); // сигнал на коньюктор 2 (A*!C) 
        }
        else{
            g.setColor(Color.WHITE);
            g.clearRect(79, 29, 10, 10);
            g.clearRect(150, 104, 10, 10);
            
        g.setColor(Color.red);
        g.drawString("0", 80, 38);
        g.drawString("0", 151, 113 );
        }
    
    }
    
    private void B(){
    Graphics g = jPanelXY.getGraphics();
    Color gree = new Color(48, 116, 51);
    
    if(b==true){
        g.setColor(Color.WHITE);
        g.clearRect(79, 59, 10, 10);
        
        g.setColor(gree);
        g.drawString("1", 80, 68);
        
        } 
        else{
            g.setColor(Color.WHITE);
            g.clearRect(79, 59, 10, 10);
             
            g.setColor(Color.red);
            g.drawString("0", 80, 68);
        }
    }
   
    private void C(){
    Color gree = new Color(48, 116, 51);
    Graphics g = jPanelXY.getGraphics();
    
    if(c==true){
            g.setColor(Color.WHITE);
            g.clearRect(44, 149, 10, 10);
            g.clearRect(96, 156, 10, 10);
            //*********
            g.clearRect(149, 134, 10, 10);
             
            
            g.setColor(gree);
            g.drawString("1", 45, 158);//сигнал на входе
            g.setColor(Color.red);
            g.drawString("0", 97, 165);// сигнал на выходе
            //**********
            g.drawString("0", 150, 143);
        } 
        else{
            g.setColor(Color.WHITE);
            g.clearRect(44, 149, 10, 10);
            g.clearRect(96, 156, 10, 10);
            //******
            g.clearRect(149, 134, 10, 10);
             
            
             g.setColor(Color.red);
             g.drawString("0", 45, 158);
             g.setColor(gree);
             g.drawString("1", 97, 165);
             //*********
             g.drawString("1", 150, 143);
        }
    
    
    }
    
    private void a_AND_NOT_notc(){
    
        Graphics g = jPanelXY.getGraphics();
        Color gree = new Color(48, 116, 51);
        
        if(a&&(!c)==true){
          g.setColor(Color.WHITE);
          g.clearRect(198, 111, 10, 10);   
          g.clearRect(268, 71, 10, 10);
            
             g.setColor(Color.red);
             g.drawString("0", 200, 120);
             
             g.drawString("0", 270, 80);
        }
        else{
        
         g.setColor(Color.WHITE);
         g.clearRect(198, 111, 10, 10);
         g.clearRect(268, 71, 10, 10);
            
             g.setColor(gree);
             g.drawString("1", 200, 120);
             g.drawString("1", 270, 80);
        
        }
    
        
    
    }
    
    private void aAND_NOTb_andSignalOnConuctr3(){
       Graphics g = jPanelXY.getGraphics();
          Color gree = new Color(48, 116, 51);
       
        
         if( (a&&b)==false ){
           g.setColor(Color.WHITE);
           g.clearRect(129, 36, 10, 10);
           g.clearRect(269, 39, 10, 10);
            
                g.setColor(gree);
                g.drawString("1", 130, 45);// результат лог умножения A*B
                
                g.drawString("1",270, 48);//сигнал на коньюктор 4
        }
         
         if((a&&b)==true){
           g.setColor(Color.WHITE);
           g.clearRect(129, 36, 10, 10);
           g.clearRect(269, 39, 10, 10);
           
           g.setColor(Color.red);
             g.drawString("0", 130, 45);// результат лог умножения A*B
             g.drawString("0",270, 48);//сигнал на коньюктор 4
         }
    
    }
    
    private void finishResalt(){
    
    Graphics g = jPanelXY.getGraphics();
    Color gree = new Color(48, 116, 51);
    
    if(f==true){
    
     g.setColor(Color.WHITE);
     g.clearRect(319, 50, 10, 10);
        
      g.setColor(gree);
      g.drawString("1", 320, 59);
        
    }
    else{
    g.setColor(Color.WHITE);
    g.clearRect(319, 50, 10, 10);
        
      g.setColor(Color.red);
      g.drawString("0", 320, 59);
    
    }
    
    }
    
    
    
    private void jPanelXYAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanelXYAncestorMoved
        jPanelSchema();// TODO add your handling code here:
    }//GEN-LAST:event_jPanelXYAncestorMoved

    
    
    
    public void jPanelSchema(){
    
         Graphics g = jPanelXY.getGraphics();
         
        g.drawRect(90, 25, 35, 60); //AND_NOT_1
        g.drawRect(55, 140, 35, 60); //AND_NOT_2
        g.drawRect(160, 100, 35, 60); // AND_NOT_3
        g.drawRect(280, 37, 35, 60); //AND_NOT_4
        
        g.drawLine(5, 40, 90, 40);// line_1
         g.drawLine(60, 40, 60, 115);//line_1.1
         g.drawLine(60, 115, 160, 115);//line_1.2
        
        g.drawLine(5, 70, 90, 70);//line_2
        
        g.drawLine(5, 160, 55, 160);//line_3
         g.drawLine(30, 160, 30, 175);//line_3.1
         g.drawLine(30, 175, 55, 175);//line_3.2
        
        g.drawLine(97, 170, 130, 170);//line_4
         g.drawLine(130, 170, 130 , 145);//line_4.1
         g.drawLine(130, 145, 160, 145);//line_4.2
       
        g.drawLine(132, 52, 280, 52);//line_5
        
        g.drawLine(202, 127, 250, 127);//line_6
         g.drawLine(250, 127, 250, 85);//line_6.1
         g.drawLine(250, 85, 280, 85);//line_6.2
         
        g.drawLine(322, 65, 350, 65);//line_7
         
        
        
        g.drawOval(125, 50, 7, 7);//oval_1
        g.drawOval(90, 165, 7, 7);//oval_2
        g.drawOval(195, 125, 7, 7);//oval_3
        g.drawOval(315, 62, 7, 7);//oval_4
         g.fillOval(58, 38, 5, 5);//point_1
         
         
         
         g.fillOval(x, 40, 6, 6);
         
         g.drawString("A", 6, 39);
         g.drawString("B", 6, 69);
         g.drawString("C", 6, 159);
         
         g.drawString("&", 93, 37);
         g.drawString("&", 58, 152);
         g.drawString("&", 163, 112);
         g.drawString("&", 283, 49);
    
    }
    
    
    
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
            java.util.logging.Logger.getLogger(logicFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logicFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logicFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logicFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logicFunction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelXY;
    private javax.swing.JRadioButton jRadioButton_A0;
    private javax.swing.JRadioButton jRadioButton_A1;
    private javax.swing.JRadioButton jRadioButton_B0;
    private javax.swing.JRadioButton jRadioButton_B1;
    private javax.swing.JRadioButton jRadioButton_C0;
    private javax.swing.JRadioButton jRadioButton_C1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
         aAND_NOTb_andSignalOnConuctr3();
         System.out.println("Start");
         sleep(2000);
         System.out.println("1");
         A();
         sleep(4000);
         System.out.println("2");
         B(); 
         
         sleep(3000);
         System.out.println("3");
         C(); 
    }

    private void sleep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}





