import java.util.*;

import java.lang.*;

import java.io.*;

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		  int i,j,n,t,median;

		  Scanner s = new Scanner (System.in);

		  n = s.nextInt();

		  int k[] = new int[10];

		    for (i=0;i<n;i++)

		       k[i] = s.nextInt();

	      for (i=0;i<n;i++)

		      {

		  	      for (j =i+1;j<n;j++)

		  	          {

		  	              	if (k[i] > k[j])

		  		                  {

		  		                      	t = k[i];

		  		                      	k[i] = k[j];

		  		                      	k[j] = t;

		  	                  	}

		            	}

		      }

		  if (n%2 == 0)

		     {

		       median = ((k[n/2]+k[(n-1)/2])/2);

		       System.out.println(median);

		     }

		  else 

		     {

			      median = k[n/2];

			      System.out.println(median);  

		     }

  	}

}
