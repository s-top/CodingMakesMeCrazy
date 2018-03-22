 package com.lzp.Demo.WangYi;

import java.util.*;

public class ����01�� {

	public static void main(String[] args) {
		/*
		 * 2018-03-22
		 * ����01��
		 * ���һ��01��������������λ�õ��ַ����ǲ�һ����,���Ǿͽ����01��Ϊ����01��������: "1","10101","0101010"���ǽ���01����
		       С��������һ��01��s,С�����ҳ�һ����������Ӵ�,��������Ӵ���һ������01����С����Ҫ����æ�������������Ӵ��ĳ����Ƕ��١�
		 *
		 * ����:
		 *	111101111
		 * ���:
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

