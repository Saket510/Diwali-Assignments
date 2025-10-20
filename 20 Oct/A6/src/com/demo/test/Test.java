
package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Demo;

public class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();
		
		Demo d = new Demo();
		
		System.out.println(d.reverse(n)); 
	}
}
