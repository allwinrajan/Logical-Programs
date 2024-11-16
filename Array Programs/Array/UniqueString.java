package com.Array;

public class UniqueString {
  public static void unique(String str) {
	  for (int i = 0; i < str.length(); i++) {
		boolean flag = true;
		 for (int j = 0; j < str.length(); j++) {
			if(i != j && str.charAt(i)==str.charAt(j)) {
				flag=false;break;
			}
		}
		 if(flag) {
			 System.out.print(str.charAt(i)+" ");
		 }
	}
  }
	public static void main(String[] args) {
		String str = "allwwiinn";
		unique(str);
	}
}
