package com.slk.practice;

public class SwapDemo {

	static void swapper(int a,int b)
	{
		System.out.println("Before Swapping :: a = "+a+" & b = "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping  :: a = "+a+" & b = "+b);
	}
	
	
	
	public static void main(String[] args) {
		//SwapDemo obj=new SwapDemo();
		swapper(101,120);

	}

}
