package algorithms;

import java.util.Scanner;

public class PlusMinus {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		PlusMinus(arr);
	}
	public static int PlusMinus(int arr[])
	{
		float plus=0,minus=0,zero=0;
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]<0)
			{
				minus++;
			}
			else if(arr[i]>0)
			{
				plus++;
			}
			else 
			{
				zero++;
			}
		}
		System.out.println(plus/arr.length);
		System.out.println(minus/arr.length);
		System.out.println(zero/arr.length);
		
		
		return 0;
	}
}
