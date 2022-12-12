package com.factorial;

public class FactorialMain {
	//method to find factorial
	public int findFactoril(int n) {
		int fact=1;
		if(n==0) {
			return 1;
		}else {
			if(n>0) {
				for(int i=1;i<=n;i++) {
					fact=fact*i;
				}return fact;
			}else {
				return -1;
			}
		}
	}
}
