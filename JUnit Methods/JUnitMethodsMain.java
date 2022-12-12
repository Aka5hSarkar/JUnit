package com.junit_methods;

import java.util.ArrayList;

public class JUnitMethodsMain {
	public boolean even(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean odd(int n) {
		if(n%2==0) {
			return false;
		}else {
			return true;
		}
	}
	public int[] createArray(int start,int end) {
		int[] arr=new int[(end-start)];
		for(int i=0,j=start;i<arr.length&&j<=end;i++,j++) {
			arr[i]=j;
		}return arr;
	}
	public String searchArrayList(ArrayList<String> arr,String searchItem) {
		if(arr.contains(searchItem)) {
			return searchItem;
		}else {
			return null;
		}
	}
}
