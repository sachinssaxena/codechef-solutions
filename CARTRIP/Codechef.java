import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// cost per km = 10
		// rent for da y = rent for at least 300 kms
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    System.out.println(carHireCost(x));
		}
		
	}
	public static int carHireCost(int x)
	{
	    if(x<300)
	    return 300*10;
	    else
	    return x*10;
	}
}
