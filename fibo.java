import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		Scanner s = new Scanner (System.in);

		int n = s.nextInt ();

		int a = 1;

		int b = 1;

		int c=0;

		n = n-2;

		System.out.print(a+" "+b);

		while (n > 0)

		{

		   c = a+b;

		    System.out.println(" "+c );

			a = b;

			b = c;

			n =n-1;

		}

		

	}

}
