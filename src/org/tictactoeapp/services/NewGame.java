/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.services;

import org.tictactoeapp.core.GameCore;
import org.tictactoeapp.pojomodels.CoreButtonList;
import org.tictactoeapp.pojomodels.GameScores;
import org.tictactoeapp.pojomodels.GameSettings;

/**
 *
 * @author Pc
 */
public interface NewGame
{
   void initializeNewGame();
   void setGameScore(int gamerOid);
   void setGameSettings(GameSettings gameSettings);
   void setGameScores(GameScores gameScores);
   void setGameButtonList(CoreButtonList buttonList);
   
   NewGame getNewGame();
   GameScores getGameScores();
   GameCore getGameCore();
   GameSettings getGameSettings();
   CoreButtonList getCoreButtonList();
}
