import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		 Scanner s = new Scanner (System.in);

       int ch = s.nextInt();

       int ra = s.nextInt();

       int re,sum=0,k,m;

         for (k = ch; k < ra; k++ )

         {

         	 m = k;

         	 while ( m > 0 )

         	 {

         	 re = m % 10;

         	 sum = sum + (re*re*re);

         	 m = m /10;

         	 }

         	 if (sum==k)

         	 {

		System.out.println(sum);

         	 }

            sum =0;

         	 

         }

          

	}

}
