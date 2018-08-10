import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

	     Scanner s = new Scanner (System.in);

	    int t1 = s.nextInt();

	    int m1 = s.nextInt(); 

	    int t2 = s.nextInt();

	    int m2 = s.nextInt(); 

	    int t = Math.abs(t1-t2);

	    int m = Math.abs(m1-m2);

	    System.out.println(t+" "+m);

	}

}
