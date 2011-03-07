/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tictactoeapp.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ubuntu
 */
public class GameData
{

    private  List<String[]> gameValuesList = new ArrayList<String[]>();
    
    public  String getGameValue(int rowOid,int columnOid)
    {
        String value = gameValuesList.get(rowOid)[columnOid];

        return value == null ? null : value;
    }

    public String[] getGameArray(int rowOid)
    {
        return gameValuesList.get(rowOid);
    }

    public void addGameValueFromString(int rowOid,int columnOid,String columnValue)
    {
        gameValuesList.get(rowOid)[columnOid] = columnValue;
    }

    public List<String[]> getGameValuesList()
    {
        return gameValuesList;
    }

    public void addGameValueFromArray(String[] valuesArray)
    {
        gameValuesList.add(valuesArray);
    }

}
