/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.services.servicesimpl;

import java.awt.Color;
import org.tictactoeapp.core.GameCore;
import org.tictactoeapp.pojomodels.CoreButtonList;
import org.tictactoeapp.pojomodels.GameScores;
import org.tictactoeapp.pojomodels.GameSettings;
import org.tictactoeapp.services.NewGame;
import org.tictactoeapp.singletonpack.ButtonInitializer;

/**
 *
 * @author Pc
 */
public class NewGameImpl implements NewGame
{

    public NewGameImpl() {}
    
    public NewGameImpl(boolean firstGame)
    {
        gameScores = new GameScores(0, 0, 0);
        gameSettings = new GameSettings("X","O",Color.BLACK);
        coreGame = new GameCore();

        buttonList = ButtonInitializer.getInstance().initializeButtons(false);
        
        coreGame.initializeCore();

    }
    
    private GameCore coreGame = null;
    private GameScores gameScores = null;
    private GameSettings gameSettings = null;
    private CoreButtonList buttonList = null;

    public NewGame getNewGame()
    {
       return this;
    }

    public void initializeNewGame()
    {
        coreGame = new GameCore();
        gameScores = new GameScores(0,0,0);
        
        coreGame.initializeCore();
        
    }

    public GameScores getGameScores() {
      return gameScores;
    }

    public void setGameScore(int gamerOid)
    {

        switch (gamerOid)
        {
            case 0:
            gameScores.setPlayerScore(gameScores.getPlayerScore()+1);
            break;
            case 1:
            gameScores.setComputerScore(gameScores.getComputerScore()+1);
            break;
            case 2:
            gameScores.setDrawScore(gameScores.getDrawScore()+1);
            break;
        }

    }

    public GameCore getGameCore() {
        return coreGame;
    }

    public GameSettings getGameSettings()
    {
        return gameSettings;
    }

    public void setGameSettings(GameSettings gameSettings) {
       this.gameSettings = gameSettings;
    }

    public void setGameScores(GameScores gameScores) {
       this.gameScores = gameScores;
    }

    public void setGameButtonList(CoreButtonList buttonList) {
       this.buttonList = buttonList;
    }

    public CoreButtonList getCoreButtonList() {
        return buttonList;
    }

    

}
