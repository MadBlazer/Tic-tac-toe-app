/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DlgGameSettings.java
 *
 * Created on 13.Oca.2011, 19:38:00
 */

package org.tictactoeapp.frames.dialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import org.tictactoeapp.frames.FrmTicTacToeMain;
import org.tictactoeapp.pojomodels.GameSettings;
import org.tictactoeapp.services.NewGame;
import org.tictactoeapp.services.servicesimpl.NewGameImpl;
import org.tictactoeapp.services.servicesimpl.TicTacToeComboImpl;
import org.tictactoeapp.singletonpack.ButtonInitializer;
import org.tictactoeapp.singletonpack.GameSystem;

/**
 *
 * @author Pc
 */
public class DlgGameSettings extends javax.swing.JDialog {

    /** Creates new form DlgGameSettings */
    public DlgGameSettings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenDimensions.width / 4) + 25, (screenDimensions.height / 4) + 15);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpXO = new javax.swing.ButtonGroup();
        btnGrpDifficulty = new javax.swing.ButtonGroup();
        cmbColorSelector = new javax.swing.JComboBox();
        lblColorChange = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnX = new javax.swing.JRadioButton();
        rbtnO = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnNewGameStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Yeni oyun oluştur");

        cmbColorSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Siyah", "Kırmızı", "Mavi", "Yeşil" }));

        lblColorChange.setText("Kendi Renginiz : ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Temsilci Harf"));

        btnGrpXO.add(rbtnX);
        rbtnX.setSelected(true);
        rbtnX.setText("X");
        rbtnX.setNextFocusableComponent(rbtnO);

        btnGrpXO.add(rbtnO);
        rbtnO.setText("O");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(rbtnX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(rbtnO)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbtnX)
                .addComponent(rbtnO))
        );

        jLabel1.setText("Yeni Oyun Ayarları");

        btnNewGameStart.setText("Yeni Oyuna Başla !");
        btnNewGameStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblColorChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbColorSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnNewGameStart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColorChange)
                    .addComponent(cmbColorSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNewGameStart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameStartActionPerformed

        NewGame newGame = new NewGameImpl();
        GameSettings gameSettings = new GameSettings();
        TicTacToeComboImpl comboImpl = new TicTacToeComboImpl();

        Color playerColor = comboImpl.getSelectedComboColor(cmbColorSelector);

        gameSettings.setPlayerColor(playerColor);

        if (rbtnX.isSelected())
        {
            gameSettings.setPlayerPoint(rbtnX.getText());
            gameSettings.setComputerPoint(rbtnO.getText());
        }
        else
        {
        gameSettings.setPlayerPoint(rbtnO.getText());
        gameSettings.setComputerPoint(rbtnX.getText());
        }

        newGame.setGameSettings(gameSettings);
        newGame.setGameButtonList(ButtonInitializer.getInstance().initializeButtons(false));
       
        newGame.initializeNewGame();

        GameSystem.getInstance().setGame(newGame);

        FrmTicTacToeMain.newGameInitialize();
        this.dispose();

    }//GEN-LAST:event_btnNewGameStartActionPerformed

   
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgGameSettings dialog = new DlgGameSettings(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpDifficulty;
    private javax.swing.ButtonGroup btnGrpXO;
    private javax.swing.JButton btnNewGameStart;
    private javax.swing.JComboBox cmbColorSelector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColorChange;
    private javax.swing.JRadioButton rbtnO;
    private javax.swing.JRadioButton rbtnX;
    // End of variables declaration//GEN-END:variables

}
