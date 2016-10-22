package com.shalaka.algorithms.warmup.simple_array_sum;

import java.util.Scanner;

/**
 * 
 * @author Shalaka Given an array of integers, can you find the sum of its
 *         elements?
 * 
 *         Input Format
 * 
 *         The first line contains an integer, , denoting the size of the array.
 *         The second line contains space-separated integers representing the
 *         array's elements.
 * 
 *         Output Format
 * 
 *         Print the sum of the array's elements as a single integer.
 *
 */

public class Solution {
	public static void main(String[] args) {

		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += scanner.nextInt();
		}
		scanner.close();
		System.out.println(sum);
	}
}
