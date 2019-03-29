package com.java8.coding;

public class Pallindrome {
	public static void main(String[] args) {
		int n=121;
		int sum=0;
		int temp=n;
		while (n>0) {
			int reminder=n%10;
			System.out.println(reminder);
			sum=sum*10+reminder;
			System.out.println(sum);
			n=n/10;
		}
if(temp==sum) {
	System.out.println("pallindrome");
}
else {
	System.out.println("not pallindrome");
}

}
}