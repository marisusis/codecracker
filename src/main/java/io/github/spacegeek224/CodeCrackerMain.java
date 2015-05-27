package io.github.spacegeek224;

import java.util.Scanner;

public class CodeCrackerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		final int wordl = word.length();
		outln("Word: " + word);
		outln("Length: " + Integer.toString(wordl));
		//Generate arrays
		char[] alpha = new char[26];
		int k = 0;
		for (int i = 0; i < 26; i++) {
			alpha[i] = (char)(97 + (k++));
		}
		char[] wordc = new char[wordl];
		for (int i = 0; i < wordl; i++) {
			wordc[i] = word.charAt(i);
		}
		
		//Print out individual characters
		for (int i = 0; i < wordl; i++) {
		}
	}

	public static void outln(String s) {
		System.out.println(s);
	}
	public static void out(String s) {
		System.out.print(s);
	}
		// TODO Replacing method
		/**
		String test = "hello";
		test.replace(oldChar, newChar);
		 */
}
