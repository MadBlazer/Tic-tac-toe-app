/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.services.servicesimpl;

import java.awt.Color;
import javax.swing.JComboBox;
import org.tictactoeapp.services.TicTacToeCombobox;

/**
 *
 * @author Pc
 */
public class TicTacToeComboImpl implements TicTacToeCombobox
{

    public Color getSelectedComboColor(JComboBox comboBox)
    {
        switch (comboBox.getSelectedIndex())
        {
            case 0:
            return Color.BLACK;
            case 1:
            return Color.RED;
            case 2:
            return Color.BLUE;
            case 3:
            return Color.GREEN;
        }
         return null;
    }

}
