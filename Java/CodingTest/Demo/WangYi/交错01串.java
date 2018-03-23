 package com.lzp.Demo.WangYi;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * 2018-03-22
		 *	111101111
		 *  3
		 */
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		int max = 1;
		int length = 1;
		for(int i = 0; i < str.length() - 1; i++){
			char a = str.charAt(i);
			char b = str.charAt(i + 1);
			if(a != b) {
				length = length + 1;
				if(length > max) {
					max = length;
				}
			}else {
				length = 1;
			}
		}
		System.out.println(max);
	}
}

