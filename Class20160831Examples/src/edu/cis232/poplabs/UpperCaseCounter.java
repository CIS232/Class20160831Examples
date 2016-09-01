package edu.cis232.poplabs;

import java.util.Scanner;

public class UpperCaseCounter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello, I will count the upper case letters in whatever text you input:");
		String input = keyboard.nextLine();
		
		int count = 0;
		for(int i = 0; i < input.length(); i++){
			char letter = input.charAt(i);
			if(Character.isUpperCase(letter)){
				count += 1;
			}
		}
		
		System.out.printf("There are %d upper case letters%n", count);

	}

}
