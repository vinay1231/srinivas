import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

             	Scanner h = new Scanner (System.in);

		

		String str=h.next();

		char k;

		int i;

		int count=0;

		for(i=0;i<str.length();i++)

		{

			k=str.charAt(i);

			if(Character.isLetter(k))

			{

				count=1;

			}

		}

		if(count==1)

			System.out.println("no");

		else

		System.out.println("yes");



	}

}
