package com.shalaka.algorithms.warmup.ver_big_sum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		long sum = 0;
		
		for(int i=0;i<n;i++) {
			sum += in.nextInt();
		}

		in.close();
		System.out.println(sum);
	}

}
