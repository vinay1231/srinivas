import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

             	Scanner h = new Scanner (System.in);

		int n = h.nextInt();

		int k[] = new int[10];

		 for (int i=0;i<n;i++)

		 {

		 	k[i] = h.nextInt();

		 }

		  for (int i=0;i<n;i++)

		 {

		 	System.out.println(k[i]+" "+i);

		 }

		

	}

}
