package com.lzp.Demo.WangYi;

import java.util.*;

public class ��ɫ��ש�� {

	public static void main(String[] args) {
		/*
		 * ��ɫ��ש��
		 * 
		 * �������һ���ַ���s,�ַ���s�ĳ���length(1 �� length �� 50),s�е�ÿһ���ַ���Ϊһ����д��ĸ(A��Z)��
		 * ����: s = "ABAB",��ôС�����������еĽ��:
			"AABB","ABAB","ABBA","BAAB","BABA","BBAA"
			����ֻ��"AABB"��"BBAA"�������ֻ��һ�Բ�ͬ��ɫ������ש�顣 
		 *
		 *˼·��ֻ��һ�ֻ������ֵ���ĸ���д�1����2��������������Ϊ0.
		 */

		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		Map<String,Integer> maps = new HashMap<String,Integer>();
		
		//ͳ����ĸ���ֵĴ�����ͨ��map�ĳ���ͳ����ĸ������
		for(int i = 0; i < str.length(); i++){
			String key = String.valueOf((str.charAt(i)));
			if(!maps.containsKey(key)) {
				maps.put(key, 1);
			}else{
				int val =maps.get(key);
				maps.put(key, val+1);
	    	}
		}
		if(maps.size() == 2) {
			System.out.println(2);
		}else if(maps.size() == 1){
			System.out.println(1);
		}else{
            System.out.println(0);
        }
		
	}
}
