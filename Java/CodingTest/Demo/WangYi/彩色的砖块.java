package com.lzp.Demo.WangYi;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		    s = "ABAB"
			"AABB","ABAB","ABBA","BAAB","BABA","BBAA"
		    "AABB"和"BBAA"
		 */

		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		Map<String,Integer> maps = new HashMap<String,Integer>();

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
