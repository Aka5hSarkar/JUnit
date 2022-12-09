package com.prime;

public class FindPrime{
	static boolean validatePrime(int n) {
		int count=0;
		if(n<2) {
			return false;
		}else {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				return true;
			}else {
				return false;
			}
		}	
	}
}