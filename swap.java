import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		Scanner d = new Scanner (System.in);

		int a,b,c;

		a = d.nextInt();

		b = d.nextInt();

		c = a;

		a = b;

		b = c;

		System.out.println(a+" "+b);

	}

}
