package com.after;

public class AfterMain {
	int n;
	public boolean validate(int n) {
		this.n=n;
		if(n>0) {
			return true;
		}else return false;
	}
	public int fact() {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}return fact;
	}
}
