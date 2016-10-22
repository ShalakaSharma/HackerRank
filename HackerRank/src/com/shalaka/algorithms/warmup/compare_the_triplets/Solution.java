package com.shalaka.algorithms.warmup.compare_the_triplets;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		
		int scoreA = 0, scoreB = 0;

		if (!(a0 < 1 || a0 > 100 || a1 < 1 || a1 > 100 || a2 < 1 || a2 > 100
				|| b1 < 1 || b1 > 100 || b0 < 1 || b0 > 100 || b2 < 1
				|| b2 > 100)) {
			
			if(a0>b0) {
				scoreA++;
			} else if(a0<b0) {
				scoreB++;
			}
			if(a1>b1) {
				scoreA++;
			} else if(a1<b1) {
				scoreB++;
			}
			if(a2>b2) {
				scoreA++;
			} else if(a2<b2) {
				scoreB++;
			}
		}
		
		in.close();
		System.out.println(scoreA + " " + scoreB);

	}

}
