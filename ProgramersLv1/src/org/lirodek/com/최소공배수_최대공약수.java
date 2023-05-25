package org.lirodek.com;

public class 최소공배수_최대공약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result[] = result(2,5);
		for(int temp : result) {
			System.out.println(temp);
		}
	}
	
	public static int[] result(int a, int b) {
		return new int[]{gcd(a,b), lcm(a,b)};
	}
	
	// 최대 공약수
	public static int gcd(int a, int b) {
		if(b == 0) 
			return a;
		return gcd(b, a % b);
	}
	
	// 최소 공배수
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

}
