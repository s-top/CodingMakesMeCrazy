package com.lzp.Demo.WangYi;

import java.util.*;

public class 交错01串 {

	public static void main(String[] args) {
		/*
		 * 2018-03-22
		 * 交错01串
		 * 如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: "1","10101","0101010"都是交错01串。
		       小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。小易需要你帮帮忙求出最长的这样的子串的长度是多少。
		 *
		 * 输入:
		 *	111101111
		 * 输出:
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

