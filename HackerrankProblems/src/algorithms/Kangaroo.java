package algorithms;

import java.util.Scanner;

public class Kangaroo {
	
	public static String Kangaroo(int x1,int v1,int x2,int v2)
	{
		if(v1>v2)
		{
			int remainder = (x2-x1)%(v1-v2);
			if(remainder==0)
			{
				return "YES";
			}
		}
		return "NO";
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int v1=sc.nextInt();
		int x2=sc.nextInt();
		int v2=sc.nextInt();
		System.out.println(Kangaroo(x1,v1,x2,v2));
	}

}

