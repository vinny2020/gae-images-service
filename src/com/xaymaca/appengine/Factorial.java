package com.xaymaca.appengine;

/**
 * Created by IntelliJ IDEA.
 * User: xaymaca
 * Date: 2/10/11
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */

public class Factorial
{
    // Evaluate n!
    public static long factorial( int n )
    {
        if( n <= 1 )     // base case
            return 1;
        else
            return n * factorial( n - 1 );
    }

    // Simple test program
    public static void main( String [ ] args )
    {
        for( int i = 1; i <= 10; i++ )
            System.out.println( factorial( i ) );
    }
}