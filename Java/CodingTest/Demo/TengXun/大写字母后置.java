package com.lzp.Demo.NiuKeWang;

import java.util.*;
public class Main {

    /*
     * 把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
     */

    public static void main(String[] args){
        Scanner scan = newScanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            System.out.println(getResult(str));
        }
    }
    public static String getResult(String str){
        return str.replaceAll("[A-Z]","") + str.replaceAll("[a-z]","");
    }
}
