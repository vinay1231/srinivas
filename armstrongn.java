import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

    {

       Scanner s = new Scanner (System.in);

       int ch = s.nextInt();

       int re,sum=0,d;

       d = ch;

        while ( ch > 0)

         {

         	 re = ch % 10;

         	 sum = sum + (re*re*re);

         	 ch = ch /10;

         }

         if ( sum == d )

           System.out.println("yes");

           else

           System.out.println("no");

           

   	}

}
