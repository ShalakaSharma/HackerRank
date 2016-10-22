package com.shalaka.algorithms.warmup.plus_minus;

import java.text.DecimalFormat;
import java.util.*;



public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int positives = 0;
		int negatives = 0;
		int zeroes = 0;
		
		for(int i=0; i<n; i++) {
			int num = in.nextInt();
			if(num>0) {
				positives++;
			} else if(num<0) {
				negatives++;
			} else {
				zeroes++;
			}
		}
		
		DecimalFormat df6 = new DecimalFormat("#.######");
		
		System.out.println(df6.format((double)positives/n));
		
		System.out.println(df6.format((double)negatives/n));
		
		System.out.println(df6.format((double)zeroes/n));
		
		
		
		in.close();
	}
	
}
