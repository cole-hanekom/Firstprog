package za.ac.cput.calculator;

/*
*@author Cole Hanekom
**/

public class Division {
    /*
    * Returns result of integer division
    *
    * */

    public static int integerDivision(int numerator,int denominator){
        if(denominator < 1) return 0;
        return numerator/denominator;
    }
}
