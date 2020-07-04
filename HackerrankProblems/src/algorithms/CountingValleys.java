package algorithms;

import java.util.Scanner;

public class CountingValleys {
	
	public static int countingValleys(int n, String s)
	{
		int altitude=0,valleyCount=0;
		for(int i=0;i<n;i++)
		{
			char c = s.charAt(i);
			if(c=='U')
			{
				altitude++;
				if(altitude==0)
				{
					valleyCount++;
				}
			}
			else
			{
				altitude--;
			}
		}
		return 1;
		
	}
	public static void main(String args[])
	{
		int n;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of String:");
		n=sc.nextInt();
		System.out.println("Enter the String");
		s=sc.next();
		System.out.println(countingValleys(n,s));
		sc.close();
		
	}

}
