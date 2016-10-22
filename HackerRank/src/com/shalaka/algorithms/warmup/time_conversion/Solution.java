package com.shalaka.algorithms.warmup.time_conversion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String timeInput = sc.nextLine();

		String timeOutput = "";

		int hours = 0;

		int mins = 0;

		int seconds = 0; 
		

		if (timeInput.length()==10) {
			hours = Integer.parseInt(timeInput.substring(0, 2));
			mins = Integer.parseInt(timeInput.substring(3, 5));
			seconds = Integer.parseInt(timeInput.substring(6, 8));
			
		}
		
		if ((hours >= 1 && hours <= 12) && (mins >= 0 && mins < 60)
				&& (seconds >= 0 && seconds < 60)) {
			
			if (timeInput.contains("PM")) {
				if(hours!=12) {
					hours=hours+12;
				} 
				timeOutput = timeOutput + (hours);			
				
			} else if (timeInput.contains("AM")) {
				if(hours==12) {
					hours=0;
				}
				if (hours < 10) {
					timeOutput = timeOutput + "0";
				}
				timeOutput = timeOutput + hours;
			}
			
			if(mins<10) {
				timeOutput = timeOutput + ":0" + mins;
			} else {
				timeOutput = timeOutput + ":" + mins;
			}
			if(seconds<10) {
				timeOutput = timeOutput + ":0" + seconds;
			} else {
				timeOutput = timeOutput + ":" + seconds;
			}
			System.out.println(timeOutput);
		}

		sc.close();
		
	}
}