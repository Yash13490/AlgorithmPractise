package com.java.fundamentals;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {

	final static String regularExpression = "^[a-z]+_?[0-9]?@hackerrank.com";

	final static Scanner scan = new Scanner(System.in);
	final static String fileName = System.getenv("OUTPUT_PATH");

	public static void main(String[] args) {

		int i=0;
		int n = Integer.parseInt(scan.nextLine());
		boolean[] output = new boolean[n];
		while(i < n ) {
			output[i]=match(scan.nextLine());
			i++;
		}
		i=0;
		while(i<output.length) {
			System.out.println(output[i]);
			i++;
		}
	}
	public static boolean match(String str) {
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern.matcher(regularExpression);
		//System.out.println(str+"		"+matcher.matches());
		return matcher.matches();
	}

}
