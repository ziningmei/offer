package com.offer;

public class Fibonacci {

	public int fibonacci(int n) {
		int a = 1, b = 1, c = 0;
		if (n <= 0)
			c = 0;
		else if (n == 1) {
			c = 1;
		} else if (n == 2) {
			c = 1;
		} else {
			for (int i = 3; i <= n; i++) {
				c=a+b;
				b=a;
				a=c;
			}
		}
		return c;
	}

	public static void main(CharactorString[] args) {
		Fibonacci two = new Fibonacci();
		System.out.println(two.fibonacci(4));
	}
}
