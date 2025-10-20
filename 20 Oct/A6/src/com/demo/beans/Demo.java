package com.demo.beans;

public class Demo
{

	public int reverse(int n)
	{
		int reverse = 0;
		
		while(n!=0)
		{
			int digit = n%10;
			reverse = reverse * 10 + digit;
			n= n/10;
		}
		return reverse;
	}
	
}
