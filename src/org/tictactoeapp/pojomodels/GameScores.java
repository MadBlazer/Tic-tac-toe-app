/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.pojomodels;

/**
 *
 * @author Pc
 */
public class GameScores
{

    private int playerScore;
    private int computerScore;
    private int drawScore;

    public GameScores(int playerScore, int computerScore, int drawScore) {
        this.playerScore = playerScore;
        this.computerScore = computerScore;
        this.drawScore = drawScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public int getDrawScore() {
        return drawScore;
    }

    public void setDrawScore(int drawScore) {
        this.drawScore = drawScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
    
}
