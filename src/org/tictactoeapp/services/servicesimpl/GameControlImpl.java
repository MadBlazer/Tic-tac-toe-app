/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.services.servicesimpl;

import org.tictactoeapp.pojomodels.Koordinant;
import org.tictactoeapp.services.GameControl;
import org.tictactoeapp.singletonpack.GameSystem;

/**
 *
 * @author Pc
 */
public class GameControlImpl implements GameControl
{
    
   // private static final Logger controlLogger = Logger.getLogger("Game Logger");

    public Koordinant binaryCheck()
    {
        Koordinant binaryKoord = new Koordinant();
        
        String[] row1 = GameSystem.getInstance().getGame().
        getGameCore().getGameValuesList().get(0);

        String[] row2 = GameSystem.getInstance().getGame().
        getGameCore().getGameValuesList().get(1);

        String[] row3 = GameSystem.getInstance().getGame().
        getGameCore().getGameValuesList().get(2);

        for (int i=0;i<3;i++)
        {
            String[] currentRow = GameSystem.getInstance().getGame().
            getGameCore().getGameValuesList().get(i);

           if (row1[i].equals(row2[i]) && !row1[i].equals(row3[i]) && row3[i].contains("None")) // XX null alt alta
           {
                binaryKoord.setColumn(i);
                binaryKoord.setRow(2);
                return binaryKoord;
           }
           if (!row1[i].equals(row2[i]) && row1[i].equals(row3[i]) && row2[i].contains("None")) // X null X alt alta
           {
                binaryKoord.setColumn(i);
                binaryKoord.setRow(1);
                return binaryKoord;
           }
           if(!row1[i].equals(row2[i]) && row2[i].equals(row3[i]) && row1[i].contains("None")) // null XX alt alta
           {
                binaryKoord.setColumn(i);
                binaryKoord.setRow(0);
                return binaryKoord ;
           }
           if (currentRow[0].equals(currentRow[1]) && !currentRow[0].equals(currentRow[2])
              && currentRow[2].contains("None")) //XX null yan yana
           {
               binaryKoord.setRow(i);
               binaryKoord.setColumn(2);
               return binaryKoord;
           }
           if (!currentRow[0].equals(currentRow[1]) && currentRow[0].equals(currentRow[2])
              && currentRow[1].contains("None")) // X null X yana
           {
               binaryKoord.setRow(i);
               binaryKoord.setColumn(1);
               return binaryKoord;
           }
           if (!currentRow[0].equals(currentRow[1]) && currentRow[1].equals(currentRow[2])
               && currentRow[1].contains("None")) // null XX
           {
               binaryKoord.setRow(i);
               binaryKoord.setColumn(0);
               return binaryKoord;
           }
        }
       return crossControl(row1, row2, row3);
    }

    private Koordinant crossControl(String[] row1,String[] row2,String[] row3)
    {
         Koordinant crossKoord = new Koordinant();

         if (row1[0].equals(row2[1]) && !row1[0].equals(row3[2]) && row3[2].contains("None")) // XX null çarpraz soldan sağa
         {
            crossKoord.setColumn(2);
            crossKoord.setRow(2);
            return crossKoord;
         }
         if (!row1[0].equals(row2[1]) && row1[0].equals(row3[2]) && row2[1].contains("None")) // X null X soldan sağa
         {
             crossKoord.setColumn(1);
             crossKoord.setRow(1);
             return crossKoord;
         }
         if(!row1[0].equals(row2[1]) && row2[1].equals(row3[2]) && row1[0].contains("None")) // null XX soldan sağa
         {
            crossKoord.setColumn(0);
            crossKoord.setRow(0);
            return crossKoord;
         }
         if(row1[2].equals(row2[1]) && row1[2].equals(row3[0]) && row3[0].contains("None")) // XX null sağdan sola
         {
             crossKoord.setColumn(0);
             crossKoord.setRow(2);
             return crossKoord;
         }
         if (!row1[2].equals(row2[1]) && row1[2].equals(row3[0]) && row2[1].contains("None")) // X null X sağdan sola
         {
             crossKoord.setColumn(1);
             crossKoord.setRow(1);
             return crossKoord;
         }
         if (!row1[2].equals(row2[1]) && row2[1].equals(row3[0]) && row1[2].contains("None")) // null XX sağdan sola
         {
            crossKoord.setColumn(2);
            crossKoord.setRow(0);
            return crossKoord;
         }

        return null;
    }

    public Boolean isPlayerWinner()
    {
        String[] row1 = GameSystem.getInstance().getGame().
        getGameCore().getGameValuesList().get(0);

        String[] row2 = GameSystem.getInstance().getGame().
        getGameCore().getGameValuesList().get(1);

        String[] row3 = GameSystem.getInstance().getGame().
        getGameCore().getGameValuesList().get(2);

       for(int i=0;i<3;i++)
       {
           String[] currentRow = GameSystem.getInstance().getGame().
        getGameCore().getGameValuesList().get(i);

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

   

}
