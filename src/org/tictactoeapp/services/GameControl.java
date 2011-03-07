/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.services;

import org.tictactoeapp.pojomodels.Koordinant;

/**
 *
 * @author Pc
 */
public interface GameControl
{

    Koordinant binaryCheck();
    Boolean isPlayerWinner();
    

}
