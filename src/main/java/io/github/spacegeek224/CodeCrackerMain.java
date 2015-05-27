package io.github.spacegeek224;

import java.util.Scanner;

public class CodeCrackerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String uword = input.nextLine();
		int uwordl = uword.length();
		outln("Word: " + uword);
		outln("Length: " + Integer.toString(uwordl));
		
	}
	public static void outln(String s) {
		System.out.println(s);
	}
	public static void out(String s) {
		System.out.print(s);
	}

}
