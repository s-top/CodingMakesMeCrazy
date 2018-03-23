package com.lzp.Demo.NiuKeWang;

import java.util.*;

public class JinRiTouTiao {
	/*
	 * 2018-03-22
	 *P为给定的二维平面整数点集。定义 P 中某点x，如果x满足 P 中任意点都不在 x 的
	 *右上方区域内（横纵坐标都大于x），则称其为“最大的”。求出所有“最大的”点的集合。
	 *（所有点的横坐标和纵坐标都不重复, 坐标轴范围在[0,1e9)内）
	 *
	 *输入:
	 *	5
		1 2
		5 3
		4 6
		7 5
		9 0
	 *输出:
	 *  4 6
		7 5
		9 0
	 *思路：按x坐标排序，然后探索Y坐标的最大值，最后倒序输出（通过率：30%）
	 */
	public static void main(String[] args) {
        //处理输入
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
        
        int point[] = new int[2*N];
        
        int index = 0;
        while(in.hasNextInt()){
            int x = in.nextInt();
            int y = in.nextInt();
			if(x >= 0 && y >= 0) {
				point[index] = x;
				point[index + 1] = y;
				index = index + 2;
			}
        }
        //按x坐标从小到大选择排序​
        for(int i = 0; i < 2 * N; i = i + 2){

            int minIndex = i;
            
            for(int j = i + 2; j < 2 * N; j = j + 2){
               if(point[j] < point[minIndex]){
                   minIndex = j;
               }
            }
            
            if(minIndex != i){
            	
                int temp0 = point[i];
                point[i] = point[minIndex];
                point[minIndex] = temp0;
                
                int temp1 = point[i+1];
                point[i+1] = point[minIndex+1];
                point[minIndex+1] = temp1;
            }
        }
        
        //保存结果
        List<String> list = new ArrayList<String>();
        //探索Y坐标的最大值
        if(N <= 500000 && N >= 1){
        	
        	int m = 2 * N - 2;
        	list.add(point[m] + " " + point[m+1]);
        	int maxNum = point[m+1];
        	while(m >= 0) {
        		int y_A = maxNum;
        		for(int k = m-2; k >= 0; k = k - 2) {
        			int y_B = point[k+1];        			
        			if(y_B > y_A) {
        				maxNum = y_B;
        				list.add(point[k] + " " + point[k+1]);
        				m = k;
        				break;
        			}
        		}
        		m = m - 2;
        	}
        }
        //倒序输出结果
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}
