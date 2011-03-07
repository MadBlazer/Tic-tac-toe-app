/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.singletonpack;

import org.tictactoeapp.services.NewGame;

/**
 *
 * @author Pc
 */
public class GameSystem
{

    private static GameSystem gameSystem = new GameSystem();
    private NewGame game = null;

    private GameSystem() {}
    
    public static synchronized GameSystem getInstance()
    {
        if (gameSystem == null)
        {
            gameSystem = new GameSystem();
            return gameSystem;
        }
        return gameSystem;
    }

    public NewGame getGame() {
        return game;
    }

    public void setGame(NewGame game) {
        this.game = game;
    }


}
