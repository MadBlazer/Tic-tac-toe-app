/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.core;

import java.util.List;
import java.util.Random;
import org.tictactoeapp.pojomodels.Koordinant;
import org.tictactoeapp.services.GameControl;
import org.tictactoeapp.services.servicesimpl.GameControlImpl;

/**
 *
 * @author ubuntu
 */
public class GameCore
{

    private GameData gameData = null;
    private GameControl gameControl = null;

    public void initializeCore()
    {
        gameData = new GameData();
        gameControl = new GameControlImpl();

            String[] row1 = {"None_1","None_2","None_3"};
            String[] row2 = {"None_4","None_5","None_6"};
            String[] row3 = {"None_7","None_8","None_9"};
            
            gameData.addGameValueFromArray(row1);
            gameData.addGameValueFromArray(row2);
            gameData.addGameValueFromArray(row3);
        
    }

    public Boolean isPlayerWinner()
    {
        return gameControl.isPlayerWinner();
    }

    public boolean isGameFinished()
    {

        if (isPlayerWinner() == null)
        {

        for (String[] gameValuesArray : gameData.getGameValuesList())
        {
            for (String gameValue : gameValuesArray)
            {
                if (gameValue.contains("None")) return false;
            }
        }

        }
        
        return true;
    }

    public List<String[]> getGameValuesList()
    {
        return gameData.getGameValuesList();
    }

    public void playerGame(int rowOid,int columnOid)
    {
     gameData.addGameValueFromString(rowOid,columnOid,"X");
    }

    public Koordinant computerGame()
    {
        boolean isComputerNotNullButtonFinded = true;

        Koordinant koordinantModel = gameControl.binaryCheck();

        if (koordinantModel == null)
        {
        
            while (isComputerNotNullButtonFinded)
            {

            int randRow = new Random().nextInt(3);
            int randColumn = new Random().nextInt(3);

            String[] gameDataArray = gameData.getGameArray(randRow);

            if (gameDataArray[randColumn].contains("None"))
            {
            gameData.addGameValueFromString(randRow, randColumn, "O");

            koordinantModel = new Koordinant();

            koordinantModel.setRow(randRow);
            koordinantModel.setColumn(randColumn);

            isComputerNotNullButtonFinded = false;
            }

            }
        }
        else
        {
           gameData.addGameValueFromString(koordinantModel.getRow(),koordinantModel.getColumn(), "O");
        }
        return koordinantModel;
    }

}
