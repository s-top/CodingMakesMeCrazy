package com.lzp.Demo.WangYi;

import java.util.*;

public class 彩色的砖块 {

	public static void main(String[] args) {
		/*
		 * 彩色的砖块
		 * 
		 * 输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s中的每一个字符都为一个大写字母(A到Z)。
		 * 例如: s = "ABAB",那么小易有六种排列的结果:
			"AABB","ABAB","ABBA","BAAB","BABA","BBAA"
			其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。 
		 *
		 *思路：只有一种或者两种的字母才有答案1或者2，其他情况结果都为0.
		 */

		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		Map<String,Integer> maps = new HashMap<String,Integer>();
		
		//统计字母出现的次数，通过map的长度统计字母的种类
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
