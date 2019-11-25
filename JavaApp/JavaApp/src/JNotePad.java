/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zoha Saleem
 */
import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.text.DefaultEditorKit;

public class JNotePad extends javax.swing.JFrame {
    private boolean change = false;
    private boolean save = false;
    private String file = "";
    private String defaultTitle = "Untitled Notepad";
    private String title = defaultTitle;
    private JFileChooser fileChooser;
    private FileOutputStream fos;
    File fileName2;
    /**
     * Creates new form JNotePad
     */
    public JNotePad() {
        setTitle("Untitled Notepad");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newItem = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();
        saveAsItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutItem = new javax.swing.JMenuItem();
        CopyItem = new javax.swing.JMenuItem();
        pasteItem = new javax.swing.JMenuItem();
        bold = new javax.swing.JMenuItem();
        Italic = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        fileMenu.setText("File");

        newItem.setText("New");
        newItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemActionPerformed(evt);
            }
        });
        fileMenu.add(newItem);

        openItem.setText("Open");
        openItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openItemActionPerformed(evt);
            }
        });
        fileMenu.add(openItem);

        saveItem.setText("Save");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveItem);

        saveAsItem.setText("Save As..");
        saveAsItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsItem);

        exitItem.setText("Exit");
        exitItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitItemMouseClicked(evt);
            }
        });
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        cutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutItem.setText("Cut");
        cutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutItemActionPerformed(evt);
            }
        });
        editMenu.add(cutItem);

        CopyItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        CopyItem.setText("Copy");
        CopyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyItemActionPerformed(evt);
            }
        });
        editMenu.add(CopyItem);

        pasteItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        pasteItem.setText("Paste");
        pasteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteItem);

        bold.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        bold.setText("Bold");
        bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldActionPerformed(evt);
            }
        });
        editMenu.add(bold);

        Italic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        Italic.setText("Italic");
        Italic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalicActionPerformed(evt);
            }
        });
        editMenu.add(Italic);

        jMenuBar1.add(editMenu);

        jMenu1.setText("Size");

        jMenuItem1.setText("16");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("18");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(493, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //For Opening a saved File
    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_openItemActionPerformed
    //For Exit
    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        this.setVisible(false);
        new Apps().setVisible(true);
    }//GEN-LAST:event_exitItemActionPerformed
    //For saving condition 
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
     //   change=true;
    }//GEN-LAST:event_formKeyPressed
    //For new 
    private void newItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemActionPerformed
       
        if (change==true)
        {
            int choice= JOptionPane.showConfirmDialog(null,"Do you want to save file?");
            if(choice==0)
            {   
                if(file.equals(""))
                {
                    saveFile();
                }
                else
                {
                    saveAsFile();
                }
            }
            else if(choice==1)
            {
                newFile();
            }
        }
        else
        {
           newFile();
        }
    }//GEN-LAST:event_newItemActionPerformed
    //For save
    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
  
        if(file.equals(""))
        {
            saveAsFile();
        }
        else
        {
            saveFile( );
        }
    }//GEN-LAST:event_saveItemActionPerformed
    //For SaveAS
    private void saveAsItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsItemActionPerformed
       saveAsFile();
    }//GEN-LAST:event_saveAsItemActionPerformed

    private void textAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyPressed
        change=true;
    }//GEN-LAST:event_textAreaKeyPressed

    private void CopyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyItemActionPerformed
        textArea.getSelectedText();
        textArea.copy();
    }//GEN-LAST:event_CopyItemActionPerformed
    //For Cut item
   
    private void cutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutItemActionPerformed
        textArea.getSelectedText();
        textArea.cut();
    }//GEN-LAST:event_cutItemActionPerformed

    private void boldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldActionPerformed
        textArea.setFont(new Font(textArea.getFont().getName(),textArea.getFont().BOLD,12));
        
    }//GEN-LAST:event_boldActionPerformed

    private void ItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalicActionPerformed
        textArea.setFont(new Font(textArea.getFont().getName(),textArea.getFont().ITALIC,12));
    }//GEN-LAST:event_ItalicActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        textArea.setFont(new Font(textArea.getFont().getName(),textArea.getFont().getStyle(),16));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        textArea.setFont(new Font(textArea.getFont().getName(),textArea.getFont().getStyle(),18));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String about="This application is copyright by Sana Nizam and Zoha Saleem";
        JOptionPane.showMessageDialog(this,about,"About",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void exitItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitItemMouseClicked
        
    }//GEN-LAST:event_exitItemMouseClicked

    private void pasteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteItemActionPerformed
        textArea.getSelectedText();
        textArea.paste();
    }//GEN-LAST:event_pasteItemActionPerformed

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
            java.util.logging.Logger.getLogger(JNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JNotePad().setVisible(true);
            }
        });
    }
    
    public void newFile()
    {
        title=defaultTitle;
        this.setTitle(title);
        change=false;
        textArea.setText("");
    }
    
    public void openFile()
    {
        JFileChooser openFile=new JFileChooser();
        int option=openFile.showOpenDialog(openFile);
        if(option==JFileChooser.APPROVE_OPTION)
        {
            textArea.setText("");
        }
        try
        { 
            Scanner scan=new Scanner(new FileReader(openFile.getSelectedFile().getPath()));
                    
            while(scan.hasNext())
                textArea.append(scan.nextLine()+"");
            title=openFile.getSelectedFile().getName()+"";
            this.setTitle(title);
            change=true;
            file=openFile.getSelectedFile().getPath();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void saveFile()
    {
        if(save==true)
        {
            try(BufferedWriter out=new BufferedWriter(new FileWriter(file)))
            {
                out.write(textArea.getText());
                title=title;
                this.setTitle(title);
            }
            catch(Exception ex)
            {
                 System.out.println(ex.getMessage());
            }
        }
        else
        {
             JFileChooser save=new JFileChooser();
            int option=save.showSaveDialog(this);
            if(option==JFileChooser.APPROVE_OPTION)
            {
             try
                {
                    BufferedWriter out=new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                    out.write(this.textArea.getText());
                    out.close();
                }
                catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }    
        }
    }
    
    public void saveAsFile()
    {
        JFileChooser saveAs=new JFileChooser(".");
        int choice=saveAs.showSaveDialog(this);
        if(choice==JFileChooser.APPROVE_OPTION)
        {
            fileName2=new File(saveAs.getSelectedFile().getPath()+".txt");
            saveFile();
        }
    }
    
    public void processWindowEvent(WindowEvent e) 
    {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) 
        {
            this.setVisible(false);
            new Apps().setVisible(true);
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CopyItem;
    private javax.swing.JMenuItem Italic;
    private javax.swing.JMenuItem bold;
    private javax.swing.JMenuItem cutItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newItem;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem pasteItem;
    private javax.swing.JMenuItem saveAsItem;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
