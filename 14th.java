
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		for (int i = num1+1; i < num2; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
