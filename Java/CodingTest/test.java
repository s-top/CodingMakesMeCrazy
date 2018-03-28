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

public class huawei {


   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String s1 = input.nextLine();
       //qwertyuiopasdfghjklzxcvbnm
       //abcdefghijklmnopqrstuvwxyz

       System.out.println(change(s1));
    }


    public static String change(String s){
        String ziran = "abcdefghijklmnopqrstuvwxyz";
        String biaozhun = "qwertyuiopasdfghjklzxcvbnm";
        String news1 ="";
        for (int i=0;i<s.length();i++){

            char ch1 = s.charAt(i);

            if (ziran.indexOf(ch1)!=-1){
                int index = ziran.indexOf(ch1);
                ch1 = biaozhun.substring(index,index+1).charAt(0);

            }else if(ziran.toUpperCase().indexOf(ch1)!=-1){
                int index = ziran.toUpperCase().indexOf(ch1);
                ch1 = biaozhun.toUpperCase().substring(index,index+1).charAt(0);
            }
            news1 = news1+ch1;
        }
        return news1;
    }
}