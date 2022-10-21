/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KC
 */
public class Row {
    private static int row;
    public static int getRow(){
        return row;
    }
    public static void setRow(){
        row++;
    }
    public static void setRow( int temp){
        row= temp;
    }


}
