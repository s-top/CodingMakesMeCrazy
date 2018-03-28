package com.lzp.Demo.NiuKeWang;

链接：https://www.nowcoder.com/questionTerminal/1624bc35a45c42c0bc17d17fa0cba788
来源：牛客网

import java.util.*;
/**
用一个双端队列，队列第一个位置保存当前窗口的最大值，当窗口滑动一次
1.判断当前最大值是否过期
2.新增加的值从队尾开始比较，把所有比他小的值丢掉
*/
public class Solution {
   public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(size == 0) return res;
        int begin; 
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < num.length; i++){
            begin = i - size + 1;
            if(q.isEmpty())
                q.add(i);
            else if(begin > q.peekFirst())
                q.pollFirst();
         
            while((!q.isEmpty()) && num[q.peekLast()] <= num[i])
                q.pollLast();
            q.add(i);  
            if(begin >= 0)
                res.add(num[q.peekFirst()]);
        }
        return res;
    }
}
链接：https://www.nowcoder.com/questionTerminal/1624bc35a45c42c0bc17d17fa0cba788
来源：牛客网

public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        if (num == null) {
            return ret;
        }
        if (num.length < size || size < 1) {
            return ret;
        }
         
        LinkedList<Integer> indexDeque = new LinkedList<>();
        for (int i = 0; i < size - 1; i++) {
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
        }
         
        for (int i = size - 1; i < num.length; i++) {
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()]) {
                indexDeque.removeLast();
            }
            indexDeque.addLast(i);
            if (i - indexDeque.getFirst() + 1 > size) {
                indexDeque.removeFirst();
            }
            ret.add(num[indexDeque.getFirst()]);
        }
        return ret;
    }

public class Item { public static void main(String args[]) { int array[] = {1, -2, 3, 10, -4, 7, 2, -5}; System.out.println(findMax(array)); } public static int findMax(int array[]){ //加上约束条件，防止当数组为空时造成数组越界 if (array.length == 0) { return 0; } int max = array[0]; int sum = 0; for(int i=0; i<array.length; i++){ //如果加上某个元素sum>=0的话，就加； //当数组全为负数的时候只要有加法就一定比原来的数小,此时就相当于找出数组内最大的数 if(sum >= 0) { sum += array[i]; } else{ sum = array[i]; //否则从当前位置重新计算 } if(sum > max){ max = sum; } } return max; } }public class Item { public static void main(String args[]) { int array[] = {1, -2, 3, 10, -4, 7, 2, -5}; System.out.println(findMax(array)); } public static int findMax(int array[]){ //加上约束条件，防止当数组为空时造成数组越界 if (array.length == 0) { return 0; } int max = array[0]; int sum = 0; for(int i=0; i<array.length; i++){ //如果加上某个元素sum>=0的话，就加； //当数组全为负数的时候只要有加法就一定比原来的数小,此时就相当于找出数组内最大的数 if(sum >= 0) { sum += array[i]; } else{ sum = array[i]; //否则从当前位置重新计算 } if(sum > max){ max = sum; } } return max; } }
