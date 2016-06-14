package Labirint;



import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author domen
 */
public class Graphic_Maze extends javax.swing.JFrame {
    Maze ma1;
    JTableDisplay Jtab;
    int status;

    /**
     * Creates new form Graphic_Maze
     */
    public Graphic_Maze() {
        this.status = 0;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        widthS = new javax.swing.JTextField();
        heightS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        draw_mazeButton = new javax.swing.JButton();
        izrisiButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        errorTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openJMenu = new javax.swing.JMenuItem();
        saveJMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        widthS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthSActionPerformed(evt);
            }
        });

        heightS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightSActionPerformed(evt);
            }
        });

        jLabel1.setText("X");

        draw_mazeButton.setText("Postavi labirint");
        draw_mazeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                draw_mazeButtonMouseClicked(evt);
            }
        });
        draw_mazeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                draw_mazeButtonActionPerformed(evt);
            }
        });

        izrisiButton.setText("Najdi pot");
        izrisiButton.setEnabled(false);
        izrisiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izrisiButtonActionPerformed(evt);
            }
        });

        errorTextArea.setEditable(false);
        errorTextArea.setColumns(20);
        errorTextArea.setRows(5);
        errorTextArea.setText("Vnesi dolzino in sirino labirinta!");
        jScrollPane1.setViewportView(errorTextArea);

        jLabel2.setText("Porocilo uspeha");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        openJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        openJMenu.setText("Open");
        openJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openJMenuActionPerformed(evt);
            }
        });
        jMenu1.add(openJMenu);

        saveJMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveJMenu.setText("Save");
        saveJMenu.setEnabled(false);
        saveJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveJMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(widthS, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(heightS, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(izrisiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(draw_mazeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(draw_mazeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(izrisiButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(widthS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void heightSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightSActionPerformed

    private void widthSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthSActionPerformed

    private void draw_mazeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draw_mazeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_draw_mazeButtonActionPerformed

    private void draw_mazeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_mazeButtonMouseClicked
        // TODO add your handling code here:
        openJMenu.setEnabled(false);
        int width, height;
        if(this.status == 0){
            try{
                width = Integer.parseInt(widthS.getText());
                height = Integer.parseInt(heightS.getText());
                if(width < 1 || height < 2){
                    errorTextArea.setText("Napaka: Premajhna vrednost");
                    return;
                }
                ma1 = new Maze(height, width);
            }catch(NumberFormatException e){
                errorTextArea.setText("Napaka: " + e.getMessage() + "\nVnesi naravni stevili");
                return;
            }
            catch(Exception e){
                errorTextArea.setText("Neznana napaka: " + e.getMessage());
                return;
            }
        }
        Jtab = new JTableDisplay(ma1.booleanToObject(ma1.walls), ma1.getHeight()); // ubistvu je getWidth() sam tle drgac izrisujm pa mi glih kontra poment
//        System.out.println("START: " + Jtab.startYY);
//        System.out.println("STOP: " + Jtab.stopYY);
        izrisiButton.setEnabled(true);
        if(this.status == 1){
            openJMenu.setEnabled(true);
        }
        draw_mazeButton.setEnabled(false);

    }//GEN-LAST:event_draw_mazeButtonMouseClicked

    public void setStart_Stop(){
        if(Jtab.startYY == -1)
            ma1.setStartY(0);
        else if(Jtab.startYY > -1)
            ma1.setStartY(Jtab.startYY);
        if(Jtab.stopYY == -1)
            ma1.setStopY(0);
        else if(Jtab.stopYY > -1)
            ma1.setStopY(Jtab.stopYY);
    }
    
    public void setTable(JTableDisplay jtab, Maze maze){
        for (int i = 0; i < maze.getWidth(); i++) {
            for (int j = 0; j < maze.getHeight(); j++) {
                if(maze.rout[i][j] == -1)
                    jtab.setValueAt(i, j, "|");
                else if (maze.walls[i][j])
                    jtab.setValueAt(i, j, "X");
                else if(!maze.walls[i][j]) 
                   jtab.setValueAt(i, j, "O");
                if(maze.getStartY() == i)
                    jtab.setValueAt(i, 0, "ST");
                if(maze.getStopY() == i)
                    jtab.setValueAt(i, maze.getHeight() - 1 , "FIN");
            }
        }
    }
    
    private void izrisiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izrisiButtonActionPerformed
        int width = ma1.getWidth();
        int height = ma1.getHeight();
        boolean[][] test = Jtab.getWallsFromTable(width, height);
        //dobim true false labirinta in pa start stop
        ma1.walls = test;
        this.setStart_Stop();
        if(ma1.find_the_way()){
            ma1.shortes_way();
            this.setTable(Jtab, ma1);
            errorTextArea.setText("OK\nPot je izrisana\nDolzina najkrajse poti: " + ma1.getLenght());
        }
        else if (!ma1.find_the_way()){
            errorTextArea.setText("Labirint nima izhoda");
            //System.out.println("Labirint nima izhoda");
        }
        else
            errorTextArea.setText("Napaka!");
        izrisiButton.setEnabled(false);
        saveJMenu.setEnabled(true);
        draw_mazeButton.setEnabled(true);
        if(this.status == 1){
            draw_mazeButton.setEnabled(false);
        }

    }//GEN-LAST:event_izrisiButtonActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void openJMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openJMenuActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("C:/"));
        //fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if(fc.showOpenDialog(openJMenu) == JFileChooser.APPROVE_OPTION){
            widthS.setEnabled(false);
            heightS.setEnabled(false);
            Maze pom_maze = new Maze(100,100);
            String dat = fc.getSelectedFile().getAbsolutePath();
            Save_Maze.restore(dat, pom_maze);
            ma1 = new Maze(pom_maze.getWidth(),pom_maze.getHeight());
            ma1.walls = pom_maze.walls;
            ma1.setStartY(pom_maze.getStartY());
            ma1.setStopY(pom_maze.getStopY());
            draw_mazeButton.setEnabled(true);
            this.status = 1;
        }
        
    }//GEN-LAST:event_openJMenuActionPerformed

    private void saveJMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("C:/"));
        fc.setDialogTitle("Shrani labirint");
        if(fc.showSaveDialog(saveJMenu) == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getAbsolutePath();
            Save_Maze.save(path, ma1);
            
        }
    }//GEN-LAST:event_saveJMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Graphic_Maze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphic_Maze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphic_Maze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphic_Maze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphic_Maze().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton draw_mazeButton;
    private javax.swing.JTextArea errorTextArea;
    private javax.swing.JTextField heightS;
    private javax.swing.JButton izrisiButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openJMenu;
    private javax.swing.JMenuItem saveJMenu;
    private javax.swing.JTextField widthS;
    // End of variables declaration//GEN-END:variables
}
