/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author ubuntu
 */
public class KoordinantButtonModel
{

    private List<JButton[]> buttonList = new ArrayList<JButton[]>();

    public void setButtonText(int rowOid,int columnOid,String clientText)
    {
        buttonList.get(rowOid)[columnOid].setText(clientText);
        buttonList.get(rowOid)[columnOid].setEnabled(false);
    }

    public void addButtonRow(JButton[] buttonRow)
    {
        buttonList.add(buttonRow);
    }

}
