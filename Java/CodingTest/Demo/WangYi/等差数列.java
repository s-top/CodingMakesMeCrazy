package com.lzp.Demo.WangYi;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * 2018-03-22
		 *	3
			3 1 2
		 *  Possible
		 *	Impossible
		 *
		 */
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int line[] = new int[N];
		
		int index = 0;
		while(in.hasNextInt()) {
			int x = in.nextInt();
			line[index] = x;
			index++;
		}
		
		for(int i = 0; i < N; i++){

            int minIndex = i;
            
            for(int j = i + 1; j < N; j++){
               if(line[j] < line[minIndex]){
                   minIndex = j;
               }
            }
            
            if(minIndex != i){
            	
                int temp = line[i];
                line[i] = line[minIndex];
                line[minIndex] = temp;

            }
        }

        boolean flag = true;
		int d = line[1] - line[0];
		for(int i = 0; i < N - 1; i++){
			if(line[i+1] != line[i] + d) {
				flag = !flag;
				break;
			}
		}
        if(flag){
            System.out.println("Possible");
        }else{
            System.out.println("Impossible");
        }
	}
}
