/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.core;

import java.util.Random;
import org.tictactoeapp.model.KoordinantModel;

/**
 *
 * @author ubuntu
 */
public class TicTacToeCore
{

    private GameData gameData = null;

    public void initializeGame()
    {
        gameData = new GameData();

            String[] row1 = {"None_1","None_2","None_3"};
            String[] row2 = {"None_4","None_5","None_6"};
            String[] row3 = {"None_7","None_8","None_9"};
            
            gameData.addGameValueFromArray(row1);
            gameData.addGameValueFromArray(row2);
            gameData.addGameValueFromArray(row3);
        
    }

    public Boolean isPlayerWinner()
    {
        String[] row1 = gameData.getGameArray(0);
        String[] row2 = gameData.getGameArray(1);
        String[] row3 = gameData.getGameArray(2);

       for(int i=0;i<3;i++)
       {
           String[] currentRow = gameData.getGameArray(i);

           // Alt alta aynı değerler gelmişmi kontrol et

           if(row1[i].equals(row2[i]) && row1[i].equals(row3[i]) && row2[i].equals(row3[i]))
           return row1[i].equals("X") ? true : false;

           // Yan yana aynı değerler gelmişmi kontrol et

           else if(currentRow[0].equals(currentRow[1]) && currentRow[0].equals(currentRow[2]) &&
           currentRow[1].equals(currentRow[2]) )
           return currentRow[0].equals("X") ? true : false;
       }

        // Çarpraz Kontrol yap...

       if (row1[0].equals(row2[1]) && row2[1].equals(row3[2]))
       return row1[0].equals("X") ? true : false;

       else if (row1[2].equals(row2[1]) && row2[1].equals(row3[0]))
       return row1[2].equals("X") ? true : false;

       return null;
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

    public void playerGame(int rowOid,int columnOid)
    {
     gameData.addGameValueFromString(rowOid,columnOid,"X");
    }

    public KoordinantModel computerGame()
    {
        boolean isComputerNotNullButtonFinded = true;

        KoordinantModel koordinantModel = null;

        while (isComputerNotNullButtonFinded)
        {
            
        int randRow = new Random().nextInt(3);
        int randColumn = new Random().nextInt(3);

        String[] gameDataArray = gameData.getGameArray(randRow);

        if (gameDataArray[randColumn].contains("None"))
        {
         gameData.addGameValueFromString(randRow, randColumn, "O");

         koordinantModel = new KoordinantModel();
         
         koordinantModel.setRow(randRow);
         koordinantModel.setColumn(randColumn);
         
         isComputerNotNullButtonFinded = false;
        }

        }

        return koordinantModel;
    }

}
