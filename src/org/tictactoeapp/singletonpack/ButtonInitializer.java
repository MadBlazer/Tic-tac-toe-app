/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.singletonpack;

import java.awt.Color;
import javax.swing.JButton;
import org.tictactoeapp.frames.FrmTicTacToeMain;
import org.tictactoeapp.pojomodels.CoreButtonList;

/**
 *
 * @author Pc
 */
public class ButtonInitializer
{

    private static ButtonInitializer buttonInitializer = new ButtonInitializer();
    CoreButtonList coreButtonList = null;
    private ButtonInitializer() {}
    
    public static synchronized ButtonInitializer getInstance()
    {

        if (buttonInitializer == null)
        {
           return buttonInitializer = new ButtonInitializer();
        }

        return buttonInitializer;
    }

     public CoreButtonList initializeButtons(boolean isReInitialize)
     {
        coreButtonList = new CoreButtonList();

        JButton[] buttonArray1 = {FrmTicTacToeMain.btnTTT1,FrmTicTacToeMain.btnTTT2,
        FrmTicTacToeMain.btnTTT3};
        JButton[] buttonArray2 = {FrmTicTacToeMain.btnTTT4,FrmTicTacToeMain.btnTTT5,
        FrmTicTacToeMain.btnTTT6};
        JButton[] buttonArray3 = {FrmTicTacToeMain.btnTTT7,FrmTicTacToeMain.btnTTT8,
        FrmTicTacToeMain.btnTTT9};

        coreButtonList.addButtonRow(buttonArray1);
        coreButtonList.addButtonRow(buttonArray2);
        coreButtonList.addButtonRow(buttonArray3);

        for (JButton[] buttonArray : coreButtonList.getButtonList())
        {
            for (JButton button : buttonArray)
            {
                button.setForeground(Color.GRAY);
            }
        }

        if (isReInitialize) GameSystem.getInstance().getGame().setGameButtonList(coreButtonList) ;

        return coreButtonList;
    }

   /* public void setColorButtons(String playerPoint,Color color)
    {
        for (JButton[] buttonArray : coreButtonList.getButtonList())
        {
            for (JButton btn : buttonArray)
            {
             if (btn.getText().equals(playerPoint))
             {
                 btn.setForeground(color);
             }
            }
        }

    }
*/
}
