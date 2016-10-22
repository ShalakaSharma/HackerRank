package com.shalaka.algorithms.warmup.diagonal_difference;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int difference = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int value = sc.nextInt();
				if(i==j) {
					difference += value;
				}
				if(i+1==n-j) {
					difference -= value;
				}
			}
		}
		
		sc.close();
		System.out.println(Math.abs(difference));
		
	}
}
