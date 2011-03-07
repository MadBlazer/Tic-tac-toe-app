/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.pojomodels;

import java.awt.Color;

/**
 *
 * @author Pc
 */
public class GameSettings
{

    private String playerPoint;
    private String computerPoint;
    private Color playerColor;

    public GameSettings() {}

    public GameSettings(String playerPoint,String computerPoint,Color playerColor) {
        this.playerPoint = playerPoint;
       
        this.computerPoint = computerPoint;
        this.playerColor = playerColor;
    }
     
    public Color getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }

    public String getPlayerPoint() {
        return playerPoint;
    }

    public void setPlayerPoint(String playerPoint) {
        this.playerPoint = playerPoint;
    }

    public String getComputerPoint() {
        return computerPoint;
    }

    public void setComputerPoint(String computerPoint) {
        this.computerPoint = computerPoint;
    }

}
